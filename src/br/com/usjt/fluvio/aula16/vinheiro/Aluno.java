package br.com.usjt.fluvio.aula16.vinheiro;

public class Aluno {
    private String nome;
    private double[] notas;

    public Aluno() {
        nome = "";
        notas = new double[10];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        nome = n;
    }

    public double media() {

        int contador=0;
        double soma = 0;
        for(int i=0;i < notas.length;i++) {

            soma += notas[i];
            contador++;
        }

        return soma/contador;


    }

} // fim da classe Aluno
