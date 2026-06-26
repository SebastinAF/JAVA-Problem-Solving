package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

class Solution16 {
    public int maxNumberOfBalloons(String text) {

        Map<Character, Integer> resultMap = new HashMap<>();
        String s = "balloon";

        for (char c : s.toCharArray()) resultMap.put(c,0);

        for (char c : text.toCharArray()) {
            if (resultMap.containsKey(c)) {
                resultMap.put(c, resultMap.get(c) + 1);
            }
        }

        int result = Integer.MAX_VALUE;

        for (char c : resultMap.keySet()) {
            if (c == 'l' || c == 'o') {
                result = Math.min(result, resultMap.get(c) / 2);
            } else {
                result = Math.min(result, resultMap.get(c));
            }
        }

        return result;
    }
}

public class MaxNumberOfBalloonsMain {

    public static void main(String[] args) {
        Solution16 S16 = new Solution16();

        System.out.println(S16.maxNumberOfBalloons("krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvu" +
                "yznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdcii" +
                "lduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulv" +
                "rspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfz" +
                "iumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojerii" +
                "gwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrtt" +
                "rzonwafrnedglhpudovigwvpimttiketopkvqw"));
    }
}
