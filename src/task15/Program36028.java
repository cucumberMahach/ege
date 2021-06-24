package task15;

import java.util.ArrayList;
import java.util.Comparator;

public class Program36028 {
    public static void main(String[] args) {
        ArrayList<Integer> intervals = new ArrayList<>();
        for (int min = -100; min <= 100; min++){
            for (int max = -100; max <= 100; max++){
                boolean c = true;
                for (int x = 0; x <= 100; x++){
                    if ( impl(eP(x), impl(eQ(x) && ! eA(min, max, x), !eP(x))) ){

                    }else{
                        c = false;
                        break;
                    }
                }
                if (c)
                    intervals.add(max - min);
            }
        }
        intervals.sort(Comparator.reverseOrder());
        for (Integer i : intervals){
            System.out.println(i);
        }
    }

    public static boolean eP(int v){
        return v >= 17 && v <= 54;
    }

    public static boolean eQ(int v){
        return v >= 37 && v <= 83;
    }

    public static boolean eA(int min, int max, int v){
        return v >= min && v <= max;
    }

    public static boolean impl(boolean a, boolean b){
        if (a && !b)
            return false;
        return true;
    }
}
