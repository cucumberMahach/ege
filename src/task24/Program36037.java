package task24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Program36037 {
    public static void main(String[] args) throws IOException {
        String data = Files.readAllLines(Paths.get("C:\\Users\\aleks\\Downloads\\24 (2).txt")).get(0);
        int maxCount = 0;
        int count = 0;
        char[] last = new char[3]; //XZZY
        for (int i = 0; i < data.length(); i++){
            char ch = data.charAt(i);

            if (last[2] == 'X' && last[1] == 'Z' && last[0] == 'Z' && ch == 'Y'){
                count = 3;
            }else{
                count++;
                if (count > maxCount)
                    maxCount = count;
            }

            last[2] = last[1];
            last[1] = last[0];
            last[0] = ch;
        }
        System.out.println(maxCount);
    }
}
