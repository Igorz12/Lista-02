import java.util.Scanner;

public class Exe_10 {

    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static int somar(int[] v) {

        int soma = 0;

        for (int i = 0; i < v.length; i++) {
            soma = soma + v[i];
        }

        return soma;
    }

    public static void exibir(int[] v) {

        for (int i = 0; i < v.length; i++) {

            System.out.print(v[i] + " ");

        }

        System.out.println();

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.print("Digite a quantidade de posicoes: ");
        n = entrada.nextInt();

        if (n < 1 || n > 30) {

            System.out.println("Quantidade invalida!");

        } else {

            int[] numeros = new int[n];

            for (int i = 0; i < numeros.length; i++) {

                numeros[i] = fibonacci(i);

            }

            System.out.println("Sequencia de Fibonacci:");

            exibir(numeros);

            System.out.println("Soma: " + somar(numeros));

        }

        entrada.close();
    }
}