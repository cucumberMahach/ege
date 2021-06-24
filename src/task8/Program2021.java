package task8;

public class Program2021 {
    public static void main(String[] args) {
        String s = "школа";
        int n = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < s.length(); j++){
                for (int k = 0; k < s.length(); k++){
                    if (count(""+s.charAt(i)+s.charAt(j)+s.charAt(k), 'к') == 1){
                        n++;
                    }
                }
            }
        }
        System.out.println(n);
    }

    public static int count(String s, char ch){
        int n = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ch)
                n++;
        }
        return n;
    }
}
