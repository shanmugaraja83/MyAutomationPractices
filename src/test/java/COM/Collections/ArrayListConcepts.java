package COM.Collections;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> AL = new ArrayList<String>();
		AL.add("Test Name");
		AL.add("Somu");
		AL.add("Shan");
		AL.add("Somu");
		AL.add("Somu");

		String str = "shanmuga";

	/*	for (int i = 0; i < AL.size(); i++) {
			if (AL.get(i).equals("Somu")) {
				System.out.println(AL.get(i));
			}
		}*/

		//System.out.println(str);
		for (int i = 0; i < AL.size(); i++) {
			
				System.out.println(AL.get(i));
			
		}
	}

}
