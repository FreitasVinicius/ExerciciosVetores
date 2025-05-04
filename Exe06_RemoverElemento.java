import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exe06_RemoverElemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];


        System.out.println("Digite 10 números:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }


        System.out.print("Digite o número que deseja remover: ");
        int numeroParaRemover = scanner.nextInt();


        ArrayList<Integer> novoVetor = new ArrayList<>();
        boolean removido = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroParaRemover && !removido) {
                removido = true;
            } else {
                novoVetor.add(vetor[i]);
            }
        }


        System.out.println("Vetor após remoção:");
        for (int num : novoVetor) {
            System.out.print(num + " ");
        }
    }
}