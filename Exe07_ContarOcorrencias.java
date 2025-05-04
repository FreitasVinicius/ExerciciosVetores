import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exe07_ContarOcorrencias {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[15];


        System.out.println("Digite 15 números para preencher o vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }


        System.out.print("Digite um número para contar quantas vezes ele aparece no vetor: ");
        int numeroParaContar = scanner.nextInt();

        int contador = 0;
        for (int num : vetor) {
            if (num == numeroParaContar) {
                contador++;
            }
        }

        System.out.println("O número " + numeroParaContar + " aparece " + contador + " vezes no vetor.");

        scanner.close();
    }
}
