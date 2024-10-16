import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Renda anual com salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");
        double prestacaoServico = scanner.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");
        double ganhoCapital = scanner.nextDouble();

        System.out.print("Gastos médicos: ");
        double gastosMedicos = scanner.nextDouble();

        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = scanner.nextDouble();

        RendaAnual rendaAnual = new RendaAnual(salario, prestacaoServico, ganhoCapital, gastosMedicos, gastosEducacionais);
        ImpostoDeRenda impostoDeRenda = new ImpostoDeRenda(rendaAnual);

        RelatorioImposto.gerarRelatorio(impostoDeRenda);

        scanner.close();
    }
}
