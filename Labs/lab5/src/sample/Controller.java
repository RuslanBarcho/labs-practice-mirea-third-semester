package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

import javafx.scene.image.ImageView;

import java.io.File;

/**
 * Основной контроллер сцены
 */
public class Controller {

    @FXML
    private Button button;

    @FXML
    private TextField textInput;

    @FXML
    private ImageView imageView;

    /**
     * Метод, выполняющийся при создании сцены
     */
    @FXML
    public void initialize() {
        button.setOnAction(event -> {
            if(!textInput.getText().equals("")){
                try{
                    File file = new File(textInput.getText());
                    String filepath = file.toURI().toString();
                    Image image = new Image(filepath);
                    System.out.println(filepath);
                    imageView.setImage(image);
                } catch (Exception e){
                    System.out.println(e.toString());
                }
            }
        });
    }
}
