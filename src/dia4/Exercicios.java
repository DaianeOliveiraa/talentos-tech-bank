package dia4;

import java.util.Scanner;

public class Exercicios {

    public static void exercicio1() {
        //Construa um algoritmo que leia 10 valores inteiros e positivos e:
        //Encontre o maior valor
        //Encontre o menor valor
        //Calcule a média dos números lidos Esse exercício foi dado na aula 3 e agora vamos otimizar
        // ele utilizando o while e for.

        Scanner in = new Scanner(System.in);
        int valor[] = new int[10];
        int maior = 0, menor = 1000;
        float somatorio = 0, media = 0;

        for (int i = 0; i < valor.length; i++) {
            System.out.println("Insira 10 valores inteiros e positivos: ");
            if (!in.hasNext()) {
                System.out.println("Valor inválido. Digite número do tipo inteiro.");
                in.close();
                System.exit(1);
            }
            valor[i] = in.nextInt();

            somatorio = somatorio + valor[i];
            media = somatorio / 10;

            if (valor[i] < menor) {
                menor = valor[i];
            }

            if (valor[i] > maior) {
                maior = valor[i];
            }
        }
        System.out.println("Menor valor: " + menor + "\nMaior valor: " + maior + "\nMédia: " + media);


    }

    public static void exercicio2() {
        //Construa um algoritmo usando uma estrutura de repetição que calcule o fatorial de um número.

        int fatorial = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira número para calcular fatorial: ");
        int num = in.nextInt();

        while (num > 1) {
            fatorial = fatorial + (fatorial * (num - 1));
            num--;
        }
        System.out.println("O fatorial de " + num + " é: " + fatorial);


    }

    //RESOLUÇÃO RECURSIVA


            public static int fatorialRecursivo ( int x){
                if (x == 0) {
                    return 1;
            }
            return x * fatorialRecursivo(x - 1);
        }



        public static void main (String[]args){

            Scanner in = new Scanner(System.in);

            System.out.println("Digite número para cálculo do fatorial: ");
            int num = in.nextInt();

            System.out.println("O fatorial  é: " +fatorialRecursivo(num));
    }


}