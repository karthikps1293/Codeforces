import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_158_v2 {
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

        // Sum = 4
        taxiCtr = fours;

        for(int minThrees = 1, minOnes = 1; threes >= minThrees && ones >= minOnes; threes--, ones--, taxiCtr++);

        for(int minTwos = 2; twos >= minTwos; twos -= 2, taxiCtr++);

        for(int minTwos = 1, minOnes = 2; ones >= minOnes && twos >= minTwos; twos--, ones -=2, taxiCtr++);

        for(int minOnes = 4; ones >= minOnes; ones -= 4, taxiCtr++);

        // Sum = 3
        taxiCtr += threes;

        for(int minTwos = 1, minOnes = 1; twos >= minTwos && ones >= minOnes; ones--, twos--, taxiCtr++);

        for(int minOnes = 3; ones >= minOnes; ones -= 3, taxiCtr++);

        if(ones > 0 || twos > 0) taxiCtr++;

        System.out.println(taxiCtr);
    }
}
