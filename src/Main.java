import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    RowCounter rowCounter = new RowCounter(); //Vi skapar en ny class och objekt "RowCounter" med variabel rowCounter.
    rowsBeforeStop(rowCounter); //Vi skapar en metod som ska räkna hur många rows och signs användaren skriver in.
    }

    private static void rowsBeforeStop(RowCounter RowCounter){ //Vi skapar en metod som är private.
        Scanner scan = new Scanner(System.in); //Scanner så att vi kan scana våra input.
        ArrayList<String> rows = new ArrayList<>(); //Vi skapar en arraylist med namnet rows.
        while (true){ //Vi skapar en while loop.
            System.out.println("Enter text(enter stop to exit)"); //Texten som visas på när programmen först körs.
            String row = scan.nextLine(); //Scannar input och visar det i kommandofältet.
            if(row.equalsIgnoreCase("stop")){ //Om inputen är lika med stop.
                System.out.println("Ending..."); //Texten ending visas upp.
                break; //Och loopen stänger.
            }
            rows.add(row); // Vi lägger värdet av row till rows arraylist
            RowCounter.rowIncrease(); //Varje gång användaren typar in nåt höjs rowcounter med 1.
            RowCounter.signIncrease(row.length()); //Räknar hur många tecken användaren använde i sin input.
        }
        System.out.println("Number of rows: " + RowCounter.getRowCounter()); //Skriver ut resultatet
        System.out.println("Number of signs: " + RowCounter.getSignCounter()); //Skriver ut resultatet
    }
}
