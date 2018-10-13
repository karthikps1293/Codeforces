import java.io.*;

public class A_263 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] matrix = new int[5][5];
        int[] location = new int[2];
        int rowShift = 0, columnShift = 0;

        for(int i = 0; i < 5; i++) {
            String[] row = br.readLine().split(" ");
            for(int j = 0; j < 5; j++) {
                matrix[i][j] = Integer.parseInt(row[j]);

                if(matrix[i][j] == 1) {
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        rowShift = Math.abs(location[0] - 2);
        columnShift = Math.abs(location[1] - 2);
        System.out.println(rowShift + columnShift);
    }
}
