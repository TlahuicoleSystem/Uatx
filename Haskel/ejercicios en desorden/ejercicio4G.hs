import Graphics.Gloss
main :: IO ()
main = display (InWindow "Funciones Predefinidas" (300,300) (20,20)) white circulo
circulo :: Picture
circulo = Pictures [thickCircle 50 10, circle 100, Polygon [(72,72),(144,72),(144,144),(72,144),(72,72)]]
