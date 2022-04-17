package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		long addition = calc.add(7, 9, 24);
		System.out.println("ADDITION: "+addition);
		
		int subtraction = calc.sub(98,70);
		System.out.println("SUBTRACTION: "+subtraction);
		
		double multiplication = calc.mul(34.345F, 56.987F);
		System.out.println("Multiplication: " +multiplication);
		
		float divide = calc.divide(34.567F, 56.78F);
		System.out.println("Division: "+divide);
	}

}
