class Point
{
	int xPos,yPos;
	public Point(int x, int y)
	{
		xPos=x;
		yPos=y;
	}
	public void showPointInfo()
	{
		System.out.println("[" + xPos + "," + yPos + "]");
	}
}

class Circle
{
	int x,y,r;
	public Circle(int x , int y, int r)
	{
		this.x=x;
		this.y=y;
		this.r=r;
		
	}
	
	public void showPointInfo()
	{
		System.out.println("[" + x + "," + y + "]"+", 반지름은 "+r+"입니다.");
	}
	
}
public class CircleMaker {
	public static void main(String[] args)
	{
		Circle c= new Circle(2,2,4);
		c.showPointInfo();
	}
}
