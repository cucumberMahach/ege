package task8;

import java.util.ArrayList;
import java.util.HashSet;

public class ProgramP08 {
    public static void main(String[] args) {
        String s = "улей";
        HashSet<String> set = new HashSet<>();
        for (int a = 0; a < s.length(); a++){
            for (int b = 0; b < s.length(); b++){
                for (int c = 0; c < s.length(); c++){
                    for (int d = 0; d < s.length(); d++){
                        String q = ""+s.charAt(a)+s.charAt(b)+s.charAt(c)+s.charAt(d);
                        if (isValid(q))
                            set.add(q);
                    }
                }
            }
        }
        System.out.println(set.size());
    }

    public static boolean isValid(String s){
        if (s.charAt(0) == 'й')
            return false;
        if (s.contains("еу"))
            return false;

        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            if (chars.contains(s.charAt(i)))
                return false;
            else
                chars.add(s.charAt(i));
        }

        return true;
    }
}
