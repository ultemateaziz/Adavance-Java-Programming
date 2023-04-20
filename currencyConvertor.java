import java.util.Scanner;
/*
 * Currency Convertor project with console based
 */
public class currencyConvertor {
public static void main(String[] args) {
	System.out.println("1.Rupee\n2.Dollor\n3.Euro\n4.Dubai");
	//creating a object for a scanner
	Scanner inp = new Scanner(System.in);
	System.out.println("Choose the country");
	int choice = inp.nextInt();
	System.out.println("Please enter the amount");
	double amt = inp.nextDouble();
	//switch case for the selection
	switch(choice) {
	 case 1:
		 rupeeToOther(amt);
         break;
     case 2:
         dollarToOther(amt);
         break;
     case 3:
         euroTother(amt);
         break;
     case 4:
    	 dubaiToOther(amt);
    	 break;
     default:
         System.out.println("Invalid choice");
		
	}
}
public static void rupeeToOther(double amt ) {
	System.out.println("1.Rupee = " +0.013+ "Dollar");
	System.out.println();
	System.out.println(amt+"Rupee=" +(amt*0.013)+"Dollor");
	System.out.println("1 Ruppe = " + 0.012 + " Euro");
	System.out.println();
	System.out.println(amt+" Ruppe = " + (amt*0.012) + " Euro");
	System.out.println();
}
public static void dollarToOther(double amt) {
    System.out.println("1 Dollar = " + 79.37 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Dollar = " + (amt*79.37) + " Ruppe");
    System.out.println();

    System.out.println("1 Dollar= " + 0.98 + " Euro");
    System.out.println();

    System.out.println(amt+" Dollar = " + (amt*0.98) + " Euro");
}

    

public static void euroTother(double amt){
    System.out.println("1 Euro = " + 80.85 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Euro = " + (amt*80.85) + " Ruppe");
    System.out.println();

    System.out.println("1 Euro = " + 1.02 + " Dollar");
    System.out.println();

    System.out.println(amt+" Euro = " + (amt*1.02) + " Dollar");
}
public static void dubaiToOther(double amt) {
	 System.out.println("1 Dubai = " + 22.50 + " Ruppe");
	    System.out.println();
	    System.out.println(amt+" Dubai = " + (amt*22.50) + " Ruppe");
	    System.out.println();

	    System.out.println("1 Euro = " + 1.02 + " Dollar");
	    System.out.println();

	    System.out.println(amt+" Euro = " + (amt*1.02) + " Dollar");
	}
}
