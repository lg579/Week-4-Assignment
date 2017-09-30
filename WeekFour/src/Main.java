import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter integer one: ");
		int first =scan.nextInt();
		//System.out.println();
		
		System.out.print("Enter integer two: ");
		int second =scan.nextInt();
		int sum = FunWithMath.Sum(first,second);
		System.out.println("The sum is: " +sum);
		
		int difference = FunWithMath.Difference(first,second);
		System.out.println("The difference is: " +difference);
		
		int product = FunWithMath.Product(first,second);
		System.out.println("The product is: "+product);
		
		System.out.print("Enter number of gallons: ");
		int gallons =scan.nextInt();
		
		
		System.out.print("Enter price per gallon: ");
		double price =scan.nextDouble();
		
		double total = GasCalculator.GasCalculator(gallons,price);
		System.out.println("The cost to fill up the tank is: "+total);
			
		System.out.print("Enter a measurement in meters: ");
		int meters =scan.nextInt();
		
		System.out.println(FunWithMath.Converter(meters));
		
	}

	
}
