import java.io.*;

public class A_131 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int len = word.length();
        String output = "";

        boolean case1_a = false, case1_b = false, case2_a = false, case2_b = false;

        for(int i = 0; i < len; i++) {

            if(i == 0 && Character.isLowerCase(word.charAt(i))) {
                case1_a = case1_b = true;
                continue;
            }

            if(i == 0 && Character.isUpperCase(word.charAt(i))) {
                case2_a = case2_b = true;
                continue;
            }

            if(case1_a && Character.isLowerCase(word.charAt(i))) case1_b = false;

            if(case2_a && Character.isLowerCase(word.charAt(i))) case2_b = false;
        }

        if((case1_a && case1_b) || (case2_a && case2_b)) {

            //reverse case
            for(int i = 0; i < len; i++) {

                char c = word.charAt(i);

                if(Character.isLowerCase(c))
                    output += Character.toString(Character.toUpperCase(c));
                else if(Character.isUpperCase(c))
                    output += Character.toString(Character.toLowerCase(c));
            }
        }
        else output = word;

        System.out.println(output);
    }
}
