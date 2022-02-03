clc
clear
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA NEWTON\n");
po=input('Aproximacion: ');
TOL=input('Tolerancia: ');
No=input('Maximo de iteraciones: ');

fun=input('La funcion f(x)= ','s');
g=inline(fun);

funn=input('La derivada f(x)= ','s');
d=inline(funn);

i=1;
while i<=No
  p=po-g(po)/d(po);
  
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
