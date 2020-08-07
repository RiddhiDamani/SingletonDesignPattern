
public class SingletonDemo {
	
	//static member holds only one instance of the Singleton class
	private static SingletonDemo singletonInstance;
	
	//SingletonExample prevents any other class from instantiating
	private SingletonDemo() {
		
	}
	
	//Providing global point of access
	public static SingletonDemo getSingletonInstance() {
		if( null == singletonInstance) {
			singletonInstance = new SingletonDemo();
			System.out.println("Inside null check, Object is created : " + singletonInstance.toString());
			System.out.println("-------------------------------------------------------");
		}
		return singletonInstance;
	}
	
	public void printSingleton() {
		System.out.println("Inside Print singleton object : " + singletonInstance.toString());
		System.out.println("");
	}
	
}
