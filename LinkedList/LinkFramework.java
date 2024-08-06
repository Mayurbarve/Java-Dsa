package LinkedList;

import java.util.LinkedList;

public class LinkFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a"); //Add First
        list.addFirst("is");
        System.out.println(list); //Print list

        list.addLast("art");  //add last
        System.out.println(list);
        list.addFirst("This");
        System.out.println(list);


        System.out.println(list.size()); // get size of a link

        for (int index = 0; index < list.size(); index++) { //traverse linked list
            System.out.print(list.get(index) + " -> ");
        }
        System.out.println("Null");

        list.removeFirst();  //delete first node
        System.out.println(list);

        list.removeLast();  //delete Last node
        System.out.println(list);

        for (int index = 0; index < list.size(); index++) {
            System.out.print(list.get(index) + " -> ");
        }
        System.out.println("Null");

        list.addLast("art"); //add last again
        list.addFirst("This"); //add first again

        list.remove(2); // delte node using index number
        System.out.println(list);
    }
}
