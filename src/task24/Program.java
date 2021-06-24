package task24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\aleks\\Downloads\\24_demo.txt";
        InputStreamReader reader = new InputStreamReader(new FileInputStream(path));
        int ch;
        int last_ch;
        last_ch = reader.read();
        int k = 1;
        int max = 0;
        while ((ch = reader.read()) != -1){
            if (ch != last_ch){
                k++;
            }else{
                if (k > max)
                    max = k;
                k = 1;
            }
            last_ch = ch;
        }
        if (k > max)
            max = k;
        System.out.println(max);
    }
}
