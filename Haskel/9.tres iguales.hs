import Data.Char
getnum::IO Double
getnum = do
  s <- getLine
  return (read s)

tres_iguales = do
    putStr("Ingresa el valor 1")
    x <- getnum
    putStr("Ingresa el valor 2")
    y <- getnum
    putStr("Ingresa el valor 3")
    z <- getnum
    let res=(x == y) && (y == z) 
    putStr("El resultado es : "++show(res))
    putStrLn " "