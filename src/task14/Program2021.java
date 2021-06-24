package task14;

import java.math.BigInteger;

public class Program2021 {
    public static void main(String[] args) {
        BigInteger v = new BigInteger("4");
        v = v.pow(2020);
        BigInteger v2 = new BigInteger("2");
        v2 = v2.pow(2017);
        v = v.add(v2).add(new BigInteger("-15"));



        String s = v.toString(2);
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1')
                count++;
        }
        System.out.println(count);
    }
}
