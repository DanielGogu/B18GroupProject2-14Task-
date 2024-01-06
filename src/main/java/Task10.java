import java.util.ArrayList;

public class Task10 {
    //How can you remove all duplicates from ArrayList?

    public static ArrayList removeDuplicates(ArrayList arr){
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size() ; j++) {
                if (arr.get(i)==arr.get(j)){
                    arr.remove(j);
                    j--;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        array.add("abcd");
        array.add("aabb");
        array.add("abc");
        array.add("aabb");
        array.add("abcd");
        array.add("abcde");
        System.out.println("ArrayList before "+array);

        System.out.println("ArrayList after "+removeDuplicates(array));
    }
}
