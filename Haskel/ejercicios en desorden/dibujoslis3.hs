import Graphics.Gloss
main :: IO ()
main = display (InWindow "Rectangulo" (500,300) (20,20)) white rectangulotras
rectangulotras :: Picture
rectangulotras = pictures [rotate x (rectangleWire 200 200) | x <- [0,10..90]]
