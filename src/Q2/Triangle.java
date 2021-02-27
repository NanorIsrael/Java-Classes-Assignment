package Q2;

public class Triangle {
	
	public double areaOfTriangle(int base,int height){
		
		return 0.5 *base *height;
	}
	
	public double perimeterOfTriangle(int side1,int side2,int side3){
		return side1+side2+side3;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		
		// Area of triangle with side 3 assuming is an right triangle
		System.out.println("the area of triangle with sides 3,4,5 is: "+ triangle.areaOfTriangle(3, 4));

		
		// Perimeter of triangle with side 3 assuming is an right triangle
		System.out.println("the perimeter of triangle with sides 3,4,5 is: "+ triangle.perimeterOfTriangle(3, 4, 5));

	}

}
