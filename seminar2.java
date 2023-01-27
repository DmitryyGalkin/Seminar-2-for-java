public class seminar2 {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
        
        sb.append("Test");
        }
        System.out.println(sb);
        System.out.println(System.currentTimeMillis() - s);
        //System.out.println(str);
        
        }
       
}
