import javax.print.attribute.IntegerSyntax;
import java.io.*;

public class A_467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] roomStats = new int[n][2];
        int availableRooms = 0;

        for(int i = 0; i < n; i++) {
            String input[] = br.readLine().split(" ");
            roomStats[i][0] = Integer.parseInt(input[0]);
            roomStats[i][1] = Integer.parseInt(input[1]);
        }

        for(int[] pq : roomStats)
            if(pq[1] - pq[0] >= 2) availableRooms++;

        System.out.println(availableRooms);
    }
}
