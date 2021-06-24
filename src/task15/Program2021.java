package task15;

public class Program2021 {
    public static void main(String[] args) {
        for (int a = 1; a <= 100000; a++){
            boolean c = true;
            for (int x = 1; x <= 100000; x++){
                if ( impl(!del(x, a), impl(del(x, 6), !del(x, 9))) ){

                }else{
                    c = false;
                    break;
                }
            }
            if (c)
                System.out.println(a);
        }
    }

    public static boolean del(int n, int m){
        return n % m == 0;
    }

    public static boolean impl(boolean a, boolean b){
        if (a && !b)
            return false;
        return true;
    }
}
