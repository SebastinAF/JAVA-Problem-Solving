package BitManupulation;

class Solution01 {
    public int reverseBits(int n) {

        String bits = Integer.toBinaryString(n);

        while (bits.length() < 32) bits += "0";

        String reversedBits = new StringBuilder(bits).reverse().toString();

        return (int) Long.parseLong(reversedBits, 2);
    }
}

public class ReverseBitsMain {

    public static void main(String[] args) {
        Solution01 S01 = new Solution01();

        System.out.println(S01.reverseBits(43261596));
    }
}
