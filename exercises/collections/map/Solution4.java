package exercises.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution4 {

    // O programa deve criar e retorna um HashMap<String, Integer> com 10 elementos
    // O programa deve remover do map todas as pessoas cujo salario for inferior a 500

    public static void main(String[] args){

        HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    static HashMap<String, Integer> createMap(){

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Gabriel", 600);
        map.put("Maria", 900);
        map.put("Lucas", 300);
        map.put("Joaquim", 1600);
        map.put("Miguel", 150);
        map.put("Ferreira", 2600);
        map.put("Joana", 1200);
        map.put("Pedro", 200);
        map.put("Juliana", 400);
        map.put("Joao", 700);

        return map;
    }

    static void removeItemFromMap(HashMap<String, Integer> map) {

        List<String> pessoasSalarioInferior = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() < 500) {
                pessoasSalarioInferior.add(entry.getKey());
            }
        }

        for(String pessoa : pessoasSalarioInferior){
            map.remove(pessoa);
        }
    }

}
