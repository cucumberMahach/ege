package task8;

import java.util.HashSet;

public class ProgramP10 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s = "капкан";
        for (int a = 0; a < s.length(); a++){
            for (int b = 0; b < s.length(); b++){
                for (int c = 0; c < s.length(); c++){
                    for (int d = 0; d < s.length(); d++){
                        for (int e = 0; e < s.length(); e++){
                            for (int f = 0; f < s.length(); f++){
                                String q = ""+s.charAt(a)+s.charAt(b)+s.charAt(c)+s.charAt(d)+s.charAt(e)+s.charAt(f);
                                if (isValid(q) && count(q, 'к') == 2 && count(q, 'а') == 2 && count(q, 'п') == 1 && count(q, 'н') == 1){
                                    set.add(q);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(set.size());
    }

    public static boolean isValid(String s){
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i-1) == s.charAt(i))
                return false;
        }
        return true;
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
