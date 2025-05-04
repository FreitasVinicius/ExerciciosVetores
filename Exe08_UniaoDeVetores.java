import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exe08_UniaoDeVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];


        System.out.println("Digite 5 elementos para o vetor A:");
        for (int i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }


        System.out.println("Digite 5 elementos para o vetor B:");
        for (int i = 0; i < 5; i++) {
            B[i] = scanner.nextInt();
        }


        for (int i = 0; i < 5; i++) {
            C[i] = A[i];
            C[i + 5] = B[i];
        }
        

        System.out.println("Vetor C (união dos elementos de A e B):");
        for (int i = 0; i < 10; i++) {
            System.out.print(C[i] + " ");
        }

        scanner.close();
      }
    }