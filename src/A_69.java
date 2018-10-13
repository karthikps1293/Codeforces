import java.io.*;

public class A_69 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] forces = new int[n][3];

        for(int i = 0; i < n; i++) {
            String input[] = br.readLine().split(" ");
            for(int j = 0; j < 3; j++)
                forces[i][j] = Integer.parseInt(input[j]);
        }

        int x = 0, y = 0, z = 0;

        for(int c = 0; c < 3; c++) {
            for(int r = 0; r < n; r++) {
                if(c == 0) x += forces[r][c];
                if(c == 1) y += forces[r][c];
                if(c == 2) z += forces[r][c];
            }
        }

        if(x == 0 && y == 0 && z ==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
