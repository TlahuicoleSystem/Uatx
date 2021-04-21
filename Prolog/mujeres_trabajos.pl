mujer(clara).
mujer(luisa).
mujer(maria).
mujer(nelida).

trabajo(diseñadora).
trabajo(florista).
trabajo(jardinera).
trabajo(directora_orquesta).


noes(clara,florista).
noes(clara,jardinera).
enfermedad_alergia(clara,plantas).

noes(luisa,florista).
concuerdan(jardinera,plantas).
concuerdan(florista,plantas).


noes(maria,directora_orquesta).
noes(luisa,directora_orquesta).

noes(nelida,jardinera).
noes(nelida,diseñadora).

noes(mujer,trabajo):-enfermedad_alergia(mujer,x),concuerdan(trabajo,X).