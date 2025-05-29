package sample;
import java.util.Scanner;
abstract class Area{
	Scanner sc = new Scanner(System.in);
	double area;
	abstract void Collectdata();
	abstract void Calculatedata();
	void display() {
		System.out.println(area);
		}
}

class Square extends Area{
	double side;
	void Collectdata() {
		System.out.println("Enter side:");
		 side = sc.nextDouble();
	}
	
	void Calculatedata() {
		area = side*side;
	}
}

class Circle extends Area{
	final double pi = 3.14;
	double radius;
	void Collectdata() {
		System.out.println("Enter radius:");
		 radius = sc.nextDouble();
	}
	
	void Calculatedata() {
		area = pi*radius*radius;
	}
}

class Triangle extends Area{
	double base, height;
	void Collectdata() {
		System.out.println("Enter base:");
		 base = sc.nextDouble();
		System.out.println("Enter height:");
		 height = sc.nextDouble();
	}
	
	void Calculatedata() {
		area = (0.5)*base*height;
	}
}



public class Abstract_Area {

	public static void main(String[] args) {
		Square S = new Square ();
		S.Collectdata();
		S.Calculatedata();
		S.display();
		
		Circle C = new Circle();
		C.Collectdata();
		C.Calculatedata();
		C.display();
		
		Triangle T = new Triangle ();
		T.Collectdata();
		T.Calculatedata();
		T.display();
	}

}
