package Q5;

public class Complex{

	  //for real and imaginary parts of complex numbers
	  double real, img;

	  //constructor to initialize the complex number

	  Complex(double r, double i){

	this.real = r;

	this.img = i;

	  }

	 

	  public static Complex sum(Complex a, Complex b)

	  {

	//creating a temporary complex number to hold the sum of two numbers

	      Complex number = new Complex(0, 0);

	      number.real = a.real + b.real;

	      number.img = a.img + b.img;

	       //returning the output complex number

	       return number;

	   }
	  public static Complex difference(Complex a, Complex b)

	  {

	//creating a temporary complex number to hold the sum of two numbers

	      Complex number = new Complex(0, 0);

	      number.real = a.real - b.real;

	      number.img = a.img - b.img;

	       //returning the output complex number

	       return number;

	   }
	  
	  public static Complex product(Complex a, Complex b)
	  {
	       return new Complex(a.real*b.real,a.img*b.img);
	   }
	  
	   public static void main(String args[]) {

	Complex c1 = new Complex(7.8, 4.8);

	Complex c2 = new Complex(5.2, 1.5);

	       Complex temp = sum(c1, c2);

	       System.out.println("The sum is: "+ temp.real+" + "+ temp.img +"i");
	       
	       //print the difference
	       Complex temp1 = difference(c1, c2);

	       System.out.println("The differece is: "+ temp1.real+" + "+ temp1.img +"i");
	       
	       //print the product
	       Complex temp2 = product(c1, c2);

	       System.out.printf("product is: "+ temp2.real+" + "+ temp2.img +"i");

	   }

	}
