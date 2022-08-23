package br.com.usjt.fluvio.aula12.heranca;

public class Horista extends Empregado {
    // Atributo – os outros atributos são herdados da classe Empregado
// Esta classe herda todos os métodos da classe Empregado
    protected double salarioPorHora;
    protected double horasTrabalhadas;

    // Construtores
    public Horista() {
        setSalarioPorHora(0);
        setHorasTrabalhadas(0);
    }

    public Horista(String nome, String sobreNome, String cpf, int codigoEmp, double salarioPorHora, double horasTrabalhadas) {
        super(nome, sobreNome, cpf, codigoEmp);
        setSalarioPorHora(salarioPorHora);
        setHorasTrabalhadas(horasTrabalhadas);
    }

    // Métodos modificadores
    public void setSalarioPorHora(double sh) {
        salarioPorHora = (sh > 0 ? sh : 0);
    }

    public void setHorasTrabalhadas(double ht) {
        horasTrabalhadas = (ht > 0 ? ht : 0);
    }

    // Métodos de acesso
    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double vencimentos() {
        return horasTrabalhadas * salarioPorHora;
    }

    // Método dados() – sobrepõe o método dados() da classe Empregado;
// retorna os dados de um Horista.
    public String dados() {
        return "Horista: " + super.dados() + "\nSalario por hora: R$" +
                salarioPorHora + "\nHoras trabalhadas: " + horasTrabalhadas +
                "\nVencimentos: R$" + vencimentos();
// super.dados() chama o método dados() da classe Empregado
    }
}