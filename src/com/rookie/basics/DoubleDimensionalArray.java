package com.rookie.basics;

import java.util.Random;

public class DoubleDimensionalArray {
    /**
     * 输出一个double型二维数组（长度分别为5、4，值自己设定）的值。
     */
    public void test(){
        double[][] arr = new double[5][4];
        Random random = new Random();
        for(int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                arr[i][j] = random.nextDouble();
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                System.out.println(arr[i][j]+"\t");
            }
        }
    }

    /**
     * 1、有2个多维数组分别是 2 3 4   和   1  5  2   8
     * 	                  4 6 8       5  9  10  -3
     * 	                              2  7  -5 -18
     *     按照如下方式进行运算。生成一个2行4列的数组。此数组的第1行1列是2 * 1 + 3 * 5 + 4 * 2
     *                                                第1行2列是2 * 5 + 3 * 9 + 4 * 7  第2行1列是 4 * 1 + 6 * 5 + 8 * 2 依次类推。
     */
    public void test2(){
        int[][] arr1 = {{2,3,4},
                        {4,6,8}};
        int[][] arr2 = {{1,5,2,8},
                        {5,9,10,-3},
                        {2,7,-5,-18}};

        int[][] result = new int[2][4];

        for(int i = 0 ; i < arr1.length ; i++){
            for(int k = 0 ; k < arr2[0].length ; k++){
                for(int j = 0 ; j < arr2.length ; j++){
                    result[i][k] = result[i][k] + arr1[i][j]*arr2[j][k];
                }
            }
        }

        for (int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.print(result[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args){
        DoubleDimensionalArray doubleDimensionalArray = new DoubleDimensionalArray();
        doubleDimensionalArray.test2();
    }
}
