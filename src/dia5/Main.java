package dia4;

import java.util.Scanner;

public class Main {

    //Revisão e exercícos de fixação loops
    public static void main(String[] args) {
        //System.out.println(Math.pow(2,3));
        //faça um programa que calcula o exponencial a partir de sua base e sua potência
        //potencia();
        //exercicio22();
        //exercicio2I();
        //exercicio2II();
        //exercicio2III();
        //exercicio2IV();
        //exercicio2V();
        //exercicio2VI();
        //exercicio2VIVirginia();

    }

    public static void potencia() {

        Scanner in = new Scanner(System.in);
        System.out.println("Insira base e potência para cálculo do exponencial: ");
        if (!in.hasNext()) {
            System.out.println("Valor inválido. Digite número do tipo inteiro.");
            in.close();
            System.exit(1);
        }
        int b = in.nextInt();
        int p = in.nextInt();

        int exp = 1;

        for (int i = 1; i <= p; i++) {

            exp = exp * b;

        }
        System.out.println("Valor exponencial de " + b + " elevado a " + p + " é: " + exp);

        in.close();
    }

    public static void exercicio21() {
        int imprime = 0;

        for (int i = 0; i <= 4; i++) {

            System.out.println("**********");

        }
    }

    public static void exercicio22() {

        int linhas = 5;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }


            System.out.println(" ");
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 4 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 5 - i; k < 5; k++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 4 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 5 - i; k < 5; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 10 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 10 - i; k < 10; k++) {
                System.out.print(" " + i);
            }

            System.out.println();
        }
    }

    //Exercícios feitos pelo Anderson
    public static void exercicio2I() {
        int i = 4;
        while (i > 0) {
            System.out.println("**********");
            i--;
        }

        System.out.println("");
    }

    public static void exercicio2II() {

        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void exercicio2III() {

        int linhas = 10;

        for (int i = 1; i <= linhas; i++) {

            int k = linhas - i;

            while (k > 0) {
                System.out.print("  ");
                k--;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }


    public static void exercicio2IV() {
        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            while (k != 2 * i - 1) {
                System.out.print("* ");
                k++;
            }

            System.out.print("\n");
        }
    }

    public static void exercicio2V() {
        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            while (k != 2 * i - 1) {
                System.out.printf("%d ", i);
                k++;
            }

            System.out.print("\n");
        }
    }

    public static void exercicio2VI() {
        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            int l = i;
            boolean estaDecrementando = true;
            while (k != 2 * i - 1) {

                System.out.printf("%d ", l);
                k++;
                if (l > 1 && estaDecrementando) {
                    l--;
                } else {
                    estaDecrementando = false;
                    l++;
                }
            }

            System.out.print("\n");
        }
    }


    public static void exercicio2VIVirginia() {
        int rows = 5;
        System.out.println("");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(" " + k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(" " + l);
            }
            System.out.println();
        }

    }
}
