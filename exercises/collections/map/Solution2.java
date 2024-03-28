package exercises.collections.map;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution2 {

    // O método createHashMap deve retornar um HashMap com 10 pares
    // O método removeAllSummerPeople deve remover as pessoas que nasceram no verão
    // Obs: O verão deve ser considerado neste desafio entre os dias 1 de junho à 31 agosto

    public static void main(String[] args)  {

        try {
            Map<String, Date> mapUpdate = removeAllSummerPeople(createHashMap());

            for(Map.Entry<String, Date> entry : mapUpdate.entrySet()){
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }

        } catch (ParseException e){
            System.out.println("erro");
        }
    }

    public static HashMap<String, Date> createHashMap() throws ParseException{
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        HashMap<String, Date> hashMap = new HashMap<>();
        hashMap.put("Rocha", df.parse("JUNE 1 1980"));
        hashMap.put("Silva", df.parse("JULY 1 1980"));
        hashMap.put("Oliveira", df.parse("OCTOBER 1 1980"));
        hashMap.put("Pereira", df.parse("NOVEMBER 1 1980"));
        hashMap.put("Alves", df.parse("JUNE 1 1980"));
        hashMap.put("Santos", df.parse("JUNE 1 1980"));
        hashMap.put("Jesus", df.parse("JULY 1 1980"));
        hashMap.put("Gomes", df.parse("AUGUST 1 1980"));
        hashMap.put("Carlos", df.parse("JANUARY 1 1980"));
        hashMap.put("Valo", df.parse("APRIL 1 1980"));

        return hashMap;
    }

    public static HashMap<String, Date> removeAllSummerPeople(HashMap<String, Date> map) {

        HashMap<String, Date> novoHashMap = new HashMap<>(map);

        for(String key : novoHashMap.keySet()){

            Date date = novoHashMap.get(key);
            int month = date.getMonth() + 1;

            if(month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }
        }
        return map;
    }
}