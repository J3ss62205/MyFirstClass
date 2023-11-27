/**
 * 
 */
package cs141.jlhenry2;

/**
 * @author jlhenry2
 *
 */
public class Rectangle {
	
	private double width = 0; 
	private double height = 0;
	public static int count = 0; 
	
	
	Rectangle() {
		this.width = 1;
		this.height = 1;
		//System.out.println("I am alive!");
		count++;
	}
	
	public Rectangle (double height, double width) {
		this.width = width;
		this.height = height;
		count++;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public static int getCount() {
		return count;
	}
	public double getArea() {
		return this.width * this.height;
	}
	public double getPerimeter() {
		return 2*(this.height + this.width);
	}

}
