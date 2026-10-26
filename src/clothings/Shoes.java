package clothings;

public class Shoes extends ClothingItems{
	
	public Shoes(String name, String category, String color,String condition) {
		super(name, category, color,condition);
	}
	
	@Override
	public void careSpecialist() {
		System.out.println("Sole repair, resoling, heel fixes, stitching, all go to a cobbler.");
	}

}
