package dia7;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] vetor = {1,2,3,4};

        //Object[] vetor = {1,2,3,4, "asd", true};


        Integer i = 0; //int
        Short s = 0; //short
        Long l= 0L; //long
        Float f = 0f; //float
        Double d = 0.0; // double
        Character c = 'o'; //char
        String str = "";

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);

        System.out.println(lista);
        lista.remove(0);

        System.out.println(lista);

       // List<Integer> lista2 = Arrays.stream(vetor).boxed().collect(Collectors.tolist());

        List<Integer> lista2 = new ArrayList<>();

        for(int v : vetor){
            lista2.add(v);


        }
        System.out.println(lista2);

        int a = 1;
        Integer b=a;

        Integer cc = 1;
        int dd = cc;

        //List<Double> notas = new ArrayList<>(Array.asList())
    }

}
