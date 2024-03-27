package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main3 {

    public static void main(String[] args) {

        // Sobre Set

        /* Um Set é escolhido sobre outras coleções quando a principal preocupação
            é a unicidade dos elementos, sem se importar com a ordem de inserção ou
            acesso por índice.
         */
        
        // Principais Implementações

        // Mais comum, oferecendo operações rápidas sem garantir ordem
        HashSet<String> hashSet = new HashSet<>();


        // Mantém a ordem de inserção
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();


        /* Mantém os elementos ordenados de acordo com sua ordem natural, ou por um
        Comparator fornecido */

        // Objeto deve implementar Comparable

        TreeSet<Cliente> treeSet = new TreeSet<>();

        treeSet.add(new Cliente("Gabriel", 21));
        treeSet.add(new Cliente("Pedro",12));
        treeSet.add(new Cliente("Joaquim", 51));

        for(Cliente c : treeSet){
            System.out.println(c);
        }

    }

    static class Cliente implements Comparable<Cliente> {

        private String nome;
        private Integer idade;

        public Cliente(String nome, Integer idade){
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome(){
            return this.nome;
        }

        public Integer getIdade(){
            return this.idade;
        }

        @Override
        public String toString() {
            return this.nome;
        }

        @Override
        public int compareTo(Cliente outroCliente) {
            // negativo, se o objeto atual for 'menor' que o passado
            // Zero, se os dois forem iguais
            // positivo, se o atual for 'maior' que o passado
            return this.idade - outroCliente.getIdade();
        }
    }

}
