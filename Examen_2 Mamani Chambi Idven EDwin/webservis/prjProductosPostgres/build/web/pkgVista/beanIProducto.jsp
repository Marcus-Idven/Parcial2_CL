<%-- 
    Document   : beanIProducto
    Created on : 28-jul-2020, 1:56:21
    Author     : carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bean</title>
    </head>
    <body>
        <jsp:useBean id="beanIProducto" scope="session" class="pkgModelo.clsDAOProducto">
          <jsp:setProperty name="beanIProducto" property="*"/>
          <%
            
              if(beanIProducto.insertar()==false){
                  out.print("se inserto corectamente");
              }
              else{
                  out.print("no se pudo insertar");
              }
          %>
        </jsp:useBean>
    </body>
</html>
