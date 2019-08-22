<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
      integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
      integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>IDwebapp MENU</title>
    <style> #verde { color: #008000; } </style>
  </head>
  <body>
    <div class="container">
      <div class="row justify-content-sm-right">
        <div class="col-sm-auto offset-sm-1">
          <h1>Sistema de Gestión</h1>
        </div>
      </div>
      <div class="row justify-content-sm-right">
        <div class="col-sm-auto offset-sm-1">
          <p>Hola <%=request.getUserPrincipal().getName()%>; este es el menú de la aplicación:</p>
          <p>Este es el login que has utilizado: <%=request.getRemoteUser()%></p>
          <p>Nota: sólo puedes acceder a los enlaces de color verde.<p>
        </div>
      </div>
      <div class="row justify-content-sm-right">
        <div class="col-sm-auto offset-sm-1">
          <h3>Módulo Ventas</h3></td>
          <% if(request.isUserInRole("gcfp")) { %>
            <p><a id="verde" href="ventas/gestion_clientes.jsp">Operación: gestionar clientes</a></p>
            <p><a id="verde" href="ventas/gestion_facturas.jsp">Operación: gestionar facturas</a></p>
          <% } else { %>
            <p><a href="ventas/gestion_clientes.jsp">Operación: gestionar clientes</a></p>
            <p><a href="ventas/gestion_facturas.jsp">Operación: gestionar facturas</a></p>
          <% } %>
          <% if(request.isUserInRole("gcfp") || request.isUserInRole("a")) { %>
            <p><a id="verde" href="ventas/gestion_presupuestos.jsp">Operación: gestionar presupuestos</a></p>
          <% } else { %>
            <p><a href="ventas/gestion_presupuestos.jsp">Operación: gestionar presupuestos</a></p>
          <% } %>
        </div>
      </div>
      <div class="row justify-content-sm-right">
        <div class="col-sm-auto offset-sm-1">
          <h3>Módulo Compras</h3></td>
          <% if(request.isUserInRole("ac")) { %>
            <p><a id="verde" href="compras/autorizar_compras.jsp">Operación: autorizar compras</a></p>
          <% } else { %>
            <p><a href="compras/autorizar_compras.jsp">Operación: autorizar compras</a></p>
          <% } %>
          <% if(request.isUserInRole("gcp")) { %>
            <p><a id="verde" href="compras/gestion_compras.jsp">Operación: gestionar compras</a></p>
          <% } else { %>
            <p><a href="compras/gestion_compras.jsp">Operación: gestionar compras</a></p>
          <% } %>
          <% if(request.isUserInRole("gcp") || request.isUserInRole("a")) { %>
            <p><a id="verde" href="compras/gestion_proveedores.jsp">Operación: gestionar proveedores</a></p>
          <% } else { %>
            <p><a href="compras/gestion_proveedores.jsp">Operación: gestionar proveedores</a></p>
          <% } %>
        </div>
      </div>
      <div class="row justify-content-sm-right">
        <div class="col-sm-auto offset-sm-1">
          <h3>Módulo Nóminas</h3></td>
          <% if(request.isUserInRole("gnt")) { %>
            <p><a id="verde" href="nominas/gestion_nominas.jsp">Operación: gestionar nóminas</a></p>
          <% } else { %>
            <p><a href="nominas/gestion_nominas.jsp">Operación: gestionar nóminas</a></p>
          <% } %>
          <% if(request.isUserInRole("gnt") || request.isUserInRole("a")) { %>
            <p><a id="verde" href="nominas/gestion_trabajadores.jsp">Operación: gestionar trabajadores</a></p>
          <% } else { %>
            <p><a href="nominas/gestion_trabajadores.jsp">Operación: gestionar trabajadores</a></p>
          <% } %>
        </div>
      </div>
      <div class="row justify-content-sm-right">
        <div class="col-sm-auto offset-sm-1">
          <h4><a href='<%= response.encodeURL("../index.jsp?logoff=true") %>'>Logout</a></h4>
        </div>
      </div>
    </div>
  </body>
</html>
