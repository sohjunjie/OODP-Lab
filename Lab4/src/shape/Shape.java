package shape;
import java.util.Scanner;

public abstract class Shape {

	public int numOfDimension;
	
	public Shape(){
		Scanner sc = new Scanner(System.in);
		System.out.print("    Define the dimension of the shape (2~3): ");
		this.numOfDimension = sc.nextInt();
	}
	
	public double getCalculatedArea(){
		if(this.numOfDimension == 2)
			return this.calculate2DArea();
		if(this.numOfDimension == 3)
			return this.calculate3DArea();
		return 0;
	}

	public double getCalculatedVolume(){
		return this.calculateVolume();
	}

	public abstract double calculate2DArea();
	public abstract double calculate3DArea();
	
	public abstract double calculateVolume();
	
}

