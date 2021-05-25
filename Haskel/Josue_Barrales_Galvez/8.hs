import Data.Char
getnum::IO Double
getnum = do
  s <- getLine
  return (read s)

menor5 = do
    putStr("Ingresa el valor 1\n ---->")
    x <- getnum
    putStr("Ingresa el valor 2\n ---->")
    y <- getnum
    putStr("Ingresa el valor 3\n ---->")
    z <- getnum
    putStr("Ingresa el valor 4\n ---->")
    w <- getnum
    putStr("Ingresa el valor 5\n ---->")
    n <- getnum
    let resul=min n (min (min w x) (min y z))
    putStr("El resultado es : "++show(resul))

    -- JOSUE BARRALES GALVEZ
    -- B COMPUATACION
