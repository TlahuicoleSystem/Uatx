import Graphics.Gloss
main :: IO ()
main = display (InWindow "Circulos en estrella" (500,300) (20,20)) white estrella
estrella :: Picture
estrella = pictures [rotate angulo (translate x 0 (circle 10)) | x <- [50,100..200], angulo <- [ 0, 45..360]]
