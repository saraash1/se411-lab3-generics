package SE411.edu;
import java.util.List;

public class App {
	
        // for exercise 3
	    // 1
	    public static void printList(List<?> list) {
	        for (Object item : list) {
	            System.out.println(item);
	        }
	    }

	    // 2
	    public static double sumNumbers(List<? extends Number> list) {
	        double sum = 0.0;
	        for (Number n : list) {
	            sum += n.doubleValue();
	        }
	        return sum;
	    }

	 

	public static void main(String[] args) {
	
		// for exercise 1
		String[] words = {"Hello", "SE411", "Generics"};
		PrintableList<String> stringList = new PrintableList<>(words);
		stringList.printItems();

		Integer[] nums = {10, 20, 30};
		PrintableList<Integer> intList = new PrintableList<>(nums);
		intList.printItems();
		
		
		// for exercise 2
		NumberBox<Integer> intBox = new NumberBox<>();
		intBox.setItem(10);
		System.out.println("Integer item: " + intBox.getItem());
		System.out.println("Sum: " + intBox.add(5));

		NumberBox<Double> doubleBox = new NumberBox<>();
		doubleBox.setItem(2.5);
		System.out.println("Double item: " + doubleBox.getItem());
		System.out.println("Sum: " + doubleBox.add(1.5));
  
		// for exercise 3 (testing)
		List<String> names = List.of("Sara", "Noura", "Lubna");
		System.out.println("printList output:");
		printList(names);

		List<Integer> numbers = List.of(1, 2, 3, 4);
		System.out.println("sumNumbers output:");
		System.out.println(sumNumbers(numbers));


	}
}
