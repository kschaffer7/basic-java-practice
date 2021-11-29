package reverseString;

public class solution1 {
    public static void main(String[] args) {
        System.out.println(reverseString("potato"));
    }
    public static String reverseString(String string){
        StringBuilder newString = new StringBuilder();
        newString.append(string);
        return newString.reverse().toString();
    }
}
