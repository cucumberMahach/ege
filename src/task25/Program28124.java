package task25;

public class Program28124 {
    public static void main(String[] args) {
        int minNum = -1;
        int maxDivsCount = -1;
        for (int i = 568023; i <= 569230; i++){
            int divsCount = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    divsCount++;
                }
            }
            if (divsCount > maxDivsCount){
                maxDivsCount = divsCount;
                minNum = i;
            }else if (divsCount == maxDivsCount){
                if (i < minNum){
                    minNum = i;
                }
            }
        }
        System.out.println(maxDivsCount + " " + minNum);
    }
}
