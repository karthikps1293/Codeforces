import java.io.*;

public class A_110 {

    private static boolean isLucky(int n) {

        boolean ans = false;

        while(n > 0) {

            ans = true;
            int digit = n % 10;
            n = n/10;
            if(digit != 4 && digit != 7) {
                ans = false;
                break;
            }
        }return ans;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        long num = Long.parseLong(br.readLine());
        String result = "NO";
        int luckyCtr = 0;

        while(num > 0) {

            long digit = num % 10;
            num /= 10;
            if (digit == 4 || digit == 7) {
                luckyCtr++;
            }
        }

        if(isLucky(luckyCtr)) result = "YES";
        System.out.println(result);
    }
}
