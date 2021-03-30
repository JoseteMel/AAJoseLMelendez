package domain;

public class Organo extends Teclado{

    private String lugarInstalacion;
    private int numFilasTeclas;
    private int numTubos;
    private boolean pedalera;
    private boolean reparado;

    public Organo(String marca, String tipo, float precio, int numTeclas, float peso, String lugarInstalacion,
                  int numFilasTeclas, int numTubos, boolean pedalera, boolean reparado) {
        super(marca, tipo, precio, numTeclas, peso);
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
}
