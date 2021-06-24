package task12;

public class Program26957 {
    public static void main(String[] args) {
        String s = ">";
        for (int i = 0; i < 26; i++){
            s += "1";
        }
        for (int i = 0; i < 10; i++){
            s += "2";
        }
        for (int i = 0; i < 14; i++){
            s += "3";
        }

        while(s.contains(">1") || s.contains(">2") || s.contains(">3")){
            if (s.contains(">1")){
                s = s.replaceFirst(">1", "22>");
            }
            if (s.contains(">2")){
                s = s.replaceFirst(">2", "2>");
            }
            if (s.contains(">3")){
                s = s.replaceFirst(">3", "1>");
            }
        }
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '>')
                continue;
            int num = Integer.parseInt(s.charAt(i)+"");
            sum += num;
        }
        System.out.println(sum);
    }
}
