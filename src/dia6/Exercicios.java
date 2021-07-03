package dia6;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicios {

    public static void exercicio1(){
        //Dado um array cim 20 numeros, imprima seus valores de trás para frente.

        double[] array = {1,2,3,4,5,6,7,8,9,10};

        //i=array.length;
        for(int i=9; i>=0; i--){
            System.out.println(array[i]);
        }
    }

    public static void exercicio1Alternativo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Preencher vetor até: ");

        int num = in.nextInt();
        int[] vetor = new int[num];

        for(int i=0; i<num; i++){
            vetor[i] = i+1;
        }
        for(int i=vetor.length-1; i>=0; i--){
            System.out.println(vetor[i]);
        }
        in.close();
    }



    public static void sortGrupo1() {
        int[] arrayDesordenado = {-15, 98, 35, 7, 18, 0, 543, 35, 15, 2, -11, -15, -15};
        int[] arrayOrdenador = new int[arrayDesordenado.length];
        for (int j = 0; j < arrayOrdenador.length; j++) {
            int valorMinimo = arrayDesordenado[j];
            for (int i = j; i < arrayDesordenado.length; i++) {
                if (arrayOrdenador[j] > arrayDesordenado[i]) {
                    int aux = valorMinimo;
                    valorMinimo = arrayDesordenado[i];
                    arrayDesordenado[i] = aux;
                }
                arrayOrdenador[j] = valorMinimo;
            }
        }
        for (int number : arrayOrdenador) {
            System.out.print(number + ", ");
        }
    }

    public static void sortGrupo2() {
        int[] lista = {50, 30, 25, 80, 2, 7, 30, 20, -1, -101, 30, 50};
        int menor;
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[j] < lista[i]) {
                    menor = lista[j];
                    lista[j] = lista[i];
                    lista[i] = menor;
                }
            }
        }
        for (int valor : lista) {
            System.out.println(valor);
        }
    }

    public static void sortGrupo3() {
        // valores a serem ordenados
        int vetor[] = {3, 5, 10, 8, 1, 3, -10};
        // armazenam o menor valor e o índice do menor valor
        int menor, indiceMenor;
        for (int i = 0; i < vetor.length - 1; i++) {
            // antes de comparar, considera-se menor o valor atual do loop
            menor = vetor[i];
            indiceMenor = i;
            // compara com os outros valores do vetor
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < menor) {
                    menor = vetor[j];
                    indiceMenor = j;
                }
            }
            // troca os valores menor e maior
            vetor[indiceMenor] = vetor[i];
            vetor[i] = menor;
        }

        System.out.println(Arrays.toString(vetor));
    }

    public static void sortGrupo4() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite quantos números deseja ordenar: ");
        int tamanho = entrada.nextInt();
        int vetor[] = new int[tamanho];
        int aux;
        int a = 0;
        while (a < vetor.length) {
            System.out.print("Digite o " + (a + 1) + "º número: ");
            vetor[a] = entrada.nextInt();
            a++;
        }
        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vetor[i] < vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("\n Números ordenados: ");
        for (int k = 0; k < vetor.length; k++) {
            System.out.printf("%d ", vetor[k]);
        }

        entrada.close();
    }


    public static void selectionSortPtBr(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indice_com_menor_valor = i;

            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indice_com_menor_valor]) {
                    indice_com_menor_valor = j;
                }
            }

            int temporaria = vetor[indice_com_menor_valor];
            vetor[indice_com_menor_valor] = vetor[i];
            vetor[i] = temporaria;

        }


    }


    public static void selectionSort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted sub array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    public static void sortString() {
        String[] palavras = {"Banana", "Maça", "Uva", "Amora", "Ameixa"};

        System.out.println(Arrays.toString(palavras));

        Arrays.sort(palavras);

        System.out.println(Arrays.toString(palavras));
    }

    public static void sortString(int asd) {

    }


    public static void main(String[] args) {
        //exercicio1();
        // exercicio1Alternativo();


            Random rd = new Random(); // creating Random object
            int[] arr = new int[100_000];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rd.nextInt(); // storing random integers in an array
                // System.out.println(arr[i]); // printing each array element
            }

            Instant start = Instant.now();

            Arrays.sort(arr);
            // System.out.println(Arrays.toString(arr));

            Instant end = Instant.now();
            System.out.println(Duration.between(start, end));

            sortString();
        }
    }




