package task25;

public class Program36038 {
    public static void main(String[] args) {
        int i = 452021;
        int count = 0;
        while (count < 5){
            i++;
            int m = getM(i);
            if (m % 7 == 3){
                count++;
                System.out.println(i + " " + m);
            }
        }
    }

    public static int getM(int num){
        int min = -1;
        int max = -1;
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                if (i < min || min == -1)
                    min = i;
                if (i > max)
                    max = i;
            }
        }
        return min == -1 ? 0 : min + max;
    }
}
