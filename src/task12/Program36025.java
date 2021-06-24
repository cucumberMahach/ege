package task12;

public class Program36025 {
    public static void main(String[] args) {
        String q = "";
        for (int i = 0; i < 81; i++){
            q += "1";
        }

        while(q.contains("1111") || q.contains("88888")){
            if (q.contains("1111"))
                q = q.replaceFirst("1111", "888");
            else
                q = q.replaceFirst("88888", "888");
        }

        System.out.println(q);
    }
}
