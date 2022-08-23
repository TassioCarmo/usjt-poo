package br.com.usjt.fluvio.aula12.heranca;

public class Tarefeiro extends Empregado{

    private double valorDaTarefa;
    private double totaldeTarefas;

    public Tarefeiro() {
        setValorDaTarefa(0.0);
        setTotaldeTarefas(0.0);
    }

    public Tarefeiro(String nome, String sobreNome, String cpf, int codigoEmp,double valorDaTarefa,double totaldeTarefas) {
        super(nome, sobreNome, cpf, codigoEmp);
        setValorDaTarefa(valorDaTarefa);
        setTotaldeTarefas(totaldeTarefas);
    }

    public double getValorDaTarefa() {
        return valorDaTarefa;
    }

    public void setValorDaTarefa(double valorDaTarefa) {
        this.valorDaTarefa = valorDaTarefa;
    }

    public double getTotaldeTarefas() {
        return totaldeTarefas;
    }

    public void setTotaldeTarefas(double totaldeTarefas) {
        this.totaldeTarefas = totaldeTarefas;
    }

    public double vencimentos(){
        return getValorDaTarefa() * getTotaldeTarefas();
    }

    @Override
    public String dados() {
        String dados = "Tarefeiro{" +super.dados()+
                "valorDaTarefa=" + valorDaTarefa +
                ", totaldeTarefas=" + totaldeTarefas +
                '}';
        return dados;
    }
}
