package chapter11;

public class StringMaker {
	public static void main(String[] args)
	{
		String Num="990925-1012999";
		String Front=Num.substring(0, 6);
		String Back=Num.substring(7, 14);
		System.out.println(Front+" "+Back);
	}
}
