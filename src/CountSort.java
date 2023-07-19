import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
    static void doCountSort(int[] array,int maxValue)
    {
            int[] count = new int[maxValue + 1];
            int[] sortedArray = new int[array.length];
            for (int i = 0; i < array.length; i++)
            {
                count[array[i]]++;
            }
            int temp = 0;
            for (int i = 0; i < count.length; i++) {
                for (int j = 0; j < count[i]; j++) {
                    sortedArray[temp++] = i;
                }
            }
            System.out.println(Arrays.toString(sortedArray));
    }
    static int maxValue(int[] array)
    {
        int m = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] > m)
                m = array[i];
        return m;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int maximum=maxValue(A);
        doCountSort(A,maximum);
    }
}
