package org.sajourney.JavaLessons.arrays;

public class Demo {
    public static void main(String[] args){
        int nums[]={3,7,2,5};
        System.out.println(nums[0]);//printing first value
        nums[2]=9;//reinitializing the value of the third element
        System.out.println(nums[2]);

        //making it dynamic
        int values[] = new int[4];//by default all the values are zeros

        for(int i=0;i<4;i++){
            System.out.println(values[i]);
        }

        //arrays of arrays...rows x columns
        int arrays[][]= {{1,2},{3,4}};
        System.out.println(arrays[1][0]);
        for(int i=0;i<2;i++){
            for(int j=0; j<2;j++){
                System.out.print(arrays[i][j] + " ");

            }
            System.out.println();
        }



    }
}
