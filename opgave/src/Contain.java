import java.util.ArrayList;

public class Contain {

    Contain(){

    }

    public static void doesContain(String s, ArrayList<String> arrayList){
        if (arrayList.contains(s)){
            System.out.println("ArrayList Contains the search: " + s + " At the index: " + arrayList.indexOf(s));
        }
        else {
            System.out.println("ArrayList Does Not Contain the search: " + s);
        }

    }


}