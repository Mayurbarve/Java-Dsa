package IntermediateProblem;


import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("| Leap YeAr of Not |");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Year: ");
        int year = in.nextInt();
        in.close();

        boolean LeapYear = false;
        
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    LeapYear = true;
                }
            }
            else{
                LeapYear = true;
            }
        }
        if(LeapYear){
            System.out.println(LeapYear + " is Leap Year");
        }
        else{
            System.out.println(LeapYear + " is Not Leap Year");
        }
    }
}
