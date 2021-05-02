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
table {
   width: 100%;
   border: 6px solid #000;
}
th,td{
  border: 1px solid #000;
   border-spacing: 0;
}
form{
  text-align: center;
  background: #996633;
  width: 70%;
  margin-left: auto;
  margin-right: auto;
}
.prueba{
  background: #0066FF;
  color: #FFF;
  font-family: 'Rock Salt', cursive;
}
</style>
</head>

<body>
<div class="for">
<!-- FORMULRIO PARA ENVIO DE DATOS-->

  <form name="Recopilacion de datos" action="envio.php" method="POST">
	<h4>Ingrese el nombre:</h4>
	<input type="text" name="nombre" value="">
	<br/><br/>
	<h4>Ingrese sus Apellidos:</h4>
	<input type="text" name="apellidos" value="">
	<br/><br/>
	<h4>Ingrese el Direcccion:</h4>
	<input type="text" name="direccion" value="">
	<br/><br/>
	<h4>Ingrese el Telefono:</h4>
	<input type="number" name="telefono" value="">
	<br/><br/>
	<h4>Ingrese la Edad:</h4>
	<input type="number" name="edad" value="">
	<br/><br/>
	<h4>Ingrese la Altura:</h4>
	<input step="any" type="number" name="altura" value="">
	<br/><br/>
	<input type="submit" name="" value="Guardar">
	</form>

  <!-- CREACION DE LA TABLA -->
  <table>
    <tr class="prueba">
      <td>Nombre</td>
      <td>Apellidos</td>
      <td>Direccion</td>
      <td>Telefono</td>
      <td>Edad</td>
      <td>Altura</td>
    </tr>
    <!-- RECUPERANDO DATOS DE LA BASE DE DATOS-->
    <?php
      $sql="SELECT * from companero";
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
