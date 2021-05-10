
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
		//Resivimos la opcion que el usuario eligio
		$op=$_POST['opp'];
		switch ($op) {
			case '1':
				mysqli_query($conectar, "DELETE FROM agenda3 WHERE edad >= 34");
				break;
			case '2':
				// code...
				mysqli_query($conectar, "TRUNCATE TABLE agenda3");
				break;
			case '3':
				// code...
				mysqli_query($conectar, "DELETE FROM agenda3");
				break;
			case '4':
					//recuperamos la informacion de las variables
				$nombre=$conectar->real_escape_string($_POST['nombre']);
				$apellidos=$conectar->real_escape_string($_POST['apellidos']);
				$direc=$conectar->real_escape_string($_POST['direccion']);
				$tel=$conectar->real_escape_string($_POST['telefono']);
				$edad=$conectar->real_escape_string($_POST['edad']);
				$altura=$conectar->real_escape_string($_POST['altura']);
				//insertamos los valores de las variable a la base de datos
				$sql="INSERT INTO agenda3 VALUES('$nombre','$apellidos','$direc','$tel','$edad','$altura')";


				if ($conectar->query($sql) === TRUE) {
				    echo "<h1>Datos guardados correctamente <br> <a href='index.php'> Gracias!!!  Clic Aqui para regresar </a></h1>";
				    // Informamos del error ocurrido
				} else {
				    echo "Error: " . $sql . "<br>" . "Lo sentimos huboo un problema";
				}
				break;
			default:
				echo "<h1>LO SENTIMOS OCURRIO UN ERROR</h1>";
				break;
		}


	?>
</div>
</body>
</html>
