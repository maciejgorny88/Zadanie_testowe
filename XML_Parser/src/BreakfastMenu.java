import java.util.ArrayList;
import javax.xml.bind.annotation.*;


@XmlRootElement(name="breakfast_menu")
@XmlAccessorType(XmlAccessType.FIELD)


public class BreakfastMenu {
	
	@XmlElement(name="food")
	private ArrayList<Food> foodsList;
	
	public ArrayList<Food> getFoods() {
		return foodsList;
	}
	
	public void setBreakfastMenu(ArrayList<Food> foodsList) {
		this.foodsList = foodsList;
	}

}
