import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double rec = 0;
        double trans = 0;
        int op = 0;

        System.out.println("Nome? ");
        String nome = input.nextLine();

        System.out.println("Conta? ");
        String conta = input.nextLine();

        System.out.println("Saldo atual? ");
        double saldo = input.nextInt();

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + conta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("\n***********************\n");

        while (op < 4){
            System.out.println("""
                        Operações:
                        1. Consultar dados
                        2. Receber valor
                        3. Transferir valor
                        4. Sair
                """);
            op = input.nextInt();

            if (op == 1){
                System.out.println("\nO saldo atual é de R$" + saldo);
            } else if  (op == 2) {
                System.out.println("\nValor recebido: ");
                rec = input.nextDouble();
                saldo += rec;
            } else if  (op == 3) {
                System.out.println("\nValor transferido: ");
                trans = input.nextDouble();
                if (saldo < trans){
                    System.out.println("Não há saldo suficiente\n");
                } else {
                    saldo -= trans;
                }
            } else if (op > 4) {
                System.out.println("Opção inválida\n");
            }
        }
    }
}