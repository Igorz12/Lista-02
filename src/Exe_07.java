import java.util.Scanner;

public class Exe_07 {

    public static String gerarIniciais(String nomeCompleto) {

        String iniciais = "";

        String[] nomes = nomeCompleto.trim().split(" ");

        for (int i = 0; i < nomes.length; i++) {

            if (nomes[i].length() > 0) {

                iniciais = iniciais + nomes[i].charAt(0);

                if (i < nomes.length - 1) {
                    iniciais = iniciais + ".";
                }

            }

        }

        return iniciais.toUpperCase();
    }

    public static void exibirChamada(String[] nomes) {

        for (int i = 0; i < nomes.length; i++) {

            System.out.println((i + 1) + ". " +
                    nomes[i].toLowerCase() + " (" +
                    gerarIniciais(nomes[i]) + ")");

        }

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {

            System.out.print("Digite o nome completo do aluno: ");
            nomes[i] = entrada.nextLine();

        }

        exibirChamada(nomes);

        entrada.close();
    }
}