import java.util.Scanner;

public class UseScanner {

    private static Scanner sc = new Scanner(System.in);

    public static int[] readIntegers(int count)
    {
        int[] myArray = new int[count];
        int number = 0;
        for(int i=0; i<count;i++)
        {
            System.out.println("Enter number");
            number = sc.nextInt();
            sc.nextLine();
            myArray[i] = number;

        }

        return myArray;
    }

    private static int findMin(int[] arr)
    {
        arr = readIntegers(arr.length);
        int min = arr[0];
        for(int i=1;i<arr.length; i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }

    public static void main(String[] args)
    {
        int arrSize = 0;
        int[] newArray;
        System.out.println("Enter array size");
        arrSize = sc.nextInt();
        newArray = new int[arrSize];

        System.out.println("min element is " + findMin(newArray));
    }
}
