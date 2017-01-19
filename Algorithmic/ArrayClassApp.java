class ArrayClass{
	long[] a;
	int i,j;
	ArrayClass(int size){
		a=new long[size];
	}
	int nElem=0;
	void insert(int x){
		a[nElem]=x;
		nElem++;
	}
	boolean find(int x){
		for(i=0;i<nElem;i++)
			if(a[i]==x)
				break;
			if(nElem==i)
				return false;
			else
				return true;
	}
	void  delete(int x){
		for(i=0;i<nElem;i++)
			if(a[i]==x)
				break;
			if(nElem==i)
				System.out.println("This element not in a Array");
			else{
				for(j=i;j<nElem-1;j++)
					a[j]=a[j+1];
				nElem--;
			}
	}
	void display(){
		for(i=0;i<nElem;i++)
			System.out.print(a[i]+" ");
		System.out.println("");
	}
}
class ArrayClassApp{
	public static void main(String args[]){
		ArrayClass arr=new ArrayClass(100);
		arr.insert(10);
		arr.insert(11);
		arr.insert(12);
		arr.insert(13);
		arr.insert(14);
		arr.insert(15);
		arr.insert(16);
		arr.insert(17);
		arr.insert(18);
		arr.insert(19);
		arr.insert(20);
		arr.display();
		int searchkey=50;
		if(arr.find(searchkey))
			System.out.println("Fount "+searchkey);
		else
			System.out.println("cann't find "+searchkey);
		searchkey=22;
		arr.delete(searchkey);
		arr.display();
	}
}