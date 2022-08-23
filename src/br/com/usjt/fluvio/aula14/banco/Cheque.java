package br.com.usjt.fluvio.aula14.banco;

public class Cheque extends Pagamento {

    private String numeroDoCheque;

    public Cheque(String nomeDoPagador, String cpf, double valorASerPago,String numeroDoCheque) {
        super(nomeDoPagador, cpf, valorASerPago);
        setNumeroDoCheque(numeroDoCheque);
    }

    public String getBumeroDoCheque() {
        return numeroDoCheque;
    }

    public void setNumeroDoCheque(String numeroDoCheque) {
        this.numeroDoCheque = numeroDoCheque;
    }



}