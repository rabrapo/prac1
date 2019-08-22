import java.io.*;
import java.util.HashMap;

class ReadUserPassword {

  File archivo, archivo2 = null;
  FileReader fr, fr2 = null;
  BufferedReader br, br2 = null;

  HashMap<String, Prac1User> usersPasswords = new HashMap<>();
  HashMap<String, Prac1User> usersRoles = new HashMap<>();

  public ReadUserPassword() {
    try {
      archivo = new File("/opt/apache-tomcat-9.0.17/webapps/IDwebapp/WEB-INF/users/passwords_hasheds.txt");
      fr = new FileReader(archivo);
      br = new BufferedReader(fr);

      //Lectura del fichero
      String linea;
      while((linea = br.readLine()) != null) {
        String[] parts = linea.split(":");
        String login = parts[0];
        String hash = parts[1];
        String salt = parts[2];
        Prac1User prac1User = new Prac1User(login, hash, salt);

        //Debug
        System.out.println(login);
        System.out.println(hash);
        System.out.println(salt);

        usersPasswords.put(login, prac1User);
      }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      //En el finally cerramos el fichero, para asegurarnos
      //que se cierra tanto si todo va bien como si salta
      //una excepción.
      try {
        if(fr != null) {
          fr.close();
        }
      } catch (Exception e1) {
        e1.printStackTrace();
      }
    }
    try {
      archivo2 = new File("/opt/apache-tomcat-9.0.17/webapps/IDwebapp/WEB-INF/users/user_info.txt");
      fr2 = new FileReader(archivo2);
      br2 = new BufferedReader(fr2);

      //Lectura del ficheros
      String linea;
      while((linea = br2.readLine()) != null) {
        String[] parts = linea.split(":");
        String usuario = parts[0];
        String cargo = parts[1];
        String login = parts[2];
        String roles = parts[3];

        Prac1User prac1User = new Prac1User(usuario, cargo, login, roles);
        usersRoles.put(login, prac1User);
      }
    } catch (Exception e2) {
      e2.printStackTrace();
    } finally{
      try {
        if(fr2 != null) {
          fr2.close();
        }
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
  }

  public HashMap<String, Prac1User> getUsersPasswords() {
    return usersPasswords;
  }

  public HashMap<String, Prac1User> getUsersRoles() {
    return usersRoles;
  }
}
