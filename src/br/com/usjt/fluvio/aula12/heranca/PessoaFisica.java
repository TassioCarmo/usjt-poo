package br.com.usjt.fluvio.aula12.heranca;

public class PessoaFisica {
    private String nome;
    private String sobreNome;
    private String cpf;


    public PessoaFisica(){
        setNome("Indefinido");
        setSobreNome("Teste");
        setCpf("111-111-111-11");
    }

    public PessoaFisica(String nome, String sobreNome, String cpf) {
        setNome(nome);
        setSobreNome(sobreNome);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String dados() {
        String dados ="PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
        return dados;
    }
}
