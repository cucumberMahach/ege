package task23;

public class Program3341w {
    public static void main(String[] args) {//3-7 9-10 10-14 16-22
        System.out.println(f(3,  10) * f(10, 22));
    }

    public static int f(int x, int t){
        if (x == t)
            return 1;
        if (x > t || x == 8 || x == 15)
            return 0;
        return f(x+1, t) + f(x+2, t) + f(x*3, t);
    }
}
