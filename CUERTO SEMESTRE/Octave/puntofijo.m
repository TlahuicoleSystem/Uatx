clc
clear
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA PUNTO FIJO\n");
po=input('Aproximacion: ');
TOL=input('Tolerancia: ');
No=input('Maximo de iteraciones: ');
fun=input('La funcion f(x)= ','s');
g=inline(fun);

i=1;
po
while i<=No
p=g(po);
if abs(p-po)<TOL
  printf("Termino el procedimiento y el valor es %f \n",p);
  break
 endif
 i=i+1;
 po=p;
 fprintf("La solucion es  %f\n",p);
endwhile
if(i>No);
printf("MUCHAS GRACIAS EL PROCESO HA TERMINADO");
endif
  
  