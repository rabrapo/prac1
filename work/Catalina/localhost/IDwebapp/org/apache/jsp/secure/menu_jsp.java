/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.17
 * Generated at: 2019-08-22 18:45:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.secure;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("      integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n");
      out.write("      integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>Home Page</title>\r\n");
      out.write("    <style> #verde { color: #008000; } </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row justify-content-sm-right\">\r\n");
      out.write("        <div class=\"col-sm-auto offset-sm-1\">\r\n");
      out.write("          <h1>Sistema de Gestión</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row justify-content-sm-right\">\r\n");
      out.write("        <div class=\"col-sm-auto offset-sm-1\">\r\n");
      out.write("          <p>Hola ");
      out.print(request.getUserPrincipal().getName());
      out.write("; este es el menú de la aplicación:</p>\r\n");
      out.write("          <p>Este es el login que has utilizado: ");
      out.print(request.getRemoteUser());
      out.write("</p>\r\n");
      out.write("          <p>Nota: sólo puedes acceder a los enlaces de color verde.<p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row justify-content-sm-right\">\r\n");
      out.write("        <div class=\"col-sm-auto offset-sm-1\">\r\n");
      out.write("          <h3>Módulo Ventas</h3></td>\r\n");
      out.write("          ");
 if(request.isUserInRole("gcfp")) { 
      out.write("\r\n");
      out.write("            <p><a id=\"verde\" href=\"ventas/gestion_clientes.jsp\">Operación: gestionar clientes</a></p>\r\n");
      out.write("            <p><a id=\"verde\" href=\"ventas/gestion_facturas.jsp\">Operación: gestionar facturas</a></p>\r\n");
      out.write("          ");
 } else { 
      out.write("\r\n");
      out.write("            <p><a href=\"ventas/gestion_clientes.jsp\">Operación: gestionar clientes</a></p>\r\n");
      out.write("            <p><a href=\"ventas/gestion_facturas.jsp\">Operación: gestionar facturas</a></p>\r\n");
      out.write("          ");
 } 
      out.write("\r\n");
      out.write("          ");
 if(request.isUserInRole("gcfp") || request.isUserInRole("a")) { 
      out.write("\r\n");
      out.write("            <p><a id=\"verde\" href=\"ventas/gestion_presupuestos.jsp\">Operación: gestionar presupuestos</a></p>\r\n");
      out.write("          ");
 } else { 
      out.write("\r\n");
      out.write("            <p><a href=\"ventas/gestion_presupuestos.jsp\">Operación: gestionar presupuestos</a></p>\r\n");
      out.write("          ");
 } 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row justify-content-sm-right\">\r\n");
      out.write("        <div class=\"col-sm-auto offset-sm-1\">\r\n");
      out.write("          <h3>Módulo Compras</h3></td>\r\n");
      out.write("          ");
 if(request.isUserInRole("ac")) { 
      out.write("\r\n");
      out.write("            <p><a id=\"verde\" href=\"compras/autorizar_compras.jsp\">Operación: autorizar compras</a></p>\r\n");
      out.write("          ");
 } else { 
      out.write("\r\n");
      out.write("            <p><a href=\"compras/autorizar_compras.jsp\">Operación: autorizar compras</a></p>\r\n");
      out.write("          ");
 } 
      out.write("\r\n");
      out.write("          ");
 if(request.isUserInRole("gcp")) { 
      out.write("\r\n");
      out.write("            <p><a id=\"verde\" href=\"compras/gestion_compras.jsp\">Operación: gestionar compras</a></p>\r\n");
      out.write("          ");
 } else { 
      out.write("\r\n");
      out.write("            <p><a href=\"compras/gestion_compras.jsp\">Operación: gestionar compras</a></p>\r\n");
      out.write("          ");
 } 
      out.write("\r\n");
      out.write("          ");
 if(request.isUserInRole("gcp") || request.isUserInRole("a")) { 
      out.write("\r\n");
      out.write("            <p><a id=\"verde\" href=\"compras/gestion_proveedores.jsp\">Operación: gestionar proveedores</a></p>\r\n");
      out.write("          ");
 } else { 
      out.write("\r\n");
      out.write("            <p><a href=\"compras/gestion_proveedores.jsp\">Operación: gestionar proveedores</a></p>\r\n");
      out.write("          ");
 } 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row justify-content-sm-right\">\r\n");
      out.write("        <div class=\"col-sm-auto offset-sm-1\">\r\n");
      out.write("          <h3>Módulo Nóminas</h3></td>\r\n");
      out.write("          ");
 if(request.isUserInRole("gnt")) { 
      out.write("\r\n");
      out.write("            <p><a id=\"verde\" href=\"nominas/gestion_nominas.jsp\">Operación: gestionar nóminas</a></p>\r\n");
      out.write("          ");
 } else { 
      out.write("\r\n");
      out.write("            <p><a href=\"nominas/gestion_nominas.jsp\">Operación: gestionar nóminas</a></p>\r\n");
      out.write("          ");
 } 
      out.write("\r\n");
      out.write("          ");
 if(request.isUserInRole("gnt") || request.isUserInRole("a")) { 
      out.write("\r\n");
      out.write("            <p><a id=\"verde\" href=\"nominas/gestion_trabajadores.jsp\">Operación: gestionar trabajadores</a></p>\r\n");
      out.write("          ");
 } else { 
      out.write("\r\n");
      out.write("            <p><a href=\"nominas/gestion_trabajadores.jsp\">Operación: gestionar trabajadores</a></p>\r\n");
      out.write("          ");
 } 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row justify-content-sm-right\">\r\n");
      out.write("        <div class=\"col-sm-auto offset-sm-1\">\r\n");
      out.write("          <h4><a href='");
      out.print( response.encodeURL("../index.jsp?logoff=true") );
      out.write("'>Logout</a></h4>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
