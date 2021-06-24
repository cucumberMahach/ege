package task12;

public class ProgramP08 {
    public static void main(String[] args) {
        for (int n = 0; n <= 5000; n++){
            for (int a = -100; a <= 100; a++){
                for (int b = -100; b <= 100; b++){
                    if (q(a, b, n)){
                        System.out.println(n);
                    }
                }
            }
        }
    }

    public static boolean q(int a, int b, int n){
        int x = 0, y = 0;

        x += -1;
        y += -2;
        for (int i = 0; i < n; i++){
            x += a;
            y += b;

            x += -1;
            y += -2;
        }
        x += -24;
        y += -12;

        if (x == 0 && y == 0)
            return true;
        return false;
    }
}
