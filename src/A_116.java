import java.io.*;
import java.util.*;

public class A_116 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<int[]> ab = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int[] temp = new int[2];
            String[] input = br.readLine().split(" ");
            temp[0] = Integer.parseInt(input[0]);
            temp[1] = Integer.parseInt(input[1]);
            ab.add(temp);
        }

        int currentPassengers = 0, minTramSize = 0;

        for(int[] stop : ab) {
            currentPassengers -= stop[0];
            currentPassengers += stop[1];

            minTramSize = Math.max(currentPassengers, minTramSize);
        }
        System.out.println(minTramSize);
    }
}
