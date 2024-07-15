package JavaProblems;

public class Constructor {

    String name; 

    public Constructor (String fname){
        name = fname;
    }

    public static void main(String[] args) {
        Constructor myObj = new Constructor("Mayur");
        System.out.println(myObj.name);
        Constructor myObj1 = new Constructor("Sakshi");
        System.out.println(myObj1.name);
    }   
}
