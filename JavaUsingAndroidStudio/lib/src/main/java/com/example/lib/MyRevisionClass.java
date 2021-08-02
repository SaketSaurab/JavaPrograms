package com.example.lib;

public class MyRevisionClass {
    public static void main(String[] args) {
       int array[]=new int[10];
       array[0]=0000;
       array[1]=1000;
       array[2]=2000;
       array[3]=3000;
       int array2[]={1,2,3};
       int matrix[][]=new int[3][3];
        matrix[0][0]=0;
        matrix[0][1]=0;
        matrix[0][2]=0;
        matrix[1][0]=0;
        matrix[1][1]=0;
        matrix[1][2]=0;
        matrix[2][0]=0;
        matrix[2][1]=0;
        matrix[2][2]=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matrix[i][j]=34;
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        for (int i=2;i>0;i--){
            System.out.print(" "+array2[i]);
        }

    }
}
