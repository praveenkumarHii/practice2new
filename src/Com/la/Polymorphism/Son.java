package Com.la.Polymorphism;

public class Son extends Parents {
	@Override
	public void Marriage() {
		System.out.println("my marriage my rule");
	}

	public static void main(String[] args) {
               Parents Parents=new Son();
               Parents.Properties();
               Parents.Marriage();
	}

}
