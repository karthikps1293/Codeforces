import java.io.*;
import java.util.*;

public class A_160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] line2 = br.readLine().split(" ");
        List <Integer> coinVals = new ArrayList<>();
        int totVal = 0, coinCtr = 1;


        for(int i = 0, len = line2.length; i < len; i++) {
            coinVals.add(Integer.parseInt(line2[i]));
            totVal += coinVals.get(i);
        }

        Collections.sort(coinVals);
        Collections.reverse(coinVals);
        //System.out.println(coinVals);

        for(int i = 1, half = totVal/2, sum = coinVals.get(0), len = coinVals.size(); i < len; i++) {

            if(sum > half) break;

            else {
                sum += coinVals.get(i);
                coinCtr++;
            }
        }
            System.out.println(coinCtr);
    }
}
