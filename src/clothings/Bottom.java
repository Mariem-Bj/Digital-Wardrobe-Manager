package clothings;

public class Bottom extends ClothingItems {
	
	public Bottom(String name, String category, String color,String condition) {
		super(name,category,color, condition);
	}
	
	@Override
	public void careSpecialist() {
		System.out.println("Bottoms need to be regularly washed. Hem repairs, zipper fixes, or waist adjustments go to a tailor.");
		
	}

}
