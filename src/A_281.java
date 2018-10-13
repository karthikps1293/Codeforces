import java.io.*;

public class A_281 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        String word = br.readLine();

        if(Character.isLetter(word.charAt(0)))
            System.out.println(Character.toString(Character.toUpperCase(word.charAt(0))) + word.substring(1));

        else
            System.out.println(word);
    }
}
