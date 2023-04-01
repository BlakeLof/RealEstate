package RealEstate;

import java.util.Scanner;

public class REO {
	
	//Main Method for the real estate system
	public static void main(String[] args) {
		
		String line = "------------------------------";
		String choice;
		
		Scanner sIn = new Scanner(System.in);
		boolean done = false;
		while (!done) {
			 System.out.printf("%s\n\t  Main Menu\n%s\n", line, line);
		     System.out.println("\n1: Listings");
		     System.out.println("2: Bids");
     	     System.out.print("\nWhat would you like to do? (1-2): ");
		     choice = sIn.nextLine();

		          switch (choice) {
		               case "1":
		            	 listingsMenu();
		            	 break;	   
		               case "2":
		            	   bidMenu();
		                    break;
		                default:
		                	System.out.println("Please enter in either 1 or 2\n");
		                    break;
	}

}
		}
	//runs user interface and operation for listing menu
	private static void listingsMenu() {
		Scanner sIn = new Scanner(System.in);
		String line = "------------------------------";
		String listChoice;
		 boolean leave = false;
  	   while(!leave) {
  	       System.out.printf("%s\n\t  Listing Menu\n%s\n", line, line);
  	       System.out.println("\n1: Add Listings");
	       System.out.println("2: Show Listings");
	       System.out.println("3: Auto Populate Listings(Dev Tool");
 	       System.out.print("\nWhat would you like to do? (1-3, Press Enter to return to original menu): \n");
 	       listChoice= sIn.nextLine();
 	      switch (listChoice) {
  	       case "1":
  	    	   addListing();
  	    	   break;
  	       case "2":
  	    	   break;
  	       case "3":
  	    	   break;
  	       case "":
  	    	   leave =true;
  	    	   break;
  	     default:
  	    	 System.out.println("Please enter a number between 1-3, or press enter to return to original menu.\n");
 	      }
 	      
 	       
	}
	}

	//allows user to enter in a house or condo
	private static void addListing() {
		Scanner sIn = new Scanner(System.in);
		String line = "------------------------------";
		String listChoice;
		 boolean leave = false;
  	   while(!leave) {
  	       System.out.printf("%s\n\t  Add Listing\n%s\n", line, line);
  	       System.out.println("\n1: Add House");
	       System.out.println("2: Add Condo");
 	       System.out.print("\nWhat would you like to do? (1-2, Press Enter to return to previous menu): \n");
 	       listChoice= sIn.nextLine();
 	      switch (listChoice) {
  	       case "1":
  	    	   break;
  	       case "2":
  	    	   break;
  	       case "":
  	    	   leave =true;
  	    	   break;
  	     default:
  	    	 System.out.println("Please enter a number between 1-2, or press enter to return to previous menu.\n");
	}
}
	}
	//allows user to select from bid menu
	private static void bidMenu() {
		Scanner sIn = new Scanner(System.in);
		String line = "------------------------------";
		String listChoice;
		 boolean leave = false;
  	   while(!leave) {
  		   System.out.printf("%s\n\t  Bids Menu\n%s\n", line, line);
  		   System.out.println("\n1: Add New Bid");
  		   System.out.println("2: Show Existing Bids");
  		   System.out.println("3: Auto Populate Bids (Dev Tool)");
 	       System.out.print("\nWhat would you like to do? (1-3, Press Enter to return to original menu): \n");
 	       listChoice= sIn.nextLine();
 	      switch (listChoice) {
  	       case "1":
  	    	   break;
  	       case "2":
  	    	   break;
  	       case "3":
  	       		break;
  	       case "":
  	    	   leave =true;
  	    	   break;
  	     default:
  	    	 System.out.println("Please enter a number between 1-3, or press enter to return to original menu.\n");
	}
}
	}
}
