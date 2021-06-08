package Clases_Subclases;

public class Camisa extends Ropa {

    private String tManga;
    private int nBolsillos;

    public Camisa(String tManga, int nBolsillos, String color, String talla, double precio) {
        super(color, talla, precio);
        this.tManga = tManga;
        this.nBolsillos = nBolsillos;
    }

    public String gettManga() {
        return tManga;
    }

    public int getnBolsillos() {
        return nBolsillos;
    }

    public void settManga(String tManga) {
        this.tManga = tManga;
    }

    public void setnBolsillos(int nBolsillos) {
        this.nBolsillos = nBolsillos;
    }

    @Override
    public String imprimir() {
        String mensaje = " La camisa es ".concat(getcolor()).concat(" | La talla es ").concat(gettalla()).concat(" | Su precio es ").concat(String.valueOf(getprecio())).concat(" | El tipo de manga es").concat(gettManga()).concat(" | y tiene  ").concat(Integer.toString(getnBolsillos())).concat(" Bolsas");
        return mensaje;
    }
}
