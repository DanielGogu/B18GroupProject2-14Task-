import java.util.ArrayList;

public class Task8 {
    //You have a list of strings and you want to keep only those that start with
    //“A” and you want to return them in lower case".

    public static void main(String[] args) {
        ArrayList<String> listOfString=new ArrayList<>();
        listOfString.add("Amelia");
        listOfString.add("Mulia");
        listOfString.add("Zilia");
        listOfString.add("fulia");
        listOfString.add("Arelia");
        listOfString.add("Amedia");
        listOfString.add("amelia");
        System.out.println(listOfString);

        for (int i = 0; i < listOfString.size(); i++) {
            String str=listOfString.get(i);
            if (str.startsWith("A")){
                listOfString.set(i,str.toLowerCase());
            }else {
                listOfString.remove(i);
                i--;
            }
        }
        System.out.println(listOfString);

    }
}
