package Assessment.Cognizant;

import java.util.Scanner;

public class RevPyramid {
    static void reversePyramid(int row){
        for(int i = 0; i < row; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2 *(row -i) -1; k++){  
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Reverse Pyramid");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Row Count: ");
        int rwos = in.nextInt();

        reversePyramid(rwos);
        in.close();
    }
}
