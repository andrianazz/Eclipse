package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MainController implements Initializable{

	@FXML
	private Label myLabel;
	@FXML
	public ComboBox<String> combobox;
	
	ObservableList<String> List = FXCollections.observableArrayList("Andrian","Rozi","Wira","Ridho");
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//combobox.setItems(List);
		
	}
	
	public void comboChange(ActionEvent event) {
		myLabel.setText(combobox.getValue());
	}
	
	public void ButtonAction(ActionEvent event) {
		combobox.getItems().addAll("SkyeLite","Genjirou","Joundol","Trinity");
	}

}
