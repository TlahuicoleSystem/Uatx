import Data.Char
getnum::IO Double
getnum = do
  s <- getLine
  return (read s)

menor_4 = do
    putStr("Ingresa el valor 1")
    x <- getnum
    putStr("Ingresa el valor 2")
    y <- getnum
    putStr("Ingresa el valor 3")
    z <- getnum
    putStr("Ingresa el valor 4")
    w <- getnum
    let res=min (min w x) (min y z)
    putStr("El resultado es : "++show(res))
    putStrLn " "