package beans;

public class Residuo {

    private int id;
    private String nome;
    private double quantidade;
    private double valorVenda;
    private String classe;
    private String cnpj;

    public Residuo() {
    }

    public Residuo(int id, String nome, double quantidade, double valorVenda, String classe, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorVenda = valorVenda;
        this.classe = classe;
        this.cnpj = cnpj;
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

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

   
}