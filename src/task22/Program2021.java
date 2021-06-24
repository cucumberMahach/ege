package task22;

public class Program2021 {
    public static void main(String[] args) {
        for (int i = -100000; i < 100000; i++){
            int[] r = f(i);
            if (r[0] == 4 && r[1] == 5){
                System.out.println(i);
            }
        }
    }

    public static int[] f(int x){
        int l, m, q;
        q = 9;
        l = 0;
        while (x >= q){
            l = l + 1;
            x = x - q;
        }
        m = x;
        if (m < l){
            m = l;
            l = x;
        }
        return new int[]{l, m};
    }
}
