package java_assignment_3;

public class Devanshi_java_assignment_3 {

private static void GreatestInArray(int[] a, int k) {

		

		int lastGreatestNum = a[0], currentNum;

		

		for(int i =0; i<a.length; i++) {

			

			if(a[i]<k) {

				

				currentNum = a[i];

				

				if(lastGreatestNum <= currentNum) {

					lastGreatestNum = currentNum;

				}
				else {	

					if(lastGreatestNum == k) {

						lastGreatestNum = currentNum;

					}					

				}

			}

		}

		System.out.println("The the gratest number that is smaller than "+k+" is "+lastGreatestNum+".");

	}

public static void main(String[] args)
{

      int[] c = new int[] {3,5,7,2,3,10,99,44};
      int k =52;
      GreatestInArray(c,k);
}
}
