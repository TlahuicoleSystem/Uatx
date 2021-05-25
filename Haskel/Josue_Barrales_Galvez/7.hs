import Data.Char
getnum::IO Double
getnum = do
  s <- getLine
  return (read s)

menor4 = do
    putStr("Ingresa el valor 1\n ---->")
    x <- getnum
    putStr("Ingresa el valor 2\n ---->")
    y <- getnum
    putStr("Ingresa el valor 3\n ---->")
    z <- getnum
    putStr("Ingresa el valor 4\n ---->")
    w <- getnum
    let resul=min (min w x) (min y z)
    putStr("El resultado es : "++show(resul))

    -- JOSUE BARRALES GALVEZ
    -- B COMPUATACION
