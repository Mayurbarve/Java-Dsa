public class Solution{
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        System.out.println(swapCount(arr));
    }
	static int swapCount(int[] arr){
        int count = 0;
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i -1; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return count;
    }
}
