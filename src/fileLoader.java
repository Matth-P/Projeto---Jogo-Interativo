
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class fileLoader {

    public HashMap<String, Character> loadCharacters(String pathFileCharacters) 
    {
        HashMap<String, Character> characters = new HashMap<String, Character>();
        File fileCharacters = new File(pathFileCharacters);
        
        try 
        {
            Scanner scanFileCharacters = new Scanner(fileCharacters, "UTF-8");
            String lineCharacter = "";
            String nameCharacter = "";
            boolean mcCharacter;
            int fearCharacter = 0;

            while (scanFileCharacters.hasNextLine())
            {
                while (!lineCharacter.equals("CHARACTER"))
                {
                    lineCharacter = scanFileCharacters.nextLine();
                }
    
                lineCharacter = scanFileCharacters.nextLine(); // NAME:
                nameCharacter = scanFileCharacters.nextLine();
                lineCharacter = scanFileCharacters.nextLine(); // MC:
                mcCharacter = scanFileCharacters.nextLine() != null;
                lineCharacter = scanFileCharacters.nextLine(); // FEAR:
                fearCharacter = Integer.parseInt(scanFileCharacters.nextLine());
                characters.put(nameCharacter, new Character(nameCharacter, mcCharacter, fearCharacter));
            }

            scanFileCharacters.close();

        } catch (FileNotFoundException exception) {
            // TODO Auto-generated catch block
            exception.printStackTrace();
        }
        return characters;
    }
   
    public HashMap<String, Chapter> loadChapters(String pathFileChapters,
                                          HashMap<String, Character> characters,
                                          Scanner scanConsole)
    {
        HashMap<String, Chapter> chapters = new HashMap<String, Chapter>();
        File fileChapters = new File(pathFileChapters);
        
        try 
        {
            Scanner scanFileChapters = new Scanner(fileChapters, "UTF-8");
            String lineChapter = "";

            while (scanFileChapters.hasNextLine())
            {
                while (!lineChapter.equals("CHAPTER") &&
                       !lineChapter.equals("CHOICE"))
                {
                    lineChapter = scanFileChapters.nextLine();
                }
                if (lineChapter.equals("CHAPTER"))
                {
                    loadChapter(characters, scanConsole, chapters, scanFileChapters);
                    lineChapter = "";
                }
                else if (lineChapter.equals("CHOICE"))
                {
                    loadChoice(chapters, scanFileChapters);
                    lineChapter = "";
                }
                
    
            }

            scanFileChapters.close();

        } catch (FileNotFoundException exception) {
            // TODO Auto-generated catch block
            exception.printStackTrace();
        }
        return chapters;

    }

    private void loadChapter(HashMap<String, Character> characters, 
                             Scanner scanConsole,
                             HashMap<String, Chapter> chapters, 
                             Scanner scanFileChapters) 
    {
        String nameChapter;
        String textChapter;
        String nameCharacter1;
        String nameCharacter2;
        String nameCharacter3;
        String nameCharacter4;
        int fearChange;
        String lineChapter;
        lineChapter = scanFileChapters.nextLine(); // NAME:
        nameChapter = scanFileChapters.nextLine();
        lineChapter = scanFileChapters.nextLine(); // TEXT:
        textChapter = scanFileChapters.nextLine();
        lineChapter = scanFileChapters.nextLine(); // CHARACTERS:
        nameCharacter1 = scanFileChapters.nextLine();
        nameCharacter2 = scanFileChapters.nextLine();
        nameCharacter3 = scanFileChapters.nextLine();
        nameCharacter4 = scanFileChapters.nextLine();
        Character character1 = characters.get(nameCharacter1);
        Character character2 = characters.get(nameCharacter2);
        Character character3 = characters.get(nameCharacter3);
        Character character4 = characters.get(nameCharacter4);
        lineChapter = scanFileChapters.nextLine(); // FEAR CHANGE:
        fearChange = Integer.parseInt(scanFileChapters.nextLine());
        chapters.put(nameChapter, new Chapter(nameChapter, 
                                              textChapter,
                                              new Character[]{character1,character2,character3,character4},
                                              fearChange, 
                                              scanConsole));
    } 

    private void loadChoice(HashMap<String, Chapter> chapters, 
                            Scanner scanFileChapters) 
    {
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
