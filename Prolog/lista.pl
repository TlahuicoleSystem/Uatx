%
%lista([],0).
%lista([_|_]).

primeroLista([X|_],X).
ultimoLista([_|Y],Y).
primerosDos([X,Y|_],X,Y).
