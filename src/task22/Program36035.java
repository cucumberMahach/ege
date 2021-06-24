package task22;

public class Program36035 {
    public static void main(String[] args) {
        for (int i = 100000; i >= -100000; i--){
            int[] r = f(i);
            if (r[0] == 5 && r[1] == 8){
                System.out.println(i);
            }
        }
    }

    public static int[] f(int x){
        int l = 0, m = 0;
        while(x > 0){
            m = m + 1;
            if (x % 2 != 0){
                l = l + 1;
            }
            x = x / 2;
        }
        return new int[]{l, m};
    }
}
