
public class ExplicitConversion {
	
	float int_to_f;
	int float_to_i;

	public static void main (String[] args) {
		ExplicitConversion conv = new ExplicitConversion();
		conv.explicitConversion(456.97f, 45);
		conv.explicitConversionResult();
	}
	
	public void explicitConversion (float f, int i) {
		float_to_i = (int)f;
		int_to_f = (float)i;
	}
	
	public void explicitConversionResult() {
		System.out.println(float_to_i);
		System.out.println(int_to_f);
	}
}
