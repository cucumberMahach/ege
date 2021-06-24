package task6;

public class Program36019 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++){
            if (f(i) == 64)
                System.out.println(i);
        }
    }

    public static int f(int s){
        int n = 1;
        while (s < 47){
            s = s + 4;
            n = n * 2;
        }
        return n;
    }
}
