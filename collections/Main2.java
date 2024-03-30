package collections;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {

        // Sobre List
        // Principais Implementações

        ArrayList<String> arrayList = new ArrayList<>();

        // Possui métodos para trabalhar com o inicio e o fim da lista, o que no ArrayList não possui

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(3, 8, 1, 15, 12, 9, 17, 13));

        linkedList.addFirst(6); // adiciona no inicio
        linkedList.addLast(2); // adiciona no final

        linkedList.peekFirst(); // retorna o primeiro
        linkedList.peekLast(); // retorna o último

        Vector<Pessoa> vectorList = new Vector<>();



    }

    static class Pessoa {

    }
}
