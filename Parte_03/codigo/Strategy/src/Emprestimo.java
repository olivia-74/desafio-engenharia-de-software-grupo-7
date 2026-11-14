import java.util.Date;

public class Emprestimo {
    private Date dataRetirada;
    private Date dataEntregaPrevista;
    private Date dataEntregaRealizada;
    private Exemplar exemplar;
    private Usuario usuario;
    private EstrategiaFrete estrategiaFrete;

    public Emprestimo() {
    }

    public Emprestimo(Date dataRetirada, Date dataEntregaPrevista, Date dataEntregaRealizada) {
        this.dataRetirada = dataRetirada;
        this.dataEntregaPrevista = dataEntregaPrevista;
        this.dataEntregaRealizada = dataEntregaRealizada;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataEntregaPrevista() {
        return dataEntregaPrevista;
    }

    public void setDataEntregaPrevista(Date dataEntregaPrevista) {
        this.dataEntregaPrevista = dataEntregaPrevista;
    }

    public Date getDataEntregaRealizada() {
        return dataEntregaRealizada;
    }

    public void setDataEntregaRealizada(Date dataEntregaRealizada) {
        this.dataEntregaRealizada = dataEntregaRealizada;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setEstrategiaFrete(EstrategiaFrete estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public double calcularFrete() {
        return estrategiaFrete.calcularFrete(usuario.getEndereco(), exemplar);
    }
}