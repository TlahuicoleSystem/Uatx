clc
clear
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA HORNER\n");

n=input("Ingrese el grado: ");
numeros=zeros(n); 
for i = 1 : n;
  fprintf("En la posicion  %d",i);
  numeros(i)= input(" ngrese el numero... ");
endfor

x=input("Ingresa el valor de x... ");
y=numeros(n);
z=numeros(n);
j=n-1;
while j>1
  y=x*y+numeros(j);
  z=x*z+y;
  j=j-1;
endwhile
y=x*y+numeros(1);
fprintf("\nEl resultado del valor de (y) es: %d\n El valor de (z) es: %d",y,z);