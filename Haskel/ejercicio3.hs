import Graphics.Gloss

main :: IO ()
main = display(InWindow "Dibuja un cuadrado" (300,300) (20,20)) white cuadrado
cuadrado :: Picture
cuadrado = Line [(72,72),(144,72),(144,144),(72,144),(72,72)]
