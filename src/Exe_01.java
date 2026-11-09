import java.util.Scanner;

public class Exe_01 {

    public static String gerarLinha(char simbolo, int tamanho) {
        String linha = "";

        for (int i = 0; i < tamanho; i++) {
            linha = linha + simbolo;
        }
        return linha;
    }

    public static void desenharTriangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            System.out.println(gerarLinha('*', i));
        }

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] alturas = new int[3];
        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Digite a altura do triangulo: ");
            alturas[i] = entrada.nextInt();
        }
        for (int i = 0; i < alturas.length; i++) {
            desenharTriangulo(alturas[i]);
            System.out.println();
        }
        entrada.close();
    }
}