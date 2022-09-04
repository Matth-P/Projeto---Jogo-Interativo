import java.util.HashMap;
import java.util.Scanner;


public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        fileLoader reader = new fileLoader();
        HashMap<String, Character> characters = reader.loadCharacters("rsc/Characters.txt");
        HashMap<String, Chapter> chapters = reader.loadChapters("rsc/Chapters.txt",
                                                                characters,
                                                                scan);


        Chapter one = chapters.get("- Chapter 1 ------- The ghost at school! -");

        // Game Execution
        System.out.println();
        System.out.println("-- Ghost Party --");
        one.display();

        scan.close();
    }
}