import java.util.Scanner;

public class SortArray {
    static void sortArray(int[] arr){
    /*    int temp = 0;
        System.out.println("Elements of original array");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //sorting
        for(int i = 0;i<arr.length;i++){
            for(int k = i+1;k<arr.length;k++){
                if(arr[i]>arr[k]){
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                 }
            }
        } */
        System.out.println("Elements of original array ");
        for(int i = 0;i <arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        int temp = 0;
        for(int i = 0;i < arr.length; i++){
            for(int k = i+1; k<arr.length; k++){
                if(arr[i]>arr[k]){
                    temp=arr[i];
                    arr[i]=arr[k];
                    arr[k]=temp;
                }
            }
        }

        System.out.println("");
        System.out.println("Elements of sorted array");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr size");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        for(int i = 0;i<size;i++){
            System.out.println("Enter element");
            myArray[i]=sc.nextInt();
        }
        sortArray(myArray);

    }
}