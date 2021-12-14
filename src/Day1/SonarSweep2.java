package Day1;
import java.util.*;
import java.io.*;

public class SonarSweep2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/Day1/input.txt"));
        ArrayList<Integer> nums = new ArrayList<>();
        while(in.hasNext()) {
            nums.add(in.nextInt());
        }

        int result = 0;
        for (int i = 0; i < nums.size()-3; i++) {
            if(nums.get(i+1) + nums.get(i+2) + nums.get(i+3) > nums.get(i) + nums.get(i+1) + nums.get(i+2)) {
                result++;
            }
        }
        System.out.println(result);
    }
}
