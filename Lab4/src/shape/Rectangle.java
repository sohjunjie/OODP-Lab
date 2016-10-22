package shape;

import java.util.Scanner;

public class Rectangle extends Shape{

	private double length;
	private double width;
	private double height;
	private String shapeName;
	
	public Rectangle(){
		super();
		this.shapeName = this.numOfDimension + "DRectangle";
		Scanner sc = new Scanner(System.in);
		System.out.print("    Define this " + this.shapeName + " length: ");
		this.length = sc.nextDouble();		
		System.out.print("    Define this " + this.shapeName + " width: ");
		this.width = sc.nextDouble();
		
		if(this.numOfDimension == 3){
			System.out.print("    Define this " + this.shapeName + " height: ");
			this.height = sc.nextDouble();
		}
			
		
	}
	
	public double calculate2DArea() {
		return this.length * this.width;
	}

	@Override
	public double calculate3DArea() {
		return 2*(this.length * this.width) + 2*(this.length * this.height) + 2*(this.height * this.width);
	}

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
