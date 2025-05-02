import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exe03_ContadorNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[20];
        int contadorPares = 0;

        System.out.println("Digite 20 números: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Quantidades de numeros pares: " + contadorPares);

        scanner.close();
    }
}