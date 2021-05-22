import Data.Char
getnum::IO Double
getnum = do
  s <- getLine
  return (read s)

mayor2_G = do
    putStr("Ingresa el valor 1")
    x <- getnum
    putStr("Ingresa el valor 2")
    y <- getnum
    let res | x>=y =x 
            | otherwise =y 
    putStr("El resultado es : "++show(res))
    putStrLn " "