package br.com.usjt.fluvio.aula14.banco;
public class CartaoDeCredito extends Pagamento {

    private String numeroDoCartao;

    public CartaoDeCredito(String nomeDoPagador, String cpf, double valorASerPago,String numeroDoCartao) {
        super(nomeDoPagador, cpf, valorASerPago);
        setNumeroDoCartao(numeroDoCartao);
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }



}