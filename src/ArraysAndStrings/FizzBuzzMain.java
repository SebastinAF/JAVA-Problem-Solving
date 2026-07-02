package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

class Solution17 {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 ==0) list.add("FizzBuzz");
            else if (i % 3 == 0) list.add("Fizz");
            else if (i % 5 == 0) list.add("Buzz");
            else list.add(Integer.toString(i));
        }

        return list;
    }
}

public class FizzBuzzMain {

    public static void main(String[] args) {
        Solution17 S17 = new Solution17();

        System.out.println(S17.fizzBuzz(3));
    }
}
