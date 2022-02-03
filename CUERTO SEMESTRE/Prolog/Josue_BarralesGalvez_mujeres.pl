mujer(clara). 
mujer(luisa). 
mujer(maria). 
mujer(neila).

trabajo(diseñadora). 
trabajo(florista). 
trabajo(jardinera). 
trabajo(directora_de_orquesta).

no(clara,florista).
no(clara,jardinera).

no(luisa,florista).

no(luisa,directora_de_orquesta).
no(maria,directora_de_orquesta).

no(neila,jardinera). 
no(neila,diseñadora).

alergicaS(clara,plantas).
relaciona(jardinera,plantas). 
relaciona(florista,plantas).
no(Mujer,Ocupacion):-alergicaS(Mujer,X),relaciona(Ocupacion,X).

escucha(luisa,rock). 
escucha(maria,rock).

incompatibles(directora_de_orquesta,rock).
no(Mujer,Ocupacion):-escucha(,Mujer,X),incompatibles(Ocupacion,X).

repiten(A,B,C,D):-not(A == B),not(A == C),not(A == D),not(B == C),not(B == D),not(C == D).

ocupaciones([[M1,O1],[M2,O2],[M3,O3],[M4,O4]]):-mujer(M1),mujer(M2),mujer(M3),mujer(M4),
trabajo(O1),trabajo(O2),trabajo(O3),trabajo(O4),repiten(M1,M2,M3,M4),
repiten(O1,O2,O3,O4),not(no(M1,O1)),not(no(M2,O2)),not(no(M3,O3)),not(no(M4,O4)).
