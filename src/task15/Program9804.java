package task15;

public class Program9804 {
    public static void main(String[] args) {
        for (int a = 1000; a >= 1; a--){
            boolean c = true;
            for (int x = 1; x <= 1000; x++){
                if ( impl((x & 29) != 0, impl((x&17) == 0, (x&a) != 0)) ){

                }else{
                    c = false;
                    break;
                }
            }
            if (c)
                System.out.println(a);
        }
    }

    public static boolean impl(boolean a, boolean b){
        if (a && !b)
            return false;
        return true;
    }
}
