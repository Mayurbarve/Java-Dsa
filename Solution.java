import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Sort array");

        //Get size of the array
        System.out.print("Enter the array size: ");
        int arrSize = in.nextInt();

        int[] arr = new int[arrSize];

        //get the array element using randaom insted of getting through the user
        System.out.println("Enter the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100); //in.nextInt();
        }

        //Print the unsorted array
        System.out.println("Unsort array");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        in.close();

        //Now sort the array 
        int temp = 0;
        for(int i =  0; i<arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
 
        //print the sort array
        System.out.println();
        System.out.println("Sorted array");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }   
    }   
}