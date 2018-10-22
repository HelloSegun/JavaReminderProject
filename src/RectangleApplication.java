
public class RectangleApplication {
	
	double length;
	double width;

	public static void main(String[] args) {
		// Calculate the area of the Rectangle
		RectangleApplication rec = new RectangleApplication();
		rec.values(10.56, 5.35);
		rec.Display();
	}
	
	public void values(double len, double wid) {
		this.length = len;
		this.width = wid;
	}
	
	public double GetArea() {
		return length * width;
	}
	
	public void Display() {
		System.out.println("Length of Rectangle: " + length);
		System.out.println("Width of Rectangle: " + width);
		System.out.println("Area of the Rectangle: " + GetArea());
	}

}
