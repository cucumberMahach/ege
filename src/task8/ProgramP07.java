package task8;

public class ProgramP07 {
    public static void main(String[] args) {
        String s = "весна";
        int n = 0;
        for (int a = 0; a < s.length(); a++){
            for (int b = 0; b < s.length(); b++){
                for (int c = 0; c < s.length(); c++){
                    String q = ""+s.charAt(a)+s.charAt(b)+s.charAt(c);
                    if (q.contains("а")){
                        n++;
                        System.out.println(q);
                    }
                }
            }
        }
        System.out.println(n);
    }
}
