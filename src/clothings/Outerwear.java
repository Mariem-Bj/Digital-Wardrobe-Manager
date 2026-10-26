package clothings;

public class Outerwear extends ClothingItems {
	
	public Outerwear(String name, String category, String color,String condition) {
		super(name, category,color, condition);
	}
    
	@Override
	public void careSpecialist() {
		System.out.println("Outerwear like jackets and coats need dry cleaning; zipper, lining, re-waterproofing or seam repairs go to a tailor");
	}
}
