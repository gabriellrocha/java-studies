package collections.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1 {

    public static void main(String[] args){

        // Sobre comparator

        /* Diferente de interface Comparable implementada PELA CLASSE dos objetos que
        * serão comparados, a Comparator é geralmente implementada por uma classe SEPARADA
        * sendo usada quando se quer definir múltiplos critérios de ordenação para uma classe*/

        /*Em suma, usando o Comparator o mesmo objeto pode conter diversos critérios de comparação,
         já com Comparable é permitido apenas um */

        List<Aluno> alunos = Arrays.asList(
                new Aluno("Joao", 25),
                new Aluno("Miguel", 17),
                new Aluno("Maria", 29),
                new Aluno("Isabela", 39));

        System.out.println("Ordenando por idade");
        Collections.sort(alunos, new sortByAge());
        for (Aluno a : alunos){
            System.out.println(a.getNome() + " " + a.getIdade());
        }

        System.out.println("\nOrdenando por nome");
        Collections.sort(alunos, new sortByName());
        for (Aluno a : alunos){
            System.out.println(a.getNome() + " " + a.getIdade());
        }
    }

    static class Aluno {
        private String nome;
        private Integer idade;

        public Aluno(String nome, Integer idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public Integer getIdade() {
            return idade;
        }
    }

    // classes wrapper já implementam o compareTo
    // Benefício ->...

    // Posso delegar a comparação para o método compareTo usando a lógica de comparação natural desses objetos

    static class sortByName implements Comparator<Aluno>{

        @Override
        public int compare(Aluno aluno1, Aluno aluno2) {
            return aluno1.getNome().compareTo(aluno2.getNome());
        }
    }

    static class sortByAge implements Comparator<Aluno>{

        public int compare(Aluno aluno1, Aluno aluno2){
            return aluno1.getIdade().compareTo(aluno2.getIdade());
        }
    }
}
