import java.util.Scanner;

public class RotateArray {
    static void rotateArray(int[] arr, int rotateNum){

       /* int i;
        for(int k = 0;k<rotateNum;k++){
            int temp = arr[0];
            for(i = 0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1] = temp;
        } */
        int temp = 0;
        for(int k = 0; k<rotateNum; k++){
            temp = arr[0];
            for(int i = 0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
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

        System.out.println("Elements of original array");
        for(int i =0;i<myArray.length;i++){
            System.out.print(myArray[i]+" ");
        }
        rotateArray(myArray,2);
        System.out.println("");
        System.out.println("Elements of rotated array");
        for(int i =0;i<myArray.length;i++){
            System.out.print(myArray[i]+" ");
        }
    }

}