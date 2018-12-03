package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * Основной контроллер сцены
 */
public class Controller {
    @FXML
    Button button_milan;

    @FXML
    Button button_madrid;

    @FXML
    Label label_result;

    @FXML
    Label label_scorer;

    @FXML
    Label label_winner;

    int milan = 0;

    int madrid = 0;

    /**
     * Метод, выполняющийся при создании сцены
     */
    @FXML
    public void initialize(){
        button_milan.setOnAction(event -> {
            milan++;
            label_result.setText("Result: " + milan + " X " + madrid);
            label_scorer.setText("Last Scorer: MILAN");
            setWinner();
        });

        button_madrid.setOnAction(event -> {
            madrid++;
            label_result.setText("Result: " + milan + " X " + madrid);
            label_scorer.setText("Last Scorer: MADRID");
            setWinner();
        });
    }

    /**
     * метод определения победителя и его вывод
     */
    private void setWinner(){
        if (milan > madrid){
            label_winner.setText("Winner: MILAN");
        } else {
            label_winner.setText("Winner: MADRID");
        }
    }

}
