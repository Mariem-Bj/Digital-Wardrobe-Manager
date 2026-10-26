package clothings;

public abstract class ClothingItems {
	
	private String name;
	private String category;
	private String color;
	private String condition;
	
	public ClothingItems(String name, String category, String color,String condition){
		this.name=name;
		this.category=category;
		this.color=color;
		this.condition=condition;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getCondition() {
		return condition;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setCategory(String category) {
		this.category=category;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public void setCondition(String condition) {
		this.condition=condition;
	}
	
	@Override 
	public String toString() {
		return "Name: " +name+ "\nCategory: " +category+ "\nColor: " +color+ "\nCondition: " +condition;
				
	}
	
	public abstract void careSpecialist ();

	
	

}
