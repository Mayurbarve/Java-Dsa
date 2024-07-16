package BasicNumberProblems;

import java.util.Scanner;

class ConditionStatement {

    public static void main(String[] args) {
        System.out.println("Condition Statements");
        Scanner Num = new Scanner(System.in);
        

        int number = Num.nextInt();

        //if condition 
        if (number >= 75){
            System.out.println("You are grade Above Avarage Student");
             
        }
        else if(number >= 35){
            System.out.println("You are grade below Avarage Student");
        }
        else{
            System.out.println("you are failed");
            Num.close();
        }

    }
}