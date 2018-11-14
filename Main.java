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
        primaryStage.setTitle("Javabowl");
        Button button = new Button("Press to play the game, Javabowl.");
        button.setTranslateX(-130);
        button.setTranslateY(-120);

        StackPane main = new StackPane();
        StackPane setDiffculty = new StackPane();
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


        Scene scene = new Scene(main, 800,400);
        Scene difficultyscene = new Scene(setDiffculty, 800, 400);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(difficultyscene);
            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
