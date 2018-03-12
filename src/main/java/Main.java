import java.util.ArrayList;

public class Main {


    public static String reverseWithCharArray(String inputString) {
        char[] charArray = inputString.toCharArray();
        String resultString = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            resultString = resultString + charArray[i];
        }
        return resultString;
    }

//    public static void main(String[] args) {
//
//        String myString = "AB Soft";
//        String[] subStr;
//        String delimeter = " ";
//        subStr = myString.split(delimeter);
//        for(int i = 0; i < subStr.length; i++) {
//            String word1 = subStr[0];
//            String word2 = subStr[1];
//            System.out.println("AB Soft reverse :" + reverseWithCharArray(word1) + " " + (word2));
//        }
//
//    }

//}
    public static void main(String[] args) {
        String myString = "AB Soft";
        String delimeter = " ";
        String[] subStr = myString.split(delimeter);
        System.out.print(myString + " reverse :");
        for (String substr : subStr) {
            System.out.print(reverseWithCharArray(substr));
            System.out.print(" ");
        }



}}




