clc
clear
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA DIFERENCIAS DIVIDIDAS\n");

n=input('Grado polinomio... ');

for i = 1 : n,
  fprintf("Introduzca el valor de x en la posicion %f ",i);
   x(i)=input("... ");
endfor
for i = 1 : n,
  fprintf("Introduzca el valor de f(x) en la posicion %f ",i);
    f(i,1)=input("... ");
endfor
for i = 2 : n,
  for j = 2 : i,
   f(i,j)= (f(i,j-1)-f(i-1,j-1))/(x(i)-x(i-j+1));
  endfor
endfor
disp(f);


archivo= fopen('ddnewton.txt','w+');
fprintf (archivo,'%f',f(1,1));
for i=2:n,
  fprintf(archivo,'+%f',f(i,i));
  for j=1:i-1,
    fprintf(archivo,'*(x-%f)',x(j));
  endfor
endfor
fclose(archivo)