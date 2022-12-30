/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort;

/**
 *
 * @author josue-Asus
 */
public class QuickSort {
    
    private static int vec[]={80,5,47,1,78,9,16};
        
    
        //Metodo main, metodo propio del paradigma orinetado a objetos no influye en el algoritmo
        public static void main(String[] args) {
                System.out.println("Arreglo original");
                imprimirVector(vec);
                quicksortprelim(vec);
                System.out.println("\nArreglo ordenado");
                imprimirVector(vec);
        }

        //metodo para establecer los parametros del algoritmo
        public static void quicksortprelim(int vec[]){
                final int N = vec.length;
                quickSort(vec, 0, N-1);
        }
        
        public static void quickSort(int vec[], int inicio, int fin){
                //condicional para determinar que si tenemos un vector y no solo un elemento
                if(inicio>=fin){
                    return;
                }
                
                //establecemos los indices y el pibote
                int pivote = vec[inicio];
                int elemIzq = inicio+1;
                int elemDer = fin;
                
                while(elemIzq <= elemDer){
                    //ordenamos los umero del lado izquierdo
                        while(elemIzq<=fin && vec[elemIzq]<pivote){
                                elemIzq++;
                        }
                    //ordenamos los numero del lado derecho
                        while(elemDer>inicio && vec[elemDer]>=pivote){
                                elemDer--;
                        }
                     //si esta al reves hacer el intercambio ocupando un lemento auxiliar[temp]
                        if(elemIzq<elemDer){
                                int temp=vec[elemIzq];
                                vec[elemIzq]=vec[elemDer];
                                vec[elemDer]=temp;
                        }
                }
                
                if(elemDer>inicio){
                        int temp=vec[inicio];
                        vec[inicio]=vec[elemDer];
                        vec[elemDer]=temp;
                }
                
                quickSort(vec, inicio, elemDer-1);
                quickSort(vec, elemDer+1, fin);
        }
        
        public static void imprimirVector(int vec[]){
                for(int i=0;i<vec.length;i++){
                        System.out.print(vec[i]+" ");
                }
        }
}
