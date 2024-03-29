package collections.comparble;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main1 {

    // Sobre Comparable
    /* A interface Comparable é uma interface usada para definir um método de comparação
    * natural entre dois objetos de uma mesma classe*/

    public static void main(String[] args){

        List<Aluno> alunos = Arrays.asList(
                new Aluno("Gabriel", 24),
                new Aluno("Maria", 22),
                new Aluno("Joana", 16));

        Collections.sort(alunos);
        for (Aluno aluno : alunos){
            System.out.println(aluno);
        }

    }

    static class Aluno implements Comparable <Aluno> {
        private String nome;
        private Integer idade;

        public Aluno(String nome, Integer idade){
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome(){
            return nome;
        }

        public Integer getIdade(){
            return idade;
        }

        // Delegando a responsabilidade para a class Integer que já possui o compare
        @Override
        public int compareTo(Aluno outroAluno) {
            return Integer.compare(this.idade, outroAluno.idade);
        }

        @Override
        public String toString() {
            return this.nome + " " + this.idade;
        }
    }

}
