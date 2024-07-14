package Array;


public class array {
    public static void main(String[] args) {
        System.out.println("1D Array");

        int[] arr = new int[10];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10);
        }

        for(int i= 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}