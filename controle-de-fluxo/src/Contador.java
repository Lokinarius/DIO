import java.util.Scanner;



public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o valor Inicial:");
        int valorInicial = terminal.nextInt();
        System.out.println("Digite o valor final");
        int valorFinal = terminal.nextInt();

        try {
            contar(valorInicial, valorFinal);
        }catch (ContagemInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
    static void contar(int valorInicial, int valorFinal ) throws ContagemInvalidaException {
        if (valorInicial > valorFinal){
            throw new ContagemInvalidaException ("O valor final deve ser maior que o valor inicial");
        }

        int valor = valorFinal - valorInicial;
        for (int i = 1; i <valor; i++) {
            System.out.println("Imprimindo número "+ i);
        }
    }
}