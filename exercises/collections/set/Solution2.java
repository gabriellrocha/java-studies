package exercises.collections.set;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {

    // Crie classes estáticas públicas Cat e Dog
    // createCats() deve criar um conjunto com 4 Cat
    // createDogs() deve criar um conjunto com 3 Dog
    // join() deve retorna um conjunto combinado de todos os animais
    // removeCats() deve remover do conjunto pets todos os gatos do conjunto cats
    // printPets() deve imprimir todos os pets do conjunto, cada animal em uma nova linha

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

       removeCats(pets, cats);
       System.out.println();
       printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {

        HashSet<Dog> result = new HashSet<>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {

        HashSet<Object> pets = new HashSet<>(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {

        pets.removeAll(cats);

    }

    public static void printPets(Set<Object> pets) {

        for(Object pet : pets){
            System.out.println(pet);
        }
    }

    public static class Cat{

        @Override
        public String toString() {
            return "Gato";
        }
    }

    public static class Dog{

        @Override
        public String toString() {
            return "Cao";
        }
    }

}
