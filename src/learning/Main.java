package learning;

import java.util.Scanner;

public class Main {

    public  static void solEq2(int a,int b,int c){
        if(a==0){
            System.out.println("Đây không phải phương trình bậc 2!");
            System.exit(0);
        }
        double delta = b*b-4*a*c;
        if(delta<0){
            System.out.println("Phương trình vô nghiệm");
        }else if(delta==0){
            System.out.println("Phương trình có nghiệm duy nhất:"+(-b/(2*a)));
        }else if(delta>0){
            System.out.println("Phương trình có 2 nghiệm: x1=: "+((-b+Math.sqrt(delta))/(2*a))+" x2=: "+((-b-Math.sqrt(delta))/(2*a)) );
        }
    }

    public  static void changeToBinary(int number){

        String value="";

        while (number>0){
            value= number%2+value;
            number=number/2;
        }
        System.out.println(value);

    }

    public static int findMax(int [] arr){
        int max = arr[0];
        for (int e: arr
             ) {
            if(max<e){
                max = e;
            }
        }
        return max;
    }


    public static int findMin(int [] arr){
        int min = arr[0];
        for (int e: arr
        ) {
            if(min>e){
                min = e;
            }
        }
        return min;
    }

    public static int countEven(int[] arr){
        int count =0;
        for (int e :arr
             ) {
           if(e%2==0){
               count++;
           }
        }
        return count;
    }

    public static void isPrime(int number){
        boolean isPrime = true;
        for (int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                isPrime =false;
            }
        }
        if (isPrime){
            System.out.println(number);
        }
    }

    public static int[]  createArray(int n){
        int [] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.println("Nhập phần tử ở vị trí: "+i);
            arr[i]=sc.nextInt();
        }
        return arr;
    }


    public static void main(String[] args) {
//        int [] arr = createArray(5);
//        for (int e :arr
//             ) {
//            System.out.println(e);
//        }
        int [] arr = {3,4,5,6,7,8,9};
        for (int e:arr
             ) {
            isPrime(e);
        }
    }
}
