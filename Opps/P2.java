import java.util.*;
class Matrix{
	Scanner in=new Scanner(System.in);
	int row;
	int col;
	int[][] A;
	Matrix(int r,int c){
		row=r;
		col=c;
		A=new int[r][c];
	}
	Matrix(){
		setnor();
		setnoc();
		A=new  int[getnor()][getnoc()];
	}
	int getnor(){
		return row;
	}
	int getnoc(){
		return col;
	}
	void setnor(){
		System.out.print("Enter No of row=");
		this.row=in.nextInt();
	}
	void setnoc(){
		System.out.print("Enter No of col=");
		this.col=in.nextInt();
	}
	void seteom(int i,int j){
	System.out.print("Enetr Element A["+i+"]["+j+"]=");
		A[i][j]=in.nextInt();
	}
	void setE(int m,int n){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				this.A[i][j]=i+j+1;
			}
		}
	}
	void addWith(Matrix m){
		if((this.row==m.row)&&(this.col==m.col)){
			for(int i=0;i<this.row;i++){
				for(int j=0;j<this.col;j++){
					this.A[i][j]=this.A[i][j]+m.A[i][j];
				}
			}
		}
	}
	void addWith(Matrix m,Matrix t){
		if((this.row==m.row)&&(this.col==m.col)){
			for(int i=0;i<this.row;i++){
				for(int j=0;j<this.col;j++){
					t.A[i][j]=this.A[i][j]+m.A[i][j];
				}
			}
			System.out.println("Added  Matrix is :\n");
			t.display();
		}
		else
			System.out.println("Sorry! Not Addeble Matrixes ");
	}
	void multWith(Matrix m){
		int sum=0;
		if(this.col==m.row){
			Matrix t=new Matrix(this.row,m.col);
			for(int i=0;i<this.row;i++){
				for(int j=0;j<m.col;j++){
					for(int k=0;k<m.row;k++){
						sum+=this.A[i][k]*m.A[k][j];
					}
					t.A[i][j]=sum;
					sum=0;
				}
			}
			System.out.println("Multiplyed  Matrix is :\n");
			t.display();
		}
		else if(this.row==m.col){
			Matrix t=new Matrix(m.row,this.col);
			for(int i=0;i<m.row;i++){
				for(int j=0;j<this.col;j++){
					for(int k=0;k<this.col;k++){
						sum+=m.A[i][k]*this.A[k][j];
					}
					t.A[i][j]=sum;
					sum=0;
				}
			}
			System.out.println("Multiplyed  Matrix is :\n");
			t.display();
		}
		else 
			System.out.println("Sorry! Not Multiplayble Matrixes ");
	}
	void display(){
		for(int i=0;i<this.row;i++){
			for(int j=0;j<this.col;j++){
				System.out.print("	"+A[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
	}
	public String toString(){
		String str="";
		for(int i=0;i<this.row;i++){
			for(int j=0;j<this.col;j++){
				str=str+A[i][j]+"	";
			}
			str=str+"\n";
		}
		str=str+"\n";
		return str;
	}
}
class MatrixGroupSet{
	ArrayList<Matrix> ar1=new ArrayList<Matrix>();
	ArrayList<Matrix> ar2=new ArrayList<Matrix>();
	MatrixGroupSet(Matrix m){
		this.ar1.add(m);
		this.ar2.add(m);
	}
	MatrixGroupSet(){
		
	}
	int k=0;
	void Add(Matrix m){
			if((m.getnor()==ar1.get(0).getnor())&&(m.getnoc()==ar1.get(0).getnoc())){
				ar1.add(m);
			}
			if((m.getnor()==ar2.get(0).getnoc())){
				ar2.add(m);
			}
	}
	void displaym(){
		System.out.println("All Addeble Matrixes are:");
		for(Matrix a:ar1){
			System.out.println(a.toString());
		}
		System.out.println("All Multiplayeble Matrixes are:");
		for(Matrix a:ar2){
			System.out.println(a.toString());
		}
	}
	Matrix sum;
	Matrix temp;
	void sumofAdd(){
		sum=this.ar1.get(0);
	    temp=new Matrix((this.ar1.get(0)).getnor(),(this.ar1.get(0)).getnoc());
		for(Matrix m:this.ar1){
			  sum.addWith(m);
		}
		System.out.println("Sum of All Addele matrixes: ");
		System.out.println(sum.toString());
	}
	
}
class  P2{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		Matrix[] M=new Matrix[10];
		Matrix m1;
		MatrixGroupSet mat=new MatrixGroupSet();
		int N=0;
		int i,r,c,j,k,choice;
		M[0]=new Matrix(2,3);//creat Matrix
		N++;
		M[0].setE(2,3);
		M[1]=new Matrix(3,3);
		N++;
		M[1].setE(3,3);
		M[2]=new Matrix(3,2);
		N++;
		M[2].setE(3,2);
		System.out.println("********************************************************");
		System.out.println("0->For Extension Part");
		System.out.println("1->Creat new Matrix");
		System.out.println("2->Add two Matrix");
		System.out.println("3->Multiply two Matrix");
		System.out.println("4->Print Matrixes");
		System.out.println("5->Exit");
		System.out.println("---------------------------------------------------------");
		int condition=0;
		while(condition==0){
			System.out.print("Enter choice=");
			choice=in.nextInt();
			switch(choice){
				case 0:{
					int c1=0;
					System.out.println("____________________________________________________________");
					System.out.println("Extension part Start");
					System.out.println("1.Create MatrixGroupSet(MGS)");
					System.out.println("2.Update the MatrixGroupSet");
					System.out.println("3.Sum of matrices in the addable groupset.");
					System.out.println("4.Sum of matrices in the multiplicable groupset");
					System.out.println("5.For Exit from Extension Part");
					while(c1==0){
						int ch;
						System.out.print("Enter Ext choice=");
			            ch=in.nextInt();
						switch(ch){
							case 1:{
								System.out.println("Creat user matrices");
								m1=new Matrix();
					for(j=0;j<m1.getnor();j++){
				for(k=0;k<m1.getnoc();k++){
					m1.seteom(j,k);
				}
			}
					System.out.println("Created Matrix is :");
					m1.display();
								mat=new MatrixGroupSet(m1);
							};break;
							case 2:{
								  for(i=1;i<N;i++){
								  mat.Add(M[i]);
								  }
								  mat.displaym();
							};break;
							case 3:{
								mat.sumofAdd();
							};break;
							case 4:{
								System.out.println("Question is Not clear");
								//mat.sumofMult();Question is Not clear 
							};break;
							case 5:{
								System.out.println("Extension part End");
								System.out.println("____________________________________________________________");
								c1=1;
							};break;
							default:System.out.println("Sorry! Choice is wrong.");
						}
					}
				};
				break;
				case 1:{
					M[N]=new Matrix();
					for(j=0;j<M[N].getnor();j++){
				for(k=0;k<M[N].getnoc();k++){
					M[N].seteom(j,k);
				}
			}
					System.out.println("Created Matrix is :");
					M[N].display();
					N++;
				};break;
				case 2:{
					System.out.print("Enter index of 1st Matrix 0 to "+(N-1)+"=");
                    r=in.nextInt();
					System.out.print("Enter index of 2nd Matrix 0 to "+(N-1)+"=");
					c=in.nextInt();
					if((r<N)&&(c<N)){
					Matrix n=new Matrix(M[r].getnor(),M[r].getnoc());
					M[r].addWith(M[c],n);
					}
					else
						System.out.println("Sorry! index of Matrix out of Bound");
				};break;
				case 3:{
					System.out.print("Enter index of 1st Matrix 0 to "+(N-1)+"=");
                    r=in.nextInt();
					System.out.print("Enter index of 2nd Matrix 0 to "+(N-1)+"=");
					c=in.nextInt();
					if((r<N)&&(c<N)){
					M[r].multWith(M[c]);
					}
					else 
						System.out.println("Sorry! index of Matrix out of Bound");
				};break;
				case 4:{
					System.out.println("Displayed All Matrices :_________________________________");
					for(i=0;i<N;i++){
						System.out.println("\nMatrix M["+i+"] is :");
						M[i].display();
					}
				};break;
				case 5:{
					condition=1;
					System.out.println("********************************************************");
				};break;
				default:break;
			}
		}
	}
}