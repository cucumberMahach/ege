package task23;

import java.util.ArrayList;

public class Program2021 {
    public static void main(String[] args) {
        System.out.println(f(1, 10) * f(10, 20));
    }

    public static int f(int x, int t){
        if (x == t)
            return 1;
        if (x > t)
            return 0;
        return f(x+1, t) + f(x*2, t);
    }
}
