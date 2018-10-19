
public class SingletonAddition {

	private static SingletonAddition singleton_addition = new SingletonAddition();
	
	private SingletonAddition() {};
	
	public static SingletonAddition getInstance() {
		return singleton_addition;
	}
	
	protected void demoMethod() {
		System.out.println(4*4);
	}
}
