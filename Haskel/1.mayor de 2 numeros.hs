import Data.Char
getnum::IO Double
getnum = do
  s <- getLine
  return (read s)

mayor_2 = do
    putStr("Ingresa el valor 1")
    x <- getnum
    putStr("Ingresa el valor 2")
    y <- getnum
    let res=max x y
    putStr("El resultado es : "++show(res))
    putStrLn " "