import java.util.Scanner;

public class Chapter {
    String name;
    String text;
    Character character;
    int newFear;
    String choice1;
    String choice2;
    Scanner scan;
   

    Chapter(String name,
            String text,
            Character character,
            int newFear,
            String choice1,
            String choice2,
            Scanner scan)   
    {
        this.name = name;
        this.text = text;
        this.character = character;
        this.newFear = newFear;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.scan = scan;       
    }

    void display()
    {
        System.out.println();
        System.out.println(this.name);
        System.out.println();
        System.out.println(this.text);
        System.out.println();
        this.character.Fear(this.newFear);
        if (this.choice1 != null)
        {
            System.out.println();
            System.out.println("" + this.choice1);
        }
        if (this.choice2 != null)
        {
            System.out.println();
            System.out.println("" + this.choice2);
        }
    }
    
    int Choose()
    {
        int choice = -1;

        if (choice1 != null && choice2 != null)
        {    
            while (choice == -1)
            {
                System.out.println("Your choice: ");
                int choose = scan.nextInt();

                if (choose == 1)
                {
                choice = 1;
                }
                else if (choose == 2)
                {
                choice = 2;
                }
        
            } 
        }

        return choice;
    }
}
