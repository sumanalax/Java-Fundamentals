public class StringManipulator{
    public String trimAndConcat(String str1,String str2){
        return"new String is:" + str1.trim()+str2.trim();
    }
    public Integer getIndexOrNull(String word, char letter){
        return word.indexOf(letter);
    }
    public Integer getIndexOrNull(String word, String substring){
        return word.indexOf(substring);
    }
    public String concatSubstring(String word3, int num1, int num2, String word2){
        return word3.substring(num1,num2)+word2;
    }
}