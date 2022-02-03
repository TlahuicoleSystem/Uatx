
elementoquimico(carbono).
elementoquimico(diyodo).
reductor(carbono).
oxidante(diyodo).

elemento-reductor(X):-elementoquimico(X),reductor(X).
elemento-oxidante(X):-not(reductor(X)).
