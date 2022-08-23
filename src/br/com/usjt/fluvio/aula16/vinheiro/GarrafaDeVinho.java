package br.com.usjt.fluvio.aula16.vinheiro;

public class GarrafaDeVinho {
    private double precoUnitario; // em reais
    private double quantidade; // quantidade de garrafas no estoque
    private String marca;

    public GarrafaDeVinho() {
        precoUnitario = 0.0;
        quantidade = 0.0;
        marca = "";
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public String getMarca() {
        return marca;
    }
} // fim da classe GarrafaDeVinho