package exercises.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution1 {

        // O programa deve preencher um map com pares
        // O programa deve exibir as keys da coleção

        public static void main(String[] args) throws Exception {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Gabriel", 23);
            map.put("Joana", 32);
            map.put("Maria", 16);
            map.put("Kleber", 45);
            map.put("Carolina", 27);

            printKeys(map);
        }

        public static void printKeys(Map<String, Integer> map) {

            Set<String> setKey = map.keySet();
            for(String name : setKey) {
                System.out.println(name);
            }
        }
}

