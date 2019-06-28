import java.util.ArrayList;


public class Tests {
	
	public void TestValues(ArrayList<Food> menu) {
		boolean TestPassed = true;
		
		//First test
		System.out.println("================================================================ \n");
		System.out.println("Test Results \n");
		System.out.println("Test 1\n");
		System.out.println("Is first element name equal 'Belgian Waffles'?");
		if (menu.get(0).name.equals("Belgian Waffles")) {
		
			System.out.println("Yes it is! The name is indeed '" + menu.get(0).name + "'.");
		}
		else {
			System.out.println("No, it's not! The name is: " + menu.get(0).name);	
			System.out.println("DIF test Failed");
			TestPassed = false;
			
		}
		
		//Second Test
		System.out.println("\nTest 2\n");
		System.out.println("Is third element price equal '$1.95'?");
		if (menu.get(2).price.equals("$1.95")) {
		
			System.out.println("Yes it is! The price is: " + menu.get(2).price);
		}
		else {
			System.out.println("No, it's not! The price is: " + menu.get(2).price + ".");	
			System.out.println("DIF test Failed");
			TestPassed = false;
		}
		
		//Third Test
		System.out.println("\nTest 3\n");
		System.out.println("Is there 'French Toast' available in the menue?");
		boolean frenchToastAvailable = false;
		for (Food food: menu ) {
			if (food.name.equals("French Toast")) {
				System.out.println("Yes, " + food.name + " is in the menu!");
				frenchToastAvailable = true;
			}
		}
		if (!frenchToastAvailable) {
			System.out.println("No, French Toast is not in the menu!");
			System.out.println("DIF test Failed");
			TestPassed = false;
		}
		
		//Fourth test
		System.out.println("\nTest 4\n");
		System.out.println("Is there 'English Breakfast' available in the menu?");
		boolean englishBreakfastAvailable = false;
		for (Food food: menu ) {
			if (food.name.equals("English Breakfast")) {
				System.out.println("Yes, " + food.name + "is in the menu!");
				englishBreakfastAvailable = true;
			}
		}
		if (!englishBreakfastAvailable) {
			System.out.println("No, English Breakfast is not in the menu!");
			System.out.println("DIF test Failed");
			TestPassed = false;
		}
		
		if (TestPassed == true) {
		System.out.println("\n Tests result is PASSED");
				} 
			else { 
				System.out.println("\n Tests result is FAILED");
		}		
				
}

}
