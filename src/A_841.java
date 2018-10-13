import java.io.*;
import java.util.*;

public class A_841 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line1 = br.readLine().split(" ");
        int nBalloons = Integer.parseInt(line1[0]);
        int nFriends = Integer.parseInt(line1[1]);
        int maxFreq = 0;
        String colours = br.readLine();

        Map <Character, Integer> colourFrequency = new HashMap<>();

        for(int i = 0, len = colours.length(); i < len; i++) {

            char c = colours.charAt(i);

            if(!colourFrequency.containsKey(c))
                colourFrequency.put(c,1);
            else
                colourFrequency.put(c,colourFrequency.get(c)+1);
        }

        for(Character c : colourFrequency.keySet())
            if(colourFrequency.get(c) > maxFreq) maxFreq = colourFrequency.get(c);

        if(maxFreq <= nFriends) System.out.println("YES");
        else System.out.println("NO");
    }
}
