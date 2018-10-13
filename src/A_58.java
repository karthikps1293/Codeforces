import java.io.*;

public class A_58 {

    private static void check(String s, String compare) {

        if(s.length() == 0 && compare.length() > 0) System.out.println("NO");

        else if(compare.length() == 0) System.out.println("YES");

        else if(s.charAt(0) == compare.charAt(0))
            check(s.substring(1), compare.substring(1));
        else
            check(s.substring(1), compare);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        check(word, "hello");
    }
}
