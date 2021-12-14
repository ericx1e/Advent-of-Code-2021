package Day3;

import java.io.*;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

public class BinaryDiagnostic2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/Day3/input.txt"));

        int[] freq1 = new int[12];
        int[] freq0 = new int[12];
        int[] freq21 = new int[12];
        int[] freq20 = new int[12];
        ArrayList<String> input = new ArrayList<>();
        ArrayList<String> input2 = new ArrayList<>();

        while(in.hasNext()) {
            String line = in.nextLine();
            input.add(line);
            input2.add(line);
            for (int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == '0') {
                    freq0[i]++;
                    freq20[i]++;
                } else {
                    freq1[i]++;
                    freq21[i]++;
                }
            }
        }
        for(int i = 0; i < 12; i++) {
            HashSet<String> removed = new HashSet<>();
            for (int j = 0; j < input.size(); j++) {
                if(input.get(j).charAt(i) != (freq1[i] >= freq0[i] ? '1' : '0')) {
                    removed.add(input.remove(j));
                    j--;
                    if(input.size() == 1) {
                        break;
                    }
                }
            }
            for(String rem : removed) {

                for (int k = 0; k < rem.length(); k++) {
                    if(rem.charAt(k) == '0') {
                        freq0[k]--;
                    } else {
                        freq1[k]--;
                    }
                }
            }
            if(input.size() == 1) {
                break;
            }
        }

        for(int i = 0; i < 12; i++) {
            HashSet<String> removed = new HashSet<>();
            for (int j = 0; j < input2.size(); j++) {
                if(input2.get(j).charAt(i) != (freq21[i] < freq20[i] ? '1' : '0')) {
                    removed.add(input2.remove(j));
                    j--;
                    if(input2.size() == 1) {
                        break;
                    }
                }
            }
            for(String rem : removed) {
                for (int k = 0; k < rem.length(); k++) {
                    if(rem.charAt(k) == '0') {
                        freq20[k]--;
                    } else {
                        freq21[k]--;
                    }
                }
            }
            if(input2.size() == 1) {
                break;
            }
        }
//        System.out.println(input.get(0));
//        System.out.println(Integer.parseInt(input.get(0), 2));
        System.out.println(Integer.parseInt(input.get(0), 2)*Integer.parseInt(input2.get(0), 2));
    }
}
