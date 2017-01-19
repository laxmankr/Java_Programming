import java.io.*;
import java.util.*;
class Node
{
public int Data;
public Node leftChild;
public Node rightChild; 
public void displayNode(){
System.out.print(Data+" ");
}
}
class Tree
{
private Node root;
public Tree()
{ 
root = null; 
}
public Node find(int key)
{
	int k=0;
Node current = root;
while(current.Data != key)
{
	k++;
if(key < current.Data)
current = current.leftChild;
else
current = current.rightChild;
if(current == null){
	System.out.println("Time complexity O(nlog(n))="+k*Math.log(k));
return null;
}
}
System.out.println("Time complexity O(nlog(n))="+k*Math.log(k));
return current;
}
public void insert(int id)
{
Node newNode = new Node();
newNode.Data = id;
if(root==null)
root = newNode;
else
{
Node current = root;
Node parent;
while(true)
{
parent = current;
if(id < current.Data)
{
current = current.leftChild;
if(current == null)
{
parent.leftChild = newNode;
return;
}
}
else
{
current = current.rightChild;
if(current == null)
{
parent.rightChild = newNode;
return;
}
}
}
}
}
public void displayTree()
{
Stack globalStack = new Stack();
globalStack.push(root);
int nBlanks = 32;
boolean isRowEmpty = false;
System.out.println("......................................................");
while(isRowEmpty==false)
{
Stack localStack = new Stack();
isRowEmpty = true;
for(int j=0; j<nBlanks; j++)
System.out.print(' ');
while(globalStack.isEmpty()==false)
{
Node temp = (Node)globalStack.pop();
if(temp != null)
{
System.out.print(temp.Data);
localStack.push(temp.leftChild);
localStack.push(temp.rightChild);
if(temp.leftChild != null ||temp.rightChild != null)
isRowEmpty = false;
}
else
{
System.out.print("--");
localStack.push(null);
localStack.push(null);
}
for(int j=0; j<nBlanks*2-2; j++)
System.out.print(' ');
}
System.out.println();
nBlanks /= 2;
while(localStack.isEmpty()==false)
globalStack.push( localStack.pop() );
}
System.out.println("......................................................");
}
}
class Lab_8_BST
{
public static void main(String[] args) throws IOException
{
int value;
Tree theTree = new Tree();
Scanner sc = new Scanner(System.in);
theTree.insert(50);
theTree.insert(80);
theTree.insert(70);
theTree.insert(90);
theTree.insert(65);
theTree.insert(75);
theTree.insert(85);
theTree.insert(95);
theTree.insert(25);
theTree.insert(40);
theTree.insert(15);
theTree.insert(35);
theTree.insert(45);
theTree.insert(20);
theTree.insert(10);
System.out.print("Enter first letter of show, ");
System.out.print("insert, find, exit:");
boolean c=true;
while(c)
{
	System.out.print("\nEnter choice(s,i,f,e) : ");
int choice = getChar();
switch(choice)
{
case 's':
theTree.displayTree();
break;
case 'i':
System.out.print("Enter value to insert: ");
value = getInt();
theTree.insert(value);
break;
case 'f':
System.out.print("Enter value to find: ");
value = getInt();
Node found = theTree.find(value);
if(found != null)
{
System.out.print("Found: ");
found.displayNode();
System.out.print("\n");
}
else{
System.out.print("Could not find ");
System.out.print(value+"\n");
}
break;
case 'e':
System.exit(0);
break;
default:
System.out.print("Invalid entry\n");
}
}
}
public static String getString() throws IOException
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
String s = br.readLine();
return s;
}
public static char getChar() throws IOException
{
String s = getString();
return s.charAt(0);
}
public static int getInt() throws IOException
{
String s = getString();
return Integer.parseInt(s);
}
}