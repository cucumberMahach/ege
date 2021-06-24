package task16;

public class Program2021 {
    public static void main(String[] args) {
        System.out.println(f(26));
    }

    public static Integer f(int n){
        if (n == 1)
            return 1;
        if (n % 2 == 0)
            return n + f(n-1);
        if (n > 1 && n % 2 != 0)
            return 2 * f(n-2);
        return null;
    }
}
