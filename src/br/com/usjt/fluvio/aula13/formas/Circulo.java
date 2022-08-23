package br.com.usjt.fluvio.aula13.formas;


public class Circulo extends Ponto {

    private double raio;

    public Circulo() {

        raio = 1.0;

    }

    public Circulo(double coordenadaX, double coordenadaY,double raio) {
        super(coordenadaX,coordenadaY);
        setRaio(raio);

    }

    public void setRaio(double raio) {
        if(raio >=0 ) {
            this.raio = raio;
        }else {
            System.out.println("Erro raio negativo");
            return;
        }
    }

    public double getRaio() {
        return raio;
    }

    public double calculaDiametro() {

        return 2* raio;
    }

    public double calculaPerimetro() {


        return Math.PI * calculaDiametro() ;
    }

    public double calculaArea() {

        return Math.PI * raio * raio;
    }
    @Override
    public String dados() {

        return super.dados() + "\nRaio : " + raio + "\nDiametro" + calculaDiametro() + "\nArea do Circulo: " + calculaArea() + "\nPerimetro do Ciruclo: " +  calculaPerimetro() ;
    }
}
