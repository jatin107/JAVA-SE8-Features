package lambda;

public class UseSimpleInterface {

	public static void main(String[] args) {

		System.out.println("ok");
		SimpleInterface obj=()->{System.out.println("test");};
		obj.doSomething();
		SimpleInterfacewithArgs obj1=(v1,v2)->{System.out.println(v1*v2);};
		obj1.calculate(2, 3);
		
	}

}
