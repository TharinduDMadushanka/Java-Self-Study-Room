package Core;

//  Remove Special Characters From Given String

public class Q7 {
    public static void main(String[] args) {

        String str = "@#$Ja%$v#@a^&";

        String correct =str.replaceAll("[^a-zA-Z0-9]",""); // In here check str in this regex character range then other than it will replace with space
        System.out.println(correct);
    }
}
