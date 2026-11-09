import java.util.Scanner;

public class Exe_03 {

    public static boolean ehPrimo(int numero) {

        if (numero < 2) {
            return false;
        }
        for (int i = 2; i < numero; i++) {

            if (numero % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static int contarPrimos(int[] v) {

        int quantidade = 0;
        for (int i = 0; i < v.length; i++) {

            if (ehPrimo(v[i])) {
                quantidade++;
            }

        }

        return quantidade;
    }

    public static void exibirPrimos(int[] v) {
        for (int i = 0; i < v.length; i++) {

            if (ehPrimo(v[i])) {
                System.out.println("Numero primo: " + v[i]);
            }

        }
        System.out.println("Quantidade de primos: " + contarPrimos(v));

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Digite um numero inteiro: ");
            numeros[i] = entrada.nextInt();
        }

        exibirPrimos(numeros);
        entrada.close();
    }
}