	package doctorappoinmentproject;
	
	import java.util.ArrayList;
import java.util.Scanner;
	
	public class AppointementBooking {
		
		ArrayList<String> doctorname=new ArrayList<String>();
		ArrayList<String> doctorQualification=new ArrayList<String>();
		ArrayList<String> doctorGender=new ArrayList<String>();
		ArrayList<String> doctorPassword=new ArrayList<String>();
		ArrayList<String> doctorAge=new ArrayList<String>();
		ArrayList<Long> doctorMobilenumber=new ArrayList<Long>();
		ArrayList<String> doctorcity=new ArrayList<String>();
		
		ArrayList<String> patientAge=new ArrayList<String>();
		ArrayList<String> patientName=new ArrayList<String>();
		ArrayList<String> patientGender=new ArrayList<String>();
		ArrayList<String> patientPassword=new ArrayList<String>();
		ArrayList<String> patientConfirmpassword=new ArrayList<String>();
		ArrayList<Long> patientMobilenumber=new ArrayList<Long>();
		
		ArrayList<String> patientAgeBooking=new ArrayList<String>();
		ArrayList<String> patientNameBooking=new ArrayList<String>();
		ArrayList<String> patientGenderbooking=new ArrayList<String>();
		ArrayList<Byte> doctorid=new ArrayList<Byte>();
		
		
		
		
		public void dataAdd() {
			doctorname.add("harish kalyan");
			doctorname.add("mahesh");
			doctorname.add("prasana kumar");
			doctorname.add("robin");
			doctorname.add("jothi");
			doctorname.add("manoj");
			doctorname.add("maharajan");
			
			doctorQualification.add("MBBS");
			doctorQualification.add("MBBS");
			 doctorQualification.add("MBBS");
			 doctorQualification.add("MBBS");
			 doctorQualification.add("MBBS");
			 doctorQualification.add("MBBS"); 
			 doctorQualification.add("MBBS");
			 
			 
			 doctorGender.add("M");
			 doctorGender.add("M");
			 doctorGender.add("M");
			 doctorGender.add("M");
			 doctorGender.add("F");
			 doctorGender.add("M");
			 doctorGender.add("M");
			 
			 doctorPassword.add("harish123 ");
			 doctorPassword.add("mahesh123 ");
			 doctorPassword.add("prasana123 ");
			 doctorPassword.add("robin123 ");
			 doctorPassword.add("jothi123 ");
			 doctorPassword.add("manoj123 ");
			 doctorPassword.add("maharaja123 ");
			 
			 doctorAge.add("44");
			 doctorAge.add("55");
			 doctorAge.add("67");
			 doctorAge.add("48");
			 doctorAge.add("45");
			 doctorAge.add("34");
			 doctorAge.add("64");
			 
			 doctorMobilenumber.add(123l);
			 doctorMobilenumber.add(234l);
			 doctorMobilenumber.add(345l);
			 doctorMobilenumber.add(543l);
			 doctorMobilenumber.add(103l);
			 doctorMobilenumber.add(163l);
			 doctorMobilenumber.add(173l);
			 
			 doctorcity.add("nellai");
			 doctorcity.add("chennai");
			 doctorcity.add("madhurai");
			 doctorcity.add("nellai");
			 doctorcity.add("banglore");
			 doctorcity.add("pune");
			 doctorcity.add("assam");
			 
			 
					 
			}
		
		
		public void admin()throws Exception {
			Scanner sc=new Scanner(System.in);
			byte choice;
			boolean flag=true;
			
			while(flag)
			{
				System.out.println("\t\t _____________________________ ");
				System.out.println("\t\t|                            | ");
				System.out.println("\t\t|        Welcome Admin       |");
				System.out.println("\t\t|____________________________|");
				System.out.println("\n\n1.Doctor List \t2.Registered patients \t3.patients with appoinment \n 4.Main menu  \n\n");
				
				choice=sc.nextByte();
				switch(choice)
				{
				case 1:
					for(int i=0;i<=doctorname.size()-1;i++)
					{
						System.out.println("Name: \t" + doctorname.get(i));
					}
					byte menuChoice;
					System.out.println("\n\n1.Main menu\t 2. previous menu");
					menuChoice =sc.nextByte();
					if(menuChoice==1)
					{
						flag=false;
					}
					else
					{
						break;
					}
					break;
				case 2:
					if(patientName.isEmpty())
					{
						System.out.println("no registerd patients yet");
						Thread.sleep(3000);
						break;
					}
					else
					{
						for(int i=0;i<=patientName.size()-1;i++)
						{
							System.out.println(i+"."+patientName.get(i));
						}
						System.out.println("\n\n1.Main menu\t 2. previous menu");
						menuChoice =sc.nextByte();
						if(menuChoice==1)
						{
							flag=false;
						}
						else
						{
							break;
						}
					}
						break;
				case 3:
					if(patientNameBooking.isEmpty())
					{
						System.out.println("no Appointments yet");
						Thread.sleep(3000);
						break;
					}
					else
					{
						for(int i=0;i<=patientNameBooking.size()-1;i++)
						{
							System.out.println(i+"."+patientNameBooking.get(i));
						}
						System.out.println("\n\n1.Main menu\t 2. previous menu");
						menuChoice =sc.nextByte();
						if(menuChoice==1)
						{
							flag=false;
						}
						else
						{
							break;
						}
					}
						break;
						
				case 4:
					flag = false;
					break;
					
					default:
						System.out.println("Wrong choice");
						Thread.sleep(3000);
						flag=true;
						
					
				}
				
			}
			
		}
		
		
		
		public void patient() throws Exception {
			
			Scanner sc = new Scanner(System.in);
			boolean flag = true;
			while(flag)
			{
				System.out.println("\t\t _____________________________ ");
				System.out.println("\t\t|                            | ");
				System.out.println("\t\t|   Welcome to patient page  |");
				System.out.println("\t\t|____________________________|");
				System.out.println(" ");
				System.out.println("1.Login \t 2.Registration\n");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					if(patientMobilenumber.isEmpty())
					{
						System.out.println("First Register yourself then login..!");
						Thread.sleep(500);
						break;
					}
					else
					{
						patientLogin();
						flag=false;
					}
					break;
				case 2:
					patientRegistration();
					flag=false;
					break;
					default:
						System.out.println("\n you entered wrong choice.enter your choice again.....!!!");
						flag=true;
						Thread.sleep(1000);
						break;
					
				
				}
			
			}
			
			
		}
		
		public void doctor()throws Exception {
			Scanner sc=new Scanner(System.in);
			int choice=0;
			
			boolean flag=true;
			while(flag)
			{
				System.out.println("\t\t _____________________________ ");
				System.out.println("\t\t|                            | ");
				System.out.println("\t\t|   Welcome to Doctor page   |");
				System.out.println("\t\t|____________________________|");
				System.out.println(" ");
				System.out.println("1.Login \t 2.Registration\n");
				choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					if(doctorMobilenumber.isEmpty())
					{
						System.out.println("First Register yourself then login..!");
						flag=false;
						Thread.sleep(500);
						break;
					}
					else
					{
						doctorLogin();
						flag=false;
					}
					break;
				case 2:
					doctorRegistration();
					flag=false;
					break;
					default:
						System.out.println("Enter wrong choice...");
						flag=true;
					
				}
				
			}
			
		}
		
		
		
		
		

		private void patientLogin()throws Exception {
			Scanner sc=new Scanner(System.in);
			boolean flag=true;
			long mobilenumber;
			byte choice;
			System.out.println("\t\t _____________________________ ");
			System.out.println("\t\t|                            | ");
			System.out.println("\t\t|           Login            |");
			System.out.println("\t\t|____________________________|");
			
			System.out.println("Enter your user name(mobile number)");
			mobilenumber=sc.nextLong();
			System.out.println("Enter your Password");
			String password=sc.next();
			boolean flag1=false;
			int j;
			for(j=0;j<=patientMobilenumber.size()-1;j++)
			{
				if((patientMobilenumber.get(j)).equals(mobilenumber)&&(patientPassword.get(j)).equals(password));
				{
					flag1=true;
					
					break;
				}
			}
			if(flag1==true)
			{
				Thread.sleep(1000);
				
				System.out.println("\t\t _____________________________ ");
				System.out.println("\t\t|                            | ");
				System.out.println("\t\t|      Book Appointement     |");
				System.out.println("\t\t|____________________________|");
				System.out.println("\n Welcome "+patientName.get(j)+",to book a appoinment ,choose your doctor");
				
				
				for(int i=0; i<=doctorname.size()-1;i++)
				{
					System.out.println((i+1)+" . "+ doctorname.get(i));
				}
				choice=sc.nextByte();
				doctorid.add(choice);
				
				while(flag)
				{
					Thread.sleep(1000);
					
					System.out.println("\t\t _____________________________ ");
					System.out.println("\t\t|                            | ");
					System.out.println("\t\t|      Book Appointement     |");
					System.out.println("\t\t|____________________________|");
					
					if(choice<=doctorname.size() && choice>0)
					{
						System.out.println("\n\n Name: \t"+doctorname.get(choice-1)+"\n Age: \t"+ doctorAge.get(choice-1)+"\n Gender: \t "+ doctorGender.get(choice-1));
						System.out.println("\n Enter your name: \t");
						sc.nextLine();
						patientNameBooking.add(sc.nextLine());
						System.out.println("\n Enter your age: \t");
						patientAgeBooking.add(sc.nextLine());
						System.out.println("\n Enter your gender: \t");
						patientGenderbooking.add(sc.nextLine());
						System.out.println("\n Booking sucessfull.....");
						Thread.sleep(1000);
						flag=false;
						break;
						
						
					}
					else
					{
						System.out.println("\n enter the correct input....");
						flag=true;
						Thread.sleep(1000);
					
					}
					
				
				}
				
			}
			else
			{
				System.out.println("\n login sucessfull......");
				flag=true;
				Thread.sleep(1000);
				
			}
		}
		private void patientRegistration() throws Exception {
			
			Scanner sc = new Scanner(System.in);
			int i=0;
			Long mobilenumber;

			System.out.println("\t\t _____________________________________ ");
			System.out.println("\t\t|                                     | ");
			System.out.println("\t\t|  Welcome to the registration page   |");
			System.out.println("\t\t|_____________________________________|");
			
			System.out.println("\n Enter your name: \t");
			patientName.add(sc.nextLine());
		
			System.out.println("\n Enter your age: \t");
			patientAge.add(sc.nextLine());
			System.out.println("\n Enter your Mobile number: \t");
		    mobilenumber=sc.nextLong();
			Long mno;
			boolean flag=true,flag1=true;
			
			if(patientMobilenumber.isEmpty())
			{
				patientMobilenumber.add((mobilenumber));
				System.out.println("Enter password");
				patientPassword.add(sc.next());
				System.out.println("Registration is sucessfull.....");
				Thread.sleep(1000);
				flag1=false;
			}
			else
			{
				System.out.println("same mobile number is not allowed \n");
				Thread.sleep(500);
			}
			
		}
		
		private void doctorRegistration() throws Exception {
			Scanner sc=new Scanner(System.in);
			int i =0;
			Long mobilenumber ;
			boolean flag=true,flag1=true;
			
			
			System.out.println("\t\t _____________________________________ ");
			System.out.println("\t\t|                                     | ");
			System.out.println("\t\t| this is doctor registration page    |");
			System.out.println("\t\t|_____________________________________|");
			
			System.out.println("\n Enter your name: \t");
			doctorname.add(sc.nextLine());
		
			
			System.out.println("\n Enter your Mobile number: \t");
			mobilenumber=sc.nextLong();
			Long mno;
		
			
			if(doctorMobilenumber.isEmpty())
			{
				doctorMobilenumber.add((mobilenumber));
				System.out.println("Enter password");
				doctorPassword.add(sc.next());
				System.out.println("Registration is sucessfull.....");
				Thread.sleep(1000);
				flag1=false;
			}
			else
			{
				for(i=0;i<=doctorMobilenumber.size()-1;i++)
				{
					mno=doctorMobilenumber.get(i);
					
					if(mno==mobilenumber)
					{
						flag1=false;
						break;
					}
						
						
				}
				if(flag1==true)
				{
					
					doctorMobilenumber.add((mobilenumber));
					System.out.println("Enter age");
					doctorAge.add(sc.next());
					System.out.println("Enter city");
					doctorcity.add(sc.next());
					System.out.println("Enter password");
					doctorPassword.add(sc.next());
					System.out.println("Registration is sucessfull.....");
					System.out.println("Details: name:" + doctorname +"number;"+doctorMobilenumber);
					Thread.sleep(1000);
					
				}
				else
				{
					System.out.println("same mobile number not allowed");
					int index=doctorname.size()-1;
					doctorname.remove(index);
					Thread.sleep(1000);
					
				}
			}
			
			
			
			
			
		}
		private void doctorLogin() throws InterruptedException {
			Scanner sc=new Scanner(System.in);
			
			Long mobilenumber;
			
			
			System.out.println("\t\t _____________________________ ");
			System.out.println("\t\t|                            | ");
			System.out.println("\t\t|         doctor  Login      |");
			System.out.println("\t\t|____________________________|");
			
			System.out.println("Enter your username(mobile number)");
			mobilenumber=sc.nextLong();
			System.out.println("Enter your Password");
			String password=sc.next();
			int i=0;
			byte choice;
			
			boolean flag=false;
			boolean flag11=true;
			
			
			for(i=0;i<=doctorMobilenumber.size()-1;i++)
			{
				if((doctorMobilenumber.get(i)).equals(mobilenumber)&&(doctorPassword.get(i)).equals(password))
				{
					flag=false;
					break;
					
				}
			}
			
			if(flag==false)
			{
				while(flag11)
				{
					System.out.println("\t\t _____________________________ ");
					System.out.println("\t\t|                            | ");
					System.out.println("\t\t|        Welcome doctor      |");
					System.out.println("\t\t|____________________________|");
					System.out.println("\n\n 1.Appointements. \n2.logouts");
					choice=sc.nextByte();
					byte j =0;
					switch(choice)
					{
					case 1:
						if((doctorid.isEmpty()!=true))
						{
							while(j<=doctorid.size()-1)
							{
								if((i+1)==doctorid.size()-1)
								{
									System.out.println("patient name: " +patientNameBooking.get(j));
									j++;
								}
							}
							Thread.sleep(1000);
						}
						else {
							System.out.println("No appoinements....!");
							Thread.sleep(3000);
							flag11=true;
							break;
						}
						break;
					case 3:
						flag11=false;
						break;
					}
					
					
				}
			}
			
			
			
			
			
			
			
		}




			
			
		
	

		


	



		

		
		

	
		
	
	
	}
