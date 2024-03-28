package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main4 {

    public static void main(String[] args) {

        // Sobre Map
        // Principais Implementações

        // Mais comum, armazenamento eficiente sem ordenação
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Mantém a ordem de inserção
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Mantém os elementos ordenados de acordo com suas chaves
        TreeMap<Fruta, Double> treeMap = new TreeMap<>();

        treeMap.put(new Fruta("Jaca"), 12.90);
        treeMap.put(new Fruta("Banana"), 1.90);
        treeMap.put(new Fruta("Melancia"), 8.90);

        for (Map.Entry<Fruta, Double> par : treeMap.entrySet()){
            System.out.println(par.getKey() + " : " + par.getValue());
        }
    }

    static class Fruta implements Comparable<Fruta>{

        private String nome;

        public Fruta(String nome){
            this.nome = nome;
        }

        public String getNome(){
            return this.nome;
        }

        public char primeiraLetra() {
            return this.getNome().charAt(0);
        }

        @Override
        public String toString() {
            return this.nome;
        }

        @Override
        public int compareTo (Fruta outraFruta) {
            // Critério de ordenação é a primeira letra do nome da fruta

            return Character.compare(this.primeiraLetra(), outraFruta.primeiraLetra());
        }
    }
}
