package Assessment.TcsNQT;
class SmallestNum {
    public static void main(String[] args) {
        System.out.println("Smallest Number");

        int[] arr = {2,4,5,6,1,7,8,9};

        int smallest =arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        System.out.println(smallest);
    }
    
}