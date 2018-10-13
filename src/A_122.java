import java.io.*;
import java.util.*;

public class A_122 {

    private static boolean isLucky(int n) {

        boolean ans = true;

        while(n > 0) {

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
        int num = Integer.parseInt(br.readLine());
        String result = "NO";

        List <Integer> lucky = new ArrayList<>();

        //store lucky nos between 1 and 1000
        for(int i = 4; i <= 1000; i++)
            if(isLucky(i)) lucky.add(i);

        for(Integer i : lucky) {
            if(num % i == 0) {
                result = "YES";
                break;
            }
        }
        System.out.println(result);
    }
}
