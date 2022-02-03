import Graphics.Gloss
main :: IO ()
main = display (InWindow "Circulo Trasladado" (500,300) (20,20)) white circulotras
circulotras :: Picture
circulotras = pictures [translate x 0 (circle 80) | x <- [-100,-60..100]]
