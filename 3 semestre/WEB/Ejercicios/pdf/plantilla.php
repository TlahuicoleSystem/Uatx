<?php
    require 'fpdf/fpdf.php';
    class PDF extends FPDF{
        function Header(){
            
            $this->SetFont('Arial','B',30);
            $this->Cell(35);
            $this->Cell(120,15,'FICHA DE REGISTRO',0,0,'C');
            $this->Ln(40);
        }

        function Footer(){
            $this->SetY(-15);
            $this->SetFont('Arial','I',10);
            $this->Cell(120,10,'JOSUE BARRALES GALVEZ',0,0,'L');
            $this->Cell(50,10,'06/12/2020',0,0,'R');
        }
    }

?>
