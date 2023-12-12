class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            int current = getValue(s.charAt(i));

            if (i < len - 1) {
                int next = getValue(s.charAt(i + 1));

                if (current < next) {
                    sum += (next - current);
                    i++; 
                } 
                else {
                    sum += current;
                }
            } 
            else {
                sum += current; 
            }
        }

        return sum;
    }

    private int getValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
