import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void startSorting(){
        Scanner sc = new Scanner(System.in);
        boolean start = true;
        ArrayList<String> ordListe = new ArrayList<>();
        while (start){
            String tempSvar = sc.nextLine();
            if (tempSvar.equalsIgnoreCase("stop")){
                start = false;
            }
            else {
                ordListe.add(tempSvar);
            }
        }
        Sorting sorting = new Sorting(ordListe);
        System.out.println(sorting.getSortedOrd());
    }
public static void startContain(){
    System.out.println("Nu går vi til contain klassen");
    System.out.println("Skriv nogle ord du vil fylde op i din arraylist\nNår du er færdig med at skrive ord skriver du: stop");
    ArrayList<String> ordListeTo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean start = true;
        String tempSvar;
        while(start){
            tempSvar = sc.nextLine();
            if (tempSvar.equalsIgnoreCase("stop")){
                start = false;
            }else {
                ordListeTo.add(tempSvar);
            }
        }
    System.out.println("nu er du færdig med din ordliste. Nu skal du skrive det ord du gerne vil søge efter!");
        tempSvar = sc.nextLine();
        Contain.doesContain(tempSvar, ordListeTo);

}

    public static void main(String[] args) {
        System.out.println("Hello.\nIt's Najib");
        System.out.println("Vi starter med sorting klassen");
        System.out.println("Skriv De ord du gerne vil have sorteret:\nSkriv stop for at stoppe.");
startSorting();
startContain();





    }
}
