package ATM;
import java.util.*;
public class sourcecode
{
    public static void main(String args[])
    {
        int amt, r2000=0, r500=0, r100=0 ,count=0; 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter The Amount in Rupees : \n\n");
        amt = sc.nextInt();
 
 if(amt >= 2000) 
 { 
  r2000 = amt / 2000 ; 
  amt = amt % 2000;
  System.out.print("\nTotal Number Of 2000 Rupees Notes :"+ r2000) ;
 }
 if(amt >= 500) 
 { 
  r500 = amt / 500 ; 
  amt = amt % 500;
  System.out.print("\nTotal Number Of 500 Rupees Notes : "+ r500) ;
 } 
 if(amt >= 100) 
 { 
  r100 = amt / 100 ; 
  amt = amt % 100;
  System.out.print("\nTotal Number Of 100 Rupees Notes : "+ r100) ;

 } 
 count = r2000 + r500 + r100;   
 System.out.print("\n\nTotal Number Of Notes Require : \n\n"+ count) ; 
 }
}