package Assessment.TcsNQT;

import java.util.Arrays;

public class Occurrence {
    public static void main(String[] args) {
        System.out.println("Occurrence of element in array");

        int[] arr = {3,3,3,3,5,8,9,2,4,1,7,7,4,5,7,2,9,};

        Arrays.sort(arr);
        for(int i = 0; i < arr.length -1; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                else{
                    break;
                }
            }
            System.out.println("Occurrence of : " + arr[i] + " --> " + count);
            i+=(count-1);
        }
    }
}
