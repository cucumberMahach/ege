package task25;

public class Program27850 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 245690; i <= 245756; i++){
            boolean primeNumber = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber){
                System.out.println(count + " " + i);
            }
            count++;
        }
    }
}
