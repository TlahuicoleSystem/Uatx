clc
clear
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA SECANTE\n");
po=input('Aproximacion Po: ');
p1=input('Aproximacion P1: ');
TOL=input('Tolerancia: ');
No=input('Maximo de iteraciones: ');
fun=input('La funcion f(x)= ','s');
f=inline(fun);

i=2;
qo=f(po);
q1=f(p1);
while i<=No
  p=p1-q1*(p1-po)/(q1-qo);
   fprintf("La solucion en la iteracion %f es  %f\n",i,p);
  if abs(p-p1)<TOL
    printf("Termino el procedimiento en la iteracion %f  y el valor es %f \n",i,p);
  break
 endif
 i=i+1;
 po=p1;
 qo=q1;
 p1=p;
 q1=f(p);
endwhile
if(i>No);
printf("MUCHAS GRACIAS EL PROCESO HA TERMINADO");
endif