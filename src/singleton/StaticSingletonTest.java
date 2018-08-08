package singleton;

public class StaticSingletonTest {

	
	public static void main(String[] args) {
		StaticBlockSingleton.getInstance().function();
		callSomeFunction();
	}

	private static void callSomeFunction() {
		StaticBlockSingleton.getInstance().function();		
	}
	
	//only one instance of the class was created
}
