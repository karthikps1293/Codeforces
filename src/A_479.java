import java.io.*;
import java.util.*;

public class A_479 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int sum = a+b+c;

        List <Integer> l = new ArrayList<>(3);
        l.add(a);
        l.add(b);
        l.add(c);

        int max = Collections.max(l);
        int min = Collections.min(l);
        int mid = sum-(max+min);

        List <Integer> solutions = new ArrayList<>();
        solutions.add(a*b*c);
        solutions.add(a+b+c);
        solutions.add(max*(min+mid));
        System.out.println(Collections.max(solutions));
    }
}