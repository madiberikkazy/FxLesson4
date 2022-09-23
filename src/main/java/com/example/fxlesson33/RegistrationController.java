package com.example.fxlesson33;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegistrationController implements Initializable {
    @FXML
    Button btn_register, btn_cancel;
    @FXML
    TextField email, password;
    @FXML
    ComboBox<String> combobox, combobox2;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String group[] =
                {"2f2", "2f1", "3e"};
        ObservableList<String> data = FXCollections.observableArrayList(group);
        combobox.setItems(data);
        String group2[] =
                {"200", "201", "202"};
        ObservableList<String> data2 = FXCollections.observableArrayList(group2);
        combobox2.setItems(data2);
    }

    public void registernButtonClicked(ActionEvent event) {
        String comboboxtext = combobox.getValue();
        System.out.println(comboboxtext);
    }

    public void cancelrButtonClicked(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 313, 427);
            Stage stage = new Stage();
            stage.setTitle("Registration form");
            stage.setScene(scene);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
