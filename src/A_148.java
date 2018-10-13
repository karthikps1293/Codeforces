import java.io.*;
import java.util.*;

public class A_148 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List <Integer> inp = new ArrayList<>();
        for(int i = 0; i < 4; i++) inp.add(Integer.parseInt(br.readLine()));
        int d = Integer.parseInt(br.readLine());
        int ctr = 0;

        if(inp.contains(1)) {
            System.out.println(d);
            return;
        }
        else if (inp.contains(2) || inp.contains(3) || inp.contains(5) || inp.contains(7))
            ctr = d/2 + d/3 + d/5 + d/7;
        if(inp.contains(4) && !inp.contains(2))
            ctr += d/4;
        if(inp.contains(6) && !inp.contains(2) && !inp.contains(3))
            ctr += d/6;
        if(inp.contains(8) && !inp.contains(2) && !inp.contains(4))
            ctr += d/8;
        if(inp.contains(9) && !inp.contains(3))
            ctr += d/9;
        if(inp.contains(10) && !inp.contains(2) && !inp.contains(5))
            ctr += d/10;
        System.out.println(ctr);
    }
}