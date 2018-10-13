import java.io.*;
import java.util.*;

import java.io.*;

public class A_937 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String line2[] = br.readLine().split(" ");
        ArrayList <Integer> scores = new ArrayList <Integer>();

        for(String s : line2) {

            int i = Integer.parseInt(s);
            if(i == 0)continue;
            if(! scores.contains(i))
                scores.add(i);
        }
        System.out.println(scores.size());
    }
}
