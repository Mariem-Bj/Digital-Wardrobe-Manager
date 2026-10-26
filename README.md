Digital Wardrobe Manager 

This digital wardrobe manager is a console app coded using Java programming language. It allows the user to manage the items they have, flag what needs repair, get care recommendations, and more. It is inspired by the digital wardrobe concept. 

Features: 

-Add, view, search (by category or color), remove an item. 

-Update an item's condition and flag whether it needs repair or not. 

-Summary stats: total number of items, items needing repair, items per category.

-Get care recommendations for each garment type. 


How to run: 

-Requires Java 21 or later. 

-Download or clone this repository. 

-In Eclipse: File > Import > Existing Projects in Workspace, and select the folder. 

-Run "Test.java". 


Design Notes: 

-"Clothing Items" is an abstract base class holding shared data (name, category, condition, and color) and the corresponding getters and setters. 

-"Top", "Bottom", "Outerwear" and "Shoes" are subclasses that implement the class "Clothing Items", overriding the method "careSpecialist" with the right care for each type of garment. 

-All items are stored in one ArrayList : ArrayList <ClothingItems>. 


Possible improvements: 

-Save and load the wardrobe from a file. 

-Graphical Interface (in progress). 

-Booking system for repair services. 