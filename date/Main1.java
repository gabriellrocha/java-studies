package date;

import java.util.Date;

public class Main1 {

    public static void main(String[] args) throws InterruptedException {

        // Todo tipo date armazena uma hora em milissegundos desde 1° de janeiro de 1970 GMT.
        // Cada objeto é inicializado com a hora atual na sua criação
        Date date = new Date();

        // Calcula a diferença entre duas datas
        Date date1 = new Date();
        System.out.println(date1.getTime());
        Thread.sleep(3000);
        Date date2 = new Date();

        System.out.println("Diferença: " + (date2.getTime() - date1.getTime()));

        // Métodos obsoletos, apenas para fins de conhecimento

        // Quanto tempo se passou desde o início do dia
        System.out.println(date2.getHours());
        System.out.println(date2.getMinutes());
        System.out.println(date2.getSeconds());

        // Redefinindo os valores de horas, minutos e segundos para 0
        date2.setHours(0);
        date2.setMinutes(0);
        date.setSeconds(0);

        date.setMonth(0); // Janeiro, (os meses são representados entre 0 e 11)
        date2.setDate(1); // dia 1
    }
}
