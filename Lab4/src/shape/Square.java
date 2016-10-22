package shape;

import java.util.Scanner;

public class Square extends Shape{
	
	private double length;
	private String shapeName;
	
	public Square(){
		super();
		this.shapeName = this.numOfDimension + "DSquare";
		Scanner sc = new Scanner(System.in);
		System.out.print("    Define this " + this.shapeName + " length: ");
		this.length = sc.nextDouble();
	}
	
	@Override
	public double calculate2DArea() {
		return this.length * this.length;
	}

	@Override
	public double calculate3DArea() {
		return calculate2DArea() * this.length;
	}

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
