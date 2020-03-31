package chapter11;

public class BuilderMaker {
	public static void main(String[] args)
	{
		StringBuilder num= new StringBuilder("990925-1012999");
		num.replace(5, 7," ");
		System.out.println(num.toString());
	}
}
 