clear all
clc
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA ROMBERG\n");
n=input("Ingresa el valor de N:");
a=input("a: ");
b=input("b: ");
fun=input("f(x)=","s");
f=inline(fun);



h=b-a;

R(1,1)=(h/2)*(f(a)+f(b));
M(1,1)=R(1,1);

for i=2:n
  k=1;
  s=0;
  for k=1:2^(i-2)
    s+=f(a+(k-0.5)*h);
  endfor
  R(2,1)=0.5*(R(1,1)+h*(s));
  for j=2:i
    R(2,j)=R(2,j-1)+((R(2,j-1)-R(1,j-1))/(4^(j-1)-1));
  endfor
  h=h/2;
  M=[M zeros(i-1,1);R(2,:)];
  for  j=1:i
    R(1,j)=R(2,j);
    endfor
  endfor
Re=M(n,n);
fprintf('\nEl resultado es: %f',M(n,n))