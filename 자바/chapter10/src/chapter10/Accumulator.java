package chapter10;

public class Accumulator {
	int sum=0;
	public void add(int i)
	{
		sum+=i;
	}
	public void showInfo()
	{
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Accumulator a= new Accumulator();
		for(int i=0;i<10;i++)
			a.add(i);
		a.showInfo();
	}
}
 