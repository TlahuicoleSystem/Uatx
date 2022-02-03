clear
clc
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA RIEMANN\n");
n=input("Ingresa el valor de N:");
a=input("a: ");
b=input("b: ");
fun=input("f(x)=","s");
f=inline(fun);


dx=(b-a)/n;
A=0;
B=0;
x=a;

%izq

for i=1:n
  A=A+f(x)*dx
  x=x+dx;
endfor

%der
x=a;
for i=1:n
  x=x+dx;
  B=B+f(x)*dx
endfor

resultado=(A+B)/2;


fprintf('\nIzquierda es: %f',A)
fprintf('\nDerecha es: %f',B)
fprintf('\nEl resultado es: %f',resultado)
printf("\nMUCHAS GRACIAS EL PROCESO HA TERMINADO");
