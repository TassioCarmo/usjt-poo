package br.com.usjt.fluvio.aula12.heranca;

public class Mensalista extends Empregado {
    // Atributo – os outros atributos são herdados da classe Empregado
    // Esta classe herda todos os métodos da classe Empregado
    protected double salarioMensal;

    // Construtores
    public Mensalista() {
        setSalarioMensal(0);
    }

    public Mensalista(String nome, String sobreNome, String cpf, int codigoEmp, double salarioMensal) {
        super(nome, sobreNome, cpf, codigoEmp);
        setSalarioMensal(salarioMensal);
    }

    // Métodos modificadores
    public void setSalarioMensal(double sm) {
        salarioMensal = (sm > 0 ? sm : 0);
    }

    // Métodos de acesso
    public double getSalarioMensal() {
        return salarioMensal;
    }

    // Método dados() – sobrepõe o método dados() da classe Empregado;
    // retorna os dados de um Mensalista.
    public String dados() {
        return "Mensalista: " + super.dados() + "\nSalario: " + salarioMensal;
        // super.dados() chama o método dados() da classe Empregado
    }
}