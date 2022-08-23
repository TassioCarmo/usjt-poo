package br.com.usjt.fluvio.aula11.emporium;
/* TesteEmporium.java
 * Trata-se de uma implementa��o de teste do Projeto Emporium.
 * Leia as instru��es abaixo, ANTES de executar a aplica��o.

*******   LEIA TODO O TEXTO, ANTES DE TESTAR A APLICA��O  ********

O cliente vai ao "emporium" comprar frutas, legumes e gr�os. O dono do
"emporium" vende todos os itens por kg (quilograma).

Para fazer as compras, cria-se um objeto "carrinho" e executa-se o
m�todo colocarProdutoNoCarrinho(), uma vez para cada item comprado,
informando-se, nos par�metros o nome do produto (por exemplo,
"arroz"), o pre�o unit�rio por kg (por exemplo, 1.43) e a quantidade
a ser colocada no carrinho em kg (por exemplo, 2.5), nesta ordem.

Para exemplificar, s�o colocados no carrinho tr�s ou quatro produtos
 diferentes.

Para encerrar, cria-se um objeto "caixa"; no seu construtor, o
primeiro par�metro corresponde ao nome do cliente (String) e, ao
segundo par�metro, o objeto "carrinho" instanciado.
 antes.

Depois, o aplicativo exibir� o retorno do m�todo dadosDaCompra()-
veja na classe Caixa - e observe o resultado.

******************* Exerc�cios ****************************

***** Ap�s executar a aplica��o e analisar o c�digo-fonte das classes
Cliente, Produto, Carrinho e Caixa (nesta ordem), fa�a os exerc�cios
 a seguir.
******

1) Compile a classe Carrinho sem o casting (convers�o de tipo) na 1.a
 linha do bloco while do m�todo listaDeProdutos(), isto �, apague a
 seq��ncia '(Produto)' logo ap�s o sinal de igual. Qual � a mensagem
  de erro? Como se resolveria este erro, sem usar o "casting"?

2) Crie o atributo cpf (String), na classe Cliente e fa�a com que o
n�mero do cpf do cliente apare�a na impress�o das compras, feita pelo
 objeto da classe Caixa.

3) Crie, na classe Carrinho, um m�todo que retorne o "peso" (massa)
em kg do carrinho (depois que o cliente colocou todos os produtos
desejados).

4) Modifique os m�todos da classe Carrinho, de modo que seja dado um
 desconto de 12% no total a pagar, caso o "peso" (massa) do carrinho
 seja superior a 50 kg.

5) Fa�a as modifica��es necess�rias para que o valor do desconto
(em reais) e o "peso" (massa) do carrinho apare�am na impress�o feita
 pelo objeto da classe Caixa.

6) Na classe Carrinho, escreva um m�todo que recebe como par�metro um
 n�mero inteiro (maior ou igual a zero), relativo � posi��o do produto
  no ArrayList, e imprima o nome do produto e o total gasto
  (quantidade * precoUnitario) com esse produto. OBS.: Se o n�mero
  fornecido como par�metro corresponder a uma posi��o inexistente no
  ArrayList, deve ser impressa uma mensagem de erro adequada.

7) Crie um m�todo, na classe Carrinho, para remover um produto da
lista de produtos; no par�metro deste m�todo, deve ser declarada
uma vari�vel (String) que recebe o nome do produto a ser removido.

*/

import javax.swing.*;

public class TesteEmporium
{
    public static void main( String args[] )
    {
        // instancia o objeto Carrinho.
        Carrinho ca = new Carrinho();
        double precoUn;
        double quant;
        //colocando 4 produtos no carrinho.
        for( int i = 1; i <= 2; i++ )
        {
            String nome = JOptionPane.showInputDialog(
                    "Escreva o nome do produto.");
             precoUn = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Escreva o pre�o unit�rio do produto.") );
             quant = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Escreva a quantidade (kg) de produto.") );
            ca.colocarProdutoNoCarrinho( nome, precoUn, quant );
        }

        ca.imprimeGasto(2);
        ca.remevoItem(1);


        // instancia o objeto caixa.
        String no = JOptionPane.showInputDialog(
                "Escreva o nome do cliente.");

        // instancia o objeto cpf.
        String cpf = JOptionPane.showInputDialog(
                "Escreva o CPF.");



        Caixa cx = new Caixa( no, ca, cpf );



        // exibe o resultado da compra e o valor a pagar.
        JOptionPane.showMessageDialog( null, cx.dadosDaCompra(),
                "Resultado da Compra", 1);
        System.exit(0);

    }
}