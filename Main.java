import static CharA.CharA.ocurrenceA;
import static Fibonacci.Fibonacci.isFibonacci;
import static Soma.Soma.SomaK;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao;

        System.out.println("Desafio Target Sistemas");

        while (true) {

            System.out.println("Escolha umas da questões abaixo: \n" +
                    "1. Fibonacci \n" +
                    "2. Soma \n" +
                    "3. Existência do caractere A \n" +
                    "4. Sair");
            Scanner ler = new Scanner(System.in);
            opcao = lerInt(ler);


            switch (opcao) {
                case 1:
                    System.out.println("Digite o número que você quer verificar se é Fibonacci");
                    int number = lerInt(ler);
                    isFibonacci(number);
                    System.out.println("-------------------------------------------\n\n\n");
                    break;
                case 2:
                    SomaK();
                    System.out.println("-------------------------------------------\n\n\n");
                    break;
                case 3:
                    System.out.println("Digite a palavra ou frase que você quer contar a ocorrência do caractere a");
                    String str = ler.nextLine();
                    ocurrenceA(str);
                    System.out.println("-------------------------------------------\n\n\n");
                    break;
                case 4:
                    System.out.println("Até logo!");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Selecione uma opção válida!");
                    System.out.println("-------------------------------------------\n\n\n");
                    break;

            }
        }
    }
    public static int lerInt(Scanner sc) {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Você não digitou um número válido, tente novamente");
            }
        }
    }
    
    
}