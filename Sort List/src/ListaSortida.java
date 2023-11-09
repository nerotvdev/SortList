import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaSortida {
    public static void main(String[] args) {
        List<Integer> listanumeros = new ArrayList<>();
        listanumeros.add(5);
        listanumeros.add(8);
        listanumeros.add(3);
        listanumeros.add(6);
        
        Collections.sort(listanumeros);

        System.out.println("Lista Ordenada: " + listanumeros);
    }
}