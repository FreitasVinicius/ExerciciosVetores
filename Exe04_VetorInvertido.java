import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exe04_VetorInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[8];

        System.out.println("Digite 8 numeros: ");
        for (int i =0; i < numeros.length; i++){
            System.out.print("Elemento " + (i+1) + ":");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Vetor na ordem inversa: ");
        for (int i = numeros.length -1; i>=0; i--){
            System.out.print(numeros[i]+ " ");
        }
        
        scanner.close();
    }
}