
import java.util.Scanner;

public class NumCal {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a, b, c;
	System.out.println("Enter 1st number");
	a = sc.nextInt();
	System.out.println("Enter 2ed number");
	b = sc.nextInt();
	System.out.println("Enter 3ed number");
	c = sc.nextInt();
	
	int sum = a+b+c;
	System.out.println("sum of numbers are " + sum);
	System.out.println("sum of numbers are " + sum);
	System.out.println("avg of numbers are " + sum/3);
	System.out.println("avg of numbers are " + sum/3);
	
	
	
	sc.close();
}
}

