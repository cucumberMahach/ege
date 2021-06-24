package task6;

public class Program27403 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++){
            if (f(i) == 64){
                System.out.println(i);
            }
        }
    }

    public static int f(int s){
        s = s / 10;
        int n = 1;
        while (s < 51){
            s = s + 5;
            n = n * 2;
        }
        return n;
    }
}
