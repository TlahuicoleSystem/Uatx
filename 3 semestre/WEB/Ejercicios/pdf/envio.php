<?php

//Provamos conexion con el servidor
$conectar = new mysqli('localhost','root','','uatx');

//verificamos la conexion
if($conectar->connect_error)
	die("no se pudo conectar con el servidor");

//recuperamos la informacion de las variables
$nombre=$conectar->real_escape_string($_POST['nombre']);
$apellidos=$conectar->real_escape_string($_POST['apellidos']);
$matricula=$conectar->real_escape_string($_POST['matricula']);
$domicilio=$conectar->real_escape_string($_POST['domicilio']);
$localidad=$conectar->real_escape_string($_POST['localidad']);
$cp=$conectar->real_escape_string($_POST['cp']);
$estado=$conectar->real_escape_string($_POST['estado']);
$telefono=$conectar->real_escape_string($_POST['telefono']);
$fecha=$conectar->real_escape_string($_POST['fecha']);
$edad=$conectar->real_escape_string($_POST['edad']);
$curso=$conectar->real_escape_string($_POST['curso']);
$tutor=$conectar->real_escape_string($_POST['tutor']);
//insertamos los valores de las variable a la base de datos
$sql="INSERT INTO pdf VALUES('$nombre','$apellidos','$matricula','$domicilio',
'$localidad','$cp','$estado','$telefono','$fecha','$edad','$curso','$tutor')";


if ($conectar->query($sql) === TRUE) {
    echo "<h1>Datos guardados correctamente <br> <a href='index.php'>  Clic Aqui para regresar </a></h1>";
		echo $telefono;
    // Informamos del error ocurrido
} else {
    echo "Error: " . $sql . "<br>" . "Lo sentimos huboo un problema";
}


?>
