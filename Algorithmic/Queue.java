//Assignment-2,Roll  No-1401CS22
//Q-2
import java.io.*;
import java.util.*;

public class Queue
{

        public static void main(String[] args)
        {
                Scanner s=new Scanner(System.in);
                arraybasedque q1=new arraybasedque ();
                //q1.enque();
                //q1.enque();
                //q1.enque();
           // q1.enque();
                //q1.enque(6);
                //q1.enque(7);
                //q1.dequeue();
        //        q1.dequeue();
                //q1.print();
                System.out.print("\nEnter 1 for inserting");
                System.out.print("\nEnter 2 for dequeuing an element");
                System.out.print("\nEnter 3 for printing");

                int z=0;
                while(z<6){
                        System.out.print("\nEnter choice=");
                int a=s.nextInt();
                switch(a)
                {
                case 1:
                        q1.enque();
                        break;

                case 2:
                        q1.dequeue();
                        break;

                case 3:
                        q1.print();
                        break;
                }

                }


}
public class arraybasedque
{
         Scanner r=new Scanner(System.in);
        int maxsize=10; // Maximum size of queue
         int front=1; // Index of front element
         int rear=0;
         int[] queue=new int[maxsize+1];
         public void enque()
         {
                 System.out.println("Enter the element");
                 int n=r.nextInt();
                 if((rear+2)%maxsize==front)
                         System.out.println("Queue is full");
                 else
                         rear=(rear+1)%maxsize;
                     queue[rear]=n;
         }
         public int dequeue()
         {
                 if(front==rear||rear==-1)
                         System.out.println("queue is empty");
                 int a=queue[front];
                 front=(front+1)%maxsize;
                 return a;
         }
         public void print()
         {
                 int i=front;
                 while(i!=rear)
                 {
                         System.out.print(queue[i]+"\t");

                         if(i==maxsize-1)
                                 i=0;
                         else
                                 i++;

                 }
                 if(i==10)
                         System.out.print(queue[0]);
                 else
                         System.out.print(queue[rear]);

         }
}



        }