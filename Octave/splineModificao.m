clc
clear
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA spline condicionado\n");
n=input(' Escriba el numero de coeficientes:  ');

for i = 1 : n,
  fprintf("Intruduce X%d",i-1);
  x(i)=input('= '); 
endfor

for i = 1 : n,
  fprintf("Intruduce F(x)%d",i-1);
  a(i)=input('= ');
endfor
fprintf("Intruduce F'(x) de la posicon 0 %d");
FPO=input('= '); 

fprintf("Intruduce F'(x) de la ultima posicion %d");
FPN=input('= ');

for i = 1 : n-1,
  h(i)=x(i+1)-x(i);
endfor
alfa(1)=3*(a(2)-a(1))/h(1)-3*FPO;
alfa(n)=3*FPN-3*(a(n)-a(n-1))/h(n-1);
for i = 2 : n-1,
  alfa(i)=3/h(i)*(a(i+1)-a(i))-3/h(i-1)*(a(i)-a(i-1));
endfor

l(1)=2*h(1);
mu(1)=0.5;
Z(1)=a(1)/l(1);
for i=2 : n-1, 
  l(i)=2*(x(i+1)-x(i-1))-(h(i-1))*(mu(i-1));
  mu(i)=h(i)/l(i);
  Z(i)=(alfa(i)-(h(i-1)*Z(i-1)))/l(i);
endfor
l(n)=h(n-1)*(2-mu(n-1));
Z(n)=(alfa(n)-h(n-1)*Z(n-1))/l(n);
c(n)=Z(n);
j=n-1;
while j>0
   c(j)=Z(j)-(mu(j)*c(j+1));
   b(j)=(a(j+1)-a(j))/h(j)-h(j)*(c(j+1)+2*c(j))/3;
   d(j)=(c(j+1)-c(j))/(3*h(j));
   j=j-1;
endwhile
b(n+1)=0;
c(n+1)=0;
d(n+1)=0;
for j=1:n,
  fprintf('j= %2d, a= %.2f, b= %.2f, c= %.2f y d= %.2f \n',j,a(j),b(j),c(j),d(j));
endfor

archivo = fopen('splinemodificadoo.txt','wt');
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