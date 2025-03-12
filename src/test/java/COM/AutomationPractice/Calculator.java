package COM.AutomationPractice;

public class Calculator implements MathAlgorithm {
	int a=4;
	int b=5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculator cal=new Calculator();
		
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
		
		
		
	}

	@Override
	public  void add() {
		// TODO Auto-generated method stub
		
		
		System.out.println(a+b);
		
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println(a-b);	
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println(a/b);
	}

}
