import java.util.Scanner;

public class Task6 {
    //Create a method to count how many vowels are present in a string
    //“documentation”
    public static int countVowels(String str){
        str=str.toLowerCase();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Please enter the String ");
        String str=qq.nextLine();
        System.out.println("The number of vowels in the String is "+countVowels(str));
    }
}
