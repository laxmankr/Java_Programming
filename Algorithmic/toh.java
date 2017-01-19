//Assignment-2,Roll NO-1401CS22
//Question-1

import java.util.*;
public class toh
{
static int Array[][],a[];
static int num,steps;
public static void main(String[] args)
{
steps=0;
Scanner kbd=new Scanner(System.in);
num=kbd.nextInt();
Array=new int[3][num];
a=new int[3];
a[0]=num;
for(int i=0;i<num;i++)
Array[0][i]=num-i;
print();
moveto(0,2,num);
System.out.println("Numer of steps="+steps);
}
static void moveto(int from,int to,int n){
   if(n==1)
diskmove(from,to);
else {
      int temp=tempry(from,to);
      moveto(from,temp,n-1);
      diskmove(from,to);
      moveto(temp,to,n-1);
}
       }
static int tempry(int f1,int t1)
       {
          int z[]={1,1,1};
           z[f1]=0;
           z[t1]=0;
           for(int i=0;i<3;i++)
            if(z[i]==1)
            return i;
return 0;
}
static void diskmove(int f,int t)
{
Array[t][a[t]]=Array[f][a[f]-1];
a[t]++;
a[f]--;
Array[f][a[f]]=0;
steps++;
print();
}
 static void print()
        {
       for(int j=0;j<num+1;j++)
       {
                  if(num==j) 
           System.out.print("*****   *****   *****");
else
      for(int i=0;i<3;i++)
           if(Array[i][num-1-j]==0)
            System.out.print("        ");
     else   System.out.print("  "+Array[i][num-1-j]+"     ");
             System.out.print("\n");
                  }
         }
}