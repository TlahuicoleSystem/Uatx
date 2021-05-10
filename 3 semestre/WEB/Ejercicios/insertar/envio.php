

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

</style>
</head>

<body>
<div class="for">
	<?php

	//Provamos conexion con el servidor
	$conectar = new mysqli('localhost','root','','uatx');

	//verificamos la conexion
	if($conectar->connect_error)
		die("no se pudo conectar con el servidor");

	//recuperamos la informacion de las variables
	$nombre=$conectar->real_escape_string($_POST['nombre']);
	$apellidos=$conectar->real_escape_string($_POST['apellidos']);
	$direc=$conectar->real_escape_string($_POST['direccion']);
	$tel=$conectar->real_escape_string($_POST['telefono']);
	$edad=$conectar->real_escape_string($_POST['edad']);
	$altura=$conectar->real_escape_string($_POST['altura']);
	//insertamos los valores de las variable a la base de datos
	$sql="INSERT INTO companero VALUES('$nombre','$apellidos','$direc','$tel','$edad','$altura')";


	if ($conectar->query($sql) === TRUE) {
	    echo "<h1>Datos guardados correctamente <br> <a href='index.php'> Gracias!!!  Clic Aqui para regresar </a></h1>";

	    // Informamos del error ocurrido
	} else {
	    echo "Error: " . $sql . "<br>" . "Lo sentimos huboo un problema";
	}

	?>
</div>
</body>
</html>
