entrada(paella,200,80).
entrada(gaspacho,150,50).
entrada(consome,300,50).

carne(filete-de-cerdo,400,150).
carne(pollo-asado,280,150).
pescado(trucha,160,200).
pescado(bacalao,300,250).

postre(flan,200,30).
postre(nueces-con-miel,500,50).
postre(naranja,50,250).


plato-principal(PF,Cal,Costo):-carne(PF,Cal,Costo);pescado(PF,Cal,Costo).
calorias(X,Y,Z,V):-V is X+Y+Z.
precio(A,B,C,D):-D is A+B+C.
menu(E,PF,P,Cal,Pre):-entrada(E,X,A),plato-principal(PF,Y,B),postre(P,Z,C),calorias(X,Y,Z,Cal),precio(A,B,C,Pre).