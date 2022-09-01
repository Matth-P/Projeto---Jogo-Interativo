import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class fileLoader {

    HashMap<String, Character> loadCharacters(String pathFileCharacters) {
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

}
