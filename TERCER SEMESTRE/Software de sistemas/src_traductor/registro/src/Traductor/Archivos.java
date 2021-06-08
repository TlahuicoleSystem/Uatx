/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traductor;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Archivos extends Palabras {

    private int indice;
    private String codigo;
    private Object etiqueta;
    private String variable;
    private String tipo;
    private String valor;

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setEtiqueta(Object etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }

    public void setLongitudA(int longitudA) {
        this.longitudA = longitudA;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setP(Palabras p) {
        this.p = p;
    }

    public void setVariables(ArrayList<Archivos> variables) {
        this.variables = variables;
    }

    public void setVarYres(ArrayList<VariablesRegistros> varYres) {
        this.varYres = varYres;
    }

    public void setInstruc(ArrayList<Archivos> instruc) {
        this.instruc = instruc;
    }

    public void setEtiquetas(ArrayList<Archivos> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public Object getEtiqueta() {
        return etiqueta;
    }

    public int getContador() {
        return contador;
    }

    public Palabras getP() {
        return p;
    }
    private String instruccion;//
    private int longitudA;
    int contador = 1;
    Palabras p = new Palabras();

    ArrayList<Archivos> variables = new ArrayList<>();//arreglo dinamico de variables 
    ArrayList<VariablesRegistros> varYres = new ArrayList<>();//arreglo dinamico de variables y registros
    ArrayList<Archivos> instruc = new ArrayList<>();//arreglo de instrucciones
    ArrayList<Archivos> etiquetas = new ArrayList<>();//arreglo de etiquetas

    public Archivos(Object etiqueta, String variable, int indice) {
        this.etiqueta = etiqueta;
        this.variable = variable;
        this.indice = indice;
    }

    public ArrayList<Archivos> getVariables() {
        return variables;
    }

    public ArrayList<VariablesRegistros> getVarYres() {
        return varYres;
    }

    public ArrayList<Archivos> getInstruc() {
        return instruc;
    }

    public ArrayList<Archivos> getEtiquetas() {
        return etiquetas;
    }

    public Archivos(String intr) {
        this.instruccion = intr;
    }

    public Archivos() {

    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIndice() {
        return indice;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getLongitudA() {
        return longitudA;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String codigo() {
        return codigo;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public String getValor() {
        return valor;
    }
//Lectura del archivo 
    public String leerArchivo(String nombre) {
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(nombre));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                //se hace mientras BfRead tiene datos
                temp = temp + bfRead;
            }
            texto = temp;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL ARCHIVO");
        }
        return texto;
    }

    public void buscarV(String tex) {
        VariablesRegistros vr = new VariablesRegistros();
        String txt = tex;
        //corta desde DATA a CODE
        int indice0 = txt.indexOf("DATA");
        int indice1 = txt.indexOf(".CODE");
        String palabra = txt.substring(indice0 + 4, indice1);
        StringTokenizer tokens = new StringTokenizer(palabra, ";");

        String t;
        while (tokens.hasMoreTokens()) {
            t = tokens.nextToken();
            t = t.trim();
            variables.add(new Archivos(t));//Lista de variables por linea t=guarda la linea en intruccion
            //System.out.println(p);
        }

        for (Archivos var : variables) {
            String c = var.getInstruccion();
            StringTokenizer tokens2 = new StringTokenizer(c);
            //[1] = nombre   [2]=tipo de dato   [3]=valor
            String arre[] = {"", "", ""};
            int i = 0;
            while (tokens2.hasMoreTokens()) {
                t = tokens2.nextToken();
                t = t.trim();
                //va guarnado en arreglo auxiliar
                arre[i] = t;
                i++;
                //System.out.println(p);

            }
            //Variables toman valores
            var.setVariable(arre[0]);
            var.setTipo(arre[1]);
            var.setValor(arre[2]);

            //calcula la longitud
            int _longitud = longitudVariables(var.getVariable(), var.getTipo(), var.getValor());
            //si devuelve cero, es un tipo de dato invalido
            if (_longitud == 0) {
                JOptionPane.showMessageDialog(null,"Variable: " + var.getVariable() + "Tiene un valor invalido");
                var.setLongitudA(0);
            } else {
                //variable valida, longitud toma valor 1 si es un byte, 2 sin son 2 byte

                var.setLongitudA(_longitud);
                //arreglo de variables paar tomarse como registros
                vr.añadir(var.getVariable(), var.getVariable(), var.getLongitudA());

            }

        }

        //vr.imprimir();
        tablaVariables();

    }

    public void tablaVariables() {
        System.out.println("TABLA DE SIMBOLOS");
        System.out.println("Nombre:\tTipo:\tValor:\tLongitud");
        for (Archivos var : variables) {
            System.out.println(var.getVariable() + "\t" + var.getTipo() + "\t" + var.getValor() + "\t" + var.getLongitudA());
        }
    }

    public void instrucciones(String tex) {
        Instrucciones ints = new Instrucciones();
        String txt = tex;
        int indice0 = txt.indexOf(".CODE");//se corta desde codigo 
        int indice1 = txt.indexOf("END");//hasta end
        String palabra = txt.substring(indice0 + 5, indice1);

        StringTokenizer tokens = new StringTokenizer(palabra, ";");//se cortan intrucciones hasta encontras ;
        String t;//variable para guardar tokens
        while (tokens.hasMoreTokens()) {
            t = tokens.nextToken();
            t = t.trim();//le quita espacioa al inicio y fin
            instruc.add(new Archivos(t));//lo guarda con atributos de archivo por linea de instruccion
        }

        for (Archivos var : instruc) {//recorremos lineas de instruccion
            String c = var.getInstruccion();
            String c2 = c.replace(" ", ",");//sustitumos por comas los espacios
            StringTokenizer tokens2 = new StringTokenizer(c2, ",");//se separan hasta encontrar comas
            //arre[1]=nombre   [2]=registro1  [3]=registro
            String arre[] = {"", "", ""};
            int i = 0;
            int indiceE;//auxiliar para guardar n. de linea

            while (tokens2.hasMoreTokens()) {
                t = tokens2.nextToken();
                t = t.trim();
                String varA = "";
                //encontrar etiquetas,por medio de :, y guarda la directiva a la que apunta
                int e = (t.indexOf(":"));
                if (e != -1) {//si se encuentra ':' es etiqueta
                    indiceE = contador;
                    varA = encontrarEtiquetas(t, var, indiceE);//metodo para omitir etiqueta y guardar directiva
                    var.setVariable(encontrarEtiquetas(t, var, indiceE));
                    i++;
                    arre[0] = varA;

                } else {//si no hay etiquetas se van separando lineas de codigo
                    if (!"".equals(varA)) {
                        arre[0] = varA;
                    }
                    arre[i] = t;
                    i++;
                }
            }
            i = 0;

            var.setIndice(contador);
            var.setVariable(arre[0]);
            var.setTipo(arre[1]);
            var.setValor(arre[2]);

            ints.setInstruccion(arre[0]);
            ints.setRegistro1(arre[1]);
            ints.setRegistro2(arre[2]);
            //System.out.println("registro1: "+ints.registro1+"registro 2: "+ints.registro2);

            //System.out.println("registro1: "+var.tipo+"registro 2: "+var.valor);
            contador++;
            //se guardan como una intruccion separando directiva, registroDestino,registro2Origen
            ints.inicializar(var.getVariable(), var.getTipo(), var.getValor());

        }
        //Llama al metodo para imprimir tabla
        tablaInstrucciones();
        System.out.println("");
        //Llama al metodo para imprimir etiquetas
        tablaEtiquetas();
    }

    public String encontrarEtiquetas(String cadena, Archivos v, int indice) {//Metodo que encuentra etiquetas por medio de ':'
        //System.out.println("Esta es una etiqueta (omitir):"+cadena);
        StringTokenizer tokens2 = new StringTokenizer(cadena, ":");//se separa en dos tokens
        String e = "";
        v.setEtiqueta(tokens2.nextElement());
        while (tokens2.hasMoreTokens()) {
            e = tokens2.nextToken();
            e = e.trim();//le quita espacios al inicio y fin
        }

        v.setVariable(e);
        v.setIndice(indice);

        //System.out.println("etiqueta: " + v.etiqueta + " indice" + v.indice + "    " + v.variable);
        return e;//retorna el nombre intruccion despues de la etiqueta
    }

    public int tablaInstrucciones() {
        System.out.println("TABLA DE INSTRUCCIONES");
        System.out.println("LINEA\tCODIGO:\tDIRECTIVA:\tREGISTRO DESTINO:\tREGISTRO ORIGEN:\tLONGITUD");
        for (Archivos var : instruc) {
            var.setCodigo(p.verificar(var));
            //System.out.println(verificarlongitudVariable(var) + "+" + verificarLongitudDirectiva(var));
            longitudA = verificarlongitudVariable(var) + verificarLongitudDirectiva(var);
            var.setLongitudA(verificarlongitudVariable(var) + verificarLongitudDirectiva(var));
            /* System.out.println(var.longitud);
            System.out.println(var.codigo);*/
            System.out.println(var.getIndice() + "\t" + var.getCodigo() + "\t" + var.getVariable() + "\t\t" +/*registro1*/ var.getTipo() + "\t\t\t" +/*registro2*/ var.getValor() + "\t\t" + var.getLongitudA());
        }
        return longitudA;
    }

    public int verificarlongitudVariable(Archivos p) {
        for (Archivos b : variables) {
            if (p.getTipo().equals(b.getVariable()) || p.getValor().equals(b.getVariable())) {
                longitudA = b.getLongitudA() - 1;
                p.setLongitudA(p.longitudA);
            }
        }

        return longitudA;
    }

    public void tablaEtiquetas() {
        for (Archivos e : instruc) {
            if (e.etiqueta != null) {
                // System.out.println(e.etiqueta + "\t\t" + (e.indice - 1));
                etiquetas.add(new Archivos(e.getEtiqueta(), e.getVariable(), e.getIndice()));//se guarda en un nuevo arreglo para puras etiquetas
            }
        }
        imprimirEtiquetas();
    }

    public void imprimirEtiquetas() {
        System.out.println("TABLA DE ETIQUETAS");
        System.out.println("NOMBRE :\tInstruccion:\tLinea:");
        for (Archivos e : etiquetas) {
            System.out.println(e.getEtiqueta() + "\t" + e.getVariable() + "\t\t" + e.getIndice());
        }
    }

    public void generarArchivo(String nombre) {

        int j = 0;
        String ex[] = {".hex", ".lab", ".sym"};
        while (j < 3) {
            String extencion = ex[j];

            try {
                PrintWriter writer = new PrintWriter( nombre  + extencion);
                writer.println("\t\tTABLA DE SIMBOLOS");
                writer.println("Nombre:\t\tTipo:\tValor:\tLongitud"); //12, 14,11 38
                writer.println("|-----     |\t|---|\t|----|\t|-------|");
                for (Archivos i : getVariables()) {
                    writer.print(i.getVariable() + "\t\t");
                    writer.print(i.getTipo() + "\t");
                    writer.print(i.getValor() + "\t");
                    writer.println(i.getLongitudA() + "\t\t");
                }
                writer.println("|-----     |\t|---|\t|----|\t|-------|\n\n");

                writer.println("\t\tTABLA DE INSTRUCCIONES");
                writer.println("LINEA\tCODIGO:\t   DIRECTIVA:\tREGISTRO DESTINO:\tREGISTRO ORIGEN:\tLONGITUD"); //12, 14,11 38
                for (Archivos i : instruc) {
                    writer.print(i.getIndice() + "\t");
                    writer.print(i.getCodigo() + "\t");
                    writer.print(i.getVariable() + "\t\t");
                    writer.print(i.getTipo() + "\t\t\t");
                    writer.print(i.getValor() + "\t\t\t");
                    writer.println(i.getLongitudA() + "\t\t");
                }
                writer.println("\n\n");
                writer.println("\t\tTABLA DE ETIQUETAS");
                writer.println("NOMBRE :\tInstruccion:\tLinea:"); //12, 14,11 38
                for (Archivos i : etiquetas) {
                    writer.print(i.getEtiqueta() + "\t\t\t");
                    writer.print(i.getVariable() + "\t");
                    writer.print(i.getIndice());
                }
                JOptionPane.showMessageDialog(null,"ARCHIVOS "+ex[j]+ " CREADO CORRECTAMENTE");
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();

            }
            j++;
        }

    }
}
