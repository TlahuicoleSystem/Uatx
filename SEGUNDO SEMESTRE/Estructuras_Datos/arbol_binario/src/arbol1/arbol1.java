package arbol1;

public class arbol1 {

    Nodo raiz;//CREAMOS LA VARIABLE RAIZ DE TIPO NODO

    public arbol1() {
        raiz = null;// INICIALIZAMOS LA VARIABLE RAIZ CON EL VALOR NULL
    }

    public void insertar(int dato) {//ESTE METODO LO OCUPAMOS PARA INGRESAR EL NODO EN CASO DE QUE NO HAY NADA
        if (raiz == null) {//EN ESTE IF VERIFICAMOS SI LA RAIZ ES NULL
            raiz = new Nodo(dato);// SI ESTO SE CUMPLE LA RAIZ VA A VALER LO QUE TIENE EL NUEVO NODO
        } else {
            insertarNodo(raiz, dato);/* EN OTROS CASO VAMOS A LLAMAR AL METODO DE insertarNodo DANDO 
            EL VALOR DE LA RAIZ Y EL DATO QUE EL USUARIO QUIERE INGRESAT
            */
        }
    }

    public void insertarNodo(Nodo subraiz, int dato) {/*EN ESTE METODO RECIVIMSO EL VALOR DE LA RAIZ QUE AHORA
        SERA NUESTRA SUBRAIZ Y EL DATO QUE EL USUARIO QUIERE INGRESAR
        */
        if (subraiz == null) {// CHECAMOS SI NO TENEMOS NADA 
            subraiz = new Nodo(dato);// EN CASO DE NO TENER NADA INSERTAMOS EL NUEVO NODO EN LA SUBRAIZ
        } else {// EN CASO DE TENER ALGO VAMOS A BUSCAR SI CORRESPONDE METERLO A LA IZQUIERDA O A LA DERECHA
            if (dato < subraiz.info) {//SI EL DATO QUE DA EL USUARIO ES MENOR QUE EL QUE TIEENE LA SIBRAIZ 
                if (subraiz.izquierda == null) {// Y ESA SUB RAIZ A LA IZQUIERDA NO TIENE NADA
                    subraiz.izquierda = new Nodo(dato);//VAMOS A INGRESAR EL NUEVO NODO 
                } else {//EN CASO DE QUE LA SUBRAIZ A LA IZQUIERDA TENGA UNA DATO
                    insertarNodo(subraiz.izquierda, dato);// EJECUTAMOS DE NUEVO EL METODO PARA PODER VERIFICAR ESA SUBRAIZ 
                }// Y CHECAR DE NUEVO Y ASI SUCESIVAMENTE 
            }
            if (dato >= subraiz.info) {//SI EL DATO QUE DA EL USUARIO ES MAYOY O IGUAL A LA SUBRAIZ
                if (subraiz.derecha == null) {//Y SI LA SUBRAIZ A LA DERECHA NO TIENE NADA 
                    subraiz.derecha = new Nodo(dato);//INGRESAMOS EL NUEVO NODO
                } else {//EN CASO DE QUE LA SUBRAIZ A LA DERECHA TENGA UN DATO
                    insertarNodo(subraiz.derecha, dato);//EJECUTAMOS DE NUEVO EL METODO PARA PODER VERIFICAR ESA SUBRAIZ
                }// Y CHECAR DE NUEVO Y ASI SUCESIVAMENTE
            }
        }
    }
   
    
    //////////////////////////////////////Inorden/////////////////////////////////////////////////
    
    
    public void auxInorden(){//CREAMOS ESTA FUNCION QUE NOS VA AYUDAR A PASAR EL PARAMETRO DE RAIZ AL METODO Inorden
        System.out.println("Recorrido Inorden:");
        Inorden(raiz);//LLAMAMOS LA FUNCION  Inorden Y LE PASAMOS EL PARAMETRO raiz
    }
    public void Inorden(Nodo raiz){//AQUI ESTA EL METODO INORDEN CON EL PARAMTRO raiz
        if(raiz!=null){//REVISAMOS QUE LA RAIZ NO SEA NULO PARA PODER EJECUTARSE EL METODO SOBRE ELLA
            Inorden(raiz.izquierda);//VISITAMOS EL SUBARBOL IZQUIERDO Y EJECUTAMOS EL METODO DE NUEVO
            System.out.println(raiz.info);//IMPRIMIMOS EL DATO EN DONDE ESTE EN ESE MOMENTO
            Inorden(raiz.derecha);//VISITAMOS EL SUBARBOL IZQUIEDO Y EJECUTAMOS EL METODO DE NUEVO 
        }
    }  
    
    
   //////////////////////////////////////Preorden/////////////////////////////////////////////////
    /*EN EL METODO DE Preorden TENEMOS LA MISMA LOGICA QUE LA DE Inorden ,
    LO QUE CAMBIA ES EL ORDEN DE LAS LLAMADAS RECURSIVAS YA QUE NO SON IGUALES 
    PRIMERO DEBEMOS IMPRIMIR DESPUES VISITAR IZQUIERDO Y DESPUES VISITAR DERECHO IGUAL OCUPAMOS 
    UNA FUNCION AUX PARA PODER PASAR EL PARAMATRO DE RAIZ Y DESPUES PODER EJECUTAR Preorden CON 
    EL ORDEN QUE ESTABLECE*/
    
       public void auxPreorden(){
        System.out.println("Recorrido Preorden:");
        Preorden(raiz);
    }
    public void Preorden(Nodo raiz){
        if(raiz!=null){
            System.out.println(raiz.info);
            Preorden(raiz.izquierda);
            Preorden(raiz.derecha);
        }
    }  
    
    
   //////////////////////////////////////Postorden/////////////////////////////////////////////////
    /*EN EL METODO DE Postorden TENEMOS AL IGUAL QUE EN LOS OTROS DOS RECORRIDOS  LO QUE CAMBIA ES EL ORDEN
    DE LAS LLAMADAS RECURSIVAS YA QUE NO SON IGUALES PRIMERO VISITAMOS IZQUIERO DESPUES DERECHO
    Y POR ULTIMO DEBEMOS IMPRMIR, TAMBIEN OCUPAMOS UNA FUNCION DE AUX PARA PODER PASAR EL PARAMETRO DE
    RAIZ Y DESPUES EJECUTAR EL METODO DE Postorden CON EL ORDEN QUE ESTABLECE*/
    
       public void auxPostorden(){//
        System.out.println("Recorrido Postorden:");
        Postorden(raiz);//
    }
    public void Postorden(Nodo raiz){//
        if(raiz!=null){//
            Postorden(raiz.izquierda);//
            Postorden(raiz.derecha);//
            System.out.println(raiz.info);//
        }
    }  
    
    
    ////////////////////////////////////busqueda///////////////////////////////////////////////////
    
    
    public void bucar(int datob){ // CREAMOS EL METODO DE BUSCAR Y PASAMOS EL PARAMETRO A BUSCAR 
        Nodo aux1 = raiz; //VAMOS A OCUPAR UN AUXILIAR PARA ASIGANR LO QUE TIENE RAIZ Y PODAMOS MOVERNOS DENTRO DE EL ARBOL
        while(aux1.info != datob){ //ESTE CICLO SE VA EFECTUAR MIENTRAS LA INFO QUE VALLA CAMBIANDO DE NUESTRO AUXILIAR NO SEA
            //IGUAL A LA QUE ESTAMOS BUSCANDO
            if(datob < aux1.info){  //SIEMPRE Y CUANDO SEA MENOR EL DATO QUE QUEREMOS ENCONTRAR
                aux1=aux1.izquierda; //EL AUXILIAR SE VA A IR MOVIENDO SE A LA IZQUIERDA
            }else{ //CUANDO ESA CONDICION NO SE CUMPLA QUIERE DECIR QUE ES MAS GRANDE O IGUAL 
                aux1=aux1.derecha; //ENTONCES SE VA A IR MOVIENDO A LA DERECHA 
            }
            if(aux1 == null){ //ESTA CONDICION NOS SRIVE PARA SABER SI YA LLEGO AL FINAL EN DODE AUX YA NO TIENE NADA
                System.out.println("No encontramos nada");  //ENTONCES QUIERE DECIR QUE NO SE ENCONTRO
                return;  // Y CORTAMOS LA LA OPERACION DE LA FUNCIOM
            }
        }
        System.out.println("El nodo encontrado es: "+aux1.info);  //EN CASO DE QUE YA NO SE CUMPLA LA CONDICION DEL WHILE
    }  // QUIERE DECIR  QUE YA SE ENCONTRO UN VALOR IGUAL Y ESO QUIERE DECIR QUE ENCONTRAMOS EL DATO Y MANDAMOS 
    // LA IMPRESION Y EL VALOR ENCONTRADO
    

    ////////////////////////////////////clase principal////////////////////////////////////////////////
    
    
    public static void main(String args[]) {//CON LA FUNCION MAIN LLAMAMOS TODAS LOS METODOS
        arbol1 miArbol = new arbol1();
        miArbol.insertar(10);  //LLAMAMOS EL METODO INSERTAR Y DAMOS UN DATO COMO PASO DE PARAMETROS
        miArbol.insertar(6);  
        miArbol.insertar(1);  
        miArbol.insertar(55);  
        miArbol.insertar(3);  
         miArbol.insertar(2);  //LLAMAMOS EL METODO INSERTAR Y DAMOS UN DATO COMO PASO DE PARAMETROS
        miArbol.insertar(10);  
        miArbol.insertar(8);  
        miArbol.insertar(1);  
        miArbol.insertar(5); 
        miArbol.insertar(11);  
        //miArbol.insertar(4);  
        miArbol.auxInorden();  //LLAMAMOS A LA FUNCION QUE NOS AYUDA A PASAR EL PARAMETRO AL METODO INORDEN
        miArbol.auxPreorden();
        miArbol.auxPostorden();
        
    }
}