package task23;

public class Program15932 {
    public static void main(String[] args) {
        System.out.println(f(2, 13) * f(13, 44));
    }

    public static int f(int x, int t){
        if (x == t)
            return 1;
        if (x > t || x == 29)
            return 0;
        return f(x+1, t) + f(x*2, t) + f(x*3, t);
    }
}
