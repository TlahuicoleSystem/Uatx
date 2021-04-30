import Graphics.Gloss
main :: IO ()
main = display (InWindow "Funciones Predefinidas" (300,300) (20,20)) white circulo
circulo :: Picture
circulo = thickCircle 50 10
