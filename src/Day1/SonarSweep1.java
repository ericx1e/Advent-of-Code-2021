package Day1;
import java.util.*;
import java.io.*;

public class SonarSweep1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/Day1/input.txt"));
        ArrayList<Integer> nums = new ArrayList<>();
        while(in.hasNext()) {
            nums.add(in.nextInt());
        }

        int result = 0;
        for (int i = 0; i < nums.size()-1; i++) {
            if(nums.get(i+1) > nums.get(i)) {
                result++;
            }
        }
        System.out.println(result);
    }
}
