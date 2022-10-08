import java.util.HashMap;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Controller {
    HashMap<String, Character> characters; 
    HashMap<String, Chapter> chapters;

    @FXML
    private Label imageChpater;


    @FXML
    private VBox spaceBt;

    @FXML
    private Button start;

    @FXML
    private DialogPane textChapter;

    @FXML
    void startGame(ActionEvent event) {
        fileLoader reader = new fileLoader();
        characters = reader.loadCharacters("rsc/Characters.txt");
        chapters = reader.loadChapters("rsc/Chapters.txt", characters);
        Chapter one = chapters.get("- Chapter 1 ------- The ghost at school! -");
        chapterLauncher(one);

    }

 
    void chapterLauncher(Chapter chapter) {
        try
        {
            ChapterImage chapterImage = (ChapterImage) chapter;
            imageChpater.setText(chapterImage.getImage());
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("Failed cast!");
        }
        
        spaceBt.getChildren().clear();
        
        textChapter.setHeaderText(
                chapter.getName() + "\n" +
                chapter.getText() + "\n");

        if (chapter.getChoices().size() > 0) {
            for (Choice choice : chapter.getChoices()) {
                Button bt = new Button(choice.getT());
                bt.setOnAction(new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent event) {
                        chapterLauncher(choice.getNext());
                    }
                });
                
                spaceBt.getChildren().add(bt);
            }
        }
    }

    /* public void display() {
        System.out.println();
        System.out.println(this.name);
        System.out.println();
        System.out.println(this.text);
        System.out.println();

        for (int F = 0; F < characters.length; F++) {
            this.characters[F].Fear(this.newFear);
        }
        System.out.println();

        for (int N = 0; N < characters.length; N++) {
            int fearFactor = characters[N].getFF();
            if (fearFactor != 100) {
                System.out.println(characters[N].getName());
                System.out.println(characters[N].getFF());
                System.out.println();
            }
        }

    } */

}
