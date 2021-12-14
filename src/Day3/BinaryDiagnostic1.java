package Day3;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

public class BinaryDiagnostic1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/Day3/input.txt"));

        int[] freq1 = new int[12];
        int[] freq0 = new int[12];

        while(in.hasNext()) {
            String line = in.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == '0') {
                    freq0[i]++;
                } else {
                    freq1[i]++;
                }
            }
        }

        String gammaBin = "";
        String epsilonBin = "";
        for (int i = 0; i < 12; i++) {
            if(freq1[i] > freq0[i]) {
                gammaBin += 1;
                epsilonBin += 0;
            } else {
                gammaBin += 0;
                epsilonBin += 1;
            }
        }

        int gamma = Integer.parseInt(gammaBin, 2);
        int epsilon = Integer.parseInt(epsilonBin, 2);
        System.out.println(gamma*epsilon);
    }
}
