import java.util.List;


public class Printer {
	public void Print(List<Food> menu) {
	int index=1;
	System.out.println("Printing of XML File: \n");
	for (Food food : menu) {
		System.out.println("Menu position: " + String.valueOf(index++));
		System.out.println(food.name + " - " + food.description);
		System.out.println("Calories: " + food.calories);
		System.out.println("Price: " + food.price + "\n");
		
	}
	}

}
