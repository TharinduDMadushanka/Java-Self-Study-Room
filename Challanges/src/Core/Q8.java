package Core;

// Remove White Spaces From Given String
//trim() ---> this method removes space in front and back.Not remove white spaces
// "\\s" this unicode value represent single space
public class Q8 {
    public static void main(String[] args) {
        String str="J  a  v   a  s  ta   r";

        String correct =str.trim();
        System.out.println(correct);//Remove spaces

        String str1=str.replaceAll("\\s",""); // in here single spaces will replace empty by using "".
        System.out.println(str1);
    }
}
