import java.io.*;
import java.util.*;

public class A_266 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int removeCtr = 0;
        ArrayList <Character> row = new ArrayList <Character>();

        for(int i = 0; i < n; i++)
            row.add(s.charAt(i));

        for(int i = 0; i+1 < row.size();) {
            char left = row.get(i);
            char right = row.get(i+1);

            if(left == right) {
                row.remove(i+1);
                removeCtr++;
                continue;
            }
            else
                i++;
        }
        //System.out.println(row);
        System.out.println(removeCtr);
    }
}
