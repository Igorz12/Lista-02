import java.util.Scanner;

public class Exe_02 {

    public static double calcularImc(double peso, double altura) {
        double imc;
        imc = peso / (altura * altura);
        return imc;
    }

    public static String classificarImc(double imc) {

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }

    }

    public static void exibirRelatorio(double[] pesos, double[] alturas) {

        for (int i = 0; i < pesos.length; i++) {
            double imc = calcularImc(pesos[i], alturas[i]);
            System.out.println("Pessoa " + (i + 1) + ": IMC " +
                    (Math.round(imc * 100.0) / 100.0) + " - " +
                    classificarImc(imc));

        }

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double[] pesos = new double[4];
        double[] alturas = new double[4];

        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Digite o peso da pessoa: ");
            pesos[i] = entrada.nextDouble();
            System.out.print("Digite a altura da pessoa: ");
            alturas[i] = entrada.nextDouble();

        }

        exibirRelatorio(pesos, alturas);
        entrada.close();
    }
}