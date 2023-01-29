import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Каталог товаров книжного магазина сохранен в виде двумерного списка 
List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка 
содержится название жанра, а на остальных позициях - названия книг. 
Напишите метод для заполнения данной структуры. */

public class seminar3_3 {
    public static void main(String[] args) {
        List<ArrayList<String>> matrix = new ArrayList<ArrayList<String>>();
        Scanner iScanner  = new Scanner(System.in, "cp866");
        System.out.println("Введите жанр: ");
        String ganre = iScanner.next();
        System.out.println("Введите книгу: ");
        String book = iScanner.next();

        ArrayList <String> list = new ArrayList<String>();
        list.add(ganre);
        list.add(book);
        System.out.println(list);
        matrix.add(list);
        System.out.println(matrix);
        iScanner.close();
        
    }
}
