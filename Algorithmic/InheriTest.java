class Room
{
	int length;
	int breadth;
Room(int x,int y)
{
	length=x;
	breadth=y;
}
int area()
{
	return(length*breadth);
}
}
class BedRoom extends Room
{
	int hight;
BedRoom(int x,int y,int z)
{
	super(x,y);
	hight=z;
}
int volume()
{
	return(length*breadth*hight);
}
}
class InheriTest
{
public static void main(String[] args)
{
	BedRoom room1=new BedRoom(15,10,100);
	int v=room1.volume();
	int ar=room1.area();
	System.out.println("volume v="+v+"\narea ar="+ar); 
}
}