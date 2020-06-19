package java_assignment_4;

public class Devanshi_java_assignment_5 {
	
	static boolean powerTwo(int n)
	{
		if(n==0)
			return false;
		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == (int)(Math.floor((Math.log(n) / Math.log(2))));
	}
	
	public static void main(String[] args)
	{
		if(powerTwo(31))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		if(powerTwo(64))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
