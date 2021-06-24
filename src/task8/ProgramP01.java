package task8;

import java.util.ArrayList;
import java.util.HashSet;

public class ProgramP01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String s = "аклош";
        for (int a = 0; a < s.length(); a++){
            for (int b = 0; b < s.length(); b++){
                for (int c = 0; c < s.length(); c++){
                    for (int d = 0; d < s.length(); d++){
                        for (int e = 0; e < s.length(); e++){
                            String q = ""+s.charAt(a)+s.charAt(b)+s.charAt(c)+s.charAt(d)+s.charAt(e);
                            if (!list.contains(q))
                                list.add(q);
                        }
                    }
                }
            }
        }
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list.indexOf("школа")+1);
    }
}
