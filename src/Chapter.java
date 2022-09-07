import java.util.ArrayList;
import java.util.Scanner;

// Chapter Class constructor
public class Chapter {
    private String name;
    private String text;
    private Character[] characters;
    private int newFear;
    private ArrayList<Choice> choices;
    private Scanner scan;

    // Chapter building method
    public Chapter(String name,
            String text,
            Character[] characters,
            int newFear,
            Scanner scan) {
        this.name = name;
        this.text = text;
        this.characters = characters;
        this.newFear = newFear;
        this.choices = new ArrayList<Choice>();
        this.scan = scan;
    }

    // Chapter display method, it will show the name and the fear value of a giving
    // character
    public void display() {
        System.out.println();
        System.out.println(this.name);
        System.out.println();
        System.out.println(this.text);
        System.out.println();

        for (int F = 0; F < characters.length; F++) {
            this.characters[F].Fear(this.newFear);
        }
        System.out.println();

        for (int N = 0; N < characters.length; N++) {
            int fearFactor = characters[N].getFF();
            if (fearFactor != 100) {
                System.out.println(characters[N].getName());
                System.out.println(characters[N].getFF());
                System.out.println();
            }
        }

        if (this.choices.size() > 0) {
            for (int C = 0; C < choices.size(); C++) {
                System.out.println("" + choices.get(C).getT());
            }
            System.out.println();

            int path = Choose();
            this.choices.get(path).getNext().display();
        }
    }

    // Chpater choice method, it will ask for a input, and if that input does not
    // equals
    // the actual choice, it will reapeat the question again
    private int Choose() {
        int path = -1;

        if (choices != null) {
            while (path == -1) {
                System.out.print("Your choice: ");
                String pathWrite = scan.nextLine();
                for (int P = 0; P < choices.size(); P++) {
                    if (pathWrite.equals(choices.get(P).getT())) {
                        path = P;
                    }
                }
            }
            System.out.println();
        }

        return path;
    }

    public void addChoice(Choice choice)
    {
       this.choices.add(choice);
    }
}
