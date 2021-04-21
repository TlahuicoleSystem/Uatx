clc
clear
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA MULLER\n");
po=input('Aproximacion 0: ');
p1=input('Aproximacion 1: ');
p2=input('Aproximacion 2: ');
TOL=input('Tolerancia: ');
No=input('Maximo de iteraciones: ');

fun=input('La funcion f(x)= ','s');
f=inline(fun);
h1 = p1 - po;
h2 = p2 - p1;
s1 = (f(p1) - f(po))/h1;
s2 = (f(p2) - f(p1))/h2;
d = (s2 - s1)/(h2 + h1);
i=3;

while i<=No
  b=s2+h2*d;
  D=(b^2 -4 * f(p2)*d)^(1/2);
  if abs(b-D) < abs(b+D)
    E=b+D;
  else
    E=b-D; %CHECAR ESTO
  endif
  h=-2*f(p2)/E;
  p=p2+h;
  printf("el valor es: %f  +  %f í\n",real(p),imag(p));
  if abs(h)<TOL
    printf("Fin del metodo el valor final es: %f  +  %f í\n",real(p),imag(p));
  break
  endif
po=p1;
p1=p2;
p2=p;
h1=p1-po;
h2=p2-p1;
s1=(f(p1)-f(po))/h1;
s2=(f(p2)-f(p1))/h2;
d=(s2-s1)/(h2-h1);
i=i+1;
endwhile
if(i>No);
printf("MUCHAS GRACIAS EL PROCESO HA TERMINADO");
endif