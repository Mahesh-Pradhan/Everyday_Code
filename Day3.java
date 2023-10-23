import java.util.Scanner;

class Day3
{
    public static void main(String[] args){

        Scanner palindrome = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = palindrome.nextInt();

        int sum=0,remainder,temp;
        temp=num;
        
        while(temp>0)
        {
            remainder=temp % 10 ;    /* Getting the remainder*/
            sum =(sum*10)+remainder;
            temp=temp/10;
        }

        if (num==sum)
        {
            System.out.println(num + " is a palindrome");
        }
        else
        {
            System.out.println(num + " is not a palindrome");
        }
    }
}