import java.io.*;

public class A_41 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String t = br.readLine();

        String rev = "";

        for(int len = s.length(), i = len-1; i >= 0; i--) {
            rev += String.valueOf(s.charAt(i));
        }
        if(t.equals(rev)) System.out.println("YES");
        else System.out.println("NO");
    }
}




