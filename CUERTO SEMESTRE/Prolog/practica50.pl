rinoceronte(indio).
rinoceronte(blanco).
rinoceronte(negro).
rinoceronte(java).
rinoceronte(sumatra).
es-animal(rinoceronte).
es-animal(tigre).
es-animal(leon).
es-animal(elefante).
es-animal(bufalo).

%tiene-cuerno(X):-rinoceronte(X).
digno-de-ser-cazado(X):-rinoceronte(X).
animal-digno(X):-rinoceronte(X).
tiene-cuerno(X):-animal-digno(X),digno-de-ser-cazado(X).