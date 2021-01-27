package learning;

import java.util.Scanner;

public class New130121{

    public static String str ="Trung";

    public New130121(String str2){
        this.str2=str2;

    }

    public String str2 ="";


    public static  int test(int n){
        if(n==1){
            return 1;
        }
        return n*(test(n-1));
    }

    public static  int [][] createMatrix(int m,int n){
        int arr [][] = new int[m][n];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                arr[i][j] = (int) (Math.random() * (1 - 100));
            }
        }
        return arr;
    }


    public static int findMinOod(int[][] arr){
        int min=0 ;
        int count =0;
        for (int[] array:arr
             ) {
            for (int e: array
                 ) {
                if(count==0&&e%2!=0){
                    min=e;
                    count++;
                }else if(count!=0&&e%2!=0&&min>e){
                    min=e;
                }
            }
        }
        return min;
    }


    public static String changeToBinary(int number){
        int value = number%2;
        if(number==0){
            return "";
        }
        return  (changeToBinary(number/2)+value);
    }

    public static void main(String[] args) {
        System.out.println(changeToBinary(19));
        int [][] arr = {{16,1,6,4},
                        {2,1,-3,10}};
        System.out.println(findMinOod(arr));
    }

}
