import java.util.*;
public class Sum 
{  
    public static void main (String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
      System.out.println("Enter third number: ");
        int n3= sc.nextInt();


        int sum = (n1%10) + (n2%10)+(n3%10);
        System.out.println("Sum of last digits of "+n1+" and "+n2 +" is: "+sum);
    }
    
}
