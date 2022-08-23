package br.com.usjt.fluvio.aula12.heranca;

public class Desempregado extends PessoaFisica{

    private double seguroDesemprego;

    public Desempregado(){
        setSeguroDesemprego(0.0);
    }


      public Desempregado(String nome, String sobreNome, String cpf, double seguroDesemprego) {
        super(nome, sobreNome, cpf);
        setSeguroDesemprego(seguroDesemprego);
    }

    public double getSeguroDesemprego() {
        return seguroDesemprego;
    }

    public void setSeguroDesemprego(double seguroDesemprego) {
        this.seguroDesemprego = seguroDesemprego;
    }

    @Override
    public String dados() {
          String dados =super.dados() + "Desempregado{" +
                  "seguroDesemprego=" + seguroDesemprego +
                  '}';
        return dados;
    }
}
