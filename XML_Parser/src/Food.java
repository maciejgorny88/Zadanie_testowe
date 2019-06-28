import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)

public class Food {
	String name;
	String price;
	String description;
	int calories;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	@Override
	public String toString() {
		return "/n" + "Food: name= " + name + " price= " + price + " description= " + description + 
				" calories= " + calories + "\n";
	}


}
