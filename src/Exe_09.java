import java.util.Scanner;

public class Exe_09 {

    public static long potencia(int base, int expoente) {

        if (expoente == 0) {
            return 1;
        }

        return base * potencia(base, expoente - 1);

    }

    public static void exibirPotencias(int[] bases, int expoente) {

        for (int i = 0; i < bases.length; i++) {

            System.out.println(bases[i] + "^" + expoente + " = " +
                    potencia(bases[i], expoente));

        }

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int expoente;
        int[] bases = new int[5];

        System.out.print("Digite o expoente: ");
        expoente = entrada.nextInt();

        for (int i = 0; i < bases.length; i++) {

            System.out.print("Digite uma base: ");
            bases[i] = entrada.nextInt();

        }

        if (expoente < 0) {

            System.out.println("Expoente invalido!");

        } else {

            exibirPotencias(bases, expoente);

        }

        entrada.close();
    }
}