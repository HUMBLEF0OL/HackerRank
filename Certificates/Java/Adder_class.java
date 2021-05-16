package src;
import java.util.*;
// here calculator will be another class that will hold the method of addition

class Adder extends Calculator{
	
	public int add(int a, int b)
	{
		return a+b;
	}
}

public class HR_adder_class {
	public static void main(String[] args) {
		int a,b;
		try(Scanner scan = new Scanner(System.in)){
			a = scan.nextInt();
			b = scan.nextInt();
		}
		// creating the object of the adder class using calculator class
		Calculator adderObject = new Adder();
		System.out.println("The sum is: "+adderObject.add(a,b));
		
	}
	
}
