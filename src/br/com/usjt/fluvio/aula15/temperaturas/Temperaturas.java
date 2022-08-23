package br.com.usjt.fluvio.aula15.temperaturas;

import javax.swing.JOptionPane;

public class Temperaturas {

    // atributo � um Array
    private double[] temperaturas;

    // construtor: ir� instanciar o Array.
    public Temperaturas(int tamanho) {
        temperaturas = new double[tamanho];
    }

    // m�todo modificador: modifica o valor armazenado em uma determinada
    // posi��o do Array.
    public void setTemperatura(double valor, int posicao) {
        // length retorna o tamanho do Array
        if (posicao >= 0 && posicao < temperaturas.length) {
            temperaturas[posicao] = valor;
        }
    }

    // m�todo de acesso: retorna o valor que est� armazenado em uma
    // determinada posi��o do Array.
    public double getTemperatura(int posicao) {
        return temperaturas[posicao];
    }

    // m�todo para entrada de dados: o usu�rio pode digitar todos os valores
    // a serem armazenados no Array.
    public void entradaDeDados() {
        String m = "";
        int a = 0;
        do {
            if(temperaturas[a] <0) {
                m = JOptionPane.showInputDialog("Digite o " + (a + 1) + ",o valor. ");
                temperaturas[a] = Double.parseDouble(m);
            }
        }
        while(a < temperaturas.length);
	/*	for (int a = 0; a < temperaturas.length; a++) {
			m = JOptionPane.showInputDialog("Digite o " + (a + 1) + ",o valor. ");
			temperaturas[a] = Double.parseDouble(m);
		}*/
    }
    // Tente explicar como este m�todo funciona.

    public double media() {
        int contador = 0;
        int soma = 0;

        while (contador <= temperaturas.length) {

            soma += temperaturas[contador];
            contador++;
        }
        return soma / contador;
    }

    public double menor() {
        int contador = 0;
        double menor = temperaturas[0];

        while (contador < temperaturas.length) {

            if (menor < temperaturas[contador]) {

                menor = temperaturas[contador];

            }
            contador++;
        }
        return menor;
    }

    public double maior() {
        int contador = 0;
        double maior = temperaturas[0];

        while (contador < temperaturas.length) {

            if (maior > temperaturas[contador]) {

                maior = temperaturas[contador];

            }
            contador++;
        }
        return maior;
    }

    public double negativo() {
        int contador = 0;
        int negativa = 0;

        while (contador < temperaturas.length) {

            if (temperaturas[contador] < 0) {

                negativa++;
            }
            contador++;
        }
        return negativa;
    }

    public double quadrados() {
        int contador = 0;
        int soma = 0;

        while (contador <= temperaturas.length) {

            soma += (temperaturas[contador] * temperaturas[contador]);
            contador++;
        }
        return soma;
    }

    public void mostraMetodo() {

        JOptionPane.showMessageDialog(null, "\n" + media() + "\n" + menor() + "\n" + maior() + "\n" + negativo() + "\n"
                + media() + "\n" + quadrados(), null, 1);
    }

    public void mostraArray() {
        int contador = 0;
        String mensagem = "";;
        while (contador < temperaturas.length) {

            mensagem += temperaturas[contador]+",";

            contador++;
        }

        JOptionPane.showMessageDialog(null, mensagem, null, 1);

    }

}
