package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Random;
import java.util.regex.Pattern;

/**
 * Контроллер основного экрана
 */
public class Controller {

    private int counter = 0;

    @FXML
    private Button button_guess;

    @FXML
    private TextField text_input;

    /**
     * Метод иницализации экрана
     */
    @FXML
    public void initialize(){
        Random random = new Random();
        int number = random.nextInt(6);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Информация");

        button_guess.setOnAction(event -> {
            System.out.println("click");
            if (isNumber(text_input.getText())){
                counter++;
                int compare = Integer.valueOf(text_input.getText());
                if (compare == number){
                    alert.setContentText("Вы выиграли!");
                    alert.show();
                } else if (counter < 4){
                    alert.setContentText("Неверно! Попробуйте еще раз");
                    alert.show();
                }  else {
                    alert.setContentText("Неверно! Достигнуто максимальное число попыток");
                    alert.show();
                    button_guess.setDisable(true);
                }
            }
        });
    }

    /**
     * Метод, проверяющий то, является ли строка числом (с помощью JavaRegEx)
     * @param toCheck проверяемая строка
     */
    public boolean isNumber(String toCheck){
        final String NUMBER_PATTERN = "^[0-9]+$";
        return Pattern.compile(NUMBER_PATTERN).matcher(toCheck).matches();
    }

}
