import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ChapterImage extends Chapter {

    private String image;

    public ChapterImage(HashMap<String, Character> characters2, Scanner scanFileChapters) {
        this.load(characters2, scanFileChapters);
        this.choices = new ArrayList<Choice>();
    }


    @Override
    protected void load(HashMap<String, Character> characters,
            Scanner scanFileChapters) {
        String line = scanFileChapters.nextLine(); // IMAGE :
        line = scanFileChapters.nextLine();
        this.image = line;
        line = scanFileChapters.nextLine();
        while (!line.equals("END")) {
            this.image = this.image + "\n" + line;
            line = scanFileChapters.nextLine();
        }
        super.load(characters, scanFileChapters);
    }
    @Override
    public void saveFile()
    {
        try (BufferedWriter savefile = new BufferedWriter(new FileWriter("rsc/SaveFile.txt")))
        {
            savefile.write("CHAPTER_IMAGE");
            savefile.newLine();
            savefile.write("IMAGE:");
            savefile.newLine();
            savefile.write(this.image);
            savefile.newLine();
            savefile.write("END");
            savefile.newLine();
            savefile.write("NAME:");
            savefile.newLine();
            savefile.write(getName());
            savefile.newLine();
            savefile.write("TEXT:");
            savefile.newLine();
            savefile.write(getText());
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
            savefile.write(getNF());
            savefile.close();

        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();

          }
    }


    public String getImage() {
        return this.image;
    }
}
