import java.util.Scanner;
class Startt
{   public static void main (String arg[])
  { 
	Scanner input = new Scanner (System.in);
	
	Account a1 = new Account("Rifat","017-91051","rifat@gmail.com",23.5,500.00,"1425k",50000.00);
	       // a1.setaccountNumber("");
		    //a1.setbalance(50000.00);
			
	System.out.println("Your whole account informations are \t");
	a1.showInformation();
	System.out.print("what do you want? 1= withdraw , 2=deposit \n type your number :");
	int num = input.nextInt();
	if (num == 1)
	{ System.out.println("how much money you want to withdraw? type your amount:");
	    int num1 = input.nextInt();
		System.out.println("ok done, now your balance is:"+a1.withdraw((double)num1));	
		
	}
	else if (num == 2)
    {   System.out.println("how much money you want to deposite? type your amount:");
	    int num2 = input.nextInt();
		System.out.print("ok done, now your balance is:"+a1.deposite((double)num2));
	   
	}	
  }
	
	}
	
	
