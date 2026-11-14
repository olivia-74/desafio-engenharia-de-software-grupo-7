public class EmpresaC implements EstrategiaFrete {
    @Override
    public double calcularFrete(Endereco endereco, Exemplar exemplar) {
        return 11.00;
    }
}