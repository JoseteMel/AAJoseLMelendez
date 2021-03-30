package domain;

public class Sintetizador extends Teclado{

    private int numOsciladores;
    private int numBotones;
    private boolean efectos;
    private String tipoPantalla;
    private boolean monofonico;

    public Sintetizador(String numSerie, String marca, String tipo, float precio, int numTeclas, float peso, int numOsciladores,
                        int numBotones, boolean efectos, String tipoPantalla, boolean monofonico) {
        super(numSerie, marca, tipo, precio, numTeclas, peso);
        this.numOsciladores = numOsciladores;
        this.numBotones = numBotones;
        this.efectos = efectos;
        this.tipoPantalla = tipoPantalla;
        this.monofonico = monofonico;
    }

    public int getNumOsciladores() {
        return numOsciladores;
    }

    public void setNumOsciladores(int numOsciladores) {
        this.numOsciladores = numOsciladores;
    }

    public int getNumBotones() {
        return numBotones;
    }

    public void setNumBotones(int numBotones) {
        this.numBotones = numBotones;
    }

    public boolean isEfectos() {
        return efectos;
    }

    public void setEfectos(boolean efectos) {
        this.efectos = efectos;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public boolean isMonofonico() {
        return monofonico;
    }

    public void setMonofonico(boolean monofonico) {
        this.monofonico = monofonico;
    }

    @Override
    public String toString() {
//        System.out.println("Número de serie: " + getNumeroSerie());
//        System.out.println("Marca: " + getMarca());
//        System.out.println("Tipo: " + getTipo());
//        System.out.println("Precio: " + getPrecio());
//        System.out.println("Número de teclas: " + getNumTeclas());
//        System.out.println("Peso: " + getPeso());
//        System.out.println("Número de osciladores: " + numOsciladores);
//        System.out.println("Número de botones: " + numBotones);
//        System.out.println("¿Tiene efectos?: " + efectos);
//        System.out.println("Tipo de pantalla: " + tipoPantalla);
//        System.out.println("Monofónico: " + monofonico);

        return String.valueOf("Número de serie: " + getNumeroSerie() + ", marca: " + getMarca() + ", tipo: " + getTipo() +
                ", precio: " + getPrecio() + ", número de teclas: " + getNumTeclas() + ", peso: " + getPeso() + ", número de osciladores: " +
                numOsciladores + ", número de botones: " + numBotones + ", efectos: " + efectos + ", tipo de pantalla: " +
                tipoPantalla + ", monofónico: " + monofonico + ".");
    }
}
