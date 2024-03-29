package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main5 {

    public static void main(String[] args) {

        // Classe estática Collections
        // Possui diversos métodos estáticos polimórficos que operam em coleções


        // Exemplos de alguns métodos utéis para o dia a dia

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7, 0, 9));
        Collections.min(numeros);
        Collections.max(numeros);


        ArrayList<String> sistemaSolar = new ArrayList<>(Arrays.asList("Mercurio", "Venus", "Terra", "Marte",
                "Jupiter", "Saturno", "Urano", "Netuno"));

        Collections.sort(sistemaSolar); // Classifica o conteúdo de acordo com a lógica de comparação do Objeto
        Collections.reverse(sistemaSolar); // Reverte a ordem

        Collections.unmodifiableList(sistemaSolar); // Retorna uma lista imutável

        // Caso tenha inserido os elementos na ordem errada, troca os elementos conforme o índice informado
        Collections.swap(sistemaSolar, sistemaSolar.indexOf("Venus"), sistemaSolar.indexOf("Urano"));

        
    }
}
