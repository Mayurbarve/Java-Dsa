import java.util.*;

public class MaxDiscount {
    static int totalBillDiscount(int[] arr, int k) {

        Arrays.sort(arr);
        int totalBill = 0;
        int[] revrse = new int[arr.length];

        int j = arr.length;
        for(int i = 0; i < arr.length; i++){
            revrse[j-1] = arr[i];
            j--;
        }
        int discount = revrse[0];

        for (int l = 0; l < k; l++) {
            totalBill += revrse[l];
        }

        

        int toatalDiscountedBill = totalBill - discount;
        return toatalDiscountedBill;
    }

    public static void main(String[] args) {
        System.out.println("Maximum Discount");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the count of item");
        int size = sc.nextInt();
        System.out.println("Enter the buy count of items");
        int k = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the items");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        

        System.out.println(totalBillDiscount(arr, k));
        sc.close();
    }
}
