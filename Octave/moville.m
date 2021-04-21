clc
clear
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA NEVILLE\n");
po=input('Aproximacion: ');
n=input('Grado polinomio... ');
fprintf('\n');
for i=0:(n-1),
   fprintf("Introduzca el valor de x en la posicion %f ",i);
   X(i+1)=input("... ");
end
for i=0:(n-1),
    fprintf("Introduzca el valor de f(x) en la posicion %f ",i);
    FX(i+1)=input("... ");
end

for i=1:n,
 Q(i,1)=FX(i);
end

for i=2:n,
   for j=i:n,
     Q(j,i)=(((po-X(j-i+1))*Q(j,i-1))-((po-X(j))*Q(j-1,i-1)))/(X(j)-X(j-i+1));
      fprintf("\n VALOR DE Q... %3.8f",Q(j,i));
   end
end