<?php
  $conectar = new mysqli('localhost','root','','uatx');
 ?>
<!DOCTYPE HTML>
<head>
<meta charset="utf-8">
<meta name = "author" content="Josue Barrales Galvez">
<meta name="viewport" content="width=device-width, initialscale=1.0">
<title> Consultas </title>
<!-- ESTILOS-->
<style >
body{
background: red;
}
.for{
background: #6DC36D;
width: 60%;
margin-left: auto;
margin-right: auto;
}
.tabla2 {
   width: 100%;
   border: 6px solid #000;
   border-spacing: 0;
}
.fila2{
  background: #0066FF;
  color: #FFF;
  font-family: 'Rock Salt', cursive;
}
.tabla1{
   width: 100%;
   border: 0;
}
.td1{
  border-spacing: 0;
  border: 0;
  width: 50%;
}
.tabla2 th,td{
  border: 1px solid #000;
  border-spacing: 0;
}
form{
  text-align: center;
  background: #996633;
  width: 90%;
  margin-left: auto;
  margin-right: auto;
}
</style>
</head>

<body>
<div class="for">
<!-- ESTRUCTURA DE TABLA PARA LA VISTA-->
<table class="tabla1">
  <tr>
    <td class="td1">
      <!-- FORMULRIO PARA ENVIO DE DATOS-->
      <form name="Recopilacion de datos" action="envio.php" method="POST">
    	<h3>Ingrese el nombre:</h3>
    	<input type="text" name="nombre" value="">
    	<br/><br/>
    	<h3>Ingrese sus Apellidos:</h3>
    	<input type="text" name="apellidos" value="">
    	<br/><br/>
    	<h3>Ingrese el Direcccion:</h3>
    	<input type="text" name="direccion" value="">
    	<br/><br/>
    	<h3>Ingrese el Telefono:</h3>
    	<input type="number" name="telefono" value="">
    	<br/><br/>
    	<h3>Ingrese la Edad:</h3>
    	<input type="number" name="edad" value="">
    	<br/><br/>
    	<h3>Ingrese la Altura:</h3>
    	<input step="any" type="number" name="altura" value="">
    	<br/><br/>
      <input type="hidden"  value="4" name="opp"/>
    	<input type="submit" name="" value="Guardar">
    	</form>
    </td>

    <td class="td1">
      <form name="Accion" action="envio.php" method="POST">
      <h3>Seleccione la opcion a realizar</h3>
      <input type="radio"  value="1" name="opp"/>Eliminar adad mayor o igual a 34.
      <br>
      <input type="radio"  value="2" name="opp"/>Eliminar todos los registros usando TRUNCATE.
      <br>
      <input type="radio"  value="3" name="opp"/>Eliminar todos los registros usando DELETE sin condiciones.
      <br/><br/>
      <input type="submit" name="" value="Continuar">
      </form>

    </td>
</tr>
</table>
  <!-- CREACION DE LA TABLA -->
  <table class="tabla2">
    <tr class="fila2">
      <td>Nombre</td>
      <td>Apellidos</td>
      <td>Direccion</td>
      <td>Telefono</td>
      <td>Edad</td>
      <td>Altura</td>
    </tr>
    <!-- RECUPERANDO DATOS DE LA BASE DE DATOS-->
    <?php
      $sql="SELECT * from agenda3";
      $resultado=mysqli_query($conectar,$sql);
      while ($imprimir=mysqli_fetch_array($resultado)) {
     ?>
    <tr>
      <td><?php echo $imprimir['nombre'] ?></td>
      <td><?php echo $imprimir['apellidos'] ?></td>
      <td><?php echo $imprimir['direccion'] ?></td>
      <td><?php echo $imprimir['telefono'] ?></td>
      <td><?php echo $imprimir['edad'] ?></td>
      <td><?php echo $imprimir['altura'] ?></td>
    </tr>
    <?php
        }
     ?>
  </table>
</div>
</body>
</html>
