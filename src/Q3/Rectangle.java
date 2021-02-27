package Q3;

public class Rectangle {
	int length;
	int breath;
	
	public Rectangle(int length,int breath){
		this.length = length;
		this.breath = breath;
	}
	public int area(){
		return length *breath;
	}
	
	public static void main(String[] args) {
		// Area of triangle with sides (4,5)
		Rectangle rectangle = new Rectangle(4,5);
		System.out.println("The area of rectangle with length "+rectangle.length+ " and breath "+ rectangle.breath+" is "+rectangle.area());
		
		// Area of triangle with sides (4,5)
		Rectangle rectangle2 = new Rectangle(5,8);
		System.out.println("The area of rectangle with length "+rectangle2.length+ " and breath "+ rectangle2.breath+" is "+rectangle2.area());	
	}

}
