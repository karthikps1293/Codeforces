import java.io.*;
import java.util.*;

public class A_271 {

    private static boolean isUnique(int yr) {

        List <Integer> digits = new ArrayList<>(4);

        while(yr > 0) {
            int d = yr % 10;
            yr /= 10;
            if(digits.contains(d)) return false;
            else digits.add(d);
        }return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());
        int uniqueYear = year + 1;

        while (true) {
            if(isUnique(uniqueYear)) {
                System.out.println(uniqueYear);
                return;
            }
            else uniqueYear++;
        }
    }
}
