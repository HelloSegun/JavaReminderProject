
public class SingletonDemo {
	public static void main (String [] args) {
		Singleton tmp = Singleton.getInstance();
		ClassicSingleton tmp_2 = ClassicSingleton.getInstance();
		SingletonAddition tmp_3 = SingletonAddition.getInstance();
		tmp.demoMethod();
		tmp_2.demoMethod();
		tmp_3.demoMethod();
	}
}
