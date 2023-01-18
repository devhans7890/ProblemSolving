import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1000 {
    BufferedReader bufferedReader;
    String untokendString;
    StringTokenizer stringTokenizer;
    Logger logger = LoggerFactory.getLogger(P1000.class);

    public P1000() throws IOException {
        logger.debug("A B");
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        untokendString = bufferedReader.readLine();
        stringTokenizer = new StringTokenizer(untokendString," ");
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        if (a > 0) {
            if (b < 10) {
                logger.debug("{}",a+b);
            }
        }
        bufferedReader.close();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String untokendStr = buffer.readLine();
        StringTokenizer strTokenizer = new StringTokenizer(untokendStr," ");
        int a = Integer.parseInt(strTokenizer.nextToken());
        int b = Integer.parseInt(strTokenizer.nextToken());
        if (a > 0) {
            if (b < 10) {
            }
        }
    }
}
