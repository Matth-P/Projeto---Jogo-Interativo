import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// Chapter Class constructor
public class Chapter {
    private String name;
    private String text;
    protected Character[] characters;
    private int newFear;
    protected ArrayList<Choice> choices;

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
    }

    protected Chapter() {
    }

    public Chapter(HashMap<String, Character> characters2,
            Scanner scanFileChapters) {
        this.load(characters2, scanFileChapters);
        this.choices = new ArrayList<Choice>();
    }



    protected void load(HashMap<String, Character> characters,
            Scanner scanFileChapters) {
        String nameCharacter1;
        String nameCharacter2;
        String nameCharacter3;
        String nameCharacter4;
        //this.scan = scanConsole;
        scanFileChapters.nextLine(); // NAME
        this.name = scanFileChapters.nextLine();
        scanFileChapters.nextLine(); // TEXT:
        this.text = scanFileChapters.nextLine();
        scanFileChapters.nextLine(); // CHARACTERS:
        nameCharacter1 = scanFileChapters.nextLine();
        nameCharacter2 = scanFileChapters.nextLine();
        nameCharacter3 = scanFileChapters.nextLine();
        nameCharacter4 = scanFileChapters.nextLine();
        Character character1 = characters.get(nameCharacter1);
        Character character2 = characters.get(nameCharacter2);
        Character character3 = characters.get(nameCharacter3);
        Character character4 = characters.get(nameCharacter4);
        this.characters = new Character[] { character1, character2, character3, character4 };
        scanFileChapters.nextLine(); // FEAR CHANGE:
        this.newFear = Integer.parseInt(scanFileChapters.nextLine());
    }
    
    public void saveFile()
    {
        try (BufferedWriter savefile = new BufferedWriter(new FileWriter("rsc/SaveFile.txt"))) 
            {
                savefile.write("CHAPTER");
                savefile.newLine();
                savefile.write("NAME:");
                savefile.newLine();
                savefile.write(this.name);
                savefile.newLine();
                savefile.write("TEXT:");
                savefile.newLine();
                savefile.write(this.text);
                savefile.newLine();
                savefile.write("CHARACTERS:");
                savefile.newLine();
                savefile.write(this.characters[0].getName());
                savefile.newLine();
                savefile.write(this.characters[1].getName());
                savefile.newLine();
                savefile.write(this.characters[2].getName());
                savefile.newLine();
                savefile.write(this.characters[3].getName());
                savefile.newLine();
                savefile.write("FEAR CHANGE:");
                savefile.newLine();
                savefile.write(this.newFear);
                savefile.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addChoice(Choice choice) {
        this.choices.add(choice);
    }

    public String getName() {
        return this.name;
    }
    public String getText() {
        return this.text;
    }
    public int getNF() {
        return this.newFear;
    }
    public ArrayList<Choice> getChoices() {
        return this.choices;
    }
}
