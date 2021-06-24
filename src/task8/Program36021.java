package task8;

import java.util.HashSet;

public class Program36021 {
    public static void main(String[] args) {
        String middle = "вишня";
        String begin = "виня";
        String end = "вшн";
        HashSet<String> set = new HashSet<>();
        for (int a = 0; a < begin.length(); a++){
            for (int b = 0; b < middle.length(); b++){
                for (int c = 0; c < middle.length(); c++){
                    for (int d = 0; d < middle.length(); d++){
                        for (int e = 0; e < middle.length(); e++){
                            for (int f = 0; f < end.length(); f++){
                                String q = ""+begin.charAt(a)+middle.charAt(b)+middle.charAt(c)+middle.charAt(d)+middle.charAt(e)+end.charAt(f);
                                if (isValid(q))
                                    set.add(q);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(set.size());
    }

    public static boolean isValid(String s){
        int n = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'в')
                n++;
        }
        if (n > 1)
            return false;
        return true;
    }
}
