import Data.Char
getnum::IO Double
getnum = do
  s <- getLine
  return (read s)

mayor3 = do
    putStr("Ingresa el valor 1\n ---->")
    x <- getnum
    putStr("Ingresa el valor 2\n ---->")
    y <- getnum
    putStr("Ingresa el valor 3\n ---->")
    z <- getnum
    let resul=max z (max x y)
    putStr("El resultado es : "++show(resul))
    -- JOSUE BARRALES GALVEZ
    -- B COMPUATACION
