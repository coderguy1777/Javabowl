package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane main = new StackPane();
        StackPane setDiffculty = new StackPane();
        StackPane aboutSection = new StackPane();

        primaryStage.setTitle("Javabowl");
        Button button = new Button("Press to play the game, Javabowl.");
        button.setTranslateX(-130);
        button.setTranslateY(-120);
        main.getChildren().add(button);

        Label label = new Label("Press Either Button to Proceed.");
        label.setTranslateY(-165);
        label.setFont(new Font("Arial", 20));
        main.getChildren().add(label);
        Button button2 = new Button("Press to leave the program, Javabowl.");
        main.getChildren().add(button2);
        button2.setTranslateX(130);
        button2.setTranslateY(-120);

        Button button3 = new Button("About Javabowl.");
        main.getChildren().add(button3);
        button3.setTranslateX(-8);
        button3.setTranslateY(-50);
        button3.setFont(new Font("Times New Roman", 15));

        Label HeaderSetSelection = new Label("Please Select a set difficulty.");
        setDiffculty.getChildren().add(HeaderSetSelection);
        HeaderSetSelection.setTranslateY(-160);
        HeaderSetSelection.setFont(new Font("Arial", 20));

        Button level1difficulty = new Button("Easy Mode");
        setDiffculty.getChildren().add(level1difficulty);
        level1difficulty.setTranslateY(-120);
        level1difficulty.setTranslateX(-60);
        level1difficulty.setFont(new Font("Arial", 14));

        Button level2difficulty = new Button("Medium Mode");
        setDiffculty.getChildren().add(level2difficulty);
        level2difficulty.setTranslateY(-120);
        level2difficulty.setTranslateX(60);

        Label aboutsectionheader = new Label("About Javabowl:");
        aboutSection.getChildren().add(aboutsectionheader);
        aboutsectionheader.setTranslateY(-160);
        aboutsectionheader.setFont(new Font("Arial",20));

        Label aboutsectiondetails = new Label("Javabowl is a JavaFX application developed by Jordan Hill, which originally Came from a simple scanner java project, but now is converted into a javafx application for the use of practicing for Quizbowl.");
        aboutSection.getChildren().add(aboutsectiondetails);
        aboutsectionheader.setTranslateY(-140);
        aboutsectionheader.setFont(new Font("Arial",15));

        Scene scene = new Scene(main, 800,400);
        Scene difficultyscene = new Scene(setDiffculty, 800, 400);
        Scene aboutsectionscene = new Scene(aboutSection, 800, 400);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(difficultyscene);
            }
        });

        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(aboutsectionscene);
            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        int i = 0;
        launch(args);
    }
}
