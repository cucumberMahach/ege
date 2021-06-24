package task23;

public class Program15638 {
    public static void main(String[] args) { //1-10 10-16 18-21
        System.out.println(f(1, 10) * f(10, 16) * f(18, 21));
    }

    public static int f(int start, int n){
        if (n < start)
            return 0;
        if (n == start)
            return 1;
        int k = f(start, n-1);
        if (n % 2 == 0)
            return k + f(start, n/2);
        return k;
    }
}
