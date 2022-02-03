clc
clear
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA HERMITE\n");

n=input('ingresa el numero de elementos: ');
for i=1:n
    fprintf("Intruduce X%d",i-1);
    X(i)=input('= '); 
end
for i=1:n 
    fprintf("Intruduce F(x)%d",i-1);
     F(i)=input('= ');
end
for i=1:n
     F(i)=input('= ');
     fprintf("Intruduce F'(x)%d",i-1);
      dx(i)=input('= '); 
end


for i=1:n
    Z(2*i-1)=X(i);
    Z(2*i)=X(i);
    Q((2*i)-1,1)=F(i);
    Q(2*i,1)=F(i);
    Q(2*i,2)=dx(i);
    if i~=1
        Q(2*i-1,2)=(Q(2*i-1,1)-Q(2*i-2,1))/(Z(2*i-1)-Z(2*i-2));
    end
end
for i=3:2*n
    for j=3:i
       Q(i,j)=(Q(i,j-1)-Q(i-1,j-1))/(Z(i)-Z(i-j+1))
    end
end


archivo= fopen('hermitep.txt','w+');
fprintf (archivo,'%f',Q(1,1));
for i=2:2*n,
  fprintf(archivo,'+%f',Q(i,i));
  for j=1:i-1,
    fprintf(archivo,'*(x-%f)',Z(j));
  endfor
endfor
fclose(archivo)