public class seminar2_2 {
    public static void main(String[] args) {
        String strDir = "{\"name\" : \"site_3\",\"version\": \"1.0.0\",\"description\": \"text\",\"main\": \"index.js\"}";
        String str = strDir.replace("{", "").replace("}", "")
                .replace("\"", "");
        
        StringBuilder finalStr = new StringBuilder();
        String[] newStr = str.split(",");

        for (String string2 : newStr) {
            String[] string3 = string2.split(":");
            System.out.printf("%s = %s", string3[0], string3[1]);
            finalStr.append(string3[1]);
        }
    }

}
