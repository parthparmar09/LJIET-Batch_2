package day1;
import java.util.Scanner;

class Circle {
	static final float PI = 3.14f;
	static Scanner sc = new Scanner(System.in);
	float radius ,area , circumference;
	
	public void setData() {
		System.out.println("Enter the radius :");
		this.radius = sc.nextFloat();
		
		this.area = PI * this.radius * this.radius;
		this.circumference = 2 * PI * this.radius;
	}
	
	public void getData() {
		System.out.println("The radius is :" + this.radius);
		System.out.println("The area is :" + this.area);
		System.out.println("The circumference is :" + this.circumference);
	}
}
