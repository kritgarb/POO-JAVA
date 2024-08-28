import java.util.Scanner;

public class parouimpar {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {

            // captar o número
            System.out.print("Digite um número: ");
            // armazenar número
            int dado = scanner.nextInt();
            // verifica se  é par através do resto da divisão
            if(dado % 2 == 0){
                System.out.print("É par.");
            } else {
                System.out.print("É impar.");
            }
            
            scanner.close();
        }
    }
}