package COM.AutomationPractice;

public class Encapsulationtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c=new Calculator();
		
		//c.a=10;
		//c.b=20;
		
		System.out.println(c.a);
		System.out.println(c.b);
		
		POJOClassEncapsulation PCE=new POJOClassEncapsulation();
		System.out.println(PCE.getA());
		System.out.println(PCE.getC());
		System.out.println(PCE.getS());
				
		PCE.setS("New string");
		PCE.setC("Automation");
		PCE.setA("MyName");
		
		System.out.println(PCE.getA());
		System.out.println(PCE.getC());
		System.out.println(PCE.getS());
		
	}

}
