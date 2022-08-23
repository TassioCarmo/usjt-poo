package br.com.usjt.fluvio.aula13.formas;

public class Ponto {

    private double coordenadaX;
    private double coordenadaY;


    public Ponto() {

        coordenadaX = 0.0;
        coordenadaY = 0.0;

    }


    public Ponto(double coordenadaX, double coordenadaY) {

        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }


    public double getCoordenadaX() {
        return coordenadaX;
    }


    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }


    public double getCoordenadaY() {
        return coordenadaY;
    }


    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public String dados(){

        return "\nCoordenada X: " + coordenadaX + "\nCoordenada Y: " + coordenadaY;

    }



}
