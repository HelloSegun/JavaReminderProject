
public class RectangleApplication {
	
	double length;
	double width;

	public static void main(String[] args) {
		// Calculate the area of the Rectangle
		RectangleApplication rec = new RectangleApplication();
		rec.values(10.56, 5.35);
		System.out.println("Area of the Rectangle" + "\n" + "Length of Rectangle: " + rec.length + "\n" + "Width of Rectangle: " + rec.width);
		System.out.println(rec.GetArea());
	}
	
	public void values(double len, double wid) {
		this.length = len;
		this.width = wid;
	}
	
	public double GetArea() {
		return length * width;
	}

}
