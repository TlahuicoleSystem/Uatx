
condiciones_p(A,B,C):-A>0,B>0,C>0.
restriccion_n(A,B,C):-A=<C,B=<C,A+B>C.
restriccion_n(A,B,C):-A=<B,C=<B,A+C>B.
restriccion_n(A,B,C):-B=<A,C=<A,B+C>A.

es_triangulo(A,B,C):-condiciones_p(A,B,C),restriccion_n(A,B,C).

equilatero(A,B,C):-A=B,A=C.
isosceles(A,B,C):-A=C,A\=B.
isosceles(A,B,C):-A=B,A\=C.
isosceles(A,B,C):-C=B,C\=A.
escaleno(A,B,C):-A\=B,B\=C,A\=C.
tipo(A,B,C):-equilatero(A,B,C),write('equilatero').
tipo(A,B,C):-isosceles(A,B,C),write('isosceles').
tipo(A,B,C):-escaleno(A,B,C),write('escaleno').

triangulo(A,B,C):-es_triangulo(A,B,C),tipo(A,B,C).
