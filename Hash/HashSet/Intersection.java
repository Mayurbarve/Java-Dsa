package Hash.HashSet;
import java.util.*;

public class Intersection {

    public static List<Integer> intersection(List<Integer> a, List<Integer> b){
        HashSet<Integer> setA = new HashSet<>(a);

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < b.size(); i++){

            if(setA.contains(b.get(i))){
                res.add(b.get(i));
            }
        }

        return res;

        }




    public static void main(String[] args){
        System.out.println("Intersection of two Array");

        List<Integer> a = Arrays.asList(1,2,3,4,5,6);
        List<Integer> b = Arrays.asList(2,4,9,8,7);

        List<Integer> newList = intersection(a,b);

        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }
    }
}
