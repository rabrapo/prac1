<!DOCTYPE html>
<html lang="es">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
      integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
      integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <title>Acces Form</title>
  </head>
  <body bgcolor="white">
    <div class="container">
      <div class="row">
        <form method="POST" action='<%= response.encodeURL("j_security_check") %>' >
          <table border="0" cellspacing="5">
            <tr>
              <th align="right">Username:</th>
              <td align="left"><input type="text" name="j_username"></td>
            </tr>
            <tr>
              <th align="right">Password:</th>
              <td align="left"><input type="password" name="j_password"></td>
            </tr>
            <tr>
              <td align="right"><input type="submit" value="Log In"></td>
              <td align="left"><input type="reset"></td>
            </tr>
          </table>
        </form>
      </div>
      <div class="row">
        <p><a href="../index.jsp">Back</a></p>
      </div>
    </div>
  </body>
</html>
