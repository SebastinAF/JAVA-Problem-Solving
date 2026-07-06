package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

class Solution21 {
    public String removeStars(String s) {

        List<Character> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (c == '*') list.removeLast();
            else list.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : list) sb.append(c);

        return sb.toString();
    }
}

public class RemoveStarsMain {

    public static void main(String[] args) {
        Solution21 S21 = new Solution21();

        System.out.println(S21.removeStars("leet**cod*e"));
    }
}
