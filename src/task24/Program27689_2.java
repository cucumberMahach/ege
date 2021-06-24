package task24;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program27689_2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream("C:\\Users\\aleks\\Downloads\\24_demo (1).txt"));
        int len = 0;
        int maxLen = 0;
        int data;
        while ((data = reader.read()) != -1){
            char ch = (char) data;
            if ((ch == 'X' && len % 3 == 0)||(ch == 'Y' && len % 3 == 1)||(ch == 'Z' && len % 3 == 2)){
                len++;
                if (len > maxLen)
                    maxLen = len;
            }else{
                len = 0;
            }
        }
        System.out.println(maxLen);
    }
}
