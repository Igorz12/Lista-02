import java.util.Scanner;

public class Exe_06 {

    public static int contarVogais(String texto) {

        int quantidade = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                    letra == 'o' || letra == 'u') {

                quantidade++;

            }

        }

        return quantidade;
    }

    public static void exibirContagem(String[] frases) {

        int maiorQuantidade = 0;
        int posicao = 0;

        for (int i = 0; i < frases.length; i++) {

            int quantidade = contarVogais(frases[i]);

            System.out.println("Frase: " + frases[i]);
            System.out.println("Quantidade de vogais: " + quantidade);

            if (quantidade > maiorQuantidade) {

                maiorQuantidade = quantidade;
                posicao = i;

            }

        }

        System.out.println("Frase com mais vogais: " + frases[posicao]);

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {

            System.out.print("Digite uma frase: ");
            frases[i] = entrada.nextLine();

        }

        exibirContagem(frases);

        entrada.close();
    }
}