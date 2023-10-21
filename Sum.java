import java.util.Scanner;
/*Scanner class is used to get user input*/

class Sum
{
    public static void main(String[] args)
    {
        Scanner sum = new Scanner(System.in); /** Creating an object in scanner class */
        System.out.println("Enter The First number");
        double num1= sum.nextDouble();
        
        System.out.println("Enter the second number");
        double num2 = sum.nextDouble();
        double result = num1 + num2;

        System.out.println("The Sum of the two number is " + result);
    }
    
}