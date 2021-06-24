package task24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Program27691 {
    public static void main(String[] args) throws IOException {
        String s = Files.readAllLines(Paths.get("C:\\Users\\aleks\\Downloads\\zadanie24_1.txt")).get(0);
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'A'){
                count++;
                if (count > maxCount)
                    maxCount = count;
            }else{
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}
