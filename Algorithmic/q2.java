import java.util.Scanner;

class q2
{
        
        public static void main(String a[]) 
        {
                int c;
                int x;
                Scanner in=new Scanner(System.in);
                Queue queue = new Queue();
                QueueLinked queueLinked = new QueueLinked();
                System.out.println("For ArrayQueue :\n\tSpaceComplexity -Constant\n\tTimeComplexity - O(1) for enqueue,dequeue and O(N) for printing");
                System.out.println("For LinkedQueue :\n\tSpaceComplexity - O(N)\n\tTimeComplexity- O(1) for enqueue,dequeue and O(N) for printing");

                while(true)
                {
                        System.out.print("\nMenu\n-------------\n\n1\t- Enqueue\n2\t- Dequeue\n3\t-Print\nEnter Choice : ");
                        c=in.nextInt();
                        switch (c) {
                                        case 1:
                                                System.out.print("Enter Number : ");
                                                x=in.nextInt();
                                                if(queue.enqueue(x))
                                                        System.out.println("ARRAY : Added");
                                                else System.out.println("ARRAY : Can't Add!!!");
                                                if(queueLinked.enqueue(x))
                                                        System.out.println("LINKED : Added");
                                                else System.out.println("LINKED : Can't Add!!!");
                                        break;
                                        case 2:
                                                if(queue.dequeue())
                                                        System.out.println("ARRAY : Removed");
                                                else        System.out.println("ARRAY : Can't Remove!!!");
                                                if(queueLinked.dequeue())
                                                        System.out.println("LINKED : Removed");
                                                else        System.out.println("LINKED : Can't Remove!!!");
                                        break;
                                        case 3:
                                                System.out.println("ARRAY : "+queue.getString()+"");
                                                System.out.println("LINKED : "+queue.getString()+"");

                                        break;
                                        default:
                                        System.out.println("Wrong Choice!");

                                                }                        
                }
        }
}

class Queue
{
final int SIZE_ARRAY = 100;
        int A[];
        int s,e;
        Queue()
        {
                s=-1;e=-1;
                A=new int[SIZE_ARRAY];
        }
        boolean enqueue(int x)
        {
                if(s<0) {s=0;e=-1;}
                if(e<A.length-1)
                        A[++e]=x;
                else return false;
                return true;
        }

        boolean dequeue()
        {
                if(s<=e)
                        {s++;if(s>e) s=e=-1;}
                else return false;
                return true;
        }
        boolean isEmpty()
        {
                if(s>=0) return false;return true;
        }
        int getFront()
        {
                return A[e];
        }
        String getString()
        {
                
                StringBuilder str=new StringBuilder();
                if(s==-1)
                        return "No Elements";

                for(int i=s;i<e;i++)
                        str.append(A[i]+" > ");
                str.append(A[e]+"");
                return str.toString();
        }
}
class QueueLinked
{
        class Node
        {
                int x;
                Node next;
                Node(int x)
                {
                        this.x=x;
                        next=null;
                }
        }
        Node head,tail;
        
        QueueLinked()
        {
                head=tail=null;
        }
        boolean enqueue(int x)
        {
                Node n = new Node(x);
                if(tail==null)
                {
                        head=tail=n;
                }
                else
                {
                        tail.next=n;
                }
                return true;
        }

        boolean dequeue()
        {
                if(head==null)
                        return false;
                else
                {
                        head=head.next;
                        if(head == null)
                                tail=null;
                        return true;
                }
        }
        boolean isEmpty()
        {
                if(head!=null) return false;return true;
        }
        String getString()
        {
                if(head==null)
                        return "No Elements";
                Node n=head;
                StringBuilder str=new StringBuilder();
                while((n.next)!=null)
                        {
                                str.append(n.x+" > ");n=n.next;
                        }
                str.append(n.x+"");
                return str.toString();
        }
}