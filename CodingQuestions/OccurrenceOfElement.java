package CodingQuestions;

public class OccurrenceOfElement {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,2,3,4,7,8,3,4,5,2,2,4,9,8};
        
        occurrenceOfElement(arr);
    }

    static void occurrenceOfElement(int[] arr){
        sortArrays(arr);

        for (int i = 0; i < arr.length-1; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
                else{
                    break;
                }
            }
            System.out.println(arr[i] +  " | " + count);
            i+=(count-1);
            
        }
    }

    static void sortArrays(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            int smallest = i;
            for (int j = i +1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            
        }
    }
}
