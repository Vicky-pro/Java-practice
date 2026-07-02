import java.util.Scanner;
void main(){
         Scanner sc= new Scanner(System.in);
         int[] tom = {99,89,77,44,55};
         int[] jer= {100,120,11,89,76};
         int tomC=0; int jerC =0;
         for (int i=0;i<(Math.min(tom.length,jer.length));i++){
             if(tom[i]>jer[i]){
                 tomC++;
             } else if (jer[i]>tom[i]) {
                 jerC++;
             }
         }
         int[] res = new int[2];
         res[0] = tomC;
         res[1]= jerC;

}

