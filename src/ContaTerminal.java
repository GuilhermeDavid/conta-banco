import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.print("Digite o número da conta:");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a agência:");
        agencia = sc.nextLine();
        System.out.print("Digite o nome do cliente:");
        nomeCliente = sc.nextLine();
        System.out.print("Digite o saldo:");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente +
                " obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + " conta " + numero + " e seu saldo " + saldo +
                " já está disponivel para saque");

        sc.close();
    }
}
