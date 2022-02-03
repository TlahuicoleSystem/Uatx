import Data.Char
getnum::IO Double
getnum = do
  s <- getLine
  return (read s)

3diferentes = do
    putStr("Ingresa el valor 1\n ---->")
    x <- getnum
    putStr("Ingresa el valor 2\n ---->")
    y <- getnum
    putStr("Ingresa el valor 3\n ---->")
    z <- getnum
    let resul=((x /= y) && (y /= z) && (x /= z))
    putStr("El resultado es : "++show(resul))

    -- JOSUE BARRALES GALVEZ
    -- B COMPUATACION
