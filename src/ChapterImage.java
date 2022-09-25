import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ChapterImage extends Chapter {

    private String image;

    public ChapterImage(HashMap<String, Character> characters2, Scanner scanConsole, Scanner scanFileChapters) {
        this.load(characters2, scanConsole, scanFileChapters);
        this.choices = new ArrayList<Choice>();
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println(image);
        System.out.println();
        super.display();
    }

    @Override
    protected void load(HashMap<String, Character> characters,
            Scanner scanConsole,
            Scanner scanFileChapters) {
        String line = scanFileChapters.nextLine(); // IMAGE :
        line = scanFileChapters.nextLine();
        this.image = line;
        line = scanFileChapters.nextLine();
        while (!line.equals("END")) {
            this.image = this.image + "\n" + line;
            line = scanFileChapters.nextLine();
        }
        super.load(characters, scanConsole, scanFileChapters);
    }
}
