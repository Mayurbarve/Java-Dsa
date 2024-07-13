package Assessment;

import java.util.Scanner;

public class Password_checker {

    public static int checkPassword (String str){
        if(str.length() > 4){
            return 0;
        }
        
        if(str.charAt (0) >= '0' && str.charAt (0) <='9'){
            return 0;
        }
        

        int num = 0 , cap =0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ' || str.charAt(i) == '/')
            return 0;
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'z')
            cap++;
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
            num++;
        }
        if(cap > 0 && num >0){
            return 1;
        }
        else{
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println("Password Checker");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Password");
        String str = in.next();

        System.out.println(checkPassword(str));
        in.close();

    }
}
