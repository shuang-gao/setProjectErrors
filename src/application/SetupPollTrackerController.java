package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class SetupPollTrackerController extends PollTrackerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textFieldNumOfSeats;

    @FXML
    private Button buttonClear;

    @FXML
    private TextField textFieldNumOfParties;

    @FXML
    private Button buttonSubmit;

    @FXML
    private Pane pane;

    @FXML
    private TextField textFieldNumOfPolls;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    void buttonClearClicked(ActionEvent event) {
 
    	textFieldNumOfPolls.setText("");
    	textFieldNumOfSeats.setText("");
    	textFieldNumOfParties.setText("");
    }

    @FXML
    void buttonSubmitClicked(ActionEvent event) {
        
    }

    @FXML
    void initialize() {
        assert textFieldNumOfSeats != null : "fx:id=\"textFieldNumOfSeats\" was not injected: check your FXML file 'SetupPollTrackerView.fxml'.";
        assert buttonClear != null : "fx:id=\"buttonClear\" was not injected: check your FXML file 'SetupPollTrackerView.fxml'.";
        assert textFieldNumOfParties != null : "fx:id=\"textFieldNumOfParties\" was not injected: check your FXML file 'SetupPollTrackerView.fxml'.";
        assert buttonSubmit != null : "fx:id=\"buttonSubmit\" was not injected: check your FXML file 'SetupPollTrackerView.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'SetupPollTrackerView.fxml'.";
        assert textFieldNumOfPolls != null : "fx:id=\"textFieldNumOfPolls\" was not injected: check your FXML file 'SetupPollTrackerView.fxml'.";
        assert label1 != null : "fx:id=\"label1\" was not injected: check your FXML file 'SetupPollTrackerView.fxml'.";
        assert label2 != null : "fx:id=\"label2\" was not injected: check your FXML file 'SetupPollTrackerView.fxml'.";
        assert label3 != null : "fx:id=\"label3\" was not injected: check your FXML file 'SetupPollTrackerView.fxml'.";

    }

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

    
  
}
