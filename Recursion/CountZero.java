
class CountZero{
    static int zeroCount(int digit, int count){
        if(digit == 0){
            return count;
        }

        int rem = digit % 10;
        if(rem == 0){
           return zeroCount(digit / 10, count + 1);
        }

        return zeroCount(digit / 10, count);
    
    }
    public static void main(String[] args) {
        int digit = 20202020;
        System.out.println(zeroCount(digit, 0));
    }
}