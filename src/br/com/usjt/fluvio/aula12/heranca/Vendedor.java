package br.com.usjt.fluvio.aula12.heranca;

public class Vendedor extends  Mensalista{

    private double comissoes;

    public Vendedor() {
    }

    public Vendedor(String nome, String sobreNome, String cpf, int codigoEmp, double salarioMensal, double comissoes) {
        super(nome, sobreNome, cpf, codigoEmp, salarioMensal);
        this.comissoes = comissoes;
    }

    public double getComissoes() {
        return comissoes;
    }

    public void setComissoes(double comissoes) {
        this.comissoes = comissoes;
    }

    public double vencimentos(){
        return getSalarioMensal() + comissoes;
    }

    @Override
    public String dados() {
        String dados ="Vendedor{" + super.dados()+
                "comissoes=" + comissoes +
                ", salarioMensal=" + salarioMensal +
                  '}';
        return dados;
    }
}
