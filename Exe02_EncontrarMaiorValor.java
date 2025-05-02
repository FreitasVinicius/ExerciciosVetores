import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exe02_EncontrarMaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[15];


        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        int maior = vetor[0];
        int posicaoMaior = 0;


        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Posição (índice): " + posicaoMaior);

        scanner.close();
    }
}