clc
clear
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA curva\n");
n=input(' Escriba el numero de coeficientes:  ');

for i = 1 : n,
  fprintf("Ingresa X%d",i-1);
  x(i)=input('= '); 
end
for i = 1 : n,
  fprintf("Ingresa Y%d",i-1);
  y(i)=input('= '); 
  end
for i = 1 : n,
  fprintf("Ingresa X%d+",i-1);
  xmas(i)=input('= '); 
end
for i = 1 : n,
  fprintf("Ingresa Y%d+",i-1);
  ymas(i)=input('= '); 
end
for i = 1 : n,
  fprintf("Ingresa X%d-",i-1);
  xmenos(i)=input('= '); 
end
for i = 1 : n,
  fprintf("Ingresa Y%d-",i-1);
  ymenos(i)=input('= ');
end
for i=1:n-1
  ao(i)=x(i);
  bo(i)=y(i);
  a1(i)=3*(xmas(i)-x(i));
  b1(i)=3*(ymas(i)-y(i));
  a2(i)=3*(x(i)+xmenos(i+1)-2*xmas(i));
  b2(i)=3*(y(i)+ymenos(i+1)-2*ymas(i));
  a3(i)=x(i+1)-x(i)+3*xmas(i)-3*xmenos(i+1);
  b3(i)=y(i+1)-y(i)+3*ymas(i)-3*ymenos(i+1);
endfor
ao
a1
a2
a3
bo
b1
b2
b3

archivo = fopen('curvaBezier.txt','wt');
fprintf(archivo,'wxdraw2d(color=black,\n')
for j=1:n-1
  fprintf(archivo,'parametric( %f + %f*t + %f*t^2 + %f*t^3, ',ao(j),a1(j),a2(j),a3(j));  
  fprintf(archivo,' %f + %f*t + %f*t^2 + %f*t^3, t,0,1),\n ',bo(j),b1(j),b2(j),b3(j)); 
end
  fprintf(archivo, 'color=red, point_size=2, point_type=filled_circle,points(['),
  for j=1:n
    fprintf(archivo, '[%f,%f] ', x(j),y(j)),
  endfor
fprintf(archivo,']),proportional_axes=xy)'); 
fclose(archivo)