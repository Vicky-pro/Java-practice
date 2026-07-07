public class countOfDivisor {
    static void main() {
        System.out.println(count(17));
    }
    public static int count(int n) {
        int count = 2;
        int temp=0;
        if(n<0){
            temp=n;
            n=n*-1;
        }else if(n==0){
            return 0;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if(temp<0)return count*2;
        else return count;
    }
}
