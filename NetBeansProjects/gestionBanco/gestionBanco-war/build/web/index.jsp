<%-- 
    Document   : index
    Created on : 25/10/2021, 11:01:46 AM
    Author     : josue-Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #A1E4F2">

    <center>
        
        <div style="padding: 10px; width: 500px; height: auto;background-color: #FA903E;">
            <h1>Nuevo Cliente</h1>
            <form action="registrar.do" method="POST">
                <input type="text" placeholder="Numero" name="rut"/><br>
                <input type="text" placeholder="Nombre" name="nombre"/><br>
                <select name="ciudad"/>
                <option>Tlaxcala</option>
                <option>Apizaco</option>
                <option>Huamantla</option>
                <option>Cuapiaxtla</option>
                </select>
                <br>
                <input type="text" placeholder="Codigo" name="codigo"/><br>
                <input type="submit" name="bt" value="registrar"/><br>
            </form>
            ${msg1}
        </div>


         <div style="padding: 10px; width: 500px; height: auto;background-color: #FA903E;">
             <hr style="width: 500px">
        <h1>Buscar cliente</h1>
        <form action="buscarr.do" method="POST">
            <input type="text" placeholder="Numero" name="rut"/><br>
            <input type="submit" name="bt" value="buscar"/><br>
        </form>
        ${msg2}
        <br>
        </div>

        <div style="padding: 10px; width: 500px; height: auto;background-color: #FA903E;">
        <hr style="width: 500px">
        <h1>Girar dinero</h1>
        <form action="girar.do" method="POST">
            <input type="text" placeholder="Numero" name="rut"/><br>
            <input type="text" placeholder="Monto" name="monto"/><br>
            <input type="submit" name="bt" value="girar"/><br>
        </form>
        ${msg3}
        </div>
        
        
        
        <div style="padding: 10px; width: 500px; height: auto;background-color: #FA903E;">
        <hr style="width: 500px">
        <h1>Depositar dinero</h1>
        <form action="depositarr.do" method="POST">
            <input type="text" placeholder="Numero" name="rut"/><br>
            <input type="text" placeholder="Monto" name="monto"/><br>
            <input type="submit" name="bt" value="depositar"/><br>
        </form>
        ${msg4}
        </div>
    </center>
</body>


</body>
</html>
