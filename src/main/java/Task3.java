public class Task3 {
    //Reverse a String: Write a function to reverse a given string. For example,
    //given the input "Hello", the output should be "olleH".
    public static void main(String[] args) {
        String str="Hello World";
        String reversedString ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversedString=reversedString+str.charAt(i);
        }
        System.out.println("The reversed string of "+str+" is "+reversedString);
    }
}
