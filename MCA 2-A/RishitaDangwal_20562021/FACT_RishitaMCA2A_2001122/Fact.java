public class Fact
{
 public static void main(String[] args)
 { 
int number = 5;
 long fact = 1; 
int i = 1; 
while(i<=number) 
{
 fact = fact * i; i++; 
}
 System.out.println("Factorial of "+number+" is: "+fact); 
}
 }