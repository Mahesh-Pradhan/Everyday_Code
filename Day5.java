import java.util.Scanner;

class Day5{

    public static int fibo(int num){     
        if (num==0){
            return 0;
        }   
        else if (num==1){
            return 1;
        }
        return fibo(num-1)+ fibo(num-2);

    }

    public static void main(String[] args){
        System.out.println("Fibonacci numbers at position: ");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        int fibonaci=fibo(number);
        System.out.println("Fibonacci numbers at positions is " + fibonaci);
    }
}