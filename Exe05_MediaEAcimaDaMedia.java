import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exe05_MediaEAcimaDaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numeros [] = new double[12];
        double soma = 0;

        System.out.println("Digite 12 numeros:");
        for (int i=0; i < numeros.length; i++){
            System.out.print("Número: " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        double media = soma / numeros.length;
        System.out.println("Média dos valores: " + media);

        int contadorMaiorQueMedia = 0;
        for (int i =0; i < numeros.length; i++){
            if (numeros[i] > media){
                contadorMaiorQueMedia++;
            }
        }

        System.out.println("Quantidades de numeros maior que a média: " + contadorMaiorQueMedia);

        scanner.close();
    }
}