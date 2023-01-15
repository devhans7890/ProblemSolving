import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1000 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String untokendString = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(untokendString," ");
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        if (a > 0) {
            if (b < 10) {
                System.out.println(a+b);
            }
        }
    }
}
