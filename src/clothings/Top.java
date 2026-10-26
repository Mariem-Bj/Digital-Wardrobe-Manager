package clothings;

public class Top extends ClothingItems {
	
	    public Top(String name, String category, String color,String condition) {
          	super(name,category,color,condition);	
        }
	    
	    @Override
        public void careSpecialist() {
        	    	       System.out.println("Tops need to be regularly washed. Minor tears or loose seams go to a tailor for stitching.");
        	      
        }

		
}
        
      
