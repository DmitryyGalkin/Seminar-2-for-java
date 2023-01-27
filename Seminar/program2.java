package Seminar;
import java.time.LocalDateTime;
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        LocalDateTime date = LocalDateTime.now();
    
        if (date.getHour() >= 5 && date.getHour() < 12) {
            System.out.printf("Доброе утро, %s!", name);
        } else if (date.getHour() >= 12 && date.getHour() < 18) {
            System.out.printf("Добрый день, %s!", name);
        } else if (date.getHour() >= 18 && date.getHour() < 23) {
            System.out.printf("Добрый вечер, %s!", name);
        } else {
            System.out.printf("Добрый ночи, %s!", name);
        }
        iScanner.close();
    }

}
