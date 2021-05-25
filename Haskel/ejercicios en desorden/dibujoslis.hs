import Graphics.Gloss
main :: IO ()
main = display (InWindow "Circulo concentrico" (300,300) (20,20)) white circulo
circulo :: Picture
circulo = pictures [ circle x | x <- [10,20..100] ]
