package ass_4;

import java.util.Scanner;

public class Devanshi_java_assignment_4 {

	public static void main(String []str) {
		 int a,b;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter value of a: ");
		 a = sc.nextInt();
		 System.out.print("Enter value of b: ");
		 b = sc.nextInt();
		 
		 System.out.print("Before swapping a:" +a + ",b: " +b);
		 a= a+b;
		 b= a-b;
		 a=a-b;
		 System.out.println("after swapping a:" +a +", b:"+b);

	}

}
