import java.util.*;
class spiral{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int[][] A=new int[5][4];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++){
				A[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++){
				System.out.print(" "+A[i][j]);
			}
			System.out.print("\n");
		}
		int k=0;
		int l=4;
		int m=0;
		int n=3;
		int i;
		while(k<l&&m<n){
			for(i=k;i<n;i++){
				System.out.print(" "+A[k][i]);
			}
			for(i=m;i<l;i++){
				System.out.print(" "+A[i][n]);
			}
			for(i=n;i>m;i--){
				System.out.print(" "+A[l][i]);
			}
			for(i=l;i>k;i--){
				System.out.print(" "+A[i][m]);
			}
			k++;
			l--;
			m++;
			n--;
			
		}
	}
}