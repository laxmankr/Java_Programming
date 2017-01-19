class Mathoperation{
static float mul(float x,float y)
{
	return(x*y);
}
static float devide(float  x,float y)
{
	return(x/y);
}
}
class Mathapp
{
public static void main(String args[]){
	float a=Mathoperation.mul(5,10);
	float b=Mathoperation.devide(5,10);
	System.out.println("mul a="+a+"\nadd b="+b);
}
}