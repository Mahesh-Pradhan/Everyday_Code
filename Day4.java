import java.util.Scanner;

class Calculator{
    public int add(int n1,int n2){
        return n1+n2;

    }
    public int subtract(int n1,int n2){
        return n1-n2;

    }
    public int multiply(int n1,int n2){
        return n1*n2;

    }
    public int divide(int n1,int n2){
        return n1/n2;

    }
}


public class Day4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter method for calculator");
        System.out.println(" (1)-Add two numbers");
        System.out.println(" (2)-Subtract two numbers");
        System.out.println(" (3)-Multiply two numbers");
        System.out.println(" (4)-Divide two numbers");
        
        int value= scan.nextInt();
        System.out.println("Enter the first number");
        int num1= scan.nextInt();        
        System.out.println("Enter the second number");
        int num2= scan.nextInt();
        
        Calculator calc = new Calculator();
        int result;

        switch(value){
            case 1:
                result=calc.add(num1,num2);
                System.out.println(result+ " is the answer");
                break;
            case 2:
                result=calc.subtract(num1,num2);
                System.out.println(result+ " is the answer");
                break;
            case 3:
                result=calc.multiply(num1,num2);
                System.out.println(result+ " is the answer");
                break;
                
            case 4:
                result=calc.divide(num1,num2);                
                System.out.println(result+ " is the answer");
                break;
            default:
                System.out.println("Enter a valid number");
        

        }
        
    }
}