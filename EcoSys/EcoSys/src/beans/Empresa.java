package beans;

public class Empresa {

    private String cnpj;
    private String nome;
    private String rua;
    private String bairro;
    private String numero;
    private double custoTransporte;

    public Empresa() {
    }

    public Empresa(String cnpj, String nome, String rua, String bairro, String numero, double custoTransporte) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.custoTransporte = custoTransporte;
    }  

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getCustoTransporte() {
        return custoTransporte;
    }

    public void setCustoTransporte(double custoTransporte) {
        this.custoTransporte = custoTransporte;
    }
}
