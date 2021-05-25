import Data.Char
getnum::IO Double
getnum = do
  s <- getLine
  return (read s)

mayor5_G = do
    putStr("Ingresa el valor 1\n ---->")
    x <- getnum
    putStr("Ingresa el valor 2\n ---->")
    y <- getnum
    putStr("Ingresa el valor 3\n ---->")
    w <- getnum
    putStr("Ingresa el valor 4\n ---->")
    z <- getnum
    putStr("Ingresa el valor 5\n ---->")
    n <- getnum
    let resul | n>=x && n>=y && n>=z && n>=w =n
            | w>=x && w>=y && w>=z =w
            | x>=y && y>=z =x
            | y>=z =y
            | otherwise =z
    putStr("El resultado es : "++show(resul))

    -- JOSUE BARRALES GALVEZ
    -- B COMPUATACION
