package FP01;

import java.util.List;
import java.util.function.Consumer;

public class IntroductionToFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li=List.of(15,18,4,5,1,3,1,2,3);
		
		System.out.println("the numbers are");
		printNumbers(li) ;
		System.out.println("\nthe numbers are");
		printEvenNumbers(li);
		System.out.println("\nsum of numbers " +sumOfNumbers(li));
		System.out.println("\nSquare of numbers are");
		printSquareofNumber(li);
		System.out.println("\nnumbers in ascending order are");
		printDistinctNumbersInAscendingOrder(li);

		

	}

	private static void printDistinctNumbersInAscendingOrder(List<Integer> li) {
		// TODO Auto-generated method stub
		li.stream()
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
	}

	private static void printSquareofNumber(List<Integer> li) {
		// TODO Auto-generated method stub
		li.stream()
		.map(x->x+" "+x*x)
		.forEach(System.out::println);
	}

	private static int sumOfNumbers(List<Integer> li) {
		// TODO Auto-generated method stub
		return li.stream()
			   .reduce(0, (x,y)->x+y);
	}

	private static void printEvenNumbers(List<Integer> li) {
		// TODO Auto-generated method stub
		li.stream()
		.filter(x->x%2==0)
		.map(x->x+" ")
		.forEach(System.out ::print);
		
	}

	private static void printNumbers(List<Integer> li) {
		// TODO Auto-generated method stub
		
		li.stream()
		.map(x->x+" ")
		.forEach(System.out:: print);
	}

}
