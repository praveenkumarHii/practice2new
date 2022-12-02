package Com.la.Polymorphism;

public class Bmw extends Car implements UpComing { //,Interface used in this place 
	//Multienheritance does not used in java 

	@Override
	public void engineSecret() {
		System.out.println("Bmw engine secret");

	}
	@Override
	public void CompanyValut() {
		System.out.println("bmw company valut");
		
	}

	public static void main(String[] args) {
		Car c =new Bmw();
		c.engineSecret();
		c.CompanyValut();
		

	}
	@Override
	public void method1() {
		System.out.println("this method1");
	}
	@Override
	public void metho2() {
		System.out.println("this methd2");
	}

}
