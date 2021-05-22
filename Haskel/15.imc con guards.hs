import Data.Char
getnum::IO Double
getnum = do
  s <- getLine
  return (read s)

imc = do
    putStr("Ingresa el valor 1")
    peso <- getnum
    putStr("Ingresa el valor 2")
    altura <- getnum
    let res | imc <= 18.5 ="Delgado" 
            | imc <= 25.0 ="Normal" 
            | imc <= 30.0 ="Peso Elevado" 
            | otherwise ="Sobrepeso" 
             where imc = peso/altura^2
    putStr("El resultado es : "++show(res))
    putStrLn " "