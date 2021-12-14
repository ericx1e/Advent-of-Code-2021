package Day2;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

public class Dive1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/Day2/input.txt"));
        int d = 0;
        int p = 0;

        while(in.hasNext()) {
            String dir = in.next();
            int x = in.nextInt();

            switch (dir) {
                case "forward":
                    p+=x;
                    break;
                case "up":
                    d-=x;
                    break;
                case "down":
                    d+=x;
                    break;
            }
        }

        System.out.println(d*p);
    }
}
