public class PalindromicNumber {

    private long number;

    public PalindromicNumber(){
    }

    public PalindromicNumber(long number){
        this.number = number;
    }

    public boolean isPalindromic(){
        int count = 0;
        while (count < this.countDigits()/ 2){
            if (this.digitAtPositionN(count) != this.digitAtPositionN(this.countDigits() - 1 - count)){
                return false;
            }
            count++;
        }
        return true;
    }

    public int countDigits(){
        int count = 0;
        long x = this.number;

        while (x !=0){
            x = x/10;
            count++;
        }
        return count;
    }


    public int digitAtPositionN(int N){
        long x = this.number;
        if (N >= 0 && N <= this.countDigits() - 1){
            for (int i = 0; i <= this.countDigits() - 2 - N; i++){
                x = x/10;
            }
            return (int)x%10;
        }
        return -1;

    }

}
