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

menor :: Float -> Float -> Float
menor x y = if x < y then x else y
menor3 :: Float -> Float -> Float -> Float
menor3 x y z = menor x (menor y z)
menor4 :: Float -> Float -> Float -> Float -> Float
menor4 w x y z = menor (menor w x) (menor y z)

tresIguales :: Float -> Float -> Float -> Bool
tresIguales x y z = (x == y) && (y == z)
tresDiferentes :: Float -> Float -> Float -> Bool
tresDiferentes x y z = ((x /= y) && (y /= z) && (x /= z))

mayorG :: Float -> Float -> Float
mayorG x y | x>=y =x | otherwise =y
