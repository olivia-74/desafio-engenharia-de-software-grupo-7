public class EmpresaA implements EstrategiaFrete {
    @Override
    public double calcularFrete(Endereco endereco, Exemplar exemplar) {
        return 10.00;
    }
}