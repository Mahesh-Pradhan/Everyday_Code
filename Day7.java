import java.io.*;

class Day7{
    public static int getmin(int array[]){
        int res = array[0];
        for( int i=0;i<array.length;i++)        
            res = Math.min(res,array[i]);
        return res;
    }
        
    public static int getmax(int array[]){
        int res = array[0];
        for (int i =0; i<array.length;i++)
            res =Math.max(res,array[i]);
        return res;
    }
        
    public static void main(String[] args){

        int num[] = {4,5,6,1,8,7,2,5,9,0};
        System.out.println("The maximum number in the array "+ getmax(num));
        System.out.println("The minimum number in the array "+ getmin(num));

    }
}

