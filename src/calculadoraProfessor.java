import java.util.Scanner;

public class calculadoraProfessor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do professor: ");
        String nome = teclado.nextLine();

        System.out.println("Qual é o seu regime de pagamento? Insira o número correspondente: ");
        System.out.println("1. CLT");
        System.out.println("2. Horista");
        System.out.println("3. PJ");
        System.out.print("Opção: ");
        int opcao = teclado.nextInt();

        double valorReceber = 0.0;

        if (opcao == 1) {
            System.out.print("Digite o salário mensal do professor: ");
            double salarioMensal = teclado.nextDouble();
            valorReceber = salarioMensal;
        } else if (opcao == 2) {
            System.out.print("Qual a quantidade de horas trabalhadas pelo professor? ");
            int horasTrabalhadas = teclado.nextInt();

            System.out.print("Qual é o valor da hora de trabalho desse professor? ");
            double valorHora = teclado.nextDouble();

            valorReceber = horasTrabalhadas * valorHora;
        } else if (opcao == 3) {
            System.out.print("Qual é o valor que consta no contrato desse professor? ");
            double valorContrato = teclado.nextDouble();
            valorReceber = valorContrato;
        } else {
            System.out.println("Opção desconhecida!");
            System.exit(0);
        }

        System.out.println("Nome do professor: " + nome);
        System.out.println("Valor total a receber: R$" + valorReceber);

        teclado.close();
    }
}