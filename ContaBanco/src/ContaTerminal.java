import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // [ENTRADA DE DADOS]
        // Numero
        System.out.println("Digite o número da sua conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        // Agencia
        System.out.println("Digite o número da sua agência:");
        String agencia = scanner.nextLine();
        // Nome do Cliente
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        // Saldo
        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        // [SAÍDA DE DADOS]
        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", " +
                "conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");



    }
}