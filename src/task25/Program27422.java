package task25;

public class Program27422 {
    public static void main(String[] args){
        for (int i = 174457; i <= 174505; i++){
            int count = 0;
            int div1 = 0, div2 = 0;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    count++;
                    if (count == 1){
                        div1 = j;
                    }else if (count == 2){
                        div2 = j;
                    }else{
                        j = i;
                    }
                }
            }
            if (count == 2){
                System.out.println(div1 + " , " + div2);
            }
        }
    }
}
