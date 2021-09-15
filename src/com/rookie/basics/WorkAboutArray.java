package com.rookie.basics;

import java.util.Arrays;
import java.util.Scanner;

public class WorkAboutArray {
    int[] arr = new int[10];

    public void printMenu(){
        System.out.println("******************************************");
        System.out.println("               1--插入数据                  ");
        System.out.println("               2--显示所有数据               ");
        System.out.println("               3--在指定位置处插入数据         ");
        System.out.println("               4--查询能被3整除的数据          ");
        System.out.println("               0--退出                      ");
        System.out.println("*******************************************");
        System.out.println("请输入对应的数字进行操作：");
    }

    public int enter(){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        return number;
    }

    public void insertDataToArray(){
        for(int i = 0 ; i <= 8 ; i++){
            System.out.println("输入第"+ (i+1)+"个数据：");
            arr[i] = enter();
        }
    }

    public void printArray(){
//        for(int item : this.arr ){
//            System.out.print(item+"\t");
//        }
        System.out.println(Arrays.toString(this.arr));
    }

    public void insertDataByIndex(){
        System.out.println("在第几个位置插入：");
        int index = enter();
        System.out.println("插入的数据是:");
        int number = enter();

        int length = this.arr.length;
        for(int i = length - 1 ; i > index-1 ; i--){
            arr[i] = arr[i-1];
        }
        arr[index - 1] = number;
    }

    public void beDividedExactlyBy3(){
        for (int item : this.arr){
            if(item % 3 == 0){
                System.out.print(item+",");
            }
        }
        System.out.print("\n");
    }

    public static void main(String[] args){
        WorkAboutArray workAboutArray = new WorkAboutArray();

        int choice = -1;
        do{
            workAboutArray.printMenu();
            choice = workAboutArray.enter();
            switch (choice){
                case 1:
                    workAboutArray.insertDataToArray();
                    continue;
                case 2:
                    workAboutArray.printArray();
                    continue;
                case 3:
                    workAboutArray.insertDataByIndex();
                    continue;
                case 4:
                    workAboutArray.beDividedExactlyBy3();
                    continue;
                case 0:
                    break;
                default:
                    System.out.println("输入操作错误");
            }
        }while(choice != 0 );
    }
}
