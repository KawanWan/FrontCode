package beans;

public class Funcionario {
    private int idFuncionario;
    private String CPF, nome, senha, data_nasc;

    public Funcionario(int idFuncionario, String CPF, String nome, String senha, String data_nasc) {
        this.idFuncionario = idFuncionario;
        this.CPF = CPF;
        this.nome = nome;
        this.senha = senha;
        this.data_nasc = data_nasc;
    }

    public Funcionario() {
    }

    public Funcionario(String CPF, String nome, String senha, String data_nasc) {
        this.CPF = CPF;
        this.nome = nome;
        this.senha = senha;
        this.data_nasc = data_nasc;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }
    
    
}
