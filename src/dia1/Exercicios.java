package dia1;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        exercicio4();

    }

    public static void exercicio1() {
        //Escreva um algoritmo que armazene o valor de 99 em uma variável Y e o valor 11 em uma variável Z.
        //A seguir troque os seus conteúdos fazendo com que o valor que está em Y passe para Z e vice-versa.

        int y=99, z=11, x=0;

        System.out.println("Valor anterior de y = " +y);
        System.out.println("Valor anterior de z = " +z);

        x = y;
        y = z;
        z = x;

        System.out.println("Valor atual de y = " +y);
        System.out.println("Valor atual de z = " +z);


    }

    public static void exercicio2(){
        //Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

        Scanner in = new Scanner(System.in);
        System.out.println("Insira valor: ");
        int valor = in.nextInt();

        int antecessor = valor - 1;

        System.out.println("O antecessor de " +valor +  " é " +antecessor);
        in.close();


    }

    public static void exercicio3(){
        //Ler as dimensões de um retângulo e calcular e escrever sua área A = b x h

        Scanner in = new Scanner(System.in);
        System.out.println("Insira valor da base e da altura do retângulo: ");
        int b = in.nextInt();
        int h = in.nextInt();

        int a = b*h;

        System.out.println("A área do retângulo é:" +a);

    }

    public static void exercicio4(){
        //Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos
        // e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o total de eleitores do munícipio: ");
        int total = in.nextInt();
        System.out.println("Insira o número de votos brancos: ");
        int brancos = in.nextInt();
        System.out.println("Insira o números de votos nulos: ");
        int nulos = in.nextInt();

        float percentualBrancos = (brancos*100)/total;
        float percentualNulos = (nulos*100)/total;
        float percentualValidos = (total - (brancos+nulos))*100/total;

        System.out.println("O percentual em relação ao número de eleitores é: \n nulos: " +percentualNulos + "\n brancos: " +percentualBrancos+ "\n válidos: " +percentualValidos);

    }
}
