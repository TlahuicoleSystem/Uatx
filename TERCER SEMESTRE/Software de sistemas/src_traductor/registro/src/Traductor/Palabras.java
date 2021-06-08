/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traductor;

import java.util.ArrayList;
/**
 *
 * @author Josue-Chuwi
 */
public class Palabras {

    String BYTE;
    double binario;
    int longitud;
    ArrayList<Instrucciones> pInstrucciones = new ArrayList<>();

    public int getLongitud() {
        return longitud;
    }

    public Palabras() {
        pInstrucciones.add(new Instrucciones(Integer. toHexString(14), "STORE", "xxH", "AX", 2));
        pInstrucciones.add(new Instrucciones(Integer. toHexString(15), "MOV", "AX", "xxH", 2));
        pInstrucciones.add(new Instrucciones(Integer. toHexString(17), "MOV", "BX", "xxH", 2));
        pInstrucciones.add(new Instrucciones(Integer. toHexString(18), "MOV", "CX", "xxxxH", 3));
        pInstrucciones.add(new Instrucciones(Integer. toHexString(20), "MOV", "DX", "BX", 1));
        pInstrucciones.add(new Instrucciones(Integer. toHexString(21), "MOV", "xxH", "BX", 2));
        pInstrucciones.add(new Instrucciones(Integer. toHexString(22), "ADD", "AX", "BX", 1));
        pInstrucciones.add(new Instrucciones(Integer. toHexString(24), "ADD", "CX", "DX", 1));
        pInstrucciones.add(new Instrucciones(Integer. toHexString(25), "ADD", "CX", "AX", 1));
        pInstrucciones.add(new Instrucciones(Integer. toHexString(29), "SUB", "AX", "xxH", 2));
        pInstrucciones.add(new Instrucciones(Integer. toHexString(28), "SUB", "CX", "xxxxH", 3));
        pInstrucciones.add(new Instrucciones(Integer. toHexString(30), "INC", "AX", "", 1));
        pInstrucciones.add(new Instrucciones(Integer. toHexString(33), "DEC", "BX", "", 1));
        pInstrucciones.add(new Instrucciones(Integer. toHexString(34), "JMP", "CX", "XXH", 2));
    }

    public int verificarLongitudDirectiva(Archivos i) {
        for (Instrucciones p : pInstrucciones) {
            if (i.getCodigo().equals(p.codigo)) {
                i.longitud = p.longitud;
            }
        }
        //System.out.println("Longitud de codigo: '"+i.getCodigo()+"'" +i.longitud);
        return i.longitud;
    }

    public void tablaCodigos() {
        System.out.println("TABLA DE CODIGOS");
        System.out.println("CODIGO:\tDIRECTIVA:\tREGISTRO DESTINO:\tREGISTRO ORIGEN:\tLONGITUD");
        for (Instrucciones var : pInstrucciones) {
            System.out.println( var.codigo + "\t" + var.instruccion + "\t\t" +/*registro1*/ var.registro1 + "\t\t\t" +/*registro2*/ var.registro2 + "\t\t" + var.longitud);
        }
    }

    public String verificar(Archivos ints) {

        String code = "#INV#";
        

        switch (ints.getVariable()) {

            case "STORE":
                if (!"".equals(ints.getTipo()) && "AX".equals(ints.getValor())) {
                    code= Integer. toHexString(14);
                    ints.setCodigo(code);
                    return code;
                }

            case "MOV":

                if ("AX".equals(ints.getTipo()) && !"".equals(ints.getValor())) {
                     code= Integer. toHexString(15);
                    ints.setCodigo(code);
                    return code;
                }
                if ("BX".equals(ints.getTipo()) && !"".equals(ints.getValor())) {
                     code= Integer. toHexString(17);
                    ints.setCodigo(code);
                    return code;
                } else if ("DX".equals(ints.getTipo()) && "BX".equals(ints.getValor())) {
                    code= Integer. toHexString(20);
                    ints.setCodigo(code);
                    return code;
                } else if ("CX".equals(ints.getTipo()) && !"".equals(ints.getValor())) {
                     code= Integer. toHexString(18);
                    ints.setCodigo(code);
                    return code;
                } else {
                    System.out.println("Intruccion invalida");
                    ints.setCodigo("###");
                }

                break;
            case "ADD":

                if ("AX".equals(ints.getTipo()) && "BX".equals(ints.getValor())) {
                     code= Integer. toHexString(22);
                    ints.setCodigo(code);
                    return code;
                } else if ("CX".equals(ints.getTipo()) && "DX".equals(ints.getValor())) {
                     code= Integer. toHexString(24);
                    ints.setCodigo(code);
                    return code;
                } else if ("CX".equals(ints.getTipo()) && "AX".equals(ints.getValor())) {
                     code= Integer. toHexString(25);
                    ints.setCodigo(code);
                    return code;

                } else {
                    System.out.println("Intruccion invalida");
                    ints.setCodigo("###");
                   

                }
                break;
            case "SUB":

                if ("AX".equals(ints.getTipo()) && !"".equals(ints.getValor())) {
                     code= Integer. toHexString(29);
                    ints.setCodigo(code);
                    return code;
                } else if ("CX".equals(ints.getTipo()) && !"".equals(ints.getValor())) {
                    code= Integer. toHexString(28);
                    ints.setCodigo(code);
                    return code;
                } else {
                    System.out.println("Instruccion invalida");
                    ints.setCodigo("###");
                }

                break;
            case "INC":

                if (!"".equals(ints.getTipo()) && "".equals(ints.getValor())) {
                     code= Integer. toHexString(30);
                    ints.setCodigo(code);
                    return code;
                } else {
                    System.out.println("Instruccion invalida");
                    ints.setCodigo("###");
                }

                break;
            case "DEC":

                if (!"".equals(ints.getTipo()) && "".equals(ints.getValor())) {
                     code= Integer. toHexString(33);
                    ints.setCodigo(code);
                    return code;
                } else {
                    System.out.println("Instruccion invalida");
                    ints.setCodigo("###");
                }

                break;
            case "JMP":

                if (!"".equals(ints.getTipo()) && "".equals(ints.getValor())) {
                     code= Integer. toHexString(34);
                    ints.setCodigo(code);
                    return code;
                } else {
                    System.out.println("Instruccion invalida");
                    ints.setCodigo("-1");
                }
                break;
            default:
                System.out.println("Directiva erronea");
                ints.setCodigo("Error");
                break;
        }

        return code;
    }

    public int longitudVariables(String var, String tipo, String valor) {
        //System.out.println(longitud);
        if ("BYTE".equals(tipo)) {

            int _valor = Integer.parseInt(valor);
            int _long = decimalBinario(_valor);
            BYTE = var;
            if (_long == 1) {
                longitud = _long;
                /* System.out.println("Nombre: " + BYTE + "\tTipo: " + tipo + "\tValor: " + valor+"Longitud:"+longitud);
                System.out.printf("Binario: %.0f %n", binario);
                System.out.println("");
                 */
            } else if (_long == 2) {
                longitud = _long;
            }
        } else if ("BYTEH".equals(tipo)) {
            int decimal = Integer.parseInt(valor, 16);
            if (decimal <= 255) {
                longitud = 1;

            } else if (decimal <= 510) {
                longitud = 2;
            } else {

                longitud = 0;

            }
        }

        return longitud;
    }

    public int decimalBinario(int decimal) {
        int numero, exp, digito;
        numero = decimal;

        exp = 0;
        binario = 0;
        while (numero != 0) {
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            numero = numero / 2;
        }
        //System.out.printf("Binario: %.0f %n", binario);
        //System.out.println("");
        if (decimal <= 255) {
            this.binario = binario;
            //System.out.println("Valor de 8 bits");
            return 1;
        } else if (decimal <= 510) {
            //System.out.println("Valor de dos byte");
            //System.out.println(binario);
            return 2;
        } else {
            return 0;
        }
    }

}
