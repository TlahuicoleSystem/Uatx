#include<stdlib.h>
#include <stdio.h>
#include <algorithm>
#include <cstring>
#define MAX 10000

///ENCONTRAR UNION
int padre[ MAX ]; //Este arreglo contiene el padre del i-esimo nodo

//M�todo de inicializaci�n de los vertices
void MakeSet( int n ){
    for( int i = 1 ; i <= n ; ++i )
        padre[ i ] = i;
}

//M�todo para encontrar la raiz del v�rtice actual X
int Find( int x ){
    return ( x == padre[ x ] ) ? x : padre[ x ] = Find( padre[ x ] );
}

//M�todo para unir 2 componentes conexas
void Union( int x , int y ){
    padre[ Find( x ) ] = Find( y );
}

//M�todo que me determina si 2 v�rtices estan o no en la misma
bool sameComponent( int x , int y ){
    if( Find( x ) == Find( y ) ) return true;
    return false;
}
///  ENCONTRAR UNION

int V , E;
//Estructura
struct aristaa{
    int origen;
    int destino;
    float peso;
    aristaa(){}
    //Comparador por peso, me servira al momento de ordenar lo realizara en orden ascendente

    bool operator<( const aristaa &e ) const {
        return peso < e.peso;       //PARA OBTENER EL MAYOR, INVERTIR EL SIGNO
    }
}
arista[ MAX ];      //Arreglo de aristas
aristaa AM[ MAX ];     //Arreglo de aristas del AM encontrado



void Kruskal(){
    int origen , destino;
	float peso, total = 0;          //Peso total del peso minimo y acuulador de total
    int numAristas = 0;     //Numero de Aristas del peso miinimo

    MakeSet( V );           //Inicializamos cada componente vertice
    std::sort( arista , arista + E );    //Ordenamos las aristas por su comparador

    for( int i = 0 ; i < E ; ++i ){     //Recorremos las aristas ya ordenadas por peso
        origen = arista[ i ].origen;    //V�rtice origen de la arista actual
        destino = arista[ i ].destino;  //V�rtice destino de la arista actual
        peso = arista[ i ].peso;        //Peso de la arista actual

        //Verificamos si estan o no en la misma para evitar que se haga un ciclo
        if( !sameComponent( origen , destino ) ){
            total += peso;              //Incremento el peso total del AM
            AM[ numAristas++ ] = arista[ i ];  //Agrego al AM la arista actual
            Union( origen , destino );  //Union de las dos partes en una sola
        }
    }

    if( V - 1 != numAristas ){
        puts("Error no tenemos todos los vertices");
        return;
    }
    puts( "EL CAMINO MINIMO ES...\n");
    for( int i = 0 ; i < numAristas ; ++i )
        printf("[ %d,%d ] : %f\n" , AM[ i ].origen , AM[ i ].destino , AM[ i ].peso ); //( vertice u , vertice v ) : peso

    printf( "El peso minimo es : [%f\n]" , total );
    system ("pause");
}

int main(){
    int mst;
    printf( "Ingresa el cantidad de Vertices y aristas = " );
    scanf("%d %d" , &V , &E );

    //Ingreso de datos
    printf("Ingresa los datos x x x");
    for( int i = 0 ; i < E ; ++i )
        scanf("%d %d %f" , &arista[ i ].origen , &arista[ i ].destino , &arista[ i ].peso );

    Kruskal();

    return 0;
}
