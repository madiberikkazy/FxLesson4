package com.example.fxlesson33;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    Button btn_login, btn_register;
    @FXML
    TextField email, password;
    @FXML
    Label corrected;

    public void loginButtonClicked(ActionEvent event) {
        String str = email.getText().toString();
        String str2 = password.getText().toString();
        if (str.equals("madi") && str2.equals("123")) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("welcome.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 500, 500);
                Stage stage = new Stage();
                stage.setTitle("Welcome form");
                stage.setScene(scene);
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            corrected.setText("dfgsd");
        }
    }


    public void registerButtonClicked(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("register.fxml"));
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
