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
}

