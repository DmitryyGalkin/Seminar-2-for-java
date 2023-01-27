package Seminar;
//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

/**
 * program_3
 */
public class program_3 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,1,0,1,1,1,0,0,1,1,1,1,1,0,0,1,1};
        int count = 0;
        int max_count = 0;
        for(int item : arr) {
            if (item == 1) {
                count++;
                if (max_count < count) max_count = count;
            }
            else  count = 0;
            
        }
        System.out.println("Количество повторов :"+max_count);
    }

}
