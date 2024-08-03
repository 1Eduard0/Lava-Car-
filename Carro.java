public class Carro {
    private String marca;
    private String modelo;
    private int portas;

    public Carro(String marca, String modelo, int portas) {
        this.marca = marca;
        this.modelo = modelo;
        this.portas = portas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getportas() {
        return portas;
    }
}