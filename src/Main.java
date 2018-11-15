package MainSourceforJavabowl;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class Main extends Application {

    private static final String aboutwords =
                    "Javabowl is a Javafx application written entirely in Java, developed by Jordan Hill \n" +
                    "and was made for the purpose of being used to practice for quizbowl tournaments, by \n" +
                    "getting the user to go through sets of packets based on the mode that they have selected \n"  +
                    "and challenges the player progressivley with each Question as the Packet set goes on.";
    @Override
    public void start(Stage primaryStage) {
        //StackPanes for storing elements used throughout the program.
        StackPane main = new StackPane();
        StackPane setDiffculty = new StackPane();
        StackPane aboutSection = new StackPane();
        StackPane TypeofPlayer = new StackPane();

        //Buttons for Main Menu returning, etc.
        primaryStage.setTitle("Javabowl");
        Button button = new Button("Press to play the game, Javabowl.");
        button.setTranslateX(-100);
        button.setTranslateY(-130);
        button.setFont(new Font("Arial", 12));
        main.getChildren().add(button);

        Button settings = new Button("Settings");
        settings.setTranslateX(-100);
        settings.setTranslateY(-95);
        settings.setFont(new Font("Arial", 12));
        main.getChildren().add(settings);


        Button backbutton = new Button("Main Menu");
        setDiffculty.getChildren().add(backbutton);
        backbutton.setTranslateX(-335);
        backbutton.setTranslateY(170);
        backbutton.setFont(new Font("Arial", 15));

        Button backbutton3 = new Button("Main Menu");
        aboutSection.getChildren().add(backbutton3);
        backbutton3.setTranslateX(-335);
        backbutton3.setTranslateY(170);
        backbutton.setFont(new Font("Arial", 15));

        Label label = new Label("Press Either Button to Proceed.");
        label.setTranslateY(-160);
        label.setTranslateX(15);
        label.setFont(new Font("Arial", 20));
        main.getChildren().add(label);

        Button button2 = new Button("Press to leave the program, Javabowl.");
        main.getChildren().add(button2);
        button2.setTranslateX(130);
        button2.setTranslateY(-130);
        button2.setFont(new Font("Arial", 12));


        Button button3 = new Button("About Javabowl.");
        main.getChildren().add(button3);
        button3.setTranslateX(10);
        button3.setTranslateY(-50);
        button3.setFont(new Font("Arial", 15));

        //Header for Difficulty Menu Selection.
        Label HeaderSetSelection = new Label("Please Select a Set difficulty.");
        setDiffculty.getChildren().add(HeaderSetSelection);
        HeaderSetSelection.setTranslateY(-160);
        HeaderSetSelection.setFont(new Font("Arial", 20));


        //Buttons for difficulty of the set selection for the player.
        Button level1difficulty = new Button("Easy Mode");
        setDiffculty.getChildren().add(level1difficulty);
        level1difficulty.setTranslateY(-120);
        level1difficulty.setTranslateX(-60);
        level1difficulty.setFont(new Font("Arial", 14));

        Button level2difficulty = new Button("Medium Mode");
        setDiffculty.getChildren().add(level2difficulty);
        level2difficulty.setTranslateY(-120);
        level2difficulty.setTranslateX(60);
        level2difficulty.setFont(new Font("Arial", 14));

        Button level3difficulty = new Button("Hard Mode");
        setDiffculty.getChildren().add(level3difficulty);
        level3difficulty.setTranslateY(-80);
        level3difficulty.setTranslateX(-60);
        level3difficulty.setFont(new Font("Arial", 14));

        Button level4difficulty = new Button("Ultra Mode");
        setDiffculty.getChildren().add(level4difficulty);
        level4difficulty.setTranslateY(-80);
        level4difficulty.setTranslateX(60);
        level4difficulty.setFont(new Font("Arial", 14));

        //Header for the Player type section
        Label playertypeselection = new Label("What type of player are you?");
        TypeofPlayer.getChildren().add(playertypeselection);
        playertypeselection.setTranslateY(-180);
        playertypeselection.setFont(new Font("Arial", 20));

        //Player Button Types
        Button playertype1 = new Button("Science Player");
        TypeofPlayer.getChildren().add(playertype1);
        playertype1.setTranslateY(-140);
        playertype1.setTranslateX(-70);
        playertype1.setFont(new Font("Arial", 15));

        Button playertype2 = new Button("History Player");
        TypeofPlayer.getChildren().add(playertype2);
        playertype2.setTranslateY(-140);
        playertype2.setTranslateX(70);
        playertype2.setFont(new Font("Arial", 15));

        Button playertype3 = new Button("Literature Player");
        TypeofPlayer.getChildren().add(playertype3);
        playertype3.setTranslateX(-75);
        playertype3.setTranslateY(-100);
        playertype3.setFont(new Font("Arial", 15));

        Button playertype4 = new Button("Arts Player");
        TypeofPlayer.getChildren().add(playertype4);
        playertype4.setTranslateX(60);
        playertype4.setTranslateY(-100);
        playertype4.setFont(new Font("Arial", 15));
        //Labels for the About Section
        Label aboutsectionheader = new Label("About Javabowl:");
        aboutSection.getChildren().add(aboutsectionheader);
        aboutsectionheader.setTranslateY(-160);
        aboutsectionheader.setFont(new Font("Arial", 20));

        Label aboutsectiondetails = new Label(aboutwords);
        aboutSection.getChildren().add(aboutsectiondetails);
        aboutsectiondetails.setTranslateY(-100);
        aboutsectiondetails.setFont(new Font("Arial", 15));

        //Scenes used for Button Clicks and storing Buttons
        Scene scene = new Scene(main, 1280, 720);
        Scene difficultyscene = new Scene(setDiffculty, 1280, 720);
        Scene aboutsectionscene = new Scene(aboutSection, 1280, 720);
        Scene playertype = new Scene(TypeofPlayer, 1280, 720);

        //Button lambda Clickers for Button Events
        button.setOnAction(event -> primaryStage.setScene(playertype));
        playertype1.setOnAction(event -> primaryStage.setScene(difficultyscene));
        playertype2.setOnAction(event -> primaryStage.setScene(difficultyscene));
        playertype3.setOnAction(event -> primaryStage.setScene(difficultyscene));
        playertype4.setOnAction(event -> primaryStage.setScene(difficultyscene));
        button3.setOnAction(event -> primaryStage.setScene(aboutsectionscene));
        backbutton.setOnAction(event -> primaryStage.setScene(scene));
        backbutton3.setOnAction(event -> primaryStage.setScene(scene));
        button2.setOnAction(event -> Platform.exit());

        scene.getStylesheets().add(getClass().getResource("style1button-styles.css").toExternalForm());
        difficultyscene.getStylesheets().add(getClass().getResource("style1button-styles.css").toExternalForm());
        aboutsectionscene.getStylesheets().add(getClass().getResource("style1button-styles.css").toExternalForm());
        playertype.getStylesheets().add(getClass().getResource("style1button-styles.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        int i = 0;
        launch(args);
    }
}