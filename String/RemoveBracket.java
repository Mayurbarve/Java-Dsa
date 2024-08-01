package String;


public class RemoveBracket {
    public static void main(String[] args) {
        System.out.println("Remove Brackets from Algebric expression");

        String str = "3 * (2 + 5) - {4 / [1 + (3 - 1)]}";
        removeBracket(str);
    }

    static void removeBracket(String str){
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == ')' || ch == '{' || ch == '}' || ch == '[' || ch == ']'){
                ch++;
            }
            else{
                newStr.append(ch);
            }
        }

        System.out.println(newStr);
    }
}
