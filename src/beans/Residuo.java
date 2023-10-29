package beans;

public class Residuo {

    private int id;
    private String nome;
    private int quantidade;
    private double valorVenda;
    private String classe;
    Empresa empresa;

    public Residuo() {
    }
    //teste commit
    public Residuo(int id, String nome, int quantidade, double valorVenda, String classe, Empresa empresa) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorVenda = valorVenda;
        this.classe = classe;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "\n nome: " + nome
                + "\n quantidade: " + quantidade
                + "\n valorVenda: " + valorVenda
                + "\n classe: " + classe
                + "\n empresa: " + empresa;
    }

}
