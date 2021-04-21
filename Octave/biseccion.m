clc
clear
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO \nPORFAVOR INGRESA LOS DATOS PARA BISECCION\n");
a=input('Dame el valor de a:');
b=input('Dame el valor de b:');
TOL=input('Tolerancia:');
No=input('Numero máximo de iteraciones:');

fun=input('La funcion f(x)= ','s');
f=inline(fun);

i=1;
FA=f(a);
while i<=No
  p=(a+b)/2;
  FP=f(p);
  if (FP==0 || (b-a)/2<TOL)
    fprintf("La solucion en la iteracion %f es  %f\n",i,p);
    break
  endif
  if (FP*FA>0)
    fprintf("La solucion en la iteracion %f es  %f\n",i,p);
  a=p;
  FA=FP;
  else
  fprintf("La solucion en la iteracion %f es  %f\n",i,p);
   b=p;
endif
  i = i+1;
endwhile
if(i>No);
printf("MUCHAS GRACIAS EL PROCESO HA TERMINADO");
endif