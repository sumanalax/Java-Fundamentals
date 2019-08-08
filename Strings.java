public class Strings{
public static void main(String[] args) {
    String one = "   I am a java!     ";
    String two = "I am lakshmi" ;
    String three =one.concat(two);
    String four = "i am sumana," + "I am a programmer!";
    int length = three.length();
    int a = one.indexOf("java");
    String str = "coding";

        System.out.println(three);
        System.out.println(length);
        System.out.println(four);
        System.out.println(a);
        System.out.println(one);
        System.out.println(one.trim());
        System.out.println(one.equals(two));
        System.out.println(str.length());
        System.out.println(str.indexOf('o'));
    }
}