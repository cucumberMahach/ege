package task23;

public class Program15117 {
    public static void main(String[] args) {
        System.out.println(f(3, 9) * f(9, 14) * f(16, 20));
    }

    public static int f(int start, int n){
        if (n < start)
            return 0;
        if (n == start)
            return 1;
        return f(start, n-1) + f(start, n - 2);
    }
}
