package COM.AutomationPractice;

public class ReturnTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReturnTypes RT=new ReturnTypes();
		RT.add();
		int s=RT.addReturn(30,20);
		System.out.println(s);
		
		
		String str=RT.Returnstring("shanmuga");
		System.out.println(str);
		
				
	}

public void add()
{
	
int a=10;
int b=20;

System.out.println(a+b);



}
	
public int addReturn(int a, int b)
{
	int c=a+b;
	return c;
	


}

public String Returnstring(String SS)
{
	
	return SS+" "+ " Is a Java Programmer" ;
	


}

	
}
