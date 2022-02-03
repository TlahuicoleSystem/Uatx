clc
clear
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA NEWTON PERO MODIFICADO\n");
po=input('Aproximacion: ');
TOL=input('Tolerancia: ');
No=input('Maximo de iteraciones: ');

fun=input('La funcion f(x)= ','s');
g=inline(fun);

funn=input('La derivada f(x)= ','s');
d=inline(funn);

funnn=input('La segunda derivada f(x)= ','s');
sd=inline(funnn);

i=1;
while i<=No
  p=po-(g(po)*d(po)) / (d(po)^2 - g(po)*sd(po));
  
  if abs(p-po)<TOL
    printf("Termino el procedimiento en la iteracion %f  y el valor es %f \n",i,p);
  break
 endif
 i=i+1;
 po=p;
 fprintf("La solucion en la iteracion %f es  %f\n",i,p);
endwhile
if(i>No);
printf("MUCHAS GRACIAS EL PROCESO HA TERMINADO");
endif