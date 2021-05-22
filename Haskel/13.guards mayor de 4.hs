import Data.Char
getnum::IO Double
getnum = do
  s <- getLine
  return (read s)

mayor4_G = do
    putStr("Ingresa el valor 1")
    x <- getnum
    putStr("Ingresa el valor 2")
    y <- getnum
    putStr("Ingresa el valor 3")
    w <- getnum
    putStr("Ingresa el valor 4")
    z <- getnum
    let res | w>=x && w>=y && w>=z =w
            | x>=y && y>=z =x 
            | y>=z =y 
            | otherwise =z
    putStr("El resultado es : "++show(res))
    putStrLn " "