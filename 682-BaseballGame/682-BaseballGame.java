// Last updated: 7/11/2026, 2:03:59 PM
public class Solution {
    public int calPoints(String[] ops) {
        int[] record = new int[ops.length];
        int index = 0;
        for (int i = 0; i < ops.length; i++) {
            String op = ops[i];
            if (op.equals("C")) {
                index = index - 1;
            } else if (op.equals("D")) {
                int last = record[index - 1];
                record[index] = last * 2;
                index = index + 1;
            } else if (op.equals("+")) {
                int last = record[index - 1];
                int secondLast = record[index - 2];
                record[index] = last + secondLast;
                index = index + 1;
            } else {
                int num = Integer.parseInt(op);
                record[index] = num;
                index = index + 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum = sum + record[i];
        }
        return sum;
    }
}

