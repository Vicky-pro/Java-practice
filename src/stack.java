public class stack {
    int top=0;
    int[] sta = new int[5];

    public void push(int data){
        if (top==5){
            System.out.println("stack is full");
        }
        sta[top] = data;
        top++;
    }
    public void pop(){
        if(top<0){
            System.out.println("Underline");
        }
        else {
            System.out.println(sta[top]==0);
            top--;
        }
    }
    public void peek(){
        System.out.println(sta[top-1]);
    }
    public static void main(){
        stack a=new stack();
        a.push(89);
        a.push(899);
        a.push(839);
        a.push(822);
        a.peek();
        a.push(9);


    }
}

