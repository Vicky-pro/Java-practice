class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LL{
    Node head;
    public void addf(int data)
    {
        Node nn = new Node(data);
        if(head==null)
        {
            head=nn;
            return;
        }
        nn.next=head;
        head=nn;
    }
    public void addL(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=nn;
    }
    public void pl(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void  main(String[] args)
    {
        LL a = new LL();
        a.addf(78);
        a.addf(90);
        a.addf(23);
        a.pl();
        System.out.println();
        a.addL(44);
        a.pl();
    }
}
