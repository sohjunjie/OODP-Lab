package shape;

import java.util.Scanner;

public class Triangle extends Shape{

	private double base[];
	private double height[];
	private String shapeName;
	private int numOfSides;
	
	public Triangle(){
		super();
		this.shapeName = this.numOfDimension + "DTriangle";
		
		Scanner sc = new Scanner(System.in);
		if(this.numOfDimension == 3){
			System.out.print("    Define number of sides this " + this.shapeName + " has: ");
			this.numOfSides = sc.nextInt();
		}else{
			this.numOfSides = 1;
		}
		
		base = new double[this.numOfSides];
		height = new double[this.numOfSides];
		
		for(int i=0; i<this.numOfSides; i++){
			System.out.print("    Define this " + this.shapeName + " height (" + (i+1) + "): ");
			this.height[i] = sc.nextDouble();
			System.out.print("    Define this " + this.shapeName + " base (" + (i+1) + "): ");
			this.base[i] = sc.nextDouble();
		}

		
	}
	
	@Override
	public double calculate2DArea() {
		return calculate3DArea();
	}

	@Override
	public double calculate3DArea() {
		double area = 0;	
		for(int i=0; i<this.numOfSides; i++){
			area += (0.5 * this.height[i] * this.base[i]);
		}		
		return area;
	}

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
