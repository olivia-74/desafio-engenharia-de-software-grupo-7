public class Endereco {
    private int numero;
    private String rua;
    private String cidade;

    public Endereco() {
    }

    public Endereco(int numero, String rua, String cidade) {
        this.numero = numero;
        this.rua = rua;
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
