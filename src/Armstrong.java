public class Armstrong {
    static void main() {
        int n=100000;

        for (int i=1;i<=n;i++){
            int digits=0;
            int ArmstrongSum =0;
            int temp = i;
            while(temp>0){
                temp=temp/10;
                digits++;
            }
            int temp1=i;
            while (temp1>0){
                int dig=temp1%10;
                ArmstrongSum += Math.powExact(dig,digits);
                temp1=temp1/10;
            }
            if(ArmstrongSum == i){
                System.out.print(ArmstrongSum+" ");
            }
        }
    }
}
