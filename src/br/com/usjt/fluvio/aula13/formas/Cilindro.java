package br.com.usjt.fluvio.aula13.formas;

public class Cilindro extends Circulo {

    private double altura;

    public Cilindro() {

        this.altura = 1.0;
    }

    public Cilindro(double coordenadaX, double coordenadaY, double raio, double altura) {
        super(coordenadaX, coordenadaY, raio);
        setAltura(altura);

    }

    public void setAltura(double altura) {
        if (altura >= 0) {
            this.altura = altura;
        } else {
            System.out.println("Erro altura negativa");
            return;
        }
    }

    public double getAltura() {
        return altura;
    }

    public double volumeCilindro() {

        return calculaArea() * altura;

    }

    public double areaCilindro() {
        double areaLateral = calculaPerimetro() * altura;
        double areaSuperficie = areaLateral * 2 * calculaArea();
        return areaSuperficie;

    }

    @Override
    public String dados() {
        return super.dados() + "\nAltura : " + altura + "\nVolume do Cilindro :" + volumeCilindro()
                + "\nArea da superficie do cilindro" + areaCilindro();
    }

}
