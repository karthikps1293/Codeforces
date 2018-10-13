import java.io.*;

public class A_546 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        int[] input = new int[3];
        for(int i = 0; i < 3; i++) input[i] = Integer.parseInt(line1[i]);

        int firstCost = input[0];
        int dollarsHave = input[1], totalCost = 0;
        int bananas = input[2];

        for(int i = 0, mult = 1; i < bananas; i++, mult++) {
            totalCost += mult*firstCost;
        }

        if(totalCost > dollarsHave)
            System.out.println(totalCost - dollarsHave);
        else System.out.println(0);
    }
}
