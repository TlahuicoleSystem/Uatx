import Data.Char
getnum::IO Double
getnum = do
  s <- getLine
  return (read s)

mayor5_G = do
    putStr("Ingresa el valor 1")
    x <- getnum
    putStr("Ingresa el valor 2")
    y <- getnum
    putStr("Ingresa el valor 3")
    w <- getnum
    putStr("Ingresa el valor 4")
    z <- getnum
    putStr("Ingresa el valor 5")
    n <- getnum
    let res | n>=x && n>=y && n>=z && n>=w =n 
            | w>=x && w>=y && w>=z =w 
            | x>=y && y>=z =x 
            | y>=z =y 
            | otherwise =z
    putStr("El resultado es : "++show(res))
    putStrLn " " 