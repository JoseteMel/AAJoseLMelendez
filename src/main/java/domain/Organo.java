package domain;

public class Organo extends Teclado{

    private String lugarInstalacion;
    private int numFilasTeclas;
    private int numTubos;
    private boolean pedalera;
    private boolean reparado;

    public Organo(String numSerie, String marca, String tipo, float precio, int numTeclas, float peso, String lugarInstalacion,
                  int numFilasTeclas, int numTubos, boolean pedalera, boolean reparado) {
        super(numSerie, marca, tipo, precio, numTeclas, peso);
        this.lugarInstalacion = lugarInstalacion;
        this.numFilasTeclas = numFilasTeclas;
        this.numTubos = numTubos;
        this.pedalera = pedalera;
        this.reparado = reparado;
    }

    public String getLugarInstalacion() {
        return lugarInstalacion;
    }

    public void setLugarInstalacion(String lugarInstalacion) {
        this.lugarInstalacion = lugarInstalacion;
    }

    public int getNumFilasTeclas() {
        return numFilasTeclas;
    }

    public void setNumFilasTeclas(int numFilasTeclas) {
        this.numFilasTeclas = numFilasTeclas;
    }

    public int getNumTubos() {
        return numTubos;
    }

    public void setNumTubos(int numTubos) {
        this.numTubos = numTubos;
    }

    public boolean isPedalera() {
        return pedalera;
    }

    public void setPedalera(boolean pedalera) {
        this.pedalera = pedalera;
    }

    public boolean isReparado() {
        return reparado;
    }

    public void setReparado(boolean reparado) {
        this.reparado = reparado;
    }

    @Override
    public String toString() {
//        System.out.println("Número de serie: " + getNumeroSerie());
//        System.out.println("Marca: " + getMarca());
//        System.out.println("Tipo: " + getTipo());
//        System.out.println("Precio: " + getPrecio());
//        System.out.println("Número de teclas: " + getNumTeclas());
//        System.out.println("Peso: " + getPeso());
//        System.out.println("Lugar de instalación: " + lugarInstalacion);
//        System.out.println("Número de filas de teclado: " + numFilasTeclas);
//        System.out.println("Número de tubos: " + numTubos);
//        System.out.println("¿Tiene pedalera?: " + pedalera);
//        System.out.println("Reparado: " + reparado);

        return String.valueOf("\nNúmero de serie: " + getNumeroSerie() + ", marca: " + getMarca() + ", tipo: " + getTipo() +
                ", precio: " + getPrecio() + ", número de teclas: " + getNumTeclas() + ", peso: " + getPeso() + ", lugar de instalación: " +
                lugarInstalacion + ", número de filas de teclado: " + numFilasTeclas + ", número de tubos: " +
                numTubos + ", pedalera: " + pedalera + ", reparado: " + reparado + ".\n");
    }
}
