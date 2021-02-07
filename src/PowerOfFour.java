public class PowerOfFour {
    public static void main(String[] args) {
       System.out.println(isPowerOfFour(5));
    }
    static public boolean isPowerOfFour(int n) {
        while(n%4 == 0 && n >= 4){
            n /= 4;
        }
        return n == 1;
    }
    public String maximumTime(String time) {
        char[] arrTime = time.toCharArray();

        if (arrTime[0] == '?') arrTime[0] = arrTime[1] <= '3' || arrTime[1] == '?' ? '2':'1';
        if (arrTime[1] == '?') arrTime[1] = arrTime[0]=='2' ? '3':'9';
        if (arrTime[3] == '?') arrTime[3] = '5';
        if (arrTime[4] == '?') arrTime[4] = '9';

        return String.valueOf(arrTime);
    }
}

