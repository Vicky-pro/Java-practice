import java.util.Scanner;
public class zeroToEnd {
    static void main() {
        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int[] arr={0};
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
        for(int num:arr)
            System.out.print(num+" ");
    }
}
