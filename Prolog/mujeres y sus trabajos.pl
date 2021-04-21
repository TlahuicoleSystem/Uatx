mujer(clara).
mujer(luisa).
mujer(maria).
mujer(nelida).

trabajo(diseñadora).
trabajo(florista).
trabajo(jardinera).
trabajo(directora_orquesta).

% (a) Clara es violentamente alérgica a las plantas%
%clara no es florista%
noes(clara,florista).
noes(clara,jardinera).
enfermedad_alergia(clara,plantas).

%(b) Luisa y la florista comparten el departamento%
noes(luisa,florista).
concuerdan(jardinera,plantas).
concuerdan(florista,plantas).

%(c) A María y Luisa les gusta solamente la música de rock%
noes(maria,directora_orquesta).
noes(luisa,directora_orquesta).

%(d) La jardinera, la diseñadora de modas y Nélida no se conocen entre sí%
noes(nelida,jardinera).
noes(nelida,diseñadora).

noes(mujer,trabajo):-enfermedad_alergia(mujer,x),concuerdan(trabajo,X).