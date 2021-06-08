
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
width: 70%;
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
	<h4>Ingrese el matricula:</h4>
	<input type="number" name="matricula" value="">
	<br/><br/>
	<h4>Ingrese el domicilio:</h4>
	<input type="text" name="domicilio" value="">
	<br/><br/>
	<h4>Ingrese localidad:</h4>
	<input type="text" name="localidad" value="">
	<br/><br/>
	<h4>Ingrese la codigo postal:</h4>
	<input type="number" name="cp" value="">
	<br/><br/>
  <h4>Ingrese la estado:</h4>
	<input type="text" name="estado" value="">
	<br/><br/>
  <h4>Ingrese la telefono:</h4>
	<input type="number" name="telefono" value="">
	<br/><br/>
  <h4>Ingrese la fecha:</h4>
	<input type="text" name="fecha" value="">
	<br/><br/>
  <h4>Ingrese la edad:</h4>
	<input type="number" name="edad" value="">
	<br/><br/>
  <h4>Ingrese la curso:</h4>
	<input type="text" name="curso" value="">
	<br/><br/>
  <h4>Ingrese la tutor:</h4>
	<input type="text" name="tutor" value="">
	<br/><br/>

	<input type="submit" name="" value="Guardar">
	</form>

	<!-- BOTON GENERAR   -->
	<form name="generar" action="principal.php" method="POST">
	<input type="submit" name="" value="Generar PDF">
	</form>

</div>
</body>
</html>
