package lambda.training;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class SimpleLambdaTest {

	public static void main(String[] args) {

//		new SimpleLambdaTest().sortStringArrayWithNormalComparator();		
//		new SimpleLambdaTest().sortStringArrayUsingLambdaInComparator();
		new SimpleLambdaTest().addValuesMethodReference();
		
	}
	
	private void sortStringArrayWithNormalComparator(){
		Comparator<String> comparate = new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(),s2.length());
			}
		};
		
		String[] stringArr = new String[]{"One", "T", "Three"};
		
		System.out.println(Arrays.toString(stringArr));
		Arrays.sort(stringArr, comparate);
		System.out.println(Arrays.toString(stringArr));		
	}

	private void sortStringArrayUsingLambdaInComparator(){
		Comparator<String> comparator = 
				(final String s1, final String s2) -> { 
					System.out.println("Compare strings");
					return Integer.compare(s1.length(),s2.length());					
				};
			
		String[] stringArr = new String[]{"One", "T", "Three"};
		
		System.out.println(Arrays.toString(stringArr));
		Arrays.sort(stringArr, comparator);
		System.out.println(Arrays.toString(stringArr));
		
	}
	
	private void addValuesMethodReference(){
		BinaryOperator<Integer> sum = (i1, i2) -> Integer.sum(i1, i2);
		
		System.out.println("Result : " + sum.apply(3,4));
	}

	
	
}
