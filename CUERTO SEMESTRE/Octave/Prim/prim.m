%Para que funcione debemos de tener la matriz en un archivo txt de la siguinte manera

%5
%0 1.3 2.1 0.9 0.9
%1.3 0 0.9 1.7 1.2
%2.1 0.9 0 2.0 0.7
%0.9 1.7 2.0 0 0.7
%0.9 1.2 0.7 0.7 0

clc
fprintf("Josue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA Prim\n");
fid = fopen('texto1.txt', 'r');      % Entrada de la matriz
l = fscanf(fid, '%g %g', [1 1])     % Tamaño de la matriz
h = fscanf(fid, '%g %g', [l l])     % matriz
a=h;
fclose(fid);
for i=1:l
    for j=1:l
         if a(i,j)==0
               a(i,j)=inf;
           end
    end
end
k=1:l;
listV(k)=0;
listV(1)=1;
e=1;
while (e<l)
    min=inf;
     for i=1:l
        if listV(i)==1
            for j=1:l
                if listV(j)==0
                   if min>a(i,j)
                        min=a(i,j);
                        b=a(i,j);
                        s=i;
                        d=j;
                    end
                end
            end
        end
    end
    listV(d)=1;
    distancia(e)=b;
    inicio(e)=s;
    destino(e)=d;
    e=e+1;
end


fprintf('CAMINO RECORRIDO \n\n');
total = 0;
for g=1:e-1
total = total + distancia(g);
fprintf('(%d ,%d) %d\n',inicio(g),destino(g),distancia(g));
end

fprintf('\nTotal...  %f',total);
clear
