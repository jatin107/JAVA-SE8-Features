package lambda;

public class UseSimpleInterface {

	public static void main(String[] args) {
		
		SimpleInterface obj=()->{System.out.println("test");};
		obj.doSomething();
		
	}

}
