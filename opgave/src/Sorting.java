import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
private ArrayList<String> ord;

Sorting(ArrayList<String> ord) {
this.ord = ord;

}

public ArrayList<String> getSortedOrd() {
    if(!this.ord.isEmpty()){

        Collections.sort(this.ord);
        return this.ord;
    }
    else return null;
}




}