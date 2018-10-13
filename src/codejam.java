import java.io.*;

public class codejam {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int testcases = Integer.parseInt(br.readLine());
        int ctr = 0;

        while (ctr < testcases) {

            String out = "";


            int numberOfBuses = Integer.parseInt(br.readLine());
            int[][] routes = new int[numberOfBuses][2];
            String routesList = br.readLine();
            String[] busRoutes = routesList.split(" ");

            for (int i = 0, j = 0; i < numberOfBuses; i++, j++) {
                routes[i][0] = Integer.parseInt(busRoutes[j]);
                routes[i][1] = Integer.parseInt(busRoutes[++j]);
            }

            int numberOfCities = Integer.parseInt(br.readLine());

            int[] cities = new int[numberOfCities];

            for (int i = 0; i < numberOfCities; i++) {
                cities[i] = Integer.parseInt(br.readLine());
            }

            int counter = 0;
            for (int c : cities) {
                for (int i = 0; i < numberOfBuses; i++) {
                    if (routes[i][0] <= c && c <= routes[i][1]) counter++;
                }
                out += counter + " ";
                counter = 0;
            }
            System.out.println("Case #" + (ctr + 1) + ": " + out);


            ctr++;
            br.readLine();

        }


    }
}
