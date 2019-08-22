
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafa
 */
public class ShadowPasswords {

  /**
   * @param args the command line arguments
   * @throws java.security.NoSuchAlgorithmException
   */
  public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
    LeerFichero lf = new LeerFichero();

    HashMap<String, String> mapa = lf.leerEnMapa("/usr/local/apache-tomcat-9.0.17/webapps/IDwebapp/WEB-INF/users/passwords_planos.txt");
    List<String> listaSalada = new ArrayList<String>();
    System.out.println("###########");
    System.out.println("ENTRADA.TXT");
    lf.mostrarHashMap(mapa);
    System.out.println("###########");
    /*
    La pimienta tiene que ser la misma para todas las contraseñas
    */
    int pepper = lf.generarPimienta();
    mapa.entrySet().forEach(entry -> {
      //entry.getValue();
      byte[] sal = lf.generarSal();
      String salt = new String(sal);
      listaSalada.add(salt);
      try {
        mapa.put(entry.getKey(), lf.toHexString(lf.getSHA(entry.getValue() + salt + pepper)));
      } catch (NoSuchAlgorithmException ex) {
        Logger.getLogger(ShadowPasswords.class.getName()).log(Level.SEVERE, null, ex);
      }
    });

    //lf.mostrarHashMap(mapa);
    //Guardar claves en fichero salida.txt
    lf.escribirMapa(mapa, "/usr/local/apache-tomcat-9.0.17/webapps/IDwebapp/WEB-INF/users/passwords_hasheds.txt");
    HashMap<String, String> mapa1 = lf.leerEnMapa("/usr/local/apache-tomcat-9.0.17/webapps/IDwebapp/WEB-INF/users/passwords_hasheds.txt");
    System.out.println("###########");
    System.out.println("SALIDA.TXT");
    lf.mostrarHashMap(mapa1);
    System.out.println("###########");
    System.out.println("SALES");
    Iterator i = listaSalada.iterator();
    while(i.hasNext()) {
      System.out.println(i.next().toString());
    }
    lf.addSal(listaSalada, "/usr/local/apache-tomcat-9.0.17/webapps/IDwebapp/WEB-INF/users/passwords_hasheds.txt");
  }

}

class LeerFichero {
  public HashMap<String, String> leerEnMapa(String archivo) {
    HashMap<String, String> mapa = new HashMap<>();
    try {
      FileReader entrada;
      entrada = new FileReader(archivo);
      BufferedReader br = new BufferedReader(entrada);
      String linea;

      while((linea = br.readLine()) != null) {
//        System.out.println(linea);
        String[] s = linea.split(":");
        if(s[0] != null && s[1] != null)
          mapa.put(s[0], s[1]);
      }
      entrada.close();
    } catch (IOException ex) {
      System.out.println("File not found");
    }
    return mapa;
  }

  public void escribirMapa(HashMap<String, String> m, String archivo) {
    FileWriter salida;
    int i = 0;

    try {
      salida = new FileWriter(archivo);
      m.entrySet().forEach(entry -> {
        try {
          salida.write(entry.getKey() + ":" + entry.getValue());
          salida.write("\n");
        } catch (IOException ex) {
          Logger.getLogger(LeerFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
      });
      salida.close();
    } catch (IOException ex) {
      Logger.getLogger(LeerFichero.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void mostrarHashMap(HashMap<String, String> m) {
    m.entrySet().forEach(entry -> {
      System.out.println(entry.getKey() + " => " + entry.getValue());
    });
  }

  public int generarPimienta() {
    Random r = new Random();

    return r.nextInt(1000);
  }

  public byte[] generarSal() {
    SecureRandom random = new SecureRandom();
    byte[] salt = new byte[16];

    random.nextBytes(salt);

    return salt;
  }

  public byte[] getSHA(String input) throws NoSuchAlgorithmException{
    // Static getInstance method is called with hashing SHA
    MessageDigest md = MessageDigest.getInstance("SHA-256");

    // digest() method called
    // to calculate message digest of an input
    // and return array of byte
    return md.digest(input.getBytes(StandardCharsets.UTF_8));
  }

  public String toHexString(byte[] hash){
    // Convert byte array into signum representation
    BigInteger number = new BigInteger(1, hash);

    // Convert message digest into hex value
    StringBuilder hexString = new StringBuilder(number.toString(16));

    // Pad with leading zeros
    while (hexString.length() < 32){
      hexString.insert(0, '0');
    }

    return hexString.toString();
  }

  public void addSal(List<String> lista, String archivo) throws IOException {
    List<String> lineas = new ArrayList<String>();

    try {
      FileReader fr = new FileReader(archivo);
      BufferedReader br = new BufferedReader(fr);
      String linea;

      try {
        int i = 0;
        while((linea = br.readLine()) != null){
          lineas.add(linea + ":" + lista.get(i));
          i++;
        }
      } catch (IOException ex) {
        Logger.getLogger(LeerFichero.class.getName()).log(Level.SEVERE, null, ex);
      }
      fr.close();
    } catch (FileNotFoundException ex) {
      Logger.getLogger(LeerFichero.class.getName()).log(Level.SEVERE, null, ex);
    }
    FileWriter fw = new FileWriter(archivo);
    Iterator i = lineas.iterator();
    while(i.hasNext()) {
      fw.write(i.next().toString());
      fw.write("\n");
    }
    fw.close();
  }
}