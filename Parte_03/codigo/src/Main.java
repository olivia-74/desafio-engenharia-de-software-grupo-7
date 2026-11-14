import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco(100, "Rua das Flores", "São Paulo");
        Usuario usuario = new Usuario(1, "Ana", endereco);
        Livro livro = new Livro("Padrões de Projeto", "Autor Exemplo");
        Exemplar exemplar = new Exemplar(1, new double[] {20.0, 14.0, 2.0}, 0.5, livro);

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setUsuario(usuario);
        emprestimo.setExemplar(exemplar);

        emprestimo.setEstrategiaFrete(new EmpresaA());
        exibirFrete("Empresa A", emprestimo);

        emprestimo.setEstrategiaFrete(new EmpresaB());
        exibirFrete("Empresa B", emprestimo);

        emprestimo.setEstrategiaFrete(new EmpresaC());
        exibirFrete("Empresa C", emprestimo);

        emprestimo.setEstrategiaFrete(new EmpresaD());
        exibirFrete("Empresa D", emprestimo);
    }

    private static void exibirFrete(String nomeEmpresa, Emprestimo emprestimo) {
        System.out.printf(
                Locale.forLanguageTag("pt-BR"),
                "%s: R$ %.2f%n",
                nomeEmpresa,
                emprestimo.calcularFrete()
        );
    }
}