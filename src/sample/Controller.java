package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.*;

public class Controller implements Initializable {
    ArrayList<Patient> patientList= new ArrayList<>();
    @FXML
    private TextField nameField;

    @FXML
    private TextField lastnameField;

    @FXML
    private TextField ageField;

    @FXML
    private Button add;

    @FXML
    private Button print;

    @FXML
    private ChoiceBox<String> sort;
    private String[] items ={"Imie","Nazwisko","Wiek"};

    @FXML
    void sortAction(MouseEvent event) {
    
    }
    @FXML
    void addAction(ActionEvent event) {

        patientList.add(new Patient(nameField.getText(),lastnameField.getText(),ageField.getText()));
}
    @FXML
    void printAction(ActionEvent event) {
        System.out.println(patientList.toString());
        Collections.sort(patientList);

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sort.getItems().addAll(items);


    }
}
