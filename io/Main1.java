package io;

import java.io.*;

public class Main1 {

    public static void main(String[] args) throws IOException {

        // Stream é o processo de troca de dados

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //System.in é um InputStream = É um fluxo de entrada vinculado ao teclado
        // InputStream lê Bytes e não caracteres

        // Converte fluxo de Bytes em fluxo de caracteres.
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        // InputStreamReader também pode ler dados de outro lugares. Por exemplo, um arquivo.
        // Lê um único caractere por vez
        InputStreamReader inputStreamReader1 = new InputStreamReader(new FileInputStream("C:\\Users\\gabri\\t.txt"));


        /* Para maior desempenho e comodidade usamos BufferedReader
         Utiliza o buffer para armazenar os caracteres que lê
         Ou seja, quando os caracteres forem necessários ele tira do buffer e não diretamente da fonte
         de dados. Isso economiza muitos recursos */

        BufferedReader reader1 = new BufferedReader(inputStreamReader1);
        System.out.println(reader1.readLine());

    }
}
