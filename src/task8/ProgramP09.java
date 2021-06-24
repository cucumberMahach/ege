package task8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ProgramP09 {
    public static void main(String[] args) {
        String s = "вуаль";
        HashSet<String> set = new HashSet<>();
        for (int a = 0; a < s.length(); a++){
            for (int b = 0; b < s.length(); b++){
                for (int c = 0; c < s.length(); c++){
                    for (int d = 0; d < s.length(); d++){
                        for (int e = 0; e < s.length(); e++){
                            String q = ""+s.charAt(a)+s.charAt(b)+s.charAt(c)+s.charAt(d)+s.charAt(e);
                            if (isValid(q))
                                set.add(q);
                        }
                    }
                }
            }
        }
        System.out.println(set.size());
    }

    public static boolean isValid(String s){
        if (s.charAt(0) == 'ь')
            return false;

        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0;i < s.length(); i++){
            if (chars.contains(s.charAt(i)))
                return false;
            else
                chars.add(s.charAt(i));
        }
        for (int i = 1;i < s.length(); i++){
            if ((s.charAt(i) == 'у' || s.charAt(i) == 'а') && s.charAt(i-1) == 'ь')
                return false;
        }
        return true;
    }
}
