package beans;

import java.util.ArrayList;

public class Empresa {

    private int cnpj;
    private String nome;
    private String rua;
    private String bairro;
    private String numero;
    private double custoTransporte;
    ArrayList<Residuo> residuos;

    public Empresa() {
    }

    public Empresa(int cnpj, String nome, String rua, String bairro, String numero, double custoTransporte) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.custoTransporte = custoTransporte;
    }
    
    public void addResiduo(Residuo residuo){
        residuos.add(residuo);
    }
    
    public void removeResiduo(Residuo residuo) {
        residuos.remove(residuo);
    }
    
    public int residuoEmpresa(Residuo residuo) {
        int c = 0;
        for (Residuo r : this.residuos) {
            if (r == residuo) {
                c = this.cnpj;
            }
        }
        return c;
    }

    @Override
    public String toString() {
        return "\n CNPJ: " + cnpj +
        "\n nome: " + nome +
        "\n rua: " + rua +
        "\n bairro: " + bairro +
        "\n numero: " + numero +
        "\n Custo de Transporte: " + custoTransporte;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
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
