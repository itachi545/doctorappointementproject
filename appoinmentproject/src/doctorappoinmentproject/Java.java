package doctorappoinmentproject;

import java.util.Scanner;

public class Java {
	public static void main(String[] args)throws Exception { 
		AppointementBooking ap = new AppointementBooking();
		Scanner sc = new Scanner(System.in);
		ap.dataAdd();
		boolean flag=true;
		while(flag=true)
		{
		System.out.println("----------------------------------------------------------------------");
		System.out.println(" \t\t |welcome to the Appointement booking |");
		System.out.println("---------------------------------------------------------------------\n\n");
		    System.out.println("\n1.Doctor \t 2.Paient \t 3.Admin \t 4.Exit");
		    int choice=sc.nextInt();
		    switch(choice)
		    {
		    case 1:
		    	ap.doctor();
		    	flag=true;
		    	break;
		    case 2:
		    	ap.patient();
		    	flag=true;
		    	break;
		    case 3:
		    	ap.admin();
		    	flag=true;
		    	break;
		    	default:
		    		System.exit(4);
		    	
		    }
		    
		  
	}
	}

}
