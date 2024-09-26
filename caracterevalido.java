import java.util.Scanner;

public class caracterevalido {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // captar o primeiro número
            System.out.print("Digite o primeiro número: ");
            // armazenar o primeiro número
            int dado1 = scanner.nextInt();

            // captar o segundo número
            System.out.print("Digite o segundo número: ");
            // armazenar o segundo número
            int dado2 = scanner.nextInt();

            // captar o operador
            System.out.print("Digite o operador: ");
            // armazenar o operador
            char operador = scanner.next().charAt(0);
            ;
            int result = 0;
            // verifica operador
            switch (operador) {
                case '+':
                    result = dado1 + dado2;
                    System.out.print(result);
                    break;

                case '-':
                    result = dado1 - dado2;
                    System.out.print(result);
                    break;

                case '/':
                    result = dado1 / dado2;
                    System.out.print(result);
                    break;

                case '*':
                    result = dado1 * dado2;
                    System.out.print(result);
                    break;

                default:
                    System.out.print("Operação inválida");
                    break;
            }

            scanner.close();
        }
    }

}
