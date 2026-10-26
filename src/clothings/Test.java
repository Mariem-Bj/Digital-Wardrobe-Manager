package clothings;
import java.util.Scanner;
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		
	    ArrayList<ClothingItems> closet = new ArrayList<>();
	    Scanner scanner = new Scanner(System.in);
		boolean running = true;

		       while (running) {
		            System.out.println("\n1. Add item");
		            System.out.println("2. View closet");
		            System.out.println("3. Search");
		            System.out.println("4. Update condition");
		            System.out.println("5. Remove item");
		            System.out.println("6. Stats");
		            System.out.println("7. Get care recommendations");
		            System.out.println("8. Exit");
		            

		            String choice = scanner.nextLine();

		            switch (choice) {

		                case "1":
		                    System.out.println("Enter the name of the item:");
		                    String name = scanner.nextLine();
		                    System.out.println("Enter the category(Top, Bottom, Shoes, Outerwear(jackets, coats etc.)):");
		                    String category = scanner.nextLine();
		                    System.out.println("Enter the color:");
		                    String color = scanner.nextLine();
		                    System.out.println("Enter the condition, if it needs repair specify \"needs repair\":");
		                    String condition = scanner.nextLine();
		                    
		                    ClothingItems newItem= null;
		                    
		                    switch(category.trim().toLowerCase()) {
		                    
		                       case"top":
		                    	    newItem= new Top(name,category,color,condition);
		                        break;
		                        
		                       case"bottom":
		                    	    newItem= new Bottom(name,category,color,condition);
		                        break;
		                        
		                       case"shoes":
		                    	    newItem= new Shoes(name,category,color,condition);
		                        break;
		                      
		                       case"outerwear":
		                    	    newItem= new Outerwear(name,category,color,condition);
		                        break;
		                      
		                       default:
		                    	    System.out.println("Unknown type; item was not added.");
		                    }
		                    
		                   if(newItem !=null) {
		                    	  closet.add(newItem);
		                    }
		                 
		                   break;
		                 
 
		                case "2":
		                    System.out.println("Here's your digital closet:");
		                    for (ClothingItems item : closet) {
		                        System.out.println(item);
		                    }
		                    break;

		                case "3":
		                    System.out.println("Search by category or color?");
		                    String searchType = scanner.nextLine();
		                    System.out.println("Enter the value:");
		                    String searchValue = scanner.nextLine();

		                    boolean matchFound = false;
		                    for (ClothingItems item : closet) {
		                        if (searchType.equalsIgnoreCase("category") && item.getCategory().equalsIgnoreCase(searchValue)) {
		                            System.out.println(item);
		                            matchFound = true;
		                        } else if (searchType.equalsIgnoreCase("color") && item.getColor().equalsIgnoreCase(searchValue)) {
		                            System.out.println(item);
		                            matchFound = true;
		                        }
		                    }
		                    if (!matchFound) {
		                        System.out.println("No items matched your search.");
		                    }
		                    break;

		                case "4":
		                    boolean found = false;
		                    while (!found) {
		                        System.out.println("Enter the name of the item to update:");
		                        String targetItem = scanner.nextLine();
		                        System.out.println("Enter its new condition:");
		                        String newCondition = scanner.nextLine();

		                        for (ClothingItems item : closet) {
		                            if (targetItem.equalsIgnoreCase(item.getName())) {
		                                item.setCondition(newCondition);
		                                found = true;
		                                System.out.println(item);
		                            }
		                        }
		                        if (!found) {
		                            System.out.println("The wanted item does not exist. Try again.");
		                        }
		                    }
		                    break;

		                case "5":
		                    System.out.println("Enter the name of the item to remove:");
		                    String removeName = scanner.nextLine();

		                    ClothingItems toRemove = null;
		                    for (ClothingItems item : closet) {
		                        if (removeName.equalsIgnoreCase(item.getName())) {
		                            toRemove = item;
		                        }
		                    }
		                    if (toRemove != null) {
		                        closet.remove(toRemove);
		                        System.out.println("Removed.");
		                    } else {
		                        System.out.println("Item not found.");
		                    }
		                    break;

		                case "6":
		                    System.out.println("Total items: " + closet.size());

		                    int repairCount = 0;
		                    for (ClothingItems item : closet) {
		                        if (item.getCondition().equalsIgnoreCase("needs repair")) {
		                            repairCount++;
		                        }
		                    }
		                    System.out.println(repairCount + " item(s) need repair.");

		                    ArrayList<String> countedCategories = new ArrayList<>();
		                    for (ClothingItems item : closet) {
		                        String cat = item.getCategory();
		                        if (!countedCategories.contains(cat)) {
		                            int categoryCount = 0;
		                            for (ClothingItems item2 : closet) {
		                                if (item2.getCategory().equalsIgnoreCase(cat)) {
		                                    categoryCount++;
		                                }
		                            }
		                            System.out.println(cat + ": " + categoryCount);
		                            countedCategories.add(cat);
		                        }
		                    }
		                    break;
		                    
		                case"7":
		                	    boolean found7=false;
		                    System.out.println("Enter the item's name");
		                    String garmentName=scanner.nextLine();
		                    
		                    for (ClothingItems item : closet) {
		                    	
		                    	   if(garmentName.equalsIgnoreCase(item.getName())) {
		                    		  item.careSpecialist();   
		                    		  found7=true;
		                    	   }
		                    	
		                    }
		                    if(!found7) {
		                    	 System.out.println("Item not found.");
		                    }
		                    break;
		                 
		                    
		                case "8":
		                    running = false;
		                    System.out.println("Goodbye!");
		                    break;

		                default:
		                    System.out.println("Invalid option.");
		            }
		        }

		        scanner.close();
		    }
		
        
    }    
     
 
	
