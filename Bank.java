package solution1;

import java.io.DataInputStream;

public class Bank {
	public static void main(String[] args) {
		int choice,result;
		BankAccount obj1=new BankAccount("Vikash Gangwar",10000,5);
		obj1.show();
		DataInputStream obj=new DataInputStream(System.in);
		try {
			do {
			System.out.println("\n1.Deposit");
			System.out.println("2.Withraw");
			System.out.println("3.Rate of Interest");
			System.out.println("Enter you choice (1/2/3): ");
			choice=Integer.parseInt(obj.readLine());
			if(choice==1) {
				obj1.Deposit();
			}
			if(choice==2) {
				obj1.Withdraw();
			}
			if(choice==3) {
				obj1.RateOfInterest();
			}
			System.out.println("\n Do you want to continue? (1:yes/2:no)");
			result=Integer.parseInt(obj.readLine());
			}while(result==1);
		}
		catch(Exception e) {
			System.out.println("I/O error");
		}
	}

}
