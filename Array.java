import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a month: ");  
		String monthName = sc.nextLine();              //reads string      
		
		int daysInMonth = getDaysInMonth(monthName);
		
		if(daysInMonth != -1)
			System.out.println("Number of days in "+ monthName +" : "+daysInMonth);
		else
			System.out.println("Invalid");

	}

	public static int getDaysInMonth(String monthName) {
	
		int month = -1;
		switch(monthName.toLowerCase()) {
		case "january": month = 1; break;
        case "february": month = 2; break;
        case "march": month = 3; break;
        case "april": month = 4; break;
        case "may": month = 5; break;
        case "june": month = 6; break;
        case "july": month = 7; break
        case "august": month = 8; break;
        case "september": month = 9; break;
        case "october": month = 10; break;
        case "november": month = 11; break;
        case "december": month = 12; break;
        default: month =-1;break;
		
		}
		
		int[] daysPerMonth = {
			31,28,31,30,31,30,31,31,30,31,30,31	
		};
		if(month!=-1) {
		int days = daysPerMonth[month - 1];
		return days;
		}
		else
			return -1;
	}

}
