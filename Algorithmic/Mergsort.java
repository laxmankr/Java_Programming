import java.util.*;
class Merg{
	int[] a;
	int ne;
	Merg(int max){
		a=new int[max];
		ne=0;
	}
	Merg(){
		
	}
	void insert(int key){
		a[ne]=key;
		ne++;
	}
	void display(){
		int l=ne;
		for(int i=0;i<l;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
	void M(){
		mergsort(a,0,ne-1);
	}
	void mergsort(int[] a,int l,int r){
		if(r<=l)return;
			int m=l+(r-l)/2;
		mergsort(a,l,m);
		mergsort(a,m+1,r);
		merg(a,l,m,r);
	}
	void merg(int[] a,int l,int m,int r){
		int i=0,j=0;
		int k=0;
		int[] a1=new int[m-l+1];
		int[] a2=new int[r-m];
		for(i=0;i<(m-l+1);i++){
			a1[i]=a[l+i];
		}
		for(j=0;j<(r-m);j++){
			a2[j]=a[j+m+1];
		}
		i=0;
		j=0;
		k=l;
		while(i<(m-l+1)&&j<(r-m)){
			if(a1[i]<=a2[j]){
				a[k]=a1[i];
				i++;
			}
			else {
				a[k]=a2[j];
				j++;
			}
			k++;
		}
		while(i<(m-l+1)){
			a[k]=a1[i];
			k++;
			i++;
		}
		while(j<(r-m)){
			a[k]=a2[j];
			j++;
			k++;
		}
	}
}
class Mergsort{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter maximum size of Array : ");
		int max=in.nextInt();
		Merg obj=new Merg(max);
		for(int i=0;i<max;i++){
			obj.insert(in.nextInt());
		}
		System.out.print("Input Array is  : ");
		obj.display();
		obj.M();
		System.out.print("Sorted Array is : ");
		obj.display();
	}
}