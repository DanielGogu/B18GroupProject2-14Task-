public class Task2 {
    //Find out how many alpha characters are present in a string?
    public static void main(String[] args) {
        String str="ASdjs sda;ljfas dalkj38ianh9h3";
        int countA=0;

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
                countA++;
            }
        }
        System.out.println("Number of alpha characters present in the string is "+countA);
    }
}
