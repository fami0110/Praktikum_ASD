import java.util.TreeSet;

public class TreeSetDemo14 {
	public static void main(String[] args) {
		TreeSet<String> fruits = new TreeSet<>();
		
		fruits.add("Mangga");
		fruits.add("Apel");
		fruits.add("Jeruk");
		fruits.add("Jambu");

		System.out.println("First: " + fruits.first());
		System.out.println("Last: " + fruits.last());
		
		for (String temp : fruits) {
			System.out.println(temp);
		}
		
		fruits.remove("Jeruk");
		System.out.println("Setelah remove " + fruits);

		fruits.pollFirst();
		System.out.println("Setelah poll first " + fruits);

		fruits.pollLast();
		System.out.println("Setelah poll last " + fruits);
	}
}
