public class Exemplar {
    private int codigo;
    private double[] dimensoes;
    private double peso;
    private Livro livro;

    public Exemplar() {
    }

    public Exemplar(int codigo, double[] dimensoes, double peso) {
        this.codigo = codigo;
        this.dimensoes = dimensoes;
        this.peso = peso;
    }

    public Exemplar(int codigo, double[] dimensoes, double peso, Livro livro) {
        this(codigo, dimensoes, peso);
        this.livro = livro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double[] getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(double[] dimensoes) {
        this.dimensoes = dimensoes;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
