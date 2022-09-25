
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class fileLoader {

    public HashMap<String, Character> loadCharacters(String pathFileCharacters) {
        HashMap<String, Character> characters2 = new HashMap<String, Character>();
        File fileCharacters = new File(pathFileCharacters);

        try {
            Scanner scanFileCharacters = new Scanner(fileCharacters, "UTF-8");
            String lineCharacter = "";
            String nameCharacter = "";
            boolean mcCharacter;
            int fearCharacter = 0;

            while (scanFileCharacters.hasNextLine()) {
                while (!lineCharacter.equals("CHARACTER")) {
                    lineCharacter = scanFileCharacters.nextLine();
                }

                lineCharacter = scanFileCharacters.nextLine(); // NAME:
                nameCharacter = scanFileCharacters.nextLine();
                lineCharacter = scanFileCharacters.nextLine(); // MC:
                mcCharacter = scanFileCharacters.nextLine() != null;
                lineCharacter = scanFileCharacters.nextLine(); // FEAR:
                fearCharacter = Integer.parseInt(scanFileCharacters.nextLine());
                characters2.put(nameCharacter, new Character(nameCharacter, mcCharacter, fearCharacter));
            }

            scanFileCharacters.close();

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        return characters2;
    }

    public HashMap<String, Chapter> loadChapters(String pathFileChapters,
            HashMap<String, Character> characters,
            Scanner scanConsole) {
        HashMap<String, Chapter> chapters = new HashMap<String, Chapter>();
        File fileChapters = new File(pathFileChapters);

        try {
            Scanner scanFileChapters = new Scanner(fileChapters, "UTF-8");
            String lineChapter = "";

            while (scanFileChapters.hasNextLine()) {
                while (!lineChapter.equals("CHAPTER_IMAGE") &&
                        !lineChapter.equals("CHAPTER") &&
                        !lineChapter.equals("CHOICE")) {
                    lineChapter = scanFileChapters.nextLine();
                }
                if (lineChapter.equals("CHAPTER_IMAGE")) {
                    ChapterImage chapter = new ChapterImage(characters, scanConsole, scanFileChapters);
                    chapters.put(chapter.getName(), chapter);

                    lineChapter = "";
                }
                if (lineChapter.equals("CHAPTER")) {
                    Chapter chapter = new Chapter(characters, scanConsole, scanFileChapters);
                    chapters.put(chapter.getName(), chapter);

                    lineChapter = "";
                } else if (lineChapter.equals("CHOICE")) {
                    loadChoice(chapters, scanFileChapters);
                    lineChapter = "";
                }

            }

            scanFileChapters.close();

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        return chapters;

    }

    private void loadChoice(HashMap<String, Chapter> chapters,
            Scanner scanFileChapters) {
        String nameChapterOrigin;
        String textChoice;
        String nameChapterDestination;
        String lineChapter;
        lineChapter = scanFileChapters.nextLine(); // CHAPTER A:
        nameChapterOrigin = scanFileChapters.nextLine();
        lineChapter = scanFileChapters.nextLine(); // CHOICE:
        textChoice = scanFileChapters.nextLine();
        lineChapter = scanFileChapters.nextLine(); // CHAPTER B:
        nameChapterDestination = scanFileChapters.nextLine();
        Chapter chapterOrigin = chapters.get(nameChapterOrigin);
        Chapter chapterDestination = chapters.get(nameChapterDestination);
        chapterOrigin.addChoice(new Choice(textChoice, chapterDestination));
    }
}