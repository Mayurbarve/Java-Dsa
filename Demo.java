public class Demo {
    int a = 10;
    void call(int a) {
        // This local variable 'a' is subject to change in its value
        a = a + 10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        Demo eg = new Demo();
        System.out.println("Before call-by-value: " + eg.a);
        eg.call(50510); // Passing an integer 50510 to the call() method
        System.out.println("After call-by-value: " + eg.a);
    }
}
// Output: Before call-by-value: 10
//         After call-by-value: 10
