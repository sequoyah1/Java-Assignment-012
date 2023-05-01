/**
 * Author Sequoyah Schaefer
 * Version 1.0
 * Since 5/1/2023
 */
    import java.util.Arrays;
    public class SortingAlgorithms {
        static void selection_sort(int arr[], int n) {
            for (int i = 0; i < n - 1; i++) {
                int mini = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[mini]) {
                        mini = j;
                    }
                }
                int temp = arr[mini];
                arr[mini] = arr[i];
                arr[i] = temp;
            }

            System.out.println("Output:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String args[]) {

            int[] arr = { 92,26,78,10978,1,25,27,30,27,938,876123};
            int n = arr.length;
            System.out.println("Input:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            selection_sort(arr, n);
        }
    }





/** public static void main(String args[])     int[] arr = { 92,26,78,10978,1,25,27,30,27,938,876123};
 {
     int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
     System.out.println("The original array is: ");
     for (int num : arr) {
         System.out.print(num + " ");
     }
     Arrays.sort(arr);
     System.out.println("\nThe sorted array is: ");
     for (int num : arr) {
         System.out.print(num + " ");
     }
 }
}

 import java.util.Random;
 public class Example {
 public static void main(String[] args) {
 Random rd = new Random();
 int[] arr = new int[5];
 for (int i = 0; i < arr.length; i++) {
 arr[i] = rd.nextInt();
 System.out.println(arr[i]); t
 }
 }
 }
 **/


