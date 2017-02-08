package wordtranslate;

//@author Marisaldi Michele
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class WordTranslate {

    public static void main(String[] args) {

        try {

            String[][] trad= new String[13][2];
            Random r = new Random();

            String in;
            Scanner lettore = new Scanner(System.in);

            FileReader fr = new FileReader("data/traduzione.txt");
            BufferedReader br = new BufferedReader(fr);

            int x = 0;
            while (br.ready()) {
                String s = br.readLine();
                String[] ss = s.split(", ");
                if (ss.length != trad[x].length) {
                    System.out.println("Errore");
                    continue;
                }
                trad[x][0]=ss[0];
                trad[x][1]=ss[1];
                x++;
            }

            int variabile = r.nextInt(trad.length);
            System.out.println(trad[variabile][0]);
            
            System.out.print("In italiano significa: ");
            in = lettore.nextLine();

            while(in.equalsIgnoreCase(trad[variabile][1])){
        
            if (in.equalsIgnoreCase(trad[variabile][1])) {
            System.out.println("Hai indovinato, complimenti!");
            int variabile1 = r.nextInt(trad.length);
            System.out.println(trad[variabile1][0]);
            
            System.out.print("In italiano significa: ");
            in = lettore.nextLine();
            return;
            }else{
                System.out.println("Hai sbagliato, riprova!");
            }
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Errore: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Errore: " + ex.getMessage());
        }
    }
}
