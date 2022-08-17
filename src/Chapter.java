import java.util.ArrayList;
import java.util.Scanner;

public class Chapter {
    String name;
    String text;
    Character[] characters;
    int newFear;
    ArrayList<Choice> choices;
    Scanner scan;
   

    Chapter(String name,
            String text,
            Character[] characters,
            int newFear,
            Scanner scan)   
    {
        this.name = name;
        this.text = text;
        this.characters = characters;
        this.newFear = newFear;
        this.choices = new ArrayList<Choice>();
        this.scan = scan;       
    }
    
    // Chapter display method
    void display()
    {
        System.out.println();
        System.out.println(this.name);
        System.out.println();
        System.out.println(this.text);
        System.out.println();

        for (int F = 0; F < characters.length; F++) 
        {
            this.characters[F].Fear(this.newFear);     
        }
        System.out.println();

        for (int N = 0; N < characters.length; N++) 
        {   
            int fearFactor = characters[N].fearFactor;
            if (fearFactor != 100)
            {
                System.out.println(characters[N].name);
                System.out.println(characters[N].fearFactor);
                System.out.println();     
            }   
        }

        if (this.choices.size() > 0)
        {
            for (int C = 0; C < choices.size(); C++) 
            {
                System.out.println("" + choices.get(C).text);
            }
        System.out.println();

        int path = Choose();
        this.choices.get(path).nextChapter.display();
        }
    }
    
    //Chpater choice method
    int Choose()
    {
        int path = -1;

        if (choices != null)
        {    
            while (path == -1)
            {
                System.out.print("Your choice: ");
                String pathWrite = scan.nextLine();
                for (int P = 0; P < choices.size(); P++) 
                {   
                    if (pathWrite.equals(choices.get(P).text))
                    {
                    path = P;
                    }
                }
            }
            System.out.println(); 
        }

        return path;
    }
}
