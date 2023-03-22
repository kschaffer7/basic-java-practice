package arrayPractice;

public class randomNameSelector {
    public static void main(String[] args) {
        String[] names = {"stealth", "shadow", "velvet"};
        int selectedIndex = (int)(Math.random() * (names.length));
        System.out.println(names[selectedIndex]);
    }
}
