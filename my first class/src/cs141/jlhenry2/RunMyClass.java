/**
 * 
 */
package cs141.jlhenry2;

/**
 * @author jlhenry2
 *
 */
public class RunMyClass {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle1 = new Rectangle(10,10); 
		//rectangle.setHeight(22);
		
		System.out.printf("Rectangle Height: %4.2f \n", rectangle1.getHeight());
		System.out.printf("Area for Rectangle1: %4.2f \n", rectangle1.getArea());
		System.out.printf("Perimeter for Rectangle1: %4.2f \n", rectangle1.getPerimeter());
		System.out.printf("Number of rectangles: %d \n", Rectangle.getCount());
		
		Rectangle rectangle2 = new Rectangle(20,30); 
		
		System.out.printf("Rectangle2 Height: %4.2f \n", rectangle2.getHeight());
		System.out.printf("Area for Rectangle2: %4.2f \n", rectangle2.getArea());
		System.out.printf("Perimeter for Rectangle2: %4.2f \n", rectangle2.getPerimeter());
		System.out.printf("Number of rectangles: %d \n", Rectangle.getCount());

		
		Rectangle rectangle3 = new Rectangle(); 
		
		System.out.printf("Rectangle3 Height: %4.2f \n", rectangle3.getHeight());
		System.out.printf("Area for Rectangle3: %4.2f \n", rectangle3.getArea());
		System.out.printf("Perimeter for Rectangle3: %4.2f \n", rectangle1.getPerimeter());
		System.out.printf("Number of rectangles: %d \n", Rectangle.getCount());

		rectangle3.setHeight(22);
		System.out.printf("Area for Rectangle3: %4.2f \n", rectangle3.getArea());

	}

}
