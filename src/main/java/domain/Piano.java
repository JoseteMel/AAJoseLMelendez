package domain;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Piano extends Teclado{

    private String material;
    private int numRuedas;
    private String desperfectos;
    private boolean afinado;
    private int numPedales;

    public Piano(String numeroSerie, String marca, String tipo, float precio, int numTeclas, float peso, String material, int numRuedas,
                 String desperfectos, boolean afinado, int numPedales) {
        super(numeroSerie, marca, tipo, precio, numTeclas, peso);
        this.material = material;
        this.numRuedas = numRuedas;
        this.desperfectos = desperfectos;
        this.afinado = afinado;
        this.numPedales = numPedales;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getDesperfectos() {
        return desperfectos;
    }

    public void setDesperfectos(String desperfectos) {
        this.desperfectos = desperfectos;
    }

    public boolean isAfinado() {
        return afinado;
    }

    public void setAfinado(boolean afinado) {
        this.afinado = afinado;
    }

    public int getNumPedales() {
        return numPedales;
    }

    public void setNumPedales(int numPedales) {
        this.numPedales = numPedales;
    }

    @Override
    public String toString() {
//        System.out.println("Número de serie: " + getNumeroSerie());
//        System.out.println("Marca: " + getMarca());
//        System.out.println("Tipo de piano: " + getTipo());
//        System.out.println("Precio: " + getPrecio());
//        System.out.println("Número de teclas: " + getNumTeclas());
//        System.out.println("Peso: " + getPeso());
//        System.out.println("Material: " + material);
//        System.out.println("Número de ruedas: " + numRuedas);
//        System.out.println("Desperfectos: " + desperfectos);
//        System.out.println("Afinado: " + afinado);
//        System.out.println("Número de pedales: " + numPedales);

        return String.valueOf("\nNúmero de serie: " + getNumeroSerie() + ", marca: " + getMarca() + ", tipo de piano: " + getTipo() + ", precio: "
                + getPrecio() + ", número de teclas: " + getNumTeclas() + ", peso: " + getPeso() + ", material: " + material +
                ", número de ruedas: " + numRuedas + ", desperfectos: " + desperfectos + ", afinado: " + afinado +
                ", número de pedales: " + numPedales  + ".\n");
    }
}
