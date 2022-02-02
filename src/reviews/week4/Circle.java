package reviews.week4;

public class Circle {

	// attributes will be radius
	//actions/methods: area(); , perimeter();
	
	double Pi= Math.PI;
	public double radius; //also variables can have accessModifier like methods
	
	public double area () {
		
		return radius*radius+Pi;
		
	}
	
	public double perimeter() {
		
		return 2*radius*Pi;
	}

	//toString() method
	
	public String toString() {
		return "Radius: "+radius+" Area: "+area()+", Perimeter: "+perimeter();
	}
	
	

}
