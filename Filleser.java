// Class to read the file and put it into an String Array
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Filleser {
    private int teller = 0;
    private int antord = 0;
    public String [] lestFil (String filnavn) {
        try {
            Scanner filleser = new Scanner(new File(filnavn));
            antord = filleser.nextInt();
            String [] ord = new String[antord];
            filleser.nextLine();

            while(filleser.hasNextLine()){
                ord[teller++] = filleser.nextLine();
            }
            return ord;

        }
        catch (FileNotFoundException e){
            System.out.println("Fant ikke filen");
            return null;
        }


    }
    public int getAntord(){
        return antord;
    }
}
