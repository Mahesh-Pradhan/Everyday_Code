import java.util.Scanner;

class Day2
{
    public static void main(String[] args)
    {
        Scanner prime = new Scanner(System.in);
        System.out.println("Enter the number:");

        long num = prime.nextLong();
        long i,m=num/2,flag=0;

        if(num==0||num ==1)
        {
            System.out.println(num+" is not prime number");
        }
        else
        {
            for(i=2;i<=m;i++)
            {
                if(num % i == 0)
                {
                    System.out.println(num +" is not prime number");
                    flag = 1;
                    break;
                }
            }

            if(flag==0)
            {
                System.out.println(num + " is prime number");
            }
        }

    }
}