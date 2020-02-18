package banksol;

import java.time.LocalDate;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		LocalDate date;
		String bankname;
		int complaintid;
	
		Scanner sc=new Scanner(System.in);
		CsvToCollection c=new CsvToCollection();
		
		int count=c.read();
        
		System.out.println("\nEnter the Year(mon/day/year) on which you want to display Complaints" );
		
		String d=sc.next();
		c.case1(d);
		/*date=LocalDate.parse(d);*/
		/* System.out.println("Enter a bank name to display Complaints");
		 bankname=sc.next();
		 System.out.println("Enter a complaint id to display Complaint");
		 complaintid=sc.nextInt();
		 System.out.println("Enter a complaintid to display number of days bank takes");
		 complaintid=sc.nextInt();
		 System.out.println("complaint closed with explanation");
		 System.out.println("complaint closed with response");
       		 
		 */
		
		
		
	}

}
