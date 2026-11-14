public class EmpresaB implements EstrategiaFrete {
    @Override
    public double calcularFrete(Endereco endereco, Exemplar exemplar) {
        return 12.00;
    }
}