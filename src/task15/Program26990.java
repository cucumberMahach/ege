package task15;

public class Program26990 {
    public static void main(String[] args) {
        for (int a = 0; a <= 1000; a++){
            boolean c = true;
            for (int x = 0; (x <= 1000) && c; x++){
                for (int y = 0; (y <= 1000) && c; y++){
                    if ( (x > a) || (y > a) || (2*y+x<110) ){

                    }else{
                        c = false;
                    }
                }
            }
            if (c)
                System.out.println(a);
        }
    }
}
