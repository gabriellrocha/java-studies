package exercises.collections.map;

import java.util.*;

public class Solution3 {

    // O programa deve criar um HashMap com 10 pares sobrenome, nome
    // O programa deve remover do HashMap todas as pessoas que possuem o mesmo nome

    public static void main(String[] args) {

        HashMap<String, String> map  = createMap();
        removeFirstNameDuplicates(map);
        for(String nome : map.values()){
            System.out.println(nome);
        }

    }

    public static HashMap<String, String> createMap() {

        HashMap<String, String> map = new HashMap<>();
        map.put("Rocha", "Gabriel");
        map.put("Silva", "Lucas");
        map.put("Soares", "Gabriel");
        map.put("Santos", "Juliana");
        map.put("Pereira", "Gabriel");
        map.put("Alves", "Fatima");
        map.put("William", "Carlos");
        map.put("Jesus", "Gabriel");
        map.put("Oliveira", "Joana");
        map.put("Viana", "Gabriel");

        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {

        List<String> chavesValoresDuplicados = new ArrayList<>();
        Set<String> valoresUnicos = new HashSet<>();

        for(String nome : map.values()) {

            if (!valoresUnicos.add(nome)){
                for(Map.Entry<String, String> entry : map.entrySet()){
                    if(entry.getValue().equals(nome)){
                        chavesValoresDuplicados.add(entry.getKey());
                    }
                }
            }
        }

        for(String key : chavesValoresDuplicados){
           map.remove(key);
        }

    }
}
