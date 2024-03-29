package exercises.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution1 {

    // O programa deve conter objeto do tipo Cat (livre para definir os membros)
    // O método main deve chamar o método printCats
    // O método main deve remover um Cat do conjunto de gatos

    public static void main(String[] args) {

        Set<Cat> cats = createSet();

        // Obtendo a referência do Objeto Cat para removê-lo
        Cat cat = cats.iterator().next(); // Obtendo o primeiro
        cats.remove(cat);

        printCats(cats);
    }

    public static class Cat {
        // Caso o gato não possua um dono vai se chamar gato de rua kk

        private String nome = "Gato de Rua";
        private String cor;

        public Cat(String cor){
            this.cor = cor;
        }

        public Cat(String nome, String cor){
            this(cor);
            this.nome = nome;
        }

        public String getNome(){
            return nome;
        }

        public String getCor(){
            return cor;
        }

        @Override
        public String toString() {
            return this.nome;
        }
    }

    public static Set<Cat> createSet() {

        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat("Preto", "Miau"));
        cats.add(new Cat("Amarelo"));
        cats.add(new Cat("Garfield", "Branco"));

        return cats;
    }

    public static void printCats(Set<Cat> cats) {

        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().nome);
        }
    }
}
