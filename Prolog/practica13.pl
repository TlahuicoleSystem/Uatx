transporte(roma,15478).
transporte(londres,15234).
transporte(madrid,14951).
alojamiento(hotel,roma,10236).
alojamiento(hotel,londres,14785).
alojamiento(hotel,madrid,10321).
alojamiento(hostal,roma,15201).
alojamiento(hostal,londres,10234).
alojamiento(hostal,madrid,8500).
alojamiento(camping,roma,15987).
alojamiento(camping,londres,4000).
alojamiento(camping,madrid,4000).
viaje(W,X,Y,Z):-transporte(W,A),alojamiento(Y,W,C),B is C*X,Z is A+B