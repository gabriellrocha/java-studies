package collections;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {

        // Iterator: Interface que fornece um meio de iterar sequencialmente sobre elementos
        // de uma Collection como List, Set e Map.

        // -> hasNext() verifica se há mais elementos
        // -> next() para obter o próximo elemento
        // -> remove() remove o atual elemento

        // Iterando sobre uma List
        List<String> lista = new ArrayList<>();
        lista.add("banana");
        lista.add("jaca");
        lista.add("caqui");

        Iterator<String> iterator = lista.iterator();

        while(iterator.hasNext()){
            String fruta = iterator.next();
            System.out.println(fruta);
        }

        // Iterando sobre um Set
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(10);
        conjunto.add(12);
        conjunto.add(8);

        Iterator<Integer> iterator2 = conjunto.iterator();

        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        // Iterando sobre um Map
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("gabriel", 24);
        mapa.put("maria", 25);


        Iterator<Map.Entry<String, Integer>> iterator3= mapa.entrySet().iterator();
        while(iterator3.hasNext()){
            System.out.println(iterator3.next());
        }

        // Versão abreviada for-each (utiliza o iterator da collection implicitamente)

        // Iterando um Set

        for(Integer num : conjunto){
            System.out.println(num);
        }

        // Iterando um Map

        for(Map.Entry<String, Integer> par : mapa.entrySet()){
            String key = par.getKey();
            Integer value = par.getValue();
            System.out.println(key + " : "+ value);
        }

    }
}
