public class Task1 {
    //Write a program to swap 2 String without a temporary variable?
    public static void main(String[] args) {
        String str1="String1";
        String str2="String2";

        str1=str2+str1;

        str2=str1.substring(str2.length(),str1.length());
        str1=str1.substring(0,str1.length()-str2.length());

        System.out.println(str1);
        System.out.println(str2);

    }
}
