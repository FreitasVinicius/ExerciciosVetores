import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exe09_IntersecaoEntreVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[6];
        int[] vetor2 = new int[6];


        System.out.println("Digite 6 números para o primeiro vetor:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Vetor 1 [" + i + "]: ");
            vetor1[i] = scanner.nextInt();
        }


        System.out.println("Digite 6 números para o segundo vetor:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Vetor 2 [" + i + "]: ");
            vetor2[i] = scanner.nextInt();
        }


        ArrayList<Integer> comuns = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (vetor1[i] == vetor2[j] && !comuns.contains(vetor1[i])) {
                    comuns.add(vetor1[i]);
                }
            }
        }


        System.out.println("Elementos comuns:");
        for (int num : comuns) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}