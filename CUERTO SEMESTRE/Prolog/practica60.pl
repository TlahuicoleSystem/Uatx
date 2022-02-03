orbita_entorno_a(tierra,sol).
orbita_entorno_a(luna,tierra).
orbita_entorno_a(cuerpo,sol).

planeta(X):-orbita_entorno_a(X,sol).
satelite(X):-orbita_entorno_a(X,tierra).