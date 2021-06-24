package task17;

public class Program27414 {
    public static void main(String[] args) {
        int maxNum = 0;
        int count = 0;
        for (int i = 1016; i <= 7937; i++){
            if (i % 3 == 0 && i % 7 != 0 && i % 17 != 0 && i % 19 != 0 && i % 27 != 0){
                count++;
                if (i > maxNum)
                    maxNum = i;
            }
        }
        System.out.println(count + "" + maxNum);
    }
}
