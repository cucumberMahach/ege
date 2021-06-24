package task24;

import java.io.*;

public class Program27689 {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream("C:\\Users\\aleks\\Downloads\\24_demo (1).txt"));
        int ch;
        char last_s1 = '0', last_s2 = '0';
        int maxLen = 0;
        int len = 0;
        while ((ch = reader.read()) != -1){
            char s = (char) ch;

            if (len > 0){
                if (
                        last_s1 == 'X' && s == 'Y' || last_s1 == 'Y' && s == 'Z' || last_s1 == 'Z' && s == 'X'
                ){
                    len++;
                }else{
                    if (len > maxLen)
                        maxLen = len;
                    len = 0;
                }
            }

            if (len == 0 && last_s2 == 'X' && last_s1 == 'Y' && s == 'Z'){
                len = 3;
            }

            last_s2 = last_s1;
            last_s1 = s;
        }
        if (len > maxLen)
            maxLen = len;
        System.out.println(maxLen);
    }
}
