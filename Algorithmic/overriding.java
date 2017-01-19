class s_uper
{
int x;
 s_uper(int x)
{
  this.x=x;
}
 void display( )
{
	System.out.println("super x="+x);
}
}
class sub extends s_uper
{
	int y;
	sub(int x,int y)
{
	super(x);
	this.y=y;
}
void display( )
{
	System.out.println("super x="+x);
	System.out.println("sub y="+y);
}
}
public class overriding
{
public static void main(String[] args)
{
	sub s1=new sub(100,200);
	s1.display( );
}
}