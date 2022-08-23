package br.com.usjt.fluvio.aula16.vinheiro;

public class Transporte {
    private double[] distancias; // em km
    private double[] custosporkm; // em reais/km

    public Transporte() {
        distancias = new double[26];
        custosporkm = new double[26];
    }
} // fim da classe Transporte