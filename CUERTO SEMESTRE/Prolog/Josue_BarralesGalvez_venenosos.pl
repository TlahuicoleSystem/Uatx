venenoso_no(violeta,azul).
venenoso_no(rojo,amarillo).
venenoso_no(azul,anaranjado).

uno_no_venenoso(violeta,amarillo).
uno_no_venenoso(rojo,anaranjado).
uno_no_venenoso(verde,azul).

venenoso(X):-(venenoso_no(X,Y);venenoso_no(Y,X)),no_venenoso(Y).

no_venenoso(X):-(uno_no_venenoso(X,Y);uno_no_venenoso(Y,X)),venenoso(Y).

no_venenoso(rojo).