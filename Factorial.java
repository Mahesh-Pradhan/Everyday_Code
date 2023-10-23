import java.util.Scanner;

class Factorial{
    
    public static void main(String[] args){
        Scanner fact=new Scanner(System.in);
        System.out.println("Enter the number: ");

        int i,f=1;
        int num=fact.nextInt();

        for (i=1;i<=num;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of " + num + " is " + f);
    }
}