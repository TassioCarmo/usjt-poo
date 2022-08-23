package br.com.usjt.fluvio.aula11.emporium;
// Esta classe modela o caixa do "emporium". Ela deve receber o nome do
// cliente e a lista de produtos (conte�do do "carrinho").

public class Caixa
{
    // atributos: vari�veis que armazenam os dados de um objeto, ap�s este
    // ser instanciado.
    private Cliente cliente;
    private Carrinho carrinho;

    // m�todo construtor: usado para inicializar os atributos,
    // quando um objeto cliente � criado (instanciado). Notar que o construtor
    // faz chamada interna de dois m�todos modificadores.
    public Caixa(String nomeCliente, Carrinho novoCarrinho, String cpfCliente)
    {
        cliente = new Cliente(nomeCliente, cpfCliente);
        carrinho = novoCarrinho;
    }

    // outros m�todos

    /*
     * O m�todo abaixo imprime os dados do cliente e a lista de
     * compras (conte�do do "carrinho"). O nome do cliente (retornado pelo
     * m�todo getNome() ) e a lista de produtos comprados pelo cliente
     * (retornados pelo m�todo listaDeProdutos() ) s�o concatenados em uma
     * String. Em seguida, o conte�do da String � impresso.
     */

    public String dadosDaCompra()
    {
        String saida = "";
        saida += "Cliente: " + cliente.getNome() + "\n\n" + "CPF: " +  cliente.getCpf() + "\n\n" +

                "********    Lista de compras ********** \n\n" +
                carrinho.listaDeProdutos();

        return saida;
    }
}
