package br.com.usjt.fluvio.aula11.emporium;

// Classe usada para modelar um carrinho de supermercado

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Carrinho {
    // atributos: vari�veis que armazenam os dados de um objeto, ap�s este
    // ser instanciado.
    private final ArrayList produtosEscolhidos;


    // m�todos construtores: usado para inicializar os atributos,
    // quando um objeto cliente � criado (instanciado). Notar que o construtor
    // faz chamada interna de dois m�todos modificadores.
    public Carrinho() {
        produtosEscolhidos = new ArrayList();
    }

    // outros m�todos

    /*
     * Este m�todo deve ser executado uma vez para cada produto colocado
     * no carrinho.
     * Para cada produto, escrever o nome (exemplo: "arroz"), o pre�o
     * unit�rio por kg (em reais) e a quantidade de produto (em kg).
     */

    public void colocarProdutoNoCarrinho(String nomeProduto, double precoProduto, double quantidadeProduto) {

        produtosEscolhidos.add(new Produto(nomeProduto, precoProduto, quantidadeProduto));

    }



    /*
     * Este m�todo percorre a Lista de Produtos (usando um objeto da classe
     * Iterator), armazenada em um ArrayList. Colhe os valores dos atributos
     * de cada objeto da lista e os concatena numa String (saida). Calcula
     * tamb�m o total em reais gasto nas compras, concatenando-o na mesma
     * String. Depois, retorna essa String.
     * Notar que, na linha que cont�m o coment�rio "Aqui casting!", � necess�rio
     * fazer um "casting" (convers�o de tipos), porque o m�todo next() retorna
     * uma refer�ncia (objeto) que n�o � do tipo Produto. Para fazer a convers�o
     * de tipo, � suficiente escrever entre par�nteses o nome do tipo desejado
     * (no caso, Produto) antes da chamada do m�todo next().
     */

    public String listaDeProdutos() {
        DecimalFormat duas = new DecimalFormat("0,000.00");
        Iterator<Produto> achaProdutoNaLista = produtosEscolhidos.iterator(); //5.1
        String saida = "";
        Produto prod;
        double soma = 0.0;



        while (achaProdutoNaLista.hasNext()) {
            prod = achaProdutoNaLista.next(); // Aqui casting!
            saida += prod.gastoComProduto();

            soma += prod.getQuantidade() * prod.getPrecoUnitario();


        }
        if(pesoTotal()>=50) {
            soma = soma - (soma*0.12);
            saida += "\n\nTotal a Pagar: R$ " + duas.format(soma) + "\nPeso total do carrinho" + pesoTotal() + "Preço total do carrinho ultrapassou 50KG voce tera um desconto de 12% no valor de: " + (soma*0.12) ;
            return saida;
        }else {
            saida += "\n\nTotal a Pagar: R$ " + duas.format(soma) + "\nPeso total do carrinho" + pesoTotal();
            return saida;
        }
    }

    public double pesoTotal() {
        Iterator<Produto> achaProdutoNaLista = produtosEscolhidos.iterator();
        Produto prod;
        double pesoTotal = 0.0;
        while (achaProdutoNaLista.hasNext()) {
            prod = achaProdutoNaLista.next(); // Aqui casting!
            pesoTotal += prod.getQuantidade();
        }
        return pesoTotal;
    }

    public void imprimeGasto(int posicao){
        if(posicao < 0){
            System.out.println("Erro posição não existe");
        }else{
            String imprime = (String) produtosEscolhidos.get(posicao);
            System.out.println(imprime);
        }
    }

    public void remevoItem (int posicao){
        if(posicao < 0){
            System.out.println("Erro posição não existe");
        }else{
             produtosEscolhidos.remove(posicao);

        }
    }

}
