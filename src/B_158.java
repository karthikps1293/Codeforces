import java.io.*;

public class B_158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int groups = Integer.parseInt(br.readLine());
        int[] grpSize = new int[groups];
        int taxiCtr = 0;

        String[] line2 = br.readLine().split(" ");
        for(int i = 0; i < groups; i++)
            grpSize[i] = Integer.parseInt(line2[i]);

        int ones = 0, twos = 0, threes = 0, fours = 0;
        for(int i : grpSize) {
            if(i == 1) ones++;
            else if(i == 2) twos++;
            else if(i == 3) threes++;
            else fours++;
        }

        taxiCtr = fours;

        while(ones > 0 && threes > 0) {
            ones--;
            threes--;
            taxiCtr ++;
        }
         if(threes > 0) taxiCtr += threes;

        while(twos >= 2) {
            twos -= 2;
            taxiCtr++;
        }

        while (ones >= 4) {
            ones -= 4;
            taxiCtr++;
        }

        while (ones/2 >= twos && twos > 0 && ones >= 2) {
            ones -= 2;
            twos--;
            taxiCtr++;
        }
        if(ones > 0 && twos > 0) {
            ones--;
            twos--;
            taxiCtr++;
        }

        if(ones > 0 || twos > 0)taxiCtr++;

        System.out.println(taxiCtr);
    }
}
