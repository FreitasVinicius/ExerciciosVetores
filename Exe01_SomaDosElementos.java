//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exe01_SomaDosElementos {
    public static void main(String[] args) {

        int [] numeros = {5, 8, 2, 10, 3, 7, 6, 1, 4, 9};
        int soma =0;

        for (int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);

    }
}