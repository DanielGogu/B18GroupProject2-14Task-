import java.util.Scanner;

public class Task7 {
    //Count the Number of Words in a String: Write a function to count the
    //number of words in a given string. Words are separated by spaces or
    //punctuation. For example, the input "Hello, world!" should return 2.

public static int countWords(String str){
    if(str.isEmpty()){
        return 0;
    }
    String[] words=str.split("[\\s\\p{Punct}]+");
    return words.length;
    }

    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Please enter the String");
        String inputString=qq.nextLine();
        System.out.println("In your String are "+countWords(inputString)+" words");
    }
}
