data Figura = Circulo Float | Rect Float Float
cuadrado :: Float -> Figura
cuadrado n = Rect n n
area :: Figura -> Float
area (Circulo r) = pi*r^2
area (Rect x y) = x*y
