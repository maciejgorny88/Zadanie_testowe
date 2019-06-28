import java.util.ArrayList;


public class Execute {

	public static void main(String[] args) throws Exception {
		
		LoadXML loadXML = new LoadXML("menu.xml");
		
		ArrayList<Food> menu = loadXML.GetMenu().getFoods();
		
		Printer printer = new Printer();
		printer.Print(menu);
		
		Tests tests = new Tests();
		tests.TestValues(menu);


	}

}
