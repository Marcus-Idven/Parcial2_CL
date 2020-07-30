<%-- 
    Document   : frmProducto
    Created on : 27-jul-2020, 19:33:23
    Author     : carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar Datos</title>
    </head>
    <body>
        <h1>Insertar Datos</h1><br>
        <form name="frmProducto" action="beanIProducto.jsp" target="escritorio">
              codigo <input type="tex" name="codigo"/><br>
            Descripcion <input type="text" name="descripcion"/>
            <input type="submit" value="Insertar >>"/>
        </form>
        <iframe name="escritorio"></iframe>
    </body>
</html>
