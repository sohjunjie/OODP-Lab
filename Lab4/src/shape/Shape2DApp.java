package shape;
import java.util.Scanner;

public class Shape2DApp {

    private static Scanner sc = new Scanner(System.in);
    private static Shape[] myShape = null;

    public static void main(String[] args){

    	int choice, numOfShape = 0;
        
        do {
            System.out.println("\nSelect a choice");
            System.out.println("(1) Define a new shape");
            System.out.println("(2) Calculate area of my shape");
            System.out.println("(3) Calculate volume of my shape");
            System.out.println("(4) Exit");
        	System.out.println();
        	System.out.print("    Enter the number of your choice: ");
            choice = sc.nextInt();
            
            if(choice >=2 && choice <=3)
        		if(myShape == null || myShape.length <= 0){
        			System.out.println("You must defined a shape first.");
        			continue;
        		}
            switch (choice) {
                case 1: // Define a list of shapes
	                    System.out.print("    Enter total number of shapes: ");
	                    numOfShape = sc.nextInt();
	                    myShape = generateShape(numOfShape);
                        break;
                case 2: // Calculate area of all the shapes
                		System.out.println("The area of your shape is " + calculateShapeArea(myShape));
                        break;
                case 3: // Show the list of customers with their seat numbers sorted by seat numbers
            		System.out.println("The volume of your shape is " + calculateShapeVolume(myShape));
                    break;
                case 4:
            }

        } while (choice < 4);

    }
    
    public static Shape[] generateShape(int numOfShape){

    	int choice;
    	Shape[] myShape = new Shape[numOfShape];
    	
    	for(int i=0; i<numOfShape; i++){
            System.out.println("\nWhat should shape" + (i+1) + " look like?");
            System.out.println("(1) Circle");
            System.out.println("(2) Triangle");
            System.out.println("(3) Rectangle");
            System.out.println("(4) Square");
            System.out.println("(5) I don't want any shape for shape" + (i+1));
            
            choice = sc.nextInt();
            switch (choice) {
            	case 1: // Show number of empty seats
            		myShape[i] = new Circle();
                    break;
            	case 2: // Show the list of empty seats
            		myShape[i] = new Triangle();
            		break;
            	case 3: // Show the list of customers with their seat numbers sorted by seat numbers
            		myShape[i] = new Rectangle();
            		break;
            	case 4:
            		myShape[i] = new Square();
            		break;
            	default:
            		myShape[i] = null;
            }
    	}		
    	
		return myShape;
    }
    
    public static double calculateShapeArea(Shape[] myShape){
    	double calculatedArea = 0;
    	for(Shape s : myShape)
    		if(s != null){
    			calculatedArea += s.getCalculatedArea();
    		}

    	return calculatedArea;
    }
    
    public static double calculateShapeVolume(Shape[] myShape){    	
    	double calculatedVolume = 0;
    	for(Shape s : myShape)
    		if(s != null)
    			calculatedVolume += s.getCalculatedVolume();
    	return calculatedVolume;
    }
    
}
