public class StringManipulatorTest{
    public static void main(String[]args){
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat(" hello, ","  world!  ");
        System.out.println(str);

        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("coding",letter);
        Integer a1 = manipulator.getIndexOrNull("djm",letter);
        Integer b1 = manipulator.getIndexOrNull("doro",letter);
        System.out.println(a);
        System.out.println(a1);
        System.out.println(b1);

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer c = manipulator.getIndexOrNull(word, subString);
        Integer b = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(c); 
        System.out.println(b);

    
        String word1 = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word1);
    }
}