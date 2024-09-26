import java.util.Scanner;
public class GestaoAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorConsultaBasica = 80.0;
        double valorConsultaEspecial = 119.90;
        double valorVacina = 94.90;
        double valorExame = 189.90;

        double valorTotal = 0;

        System.out.println("Bem vindo ao sistema de cadastro de animais!");
        System.out.println("--------------------------------------------");

        System.out.println("Digite o nome do dono: ");
        String nomDono = scanner.nextLine();
        System.out.println("--------------------------------------------");
        System.out.println("Digite o nome do animal: ");
        String nomeAnimal = scanner.nextLine();
        System.out.println("--------------------------------------------");
        System.out.println("Digite a espécie do animal: ");
        String especie = scanner.nextLine();
        System.out.println("--------------------------------------------");

        System.out.println("Consulta básica ou especial? B/E");
        String tipoConsulta = scanner.nextLine();

        if(tipoConsulta.equals("B")) {
            tipoConsulta = "Consulta Básica";
        } else {
            tipoConsulta = "Consulta Especial";
        }

        System.out.println("--------------------------------------------");
        System.out.println("Houve Vacinação? S/N");
        String vacina = scanner.nextLine();

        if(vacina.equals("S")) {
            vacina = "Com Vacinação";
        } else {
            vacina = "Sem Vacinação";
        }

        System.out.println("--------------------------------------------");
        System.out.println("Exame? S/N");
        String exame = scanner.nextLine();

        if(exame.equals("S")) {
            exame = "Com Exame";
        } else {
            exame = "Sem Exame";
        }

        if (tipoConsulta.equals("Consulta Básica")) {
            valorTotal += valorConsultaBasica;
        } else {
            valorTotal += valorConsultaEspecial;
        }

        if (vacina.equals("Com Vacinação")) {
            valorTotal += valorVacina;
        }

        if (exame.equals("Com Exame")) {
            valorTotal += valorExame;
        }

        System.out.printf("Aqui está o recibo da consulta:%n" +
                        "Nome do dono: %s%n" +
                        "Nome do animal: %s%n" +
                        "Espécie: %s%n" +
                        "Tipo de Consulta: %s%n" +
                        "Vacina: %s%n" +
                        "Exame: %s%n" +
                        "Valor total: R$ %.2f%n",
                nomDono, nomeAnimal, especie, tipoConsulta, vacina, exame, valorTotal);
    }
}
