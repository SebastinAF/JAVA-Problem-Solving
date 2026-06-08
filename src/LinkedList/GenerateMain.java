package LinkedList;

import java.util.ArrayList;
import java.util.List;

class Solution05 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(new ArrayList<>(list));

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);

        if (numRows == 1) return result;
        else {
            result.add(new ArrayList<>(list2));
            list.clear();
        }

        for (int i = 3; i <= numRows; i++) {

            int v = 0;

            while (v < i) {
                if (v == 0 || v == i - 1) list.add(1);
                else {
                    list.add(list2.get(v) + list2.get(v - 1));
                }
                v++;
            }
            result.add(new ArrayList<>(list));
            list2.clear();
            list2.addAll(list);
            list.clear();
        }

        return result;
    }
}

public class GenerateMain {

    public static void main(String[] args) {
        Solution05 S05 = new Solution05();

        List<List<Integer>> result = S05.generate(1);

        System.out.println(result);
    }
}
