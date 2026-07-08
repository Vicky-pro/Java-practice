public class patternPrinting {
    static void main() {
        int n=5;

        for(int row=0;row<n;row++){
            for (int col=n;col>=0;col--){
                if(row>=col){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


//        System.out.println("Hour glass");
//        for(int row=0;row<n*2;row++){
//
//            if(row>=n) {
//                int temp=row-n;
//                for (int j = n-1; j >= 0; j--) {
//                    if (temp >= j) System.out.print("* ");
//                    else System.out.print(" ");
//                }
//            }else {
//                for(int space=0;space<row;space++){
//                    System.out.print(" ");
//                }
//                for (int col=n-row;col>0;col--){
//                    System.out.print("* ");
//                }
//            }
//
//            System.out.println();
//        }

//        for(int row=1;row<n*2;row++){
//            for (int col=1;col<n*2;col++){
//                System.out.printf("%2d ",Math.min(Math.min(row,col),Math.min((n*2)-row,(n*2)-col)));
//            }
//            System.out.println();
//        }

//        System.out.println("diamond");
//        if(n%2==0){
//            n=n+1;
//        }
//        for (int row=0;row<=n;row++){
//            if(row>n/2){
//                int numOfSpaces=row-n/2;
//                for (int i=1;i<numOfSpaces;i++){
//                    System.out.print(" ");
//                }
//                for (int col=row;col<=n;col++){
//                    System.out.print(col+" ");
//                }
//            }else {
//                int numOfSpaces=n/2-row;
//                for (int i=0;i<=numOfSpaces;i++){
//                    System.out.print(" ");
//                }
//                for (int col=1;col<=row;col++){
//                    System.out.print(col+" ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("pyramid");
//        for (int i=0;i<n;i++){
//            for (int j=n;j>=0;j--){
//                if (i>=j)System.out.print("* ");
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println("Right side right-angle");
//        for (int i=0;i<n;i++){
//            for (int j=n;j>0;j--){
//                if (i>=j)System.out.print("*");
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println("left side right-angle");
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if (i>=j)System.out.print("*");
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println("hollow square");
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if (i==0||i==n-1||j==0)System.out.print("* ");
//                else if (j==n-1) System.out.print("   *");
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        int num=1;
//        System.out.println("testing");
//        for(int i=1;i<7;i++){
//
//            System.out.printf("%6d\n",num);
//            num*=11;
//        }
    }
}
