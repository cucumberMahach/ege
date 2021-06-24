package task12;

public class Program2021 {
    public static void main(String[] args) {
        String q = "";
        for (int i = 0; i < 70; i++){
            q += "8";
        }

        while(q.contains("2222") || q.contains("8888")){
            if (q.contains("2222"))
                q=q.replaceFirst("2222", "88");
            else
                q=q.replaceFirst("8888", "22");
        }

        System.out.println(q);
    }
}
