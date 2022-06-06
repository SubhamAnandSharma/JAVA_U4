package week3.eval;

import java.util.Scanner;

public enum Months {

	JAN,FEB,MAR,ARI,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;

	Months valueOf(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}

class Demo{
	
	void showDetails() {
		
		try {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter months");
		String m  = s.next();
		
		switch (m) {
		case "JAN":
			System.out.println("“This is the 1st Month of the Year January”");
			break;
		case "FEB":
			System.out.println("“This is the 2nd Month of the Year Febuary”");
			break;
		case "MAR":
			System.out.println("“This is the 3rd Month of the Year March”");
			break;
		case "APR":
			System.out.println("“This is the 4th Month of the Year April”");
			break;
		case "MAY":
			System.out.println("“This is the 5th Month of the Year May”");
			break;
		case "JUN":
			System.out.println("“This is the 6th Month of the Year June”");
			break;
		case "JUL":
			System.out.println("“This is the 7th Month of the Year July”");
			break;
		case "AUG":
			System.out.println("“This is the 8th Month of the Year August”");
			break;
		case "SEP":
			System.out.println("“This is the 9th Month of the Year September”");
			break;
		case "OCT":
			System.out.println("“This is the 10th Month of the Year October”");
			break;
		case "NOV":
			System.out.println("“This is the 11th Month of the Year November”");
			break;
		case "DEC":
			System.out.println("“This is the 12th Month of the Year December”");
			break;
			
		default:
			System.out.println("Enter Valid Month");
			break;
		}
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid Month Name");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();

		d1.showDetails();
		
		
		
	}
	
}

