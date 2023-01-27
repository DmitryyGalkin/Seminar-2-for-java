package Seminar;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
      Scanner iScanner = new Scanner(System.in,"cp866");
      System.out.printf("name: ");
      String name = iScanner.nextLine();
      System.out.printf("Привет, %s!", name);
      iScanner.close();
    }
}
