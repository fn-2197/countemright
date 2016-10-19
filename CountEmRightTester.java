package gamesnstuff;

import java.util.Scanner;

public class CountEmRightTester {

	public static void main(String[] args) {
		for(int a = 1; a != 0; a++){
			Scanner kb = new Scanner(System.in);
			System.out.println("Type in a sentance and press ENTER");
			String in = kb.nextLine();
			if(in.equals("EXIT")){
				break;
			}
			String sp[];
			in += "STOP";
			in = in.toUpperCase();
			sp = in.split("S\\s+A|SA");
			System.out.println("The number of times some varient of \"S\" followed by \"A\" in that sentance is: " + (sp.length - 1));
		}
	System.out.println("Shutting down");
	}
	
}
