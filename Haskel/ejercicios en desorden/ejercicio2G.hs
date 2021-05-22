import Graphics.Gloss

main :: IO ()
main = display (InWindow "El Dibujo resultante es:" (300,300) (20,20)) white cuadrado1
cuadrado1 :: Picture
cuadrado1 = Polygon [(72,72),(144,72),(144,144),(72,144),(72,72)]
