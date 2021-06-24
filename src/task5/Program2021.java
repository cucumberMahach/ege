package task5;

public class Program2021 {
    public static void main(String[] args) {
        for (int i = 100000; i >= 0; i--){
            if (f(i) > 77)
                System.out.println(i);
        }
    }

    public static int f(int n){
        String s = Integer.toString(n, 2);
        int g = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1'){
                g++;
            }
        }
        s = s + (g % 2);

        g = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1'){
                g++;
            }
        }
        s = s + (g % 2);
        return Integer.valueOf(s, 2);
    }
}
