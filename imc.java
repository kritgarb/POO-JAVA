import java.util.Scanner;
public class imc {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            /* Capturar o peso */
            System.out.print("Digite seu peso (em kg): ");
            double peso = scanner.nextDouble();

            /* Capturar a altura em formato variável */
            System.out.print("Digite a sua altura (em metros): ");
            String alturaStr = scanner.next();

            /* Normalizar a entrada */
            alturaStr = alturaStr.replace(",", "."); // Substitui vírgula por ponto

            if (!alturaStr.contains(".")) {
                // Se não contém ponto, adiciona o ponto antes das duas últimas casas
                int len = alturaStr.length();
                alturaStr = alturaStr.substring(0, len - 2) + "." + alturaStr.substring(len - 2);
            }

            double altura = Double.parseDouble(alturaStr); // Converter para double

            /* Verificar a altura razoável */
            if (altura < 0.5 || altura > 2.5) {
                System.out.println("Altura inválida. Insira a altura em metros (por exemplo, 1.60).");
                return;
            }

            /* Calcular o IMC */
            double imc = peso / (altura * altura);

            /* Responder condicionalmente */
            if (imc <= 18.5) {
                System.out.println("Abaixo do peso");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Peso normal");
            } else if (imc >= 25.0 && imc <= 29.9) {
                System.out.println("Sobrepeso");
            } else if (imc >= 30.0) {
                System.out.println("Obesidade");
            } else {
                System.out.println("Erro no processamento");
            }
        }
    }
}
