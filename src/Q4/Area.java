package Q4;

import java.util.Scanner;

public class Area {

	int length;
	int breath;
	
	public Area(int length,int breath){
		this.length = length;
		this.breath = breath;
	}
	public int returnArea(){
		return length *breath;
	}
	
	public static void main(String[] args) {
		// Area of triangle with sides (4,5)
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		int length = input.nextInt();
		System.out.println("Enter breath of rectangle: ");
		int breath = input.nextInt();
		Area rectangle = new Area(length,breath);
		System.out.println("The area of rectangle with length "+rectangle.length+ " and breath "+ rectangle.breath+" is "+rectangle.returnArea());
		input.close();
	}

}
