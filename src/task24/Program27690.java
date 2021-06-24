package task24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Program27690 {
    public static void main(String[] args) throws IOException {
        String s = Files.readAllLines(Paths.get("C:\\Users\\aleks\\Downloads\\zadanie24_1 (1).txt")).get(0);
        int count = 1;
        int maxCount = 0;
        for (int i = 1; i < s.length(); i++){
            char ch = s.charAt(i);
            char last = s.charAt(i-1);
            if (ch != last){
                count++;
                if (count > maxCount)
                    maxCount = count;
            }else{
                count = 1;
            }
        }
        System.out.println(maxCount);
    }
}
