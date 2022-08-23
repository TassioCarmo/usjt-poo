package br.com.usjt.fluvio.aula12.heranca;

public class Empregado extends PessoaFisica {
    // Atributos

    protected int codigoEmp;

    // Construtores
    public Empregado() {
        super("Ficticio", "Imaginario","111-111-111");
        setCodigoEmp(0);
    }

    public Empregado(String nome, String sobreNome, String cpf, int codigoEmp) {
        super(nome, sobreNome, cpf);
        setCodigoEmp(codigoEmp);
    }

    // Métodos modificadores
    public void setIdentidade(String n, String s) {
        setNome(n);
        setSobreNome(s);
    }

    public void setCodigoEmp(int c) {
        codigoEmp = (c > 0 ? c : 0);
// O que é isto? Como funciona?
    }

    // Métodos de acesso
    public String getIdentidade() {
        return getNome() + " " + getSobreNome();
    }

    public int getCodigoEmp() {
        return codigoEmp;
    }// Método dados(): retorna os dados de um Empregado em uma String.

    public String dados() {
        String dados = super.dados()
        +codigoEmp;
        return dados;
    }
}