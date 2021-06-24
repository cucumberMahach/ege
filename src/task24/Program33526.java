package task24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Program33526 {
    public static void main(String[] args) throws IOException {
        String s = Files.readAllLines(Paths.get("C:\\Users\\aleks\\Downloads\\24.txt")).get(0);
        List<Character> chList = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();
        for (int i = 1; i < s.length()-1; i++){
            char left = s.charAt(i-1);
            char right = s.charAt(i+1);
            char curr = s.charAt(i);
            if (left == right){
                int index = chList.indexOf(curr);
                if (index == -1){
                    chList.add(curr);
                    countList.add(1);
                }else{
                    countList.set(index, countList.get(index) + 1);
                }
            }
        }
        int maxCount = 0;
        int maxIndex = -1;
        for (int i = 0; i < countList.size(); i++){
            int count = countList.get(i);
            if (count > maxCount){
                maxCount = count;
                maxIndex = i;
            }
        }
        System.out.println(chList.get(maxIndex));
    }
}
