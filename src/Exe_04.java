import java.util.Scanner;

public class Exe_04 {

    public static void ordenar(int[] v) {

        for (int i = 0; i < v.length; i++) {

            for (int j = 0; j < v.length - 1; j++) {

                if (v[j] > v[j + 1]) {

                    int aux = v[j];

                    v[j] = v[j + 1];
                    v[j + 1] = aux;

                }

            }

        }

    }

    public static boolean estaOrdenado(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {

            if (v[i] > v[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void exibir(int[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero inteiro: ");
            numeros[i] = entrada.nextInt();

        }

        System.out.println("Array antes de ordenar:");
        exibir(numeros);
        System.out.println("Esta ordenado? " + estaOrdenado(numeros));
        ordenar(numeros);
        System.out.println("Array depois de ordenar:");

        exibir(numeros);
        System.out.println("Esta ordenado? " + estaOrdenado(numeros));

        entrada.close();
    }
}