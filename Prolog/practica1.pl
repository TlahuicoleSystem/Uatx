obs(belen,carlos).
obs(belen,luis).
obs(federico,maria).
obs(federico,ines).

feliz(X) :- obs(federico,X);obs(belen,X).