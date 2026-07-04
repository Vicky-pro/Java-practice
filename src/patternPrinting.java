public class patternPrinting {
    static void main() {
        int n=5;
        System.out.println("pyramid");
        for (int i=0;i<n;i++){
            for (int j=n;j>=0;j--){
                if (i>=j)System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Right side right-angle");
        for (int i=0;i<n;i++){
            for (int j=n;j>0;j--){
                if (i>=j)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("left side right-angle");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i>=j)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("hollow square");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==0||i==n-1||j==0)System.out.print("* ");
                else if (j==n-1) System.out.print("   *");
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
