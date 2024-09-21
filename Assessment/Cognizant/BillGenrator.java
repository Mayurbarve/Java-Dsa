import java.util.Scanner;

public class BillGenrator {
    static void generateBill(int pizza, int puff, int coldrinks){
        int totalPizza = Math.abs(pizza) * 100;
        int totalPuff = Math.abs(puff) *20;
        int totalColdrings = Math.abs(coldrinks) * 10;

        System.out.println("Total No. of pizza "+ pizza + ": " + totalPizza);
        System.out.println("Total No. of Puff "+ puff + ": " + totalPuff);
        System.out.println("Total No. of Coldrinks "+ coldrinks + ": " + totalColdrings);

        System.out.println("Total bill Amount: "+ (totalPizza + totalPuff + totalColdrings));
    }
    public static void main(String[] args) {
        System.out.println("Generate Total Bill");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter No. of Pizza");
        int pizza = in.nextInt();

        System.out.println("Enter No. of Puff ");
        int puff = in.nextInt();

        System.out.println("Enter No. of Coldrinks");
        int coldrinks = in.nextInt();

       generateBill(pizza, puff, coldrinks);
       in.close();
    }
}
