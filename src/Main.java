import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// throws - in semnatura metodei (a arunca exceptia mai departe);
// try {.."Codul meu"..} catch(Clasa exceptie) {.."Mesajul meu"..} ;
// throw - arunc eu o metoda ;

// throwable - exception - runtime unchecked exception,
//                        checked exception -> try.. catch;
public class Main {
    // i/o : intare, algo, iesire
    // exceptii;
    // colectii - incepem
    public static void main(String[] args) {
        processFile();
    }

    private static void processFile() {
        String fileName = null;
        boolean succes = false;
        while(!succes) {
            try {
                Scanner sc = new Scanner(System.in);
                fileName = sc.nextLine();
                FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr);
                succes = true; // Nu ajunge aici daca da exceptie mai sus
                String line;
                while ((line = br.readLine()) != null) {
                    String uppercase = line.toUpperCase();
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //alte aplicatii
        System.out.println("aici continuam sa facem altele");
    }
}