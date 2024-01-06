import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    //Check if Two Strings are Anagrams: Given two strings, determine if they
    //are anagrams, meaning they contain the same characters in a different order.
    //For example, "listen" and "silent" are anagrams.

    public static boolean isAnagram(String str1,String str2){
        char [] str1CharArray=str1.toLowerCase().replaceAll(" ","").toCharArray();
        char [] str2CharArray=str2.toLowerCase().replaceAll(" ","").toCharArray();

        if(str1CharArray.length!=str2CharArray.length){
            return false;
        }
        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);
        for (int i = 0; i < str1CharArray.length; i++) {
            if(str1CharArray[i]!=str2CharArray[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Enter first String ");
        String str1=qq.nextLine();
        System.out.println("Enter second String ");
        String str2=qq.nextLine();
        System.out.println(isAnagram(str1,str2));
    }
}
