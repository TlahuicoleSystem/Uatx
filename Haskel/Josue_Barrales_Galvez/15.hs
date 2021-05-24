import Data.Char
getnum::IO Double
getnum = do
  s <- getLine
  return (read s)

imc = do
    putStr("Ingresa el valor 1\n ---->")
    peso <- getnum
    putStr("Ingresa el valor 2\n ---->")
    altura <- getnum
    let resul | imc <= 18.5 ="Delgado"
            | imc <= 25.0 ="Normal"
            | imc <= 30.0 ="Sobrepeso"
            | otherwise ="Obesidad"
             where imc = peso/altura^2
    putStr("El resultado es : "++show(resul))

    -- JOSUE BARRALES GALVEZ
    -- B COMPUATACION
