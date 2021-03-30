package domain;

public class Teclado {

    private String marca;
    private String tipo;
    private float precio;
    private int numTeclas;
    private float peso;

    public Teclado(String marca, String tipo, float precio, int numTeclas, float peso) {
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
        this.numTeclas = numTeclas;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
