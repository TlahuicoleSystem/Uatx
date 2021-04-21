clc
clear
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA STEFFENSEN\n");
po=input('Aproximacion: ');
TOL=input('Tolerancia: ');
No=input('Maximo de iteraciones: ');

fun=input('La funcion f(x)= ','s');
g=inline(fun); 

i=1;
while i<=No
  p1= g(po);
  p2= g(p1);
  p = po - (p1-po)^2 / (p2-2*p1+po);
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