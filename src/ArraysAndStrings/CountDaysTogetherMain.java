package ArraysAndStrings;

class Solution44 {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        int aliceStart = convertToDays(arriveAlice, daysInMonth);
        int aliceEnd = convertToDays(leaveAlice, daysInMonth);
        int bobStart = convertToDays(arriveBob, daysInMonth);
        int bobEnd = convertToDays(leaveBob, daysInMonth);

        int start = Math.max(aliceStart, bobStart);
        int end = Math.min(aliceEnd, bobEnd);

        return Math.max(0, end - start + 1);
    }

    private int convertToDays(String date, int[] daysInMonth) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int total = day;

        for (int i = 0; i < month - 1; i++) {
            total += daysInMonth[i];
        }

        return total;
    }
}

public class CountDaysTogetherMain {

    public static void main(String[] args) {
        Solution44 S44 = new Solution44();

        System.out.println(S44.countDaysTogether("08-15 ", "08-18", "08-16", "08-19"));
    }
}
