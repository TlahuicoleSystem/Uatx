<?php
 //Incluimos librería y archivo de conexión
 require 'Classes/PHPExcel.php';
 require 'conexion.php';

 //Consulta
 $sql = "SELECT nombre, apellidos, matricula,domicilio,localidad,cp,estado,telefono,fecha,edad,curso,tutor FROM pdf";
 $resultado = $mysqli->query($sql);
 $fila = 7; //Establecemos en que fila inciara a imprimir los datos

 //Objeto de PHPExcel
 $objPHPExcel  = new PHPExcel();

 //Propiedades de Documento
 $objPHPExcel->getProperties()->setCreator("Josue Barrales")->setDescription("Datos");

 //Establecemos la pestaña activa y nombre a la pestaña
 $objPHPExcel->setActiveSheetIndex(0);
 $objPHPExcel->getActiveSheet()->setTitle("DATOS");

 $objDrawing = new PHPExcel_Worksheet_MemoryDrawing();
 $objDrawing->setName('Logotipo');
 $objDrawing->setDescription('Logotipo');
 $objDrawing->setImageResource($gdImage);
 $objDrawing->setRenderingFunction(PHPExcel_Worksheet_MemoryDrawing::RENDERING_PNG);
 $objDrawing->setMimeType(PHPExcel_Worksheet_MemoryDrawing::MIMETYPE_DEFAULT);
 $objDrawing->setHeight(100);
 $objDrawing->setCoordinates('A1');
 $objDrawing->setWorksheet($objPHPExcel->getActiveSheet());

 $estiloTituloReporte = array(
   'font' => array(
 'name'      => 'Arial',
 'bold'      => true,
 'italic'    => false,
 'strike'    => false,
 'size' =>13
   ),
   'fill' => array(
 'type'  => PHPExcel_Style_Fill::FILL_SOLID
 ),
   'borders' => array(
 'allborders' => array(
 'style' => PHPExcel_Style_Border::BORDER_NONE
 )
   ),
   'alignment' => array(
 'horizontal' => PHPExcel_Style_Alignment::HORIZONTAL_CENTER,
 'vertical' => PHPExcel_Style_Alignment::VERTICAL_CENTER
   )
 );

 $estiloTituloColumnas = array(
   'font' => array(
 'name'  => 'Arial',
 'bold'  => true,
 'size' =>10,
 'color' => array(
 'rgb' => 'FFFFFF'
 )
   ),
   'fill' => array(
 'type' => PHPExcel_Style_Fill::FILL_SOLID,
 'color' => array('rgb' => '538DD5')
   ),
   'borders' => array(
 'allborders' => array(
 'style' => PHPExcel_Style_Border::BORDER_THIN
 )
   ),
   'alignment' =>  array(
 'horizontal'=> PHPExcel_Style_Alignment::HORIZONTAL_CENTER,
 'vertical'  => PHPExcel_Style_Alignment::VERTICAL_CENTER
   )
 );

 $estiloInformacion = new PHPExcel_Style();
 $estiloInformacion->applyFromArray( array(
   'font' => array(
 'name'  => 'Arial',
 'color' => array(
 'rgb' => '000000'
 )
   ),
   'fill' => array(
 'type'  => PHPExcel_Style_Fill::FILL_SOLID
 ),
   'borders' => array(
 'allborders' => array(
 'style' => PHPExcel_Style_Border::BORDER_THIN
 )
   ),
 'alignment' =>  array(
 'horizontal'=> PHPExcel_Style_Alignment::HORIZONTAL_CENTER,
 'vertical'  => PHPExcel_Style_Alignment::VERTICAL_CENTER
   )
 ));

 $objPHPExcel->getActiveSheet()->getStyle('A1:E4')->applyFromArray($estiloTituloReporte);
 $objPHPExcel->getActiveSheet()->getStyle('A6:E6')->applyFromArray($estiloTituloColumnas);

 $objPHPExcel->getActiveSheet()->setCellValue('B3', 'REPORTE DE PRODUCTOS');
 $objPHPExcel->getActiveSheet()->mergeCells('B3:D3');

 $objPHPExcel->getActiveSheet()->getColumnDimension('A')->setWidth(10);
 $objPHPExcel->getActiveSheet()->setCellValue('A6', 'ID');
 $objPHPExcel->getActiveSheet()->getColumnDimension('B')->setWidth(30);
 $objPHPExcel->getActiveSheet()->setCellValue('B6', 'NOMBRE');
 $objPHPExcel->getActiveSheet()->getColumnDimension('C')->setWidth(10);
 $objPHPExcel->getActiveSheet()->setCellValue('C6', 'PRECIO');
 $objPHPExcel->getActiveSheet()->getColumnDimension('D')->setWidth(10);
 $objPHPExcel->getActiveSheet()->setCellValue('D6', 'EXISTENCIA');
 $objPHPExcel->getActiveSheet()->getColumnDimension('E')->setWidth(10);
 $objPHPExcel->getActiveSheet()->setCellValue('E6', 'TOTAL');

 //Recorremos los resultados de la consulta y los imprimimos
 while($rows = $resultado->fetch_assoc()){

   $objPHPExcel->getActiveSheet()->setCellValue('A'.$fila, $rows['id']);
   $objPHPExcel->getActiveSheet()->setCellValue('B'.$fila, $rows['nombre']);
   $objPHPExcel->getActiveSheet()->setCellValue('C'.$fila, $rows['precio']);
   $objPHPExcel->getActiveSheet()->setCellValue('D'.$fila, $rows['existencia']);
   $objPHPExcel->getActiveSheet()->setCellValue('E'.$fila, '=C'.$fila.'*D'.$fila);

   $fila++; //Sumamos 1 para pasar a la siguiente fila
 }

?>
