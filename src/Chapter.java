import java.util.Scanner;

public class Chapter {
    String name;
    String text;
    Character[] characters;
    int newFear;
    String[] choices;
    Scanner scan;
   

    Chapter(String name,
            String text,
            Character[] characters,
            int newFear,
            String[] choices,
            Scanner scan)   
    {
        this.name = name;
        this.text = text;
        this.characters = characters;
        this.newFear = newFear;
        this.choices = choices;
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
        if (this.choices != null)
        {
            for (int C = 0; C < choices.length; C++) 
            {
                System.out.println();
                System.out.println("" + choices[C]);
            }
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
    }
    
    //Chpater choice method
    int Choose()
    {
        int path = -1;

        if (choices != null)
        {    
            while (path == -1)
            {
                System.out.println("Your choice: ");
                String pathWrite = scan.nextLine();
                for (int P = 0; P < choices.length; P++) 
                {   
                    if (pathWrite.equals(choices[P]))
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
