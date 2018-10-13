import java.io.*;
import java.util.*;

public class A_236 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String output[] = {"CHAT WITH HER!", "IGNORE HIM!"};
        String username = br.readLine();
        List <Character> unique = new ArrayList<>();

        for(int i = 0, len = username.length(); i < len; i++) {
            char c = username.charAt(i);
            if(!unique.contains(c))
                unique.add(c);
        }

        if(unique.size() % 2 == 0) System.out.println(output[0]);
        else System.out.println(output[1]);
    }
}
