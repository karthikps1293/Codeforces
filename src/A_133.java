import java.io.*;

public class A_133 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int len = line.length();
        boolean ans = false;

        for(int i = 0; i < len; i++) {
            if(line.charAt(i) == 'H' || line.charAt(i) == 'Q' || line.charAt(i) == '9') {
                System.out.println("YES");
                ans = true;
                break;
            }
        }
        if(!ans) System.out.println("NO");
    }
}
