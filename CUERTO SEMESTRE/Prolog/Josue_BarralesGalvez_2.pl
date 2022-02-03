
persona(luci).
persona(juan).
persona(cris).
suscrita(luci).
suscrita(cris).
suscritas-al-times(X):-suscrita(X).
persona-educada(X):-suscrita(X),persona(X).
