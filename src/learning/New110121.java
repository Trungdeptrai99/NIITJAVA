package learning;

import java.util.Scanner;

public class New110121 {
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
        if(number==0||number==2){
            isPrime=false;
        }
        for (int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                isPrime =false;
            }
        }
        if (isPrime){
            System.out.println("Đây là số nguyên tố "+number);
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

    public static void selectSort(int[] arr) {
//        for (int i=0;i<arr.length-1;i++){
//            int indexMin =i;
//            for (int j=i+1;j<arr.length;j++){
//                if(arr[j]<arr[indexMin]){
//                    indexMin=j;
//                }
//            }
//            if(indexMin!=i){
//                int tem = arr[indexMin];
//                arr[indexMin]=arr[i];
//                arr[i]=tem;
//            }
//        }
    }


    public static void bubbleSort(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int tem = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
    }


    public static void binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l<=r){
            int mid = (l+r)/2;
            if (x==arr[mid]){
                System.out.println("Tìm thấy ở vị trí:" +mid);
                break;
            }else if(arr[mid]<x){
                l=mid+1;
            }else if (arr[mid]>x){
                r=mid-1;
            }
        }
        if (l>r){
            System.out.println("Không tìm thấy!");
        }
    }

    public static void main(String[] args) {
        int [] arr = {0,2,3,4,5,6,4,11,7,1,8,9};
        for (int e:arr
        ) {
            isPrime(e);
        }
        System.out.println("Đây là max: "+ findMax(arr));
        System.out.println("Đây là min: "+findMin(arr));
        System.out.println("Đây là số số chắn: "+countEven(arr));
        bubbleSort(arr);
        for (int e:arr
             ) {
            System.out.print(e+"-");
        }
        System.out.println("");
        binarySearch(arr,4);
    }
}
