<?php
include 'plantilla.php';
require 'conexion.php';
include 'barcode.php';
$query ="SELECT * from pdf"; //aqui va la consulta pero tengo que checar
$resultado = $mysqli->query($query);

$pdf = new PDF();
//Crea una hoja
$pdf->SetFont('Arial','B',19);
while ($row = $resultado->fetch_assoc()){
    $pdf->AddPage();
    $code = $row['matricula'];
    $pdf->Cell(49,17,'NOMBRE',1,0,'C',0);
    $pdf->Cell(140,17,utf8_decode($row['nombre']),1,1,'C',0);

    $pdf->Cell(49,17,'APELLIDOS',1,0,'C',0);
    $pdf->Cell(140,17,utf8_decode($row['apellidos']),1,1,'C',0);

    $pdf->Cell(49,17,'MATRICULA',1,0,'C',0);
    barcode('codigos/'.$code.'.png', $code, 20, 'horizontal', 'code128', true);
		$pdf->Image('codigos/'.$code.'.png',100,90,38,0,'PNG');
    $pdf->Cell(140,17,'',1,1,'C',0);

    $pdf->Cell(49,17,'DOMICILIO',1,0,'C',0);
    $pdf->Cell(140,17,utf8_decode($row['domicilio']),1,1,'C',0);

    $pdf->Cell(49,17,'LOCALIDAD',1,0,'C',0);
    $pdf->Cell(88,17,utf8_decode($row['localidad']),1,0,'C',0);
    $pdf->Cell(22,17,'C.P.',1,0,'C',0);
    $pdf->Cell(30,17,utf8_decode($row['cp']),1,1,'C',0);

    $pdf->Cell(49,17,'ESTADO',1,0,'C',0);
    $pdf->Cell(60,17,utf8_decode($row['estado']),1,0,'C',0);
    $pdf->Cell(38,17,'TELEFONO',1,0,'C',0);
    $pdf->Cell(42,17,utf8_decode($row['telefono']),1,1,'C',0);

    $pdf->Cell(71,17,'FECHA NACIMIENTO',1,0,'C',0);
    $pdf->Cell(75,17,utf8_decode($row['fecha']),1,0,'C',0);
    $pdf->Cell(25,17,'EDAD',1,0,'C',0);
    $pdf->Cell(18,17,utf8_decode($row['edad']),1,1,'C',0);

    $pdf->Cell(49,17,'CURSO',1,0,'C',0);
    $pdf->Cell(140,17,utf8_decode($row['curso']),1,1,'C',0);

    $pdf->Cell(49,17,'TUTOR',1,0,'C',0);
    $pdf->Cell(140,17,utf8_decode($row['tutor']),1,1,'C',0);
}

$pdf->Output();
?>
