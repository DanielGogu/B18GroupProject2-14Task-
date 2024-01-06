import java.util.ArrayList;
import java.util.Scanner;

public class Task9 {
    //Find the First Non-Repeating Character in a String: Given a string, find and
    //return the first non-repeating character. For example, in the string
    //"abracadabra", the first non-repeating character is 'c'.
    public  int count;
    public  char theWinner;
    public  char firstNRC(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                int count=0;
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
                this.count=count;
            }
            if (this.count==0){
                this.theWinner=str.charAt(i);

            }
            break;
        }
        return theWinner;
    }
    public static void main(String[] args) {
        String str="abracadabra";
        Task9 first=new Task9();
        System.out.println(first.firstNRC(str));
    }

}
