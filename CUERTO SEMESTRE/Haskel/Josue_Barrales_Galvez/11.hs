import Data.Char
getnum::IO Double
getnum = do
  s <- getLine
  return (read s)

mayor2_G = do
    putStr("Ingresa el valor 1\n ---->")
    x <- getnum
    putStr("Ingresa el valor 2\n ---->")
    y <- getnum
    let resul | x>=y =x
            | otherwise =y
    putStr("El resultado es : "++show(resul))

    -- JOSUE BARRALES GALVEZ
    -- B COMPUATACION
