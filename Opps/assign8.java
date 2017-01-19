import java.util.*;
import java.io.*;

class assign8
{
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the name of the file from which you want to read");
		String filename= in.nextLine();
		String s;
		int count=0,c=0;
		ArrayList<ArrayList<Double>> list = new ArrayList<ArrayList<Double>>();
		try
		{
			Scanner sc= new Scanner(new File(filename));
			while(sc.hasNext()!= false)
			{
				String str= sc.nextLine();
				count++;
			}
			System.out.println("No. of points "+count);
			FileReader f= new FileReader(filename);
			BufferedReader br= new BufferedReader(f);
			for(int i=0; i< count; i++)
			list.add(new ArrayList<Double>());
			while((s= br.readLine())!= null)
			{
				String point= s;
				String[] num= point.split("[,]");
				int n= num.length;
				double a[] = new double[n];
				for(int j=0; j< n; j++)
				{
					a[j] = Double.parseDouble(num[j]);
					list.get(c).add(a[j]);
					System.out.print(a[j]+" ");
				}
				c++;
				System.out.println("\n");
			}
			for(int i=0;i < list.size(); i++)
			{  for(int j=i+1; j< list.size(); j++)
			  {	if(list.get(j).get(0) < list.get(i).get(0))
				{
					ArrayList<Double> temp= list.get(i);
					/*list.add(temp);
					Collections.swap(list, i, j);*/
					list.set(i, list.get(j));
					list.set(j, temp);
					/*Collections.swap(list, j, list.indexOf(temp));
					list.remove(temp);
					list.get(i) = list.get(j);
					list.get(j)= temp;*/
				}
			  }
			}
			System.out.println(list);
			for(int i=0;i < list.size(); i++)
			{
			  for(int j=i+1; j< list.size(); j++)
			{
			    if(list.get(j).get(0) == list.get(i).get(0))
				{
				  if(list.get(j).get(1) < list.get(i).get(1))
				  {
					ArrayList<Double> temp= list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				  }
				}
			}}
			System.out.println("Final output");
			System.out.println(list);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Unable to find file "+ filename);
		}
		catch(IOException e)
		{
			System.out.println("Error in reading from file");
		} 
	}
}		
