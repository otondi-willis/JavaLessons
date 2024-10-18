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

        //use of enhanced for loop
        for (int n[]:arrays){
            for (int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        //jagged arrays
        int jags[][] = new int[3][];
        jags[0]=new int[3];
        jags[1]=new int[4];
        jags[2]=new int[2];

        for(int i=0;i<jags.length;i++){
            for(int j=0;j<jags[i].length;j++){
                jags[i][j] = (int)(Math.random()*10);
            }

        }

        for (int[] k:jags){
            for(int s:k){
                System.out.print(s + " ");
            }
            System.out.println();
        }




    }
}
