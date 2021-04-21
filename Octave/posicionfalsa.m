clc
clear
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA PPOSICION FALSA\n");
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
  if abs(p-p1)<TOL
    fprintf("Termino el procedimiento en la iteracion %f y el valor es %f \n",i,p);
  break
  endif
i=i+1;
q= f(p);
  fprintf("La solucion  es  %f\n",p);
  if (q*q1) < 0
    po=p1;
    qo=q1;
  endif
  p1 = p;
  q1 = q;
endwhile

if(i>No);
printf("MUCHAS GRACIAS EL PROCESO HA TERMINADO");
endif
