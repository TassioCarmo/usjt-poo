package br.com.usjt.fluvio.aula13.formas;

import javax.swing.JOptionPane;

public class TesteCilindro {

    public static void main(String[] args) {


        double coordenadaY = Double.parseDouble(JOptionPane.showInputDialog("Informe a coordenado Y"));;
        double coordenadaX = Double.parseDouble(JOptionPane.showInputDialog("Informe a coordenado X"));;

        Ponto ponto =  new Ponto(coordenadaX,coordenadaY);

        JOptionPane.showMessageDialog(null, ponto.dados());

        double raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio"));;

        Circulo circulo =  new Circulo(coordenadaX,coordenadaY,raio);

        JOptionPane.showMessageDialog(null, circulo.dados());

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
        Cilindro cilindro = new Cilindro(coordenadaX,coordenadaY,raio,altura);

        JOptionPane.showMessageDialog(null, cilindro.dados());

    }

}
