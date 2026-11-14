public class EmpresaD implements EstrategiaFrete {
    @Override
    public double calcularFrete(Endereco endereco, Exemplar exemplar) {
        return 10.50;
    }
}