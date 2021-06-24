package task14;

import java.math.BigInteger;

public class Program33516 {
    public static void main(String[] args) {
        BigInteger v = new BigInteger("512");
        v = v.pow(120).multiply(new BigInteger("7"));
        BigInteger n = new BigInteger("64");
        n = n.pow(100).multiply(new BigInteger("6"));
        BigInteger m = new BigInteger("8");
        m = m.pow(210);

        v = v.add(n.negate()).add(m).add(new BigInteger("-255"));
        String s = v.toString(8);
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '0')
                count++;
        }
        System.out.println(count);
    }
}
