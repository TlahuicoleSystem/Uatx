clear
clc
printf("\nJosue Barrales Galvez\nHOLA BIENVENIDO\nPORFAVOR INGRESA LOS DATOS PARA SIMPSON_COMPUESTA\n");
n=input("Ingresa el valor de N:");
a=input("a: ");
b=input("b: ");
fun=input("f(x)=","s");
f=inline(fun);

h=(b-a)/n;

XL0=f(a)+f(b);
XL1=0;
XL2=0;


for i=1:n-1
    X=a+(i*h);
    if (-1)^i==1
        XL2=XL2+f(X);
    else
        XL1=XL1+f(X);
    end
end
XL=(h*(XL0+(2*XL2)+(4*XL1)))/3;

fprintf('\nEl resultado es: %f',XL)
printf("\nMUCHAS GRACIAS EL PROCESO HA TERMINADO");
