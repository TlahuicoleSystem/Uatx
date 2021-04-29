multiplicaDos x y = x*2 + y*2
sumaDos x = x + 2
msDos x y = sumaDos x + sumaDos y
condicion x = if x > 100 then x else x*2

sumaTres :: Float -> Float -> Float -> Float
sumaTres x y z = x + y + z

mayor :: Float -> Float -> Float
mayor x y = if x > y then x else y

mayor3 :: Float -> Float -> Float -> Float
mayor3 x y z = mayor x (mayor y z)
mayor4 :: Float -> Float -> Float -> Float -> Float
mayor4 w x y z = mayor (mayor w x) (mayor y z)
