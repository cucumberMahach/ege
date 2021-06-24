package task24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Program29672 {
    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(Paths.get("C:\\Users\\aleks\\Downloads\\inf_22_10_20_24.txt"));
        int count = 0;
        for (String s:
             list) {
            int count_e = s.length() - s.replaceAll("E", "").length();
            int count_a = s.length() - s.replaceAll("A", "").length();
            if (count_e > count_a)
                count++;
        }
        System.out.println(count);
    }
}
