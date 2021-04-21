clc
clear
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA spline\n");
n=input(' Escriba el numero de coeficientes:  ');
x=(n);
a=(n);
h=(n);
alfa=(n);
mu=(n);
Z=(n);
b=(n);
c=(n);
d=(n);
l=(n);
for i = 1 : n,
  fprintf('Escribe el valor del coeficiente x %i: ',i);
  x(i) = input('Valor: ');
endfor
for i = 1 : n,
  fprintf('Escribe el valor de f(x) y %i: ',i);
  a(i) = input('Valor: ');
endfor

for i = 1 : n-1,
  h(i)=x(i+1)-x(i);
endfor

for i = 2 : n-1,
  alfa(i)=3/h(i)*(a(i+1)-a(i))-3/h(i-1)*(a(i)-a(i-1));
endfor

l(1)=1;
mu(1)=0;
Z(1)=0;
for i=2 : n-1, 
  l(i)=(2*(x(i+1)-x(i-1)))-(h(i-1)*mu(i-1));
  mu(i)=h(i)/l(i);
  Z(i)=(alfa(i)-(h(i-1)*Z(i-1)))/l(i);
endfor
l(n)=1;
Z(n)=0;
c(n)=0;
j=n-1;
while j>0
   c(j)=Z(j)-(mu(j)*c(j+1));
   b(j)=(a(j+1)-a(j))/h(j)-h(j)*(c(j+1)+2*c(j))/3;
   d(j)=(c(j+1)-c(j))/(3*h(j));
   j=j-1;
endwhile
b(21)=0;
c(21)=0;
d(21)=0;
for j=1:n,
  fprintf('j= %2d, a= %.2f, b= %.2f, c= %.2f y d= %.2f \n',j,a(j),b(j),c(j),d(j));
endfor

archivo = fopen('splinee.wxm.txt','wt');
fprintf(archivo,'draw2d(proportional_axes=xy,');
for (j=1:n-1)
  if(j<n-1)
  fprintf(archivo,'\nexplicit( %f + %f * (x - %f) + %f * ((x - %f)^2) + %f * ((x-%f)^3),x,%f,%f), ',a(j),b(j),x(j),c(j),x(j),d(j),x(j),x(j),x(j+1));  
  end
  if(j==n-1)
  fprintf(archivo,'\nexplicit( %f + %f * (x - %f) + %f * ((x - %f)^2) + %f * ((x-%f)^3),x,%f,%f)',a(j),b(j),x(j),c(j),x(j),d(j),x(j),x(j),x(j+1));
  end
  endfor
fprintf(archivo,'\n);');
fclose(archivo);