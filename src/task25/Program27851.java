package task25;

public class Program27851 {
    public static void main(String[] args) {
        for (int i = 210235; i <= 210300; i++){
            int count = 0;
            int[] divs = new int[4];
            for (int j = 2; j < i; j++){
                if (i % j == 0) {
                    count++;
                    if (count > 4)
                        break;
                    divs[count-1] = j;
                }
            }
            if (count == 4){
                System.out.println(divs[0] + " " + divs[1] + " " + divs[2] + " " + divs[3]);
            }
        }
    }
}
