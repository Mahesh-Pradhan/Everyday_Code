
public class prime{

    static void checkPrime(int n){
        int m,i,flag=0;
        m=n/2;
        if (n==0 || n==1){
            System.out.println(n + "is not a prime a number");
        }
        else{
            for(i=2;i<=m;i++){
                if (n%i==0){
                    System.out.println(n+"is not a prime number");
                    flag=1;
                    break;
                }
            }

            if (flag==0){
                System.out.println(n+ " is a prime number");
            }
        }
    }

    
    public static void main(String args[]){
        checkPrime(1);  
        checkPrime(3);  
        checkPrime(17);  
        checkPrime(20);  

    }

}