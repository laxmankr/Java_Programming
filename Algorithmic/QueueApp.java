// queue.java
// demonstrates queue
// to run this program: C>java QueueApp
////////////////////////////////////////////////////////////////
class Queue
{
private int maxSize;
private long[] queArray;
private int front;
private int rear;
//--------------------------------------------------------------
public Queue(int s) // constructor
{
maxSize = s+1; // array is 1 cell larger
queArray = new long[maxSize]; // than requested
front = 0;
rear = -1;
}
//--------------------------------------------------------------
public void insert(long j) // put item at rear of queue
{
if(rear == maxSize-1)
rear = -1;
queArray[++rear] = j;
}
//--------------------------------------------------------------
public long remove() // take item from front of queue
{
long temp = queArray[front++];
if(front == maxSize)
front = 0;
return temp;
}
//--------------------------------------------------------------
public long peek() // peek at front of queue
{
return queArray[front];
}
//--------------------------------------------------------------
public boolean isEmpty() // true if queue is empty
{
return ( rear+1==front || (front+maxSize-1==rear) );
}
//--------------------------------------------------------------
public boolean isFull() // true if queue is full
{
return ( rear+2==front || (front+maxSize-2==rear) );
}
//--------------------------------------------------------------
public int size() // (assumes queue not empty)
{
if(rear >= front) // contiguous sequence
return rear-front+1;
else // broken sequence
return (maxSize-front) + (rear+1);
}
//--------------------------------------------------------------
} // end class Queue
/*class Queue
{
private int maxSize;
private long[] queArray;
private int front;
private int rear;
private int nItems;
//--------------------------------------------------------------
public Queue(int s) // constructor
{
maxSize = s;
queArray = new long[maxSize];
front = 0;
rear = -1;
nItems = 0;
}
//--------------------------------------------------------------
public void insert(long j) // put item at rear of queue
{
if(rear == maxSize-1) // deal with wraparound
rear = -1;
queArray[++rear] = j; // increment rear and insert
nItems++; // one more item
}
//--------------------------------------------------------------
public long remove() // take item from front of queue
{
long temp = queArray[front++]; // get value and incr front
if(front == maxSize) // deal with wraparound
front = 0;
nItems--; // one less item
return temp;
}
//--------------------------------------------------------------
public long peekFront() // peek at front of queue
{
return queArray[front];
}
//--------------------------------------------------------------
public boolean isEmpty() // true if queue is empty
{
return (nItems==0);
}
//--------------------------------------------------------------
public boolean isFull() // true if queue is full
{
return (nItems==maxSize);
}
//--------------------------------------------------------------
public int size() // number of items in queue
{
return nItems;
}
//--------------------------------------------------------------
} // end class Queue*/
////////////////////////////////////////////////////////////////
class QueueApp
{
public static void main(String[] args)
{
Queue theQueue = new Queue(5); // queue holds 5 items
theQueue.insert(10); // insert 4 items
theQueue.insert(20);
theQueue.insert(30);
theQueue.insert(40);
theQueue.remove(); // remove 3 items
theQueue.remove(); // (10, 20, 30)
theQueue.remove();
theQueue.insert(50); // insert 4 more items
theQueue.insert(60); // (wraps around)
theQueue.insert(70);
theQueue.insert(80);
while( !theQueue.isEmpty() ) // remove and display
{ // all items
//Queues 139
//LISTING 4.4 Continued
long n = theQueue.remove(); // (40, 50, 60, 70, 80)
System.out.print(n);
System.out.print(" ");
}
System.out.println("");
} // end main()
} // end class QueueApp