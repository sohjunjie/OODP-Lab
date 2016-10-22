package shape;
import java.util.Scanner;

public class Circle extends Shape{
	
	private double radius;
	private String shapeName;
	
	public Circle(){
		super();
		this.shapeName = this.numOfDimension + "DCircle";
		Scanner sc = new Scanner(System.in);
		System.out.print("    Define this " + this.shapeName + " radius: ");
		this.radius = sc.nextDouble();
	}
	
	public double calculate2DArea() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public double calculate3DArea() {
		return 4 * Math.PI * this.radius * this.radius;
	}

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

}
