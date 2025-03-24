package com.demo1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Register 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Encapsulation p1=new Encapsulation();
		int arr[] =new int[1];
		ArrayList<Encapsulation> arraylist=new ArrayList<>();
		boolean run=true;
		while(run)
		{
			System.out.println("1)Are you new user");
			System.out.println("2)existing user");
			//System.out.println("3)show all user");
			System.out.println("4)exit");
			System.out.println("Enter a number");
			int option=s.nextInt();
			s.nextLine();
			if(option==1)
			{
				System.out.println("Enter ur username");
				String username=s.nextLine();
				System.out.println("Enter the password");
				String password=s.nextLine();
				System.out.println("Enter the email");
				String email=s.nextLine();
				System.out.println("Enter the address");
				String address=s.nextLine();
				System.out.println("Enter the mobileNumber");
				long mobileNumber=s.nextLong();
				Date creatAt = new Date();
				Date updateAt = new Date();
				boolean isActive=true;
				
				p1.setUsername(username);
				p1.setPassword(password);
				p1.setEmail(email);
				p1.setAddress(address);
				p1.setMobileNumber(mobileNumber);
				p1.setCreateAt(creatAt);
				p1.setUpdateAt(updateAt);
				p1.setIsActive(isActive);
				
				arraylist.add(p1);
			}
			else if(option==2) {
				boolean user=false;
				System.out.println("Enter the Username");
				String name=s.next();
				System.out.println("Enter the Password");
				String passwd=s.next();
				
				for(int i=0;i<arraylist.size();i++) {
					Encapsulation userlogin=arraylist.get(i);
					if(userlogin.getUsername().equals(name)&& userlogin.getPassword().equals(passwd)) 
					{
						System.out.println("You'r Logged in");
						System.out.println("Your Profile");
						System.out.println(p1.getUsername());
				        System.out.println(p1.getPassword());
				        System.out.println(p1.getEmail());
				        System.out.println(p1.getAddress());
				        System.out.println(p1.getMobileNumber());
				       // System.out.println(p1.getCreateAt());
				       // System.out.println(p1.getUpdateAt());
				       // System.out.println(p1.getIsActive());
				        user=true;
				        break;
			       }
		       }
				if(!user) {
					System.out.println("invalid username");
				}
			}	
			else if(option==3) {
				System.out.println(arraylist);
			}
			else if(option==4)
			{
				run=false;
			}
			else {
				System.out.println("Invalid Input");
			}
		}
		System.out.println("Thank you for Coming!");
	}

}
