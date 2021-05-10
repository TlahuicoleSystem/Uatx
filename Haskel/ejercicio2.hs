mayorG :: Integer -> Integer -> Integer
mayorG x y | x>=y =x | otherwise =y

mayorG3 :: Integer -> Integer -> Integer -> Integer
mayorG3 x y z | x>=y && y>=z =x | y>=z =y | otherwise =z

mayorG4 :: Integer -> Integer -> Integer -> Integer -> Integer
mayorG4 w x y z | w>=x && w>=y && w>=z =w | x>=y && y>=z =x | y>=z =y | otherwise =z

imc :: Float -> Float -> String
imc peso altura | (peso/altura^2 <= 18.5) ="Delgado" | (peso/altura^2 <= 25.0) ="Normal" | (peso/altura^2 <= 30.0) ="Peso Elevado" | otherwise ="Sobrepeso"

imcWhere :: Float -> Float -> String
imcWhere peso altura | imc <= 18.5 ="Delgado" | imc <= 25.0 ="Normal" | imc <= 30.0 ="Peso Elevado" | otherwise ="Sobrepeso" where imc = peso/altura^2
