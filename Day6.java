

class Day6{
    public static void main(String[] args){

        int nums[][] = new int[3][4]; // Creating an multidimensional array of type int

        for(int i=0;i<3;i++){

            for (int j=0;j<4;j++){

                nums[i][j]=(int)(Math.random()*10); // taking random values and multiplying it by 10 as random()function
            }                                       // return a double value, and then typecasting it to int type.
            
        }
        for(int i=0;i<3;i++){

            for (int j=0;j<4;j++){

                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}