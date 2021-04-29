
lista:-write('Cuantos elementos desea ingresar: '),read(N),leer(N,L),
nl,write('Los elementos son: '),imprime_lista(L),
nl,write('Elemento a buscar: '),read(X),busca(X,L),
nl,write('El numero mayor es: '),mayor(X,L),
nl,write('El numero menor es: '),menor(X,L),
nl,write('La suma es: : '),sumar(X,L),
nl,write('La inversa es: '),reversa(X,L).
leer(0,[]):-!.
leer(N,[C|R]):-read(C), Z is N-1,leer(Z,R).

imprime_lista([]).
imprime_lista([C|R]):- nl,write(C),tab(20),imprime_lista(R).

busca(_,[]):-write('No esta !'),nl.
busca(X,[X|_]):-write('Si esta !'),nl.
busca(X,[_|Y]):-busca(X,Y).

mayor(_,[C|R]):-max_member(Mayor,[C|R]),write(Mayor).
menor(_,[C|R]):-min_member(Menor,[C|R]),write(Menor).
sumar(_,[C|R]):-sum_list([C|R],Suma),write(Suma).
reversa(_,[C|R]):-reverse([C|R],Inversa),write(Inversa).
