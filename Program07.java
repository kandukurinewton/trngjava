import java.util.Scanner;
class Main
{
public static int factorial_of_a_number(int n)
{
if(n==0) return 1;
else
return(n*factorial_of_a_number(n-1));
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number:");
n=sc.nextInt();
if(n<0)
    System.out.println("Invalid input");
else
System.out.println("Factorial of the number"+n+"is"+factorial_of_a_number(n));
}
}