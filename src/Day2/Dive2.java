package Day2;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

public class Dive2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/Day2/input.txt"));
        int d = 0;
        int p = 0;
        int a = 0;

        while(in.hasNext()) {
            String dir = in.next();
            int x = in.nextInt();

            switch (dir) {
                case "forward":
                    p+=x;
                    d+=a*x;
                    break;
                case "up":
                    a-=x;
                    break;
                case "down":
                    a+=x;
                    break;
            }
        }

        System.out.println(d*p);
    }
}
