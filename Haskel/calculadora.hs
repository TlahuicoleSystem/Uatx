-- JOSUE BARRALES GALVEZ 
-- B COMPUATACION

getnum::IO Int
getnum = do
  s <- getLine
  return (read s)

calculadora = do
--Llamada de la funcion

putStr(" 1.- Sumar\n 2.- Restar\n 3.- Multiplicar\n 4.- Dividir\n ---->")
opc <- getnum
--Recuperamos el valor que eligio el usuario

putStr("Numero 1\n ---->")
numero <- getnum --Recuperamos el valor del primer digito

putStr("Numero 2\n ---->")
numerod <- getnum --Recuperamos el valor del segundo digito

let suma = [c+d | c <- [numero], d <- [numerod]] --operacion de la suma
let resta = [c-d | c <- [numero], d <- [numerod]] --operacion de la resta
let multiplica = [c*d | c <- [numero], d <- [numerod]] -- operacion de la multipliacion
let divide = [c `div` d | c <- [numero], d <- [numerod]] -- operacion de la division

let resultado = if opc==1 then suma else if opc==2 then resta else if opc==3 then multiplica else if opc==4 then divide else []
--por medio de la condicion se elige la operacion a realizar

putStr(" Total:"++show(resultado)++"\n")
--Se imprime el resultado de la operacion
