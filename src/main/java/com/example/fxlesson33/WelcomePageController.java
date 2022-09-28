package com.example.fxlesson33;

        import javafx.animation.TranslateTransition;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.fxml.Initializable;
        import javafx.scene.Node;
        import javafx.scene.Scene;
        import javafx.scene.control.Label;
        import javafx.scene.image.ImageView;
        import javafx.scene.layout.AnchorPane;
        import javafx.scene.layout.BorderPane;
        import javafx.scene.layout.Pane;
        import javafx.stage.Stage;
        import javafx.util.Duration;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;

public class WelcomePageController implements Initializable {

    @FXML
    private ImageView Exit;
    @FXML
    private ImageView minimize_btn;
    @FXML
    private ImageView maximize_btn;
    @FXML
    private Label Menu;

    @FXML
    private Label MenuClose;

    @FXML
    private BorderPane mainAnshor;
    @FXML
    private AnchorPane slider;

    public WelcomePageController() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        minimize_btn.setOnMouseClicked(mouseEvent -> {
            Stage s = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            s.setIconified(true);
        });
        maximize_btn.setOnMouseClicked(mouseEvent -> {
            Stage s = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            s.setFullScreen(true);
        });
        Exit.setOnMouseClicked(event -> {
            System.exit(0);
        });
        slider.setTranslateX(-176);
        Menu.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(0);
            slide.play();

            slider.setTranslateX(-176);

            slide.setOnFinished((ActionEvent e)-> {
                Menu.setVisible(false);
                MenuClose.setVisible(true);
            });
        });

        MenuClose.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(-176);
            slide.play();

            slider.setTranslateX(0);

            slide.setOnFinished((ActionEvent e)-> {
                Menu.setVisible(true);
                MenuClose.setVisible(false);
            });
        });

    }
    public void showDashboard(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            mainAnshor.getChildren().clear();
            mainAnshor.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addDashboard(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            mainAnshor.getChildren().clear();
            mainAnshor.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}