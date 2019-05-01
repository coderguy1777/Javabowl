<<<<<<< HEAD
package MainSourceforJavabowl;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    private static final String chicagoopen = "Chicago Open 2018";
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
        StackPane OtherModeSets = new StackPane();
        StackPane MainSettings = new StackPane();
        StackPane playername = new StackPane();
        StackPane playernameconfirmation = new StackPane();
        StackPane setselection = new StackPane();

        //Buttons for Main Menu returning, etc.
        primaryStage.setTitle("Javabowl");
        Button button = new Button("Play Now");
        button.setTranslateX(-60);
        button.setTranslateY(-60);
        button.setFont(new Font("Arial", 15));
        main.getChildren().add(button);

        Button settings = new Button("Settings");
        settings.setTranslateX(-60);
        settings.setTranslateY(-20);
        settings.setFont(new Font("Arial", 15));
        main.getChildren().add(settings);


        Button backbutton = new Button("Main Menu");
        setDiffculty.getChildren().add(backbutton);
        backbutton.setTranslateX(-335);
        backbutton.setTranslateY(170);
        backbutton.setFont(new Font("Arial", 12));

        Button backbutton3 = new Button("Main Menu");
        aboutSection.getChildren().add(backbutton3);
        backbutton3.setTranslateX(-335);
        backbutton3.setTranslateY(170);
        backbutton.setFont(new Font("Arial", 12));

        Button backbutton7 = new Button("Main Menu");
        TypeofPlayer.getChildren().add(backbutton7);
        backbutton7.setTranslateX(-335);
        backbutton7.setTranslateY(170);
        backbutton7.setFont(new Font("Arial", 12));

        Label label = new Label("Press any Button to Proceed.");
        main.getChildren().add(label);
        label.setTranslateY(-100);
        label.setTranslateX(-3);
        label.setFont(new Font("Arial", 20));

        Button button2 = new Button("Exit Here");
        main.getChildren().add(button2);
        button2.setTranslateX(40);
        button2.setTranslateY(-60);
        button2.setFont(new Font("Arial", 15));

        Button othermodes = new Button("Modes");
        main.getChildren().add(othermodes);
        othermodes.setTranslateX(40);
        othermodes.setTranslateY(-20);
        othermodes.setFont(new Font("Arial", 15));

        Button button3 = new Button("About Javabowl.");
        main.getChildren().add(button3);
        button3.setTranslateX(-10);
        button3.setTranslateY(20);
        button3.setFont(new Font("Arial", 9));

        //Header for Difficulty Menu Selection.
        Label HeaderSetSelection = new Label("Please Select a Set difficulty.");
        setDiffculty.getChildren().add(HeaderSetSelection);
        HeaderSetSelection.setTranslateY(-100);
        HeaderSetSelection.setTranslateX(-3);
        HeaderSetSelection.setFont(new Font("Arial", 20));

        //Header for the Other Mode Selection Menu.
        Label OtherModeLabel = new Label("Other Modes Available to Play");
        OtherModeSets.getChildren().add(OtherModeLabel);
        OtherModeLabel.setTranslateY(-80);
        OtherModeLabel.setTranslateX(5);
        OtherModeLabel.setFont(new Font("Arial", 20));

        //Label for the Settings.
        Label settingsheader = new Label("Settings");
        MainSettings.getChildren().add(settingsheader);
        settingsheader.setTranslateY(-150);
        settingsheader.setTranslateX(3);
        settingsheader.setFont(new Font("Arial", 20));

        Label amountofmaxquestions = new Label("Number of Tossups");
        MainSettings.getChildren().add(amountofmaxquestions);
        amountofmaxquestions.setTranslateY(-110);
        amountofmaxquestions.setFont(new Font("Arial", 13));

        Slider maxquestions = new Slider();
        maxquestions.setMin(0);
        maxquestions.setMax(22);
        maxquestions.setValue(0);
        maxquestions.setShowTickLabels(true);
        maxquestions.setShowTickMarks(true);
        maxquestions.setBlockIncrement(200);
        MainSettings.getChildren().add(maxquestions);
        maxquestions.getStyleClass().add("DialStyleSheet.css");
        maxquestions.setTranslateY(-80);
        maxquestions.setMaxWidth(220);

        Label amountofbonuses = new Label("Number of Bonuses");
        MainSettings.getChildren().add(amountofbonuses);
        amountofbonuses.setTranslateY(-60);
        amountofbonuses.setFont(new Font("Arial", 13));

        Slider numberofbonuses = new Slider();
        MainSettings.getChildren().add(numberofbonuses);
        numberofbonuses.setMin(0);
        numberofbonuses.setMax(10);
        numberofbonuses.setValue(0);
        numberofbonuses.setShowTickLabels(true);
        numberofbonuses.setShowTickMarks(true);
        numberofbonuses.setBlockIncrement(50);
        numberofbonuses.getStyleClass().add("DialStyleSheet.css");
        numberofbonuses.setTranslateY(-30);
        numberofbonuses.setMaxWidth(220);

        Label amountofquestiontime = new Label("Time For Each Question");
        MainSettings.getChildren().add(amountofquestiontime);
        amountofquestiontime.setTranslateY(-10);
        amountofquestiontime.setFont(new Font("Arial", 13));

        Slider timeforeachquestions = new Slider();
        MainSettings.getChildren().add(timeforeachquestions);
        timeforeachquestions.setMin(0);
        timeforeachquestions.setMax(10);
        timeforeachquestions.setValue(0);
        timeforeachquestions.setShowTickLabels(true);
        timeforeachquestions.setShowTickMarks(true);
        timeforeachquestions.setBlockIncrement(50);
        timeforeachquestions.getStyleClass().add("DialStyleSheet.css");
        timeforeachquestions.setTranslateY(20);
        timeforeachquestions.setMaxWidth(220);


        Button backbutton4 = new Button("Main Menu");
        OtherModeSets.getChildren().add(backbutton4);
        backbutton4.setTranslateX(-335);
        backbutton4.setTranslateY(170);
        backbutton4.setFont(new Font("Arial", 12));

        Button backbutton5 = new Button("Main Menu");
        MainSettings.getChildren().add(backbutton5);
        backbutton5.setTranslateX(-335);
        backbutton5.setTranslateY(170);
        backbutton5.setFont(new Font("Arial", 12));

        Button speedmode = new Button("Speed Mode");
        OtherModeSets.getChildren().add(speedmode);
        speedmode.setTranslateY(-50);
        speedmode.setTranslateX(-50);
        speedmode.setFont(new Font("Arial", 11));

        Button randommode = new Button("Random Mode");
        OtherModeSets.getChildren().add(randommode);
        randommode.setTranslateX(-50);
        randommode.setTranslateY(-20);
        randommode.setFont(new Font("Arial",10));

        Button computermode = new Button("Play an AI");
        OtherModeSets.getChildren().add(computermode);
        computermode.setTranslateY(-20);
        computermode.setTranslateX(50);
        computermode.setFont(new Font("Arial", 12));

        Button Teams = new Button("Teams");
        OtherModeSets.getChildren().add(Teams);
        Teams.setTranslateY(-50);
        Teams.setTranslateX(50);
        Teams.setFont(new Font("Arial", 12));

        //Buttons for difficulty of the set selection for the player.
        Button level1difficulty = new Button("Easy");
        setDiffculty.getChildren().add(level1difficulty);
        level1difficulty.setTranslateY(-60);
        level1difficulty.setTranslateX(-60);
        level1difficulty.setFont(new Font("Arial", 14));

        Button level2difficulty = new Button("Medium");
        setDiffculty.getChildren().add(level2difficulty);
        level2difficulty.setTranslateY(-60);
        level2difficulty.setTranslateX(40);
        level2difficulty.setFont(new Font("Arial", 14));

        Button level3difficulty = new Button("Hard");
        setDiffculty.getChildren().add(level3difficulty);
        level3difficulty.setTranslateY(-20);
        level3difficulty.setTranslateX(-60);
        level3difficulty.setFont(new Font("Arial", 14));

        Button level4difficulty = new Button("Ultra");
        setDiffculty.getChildren().add(level4difficulty);
        level4difficulty.setTranslateY(-20);
        level4difficulty.setTranslateX(40);
        level4difficulty.setFont(new Font("Arial", 14));

        //Header for the Player type section
        Label playertypeselection = new Label("What type of player are you?");
        TypeofPlayer.getChildren().add(playertypeselection);
        playertypeselection.setTranslateY(-100);
        playertypeselection.setTranslateX(-3);
        playertypeselection.setFont(new Font("Arial", 20));

        //Player Button Types
        Button playertype1 = new Button("Science");
        TypeofPlayer.getChildren().add(playertype1);
        playertype1.setTranslateY(-60);
        playertype1.setTranslateX(-60);
        playertype1.setFont(new Font("Arial", 15));

        Button playertype2 = new Button("History");
        TypeofPlayer.getChildren().add(playertype2);
        playertype2.setTranslateY(-60);
        playertype2.setTranslateX(40);
        playertype2.setFont(new Font("Arial", 15));

        Button playertype3 = new Button("Literature");
        TypeofPlayer.getChildren().add(playertype3);
        playertype3.setTranslateX(-60);
        playertype3.setTranslateY(-20);
        playertype3.setFont(new Font("Arial", 13));

        Button playertype4 = new Button("Arts");
        TypeofPlayer.getChildren().add(playertype4);
        playertype4.setTranslateX(40);
        playertype4.setTranslateY(-20);
        playertype4.setFont(new Font("Arial", 15));

        Button playertype5 = new Button("REM");
        TypeofPlayer.getChildren().add(playertype5);
        playertype5.setTranslateX(-60);
        playertype5.setTranslateY(20);
        playertype5.setFont(new Font("Arial", 15));

        Button playertype6 = new Button("Trash");
        TypeofPlayer.getChildren().add(playertype6);
        playertype6.setTranslateX(40);
        playertype6.setTranslateY(20);
        playertype6.setFont(new Font("Arial",15));

        Button backbutton6 = new Button("Main Menu");
        MainSettings.getChildren().add(backbutton6);
        backbutton6.setTranslateX(-335);
        backbutton6.setTranslateY(170);
        backbutton6.setFont(new Font("Arial", 12));

        Button nonmainmenubackbutton = new Button("Go Back");
        setDiffculty.getChildren().add(nonmainmenubackbutton);
        nonmainmenubackbutton.setTranslateX(-230);
        nonmainmenubackbutton.setTranslateY(170);
        nonmainmenubackbutton.setFont(new Font("Arial", 12));

        //Labels for the About Section
        Label aboutsectionheader = new Label("About Javabowl:");
        aboutSection.getChildren().add(aboutsectionheader);
        aboutsectionheader.setTranslateY(-90);
        aboutsectionheader.setTranslateX(10);
        aboutsectionheader.setFont(new Font("Arial", 20));

        TextField textField = new TextField();
        textField.setMaxWidth(180);
        textField.setFont(new Font("Arial", 13));
        textField.setMaxHeight(15);
        textField.setTranslateX(-5);
        textField.setTranslateY(-20);
        textField.setEditable(true);
        playername.getChildren().add(textField);

        Label playernameheader = new Label("Enter your Name");
        playername.getChildren().add(playernameheader);
        playernameheader.getStyleClass().add("test");
        playernameheader.setTranslateX(-5);
        playernameheader.setTranslateY(-50);
        playernameheader.setFont(new Font("Arial", 20));

        Button playernameenter = new Button("Press to Confirm your Player name");
        playername.getChildren().add(playernameenter);
        playernameenter.setTranslateY(20);
        playernameenter.setTranslateX(-5);
        playernameenter.setFont(new Font("Arial", 12));
        playernameenter.getStyleClass().add("userbuttonconfirmation");


        //About Section Details
        Label aboutsectiondetails = new Label(aboutwords);
        aboutSection.getChildren().add(aboutsectiondetails);
        aboutsectiondetails.setTranslateY(-30);
        aboutsectiondetails.setTranslateX(20);
        aboutsectiondetails.setFont(new Font("Arial", 15));

        Label confirmationofname = new Label(" Your Player Name is: ");
        playernameconfirmation.getChildren().add(confirmationofname);
        confirmationofname.setTranslateY(-90);
        confirmationofname.setFont(new Font("Arial", 20));
        confirmationofname.getStyleClass().add("textcolorsforuser");

        Label informationfouserconf = new Label ("Please Either click Yes or No to confirm your selected name:");
        playernameconfirmation.getChildren().add(informationfouserconf);
        informationfouserconf.setTranslateY(-60);
        informationfouserconf.setFont(new Font("Arial",15));
        informationfouserconf.getStyleClass().add("otherlabelcolors");

        Button yesselection = new Button("Yes");
        playernameconfirmation.getChildren().add(yesselection);
        yesselection.setTranslateY(-30);
        yesselection.setTranslateX(-40);
        yesselection.setFont(new Font("Arial", 15));
        yesselection.getStyleClass().add("yesbutton");

        Button incorrectnameselection = new Button("No");
        playernameconfirmation.getChildren().add(incorrectnameselection);
        incorrectnameselection.setTranslateY(-30);
        incorrectnameselection.setTranslateX(40);
        incorrectnameselection.setFont(new Font("Arial", 15));
        incorrectnameselection.getStyleClass().add("nobutton");

        Label setselector = new Label("Please type in a set to select below");
        setselection.getChildren().add(setselector);
        setselector.setTranslateY(-70);
        setselector.setFont(new Font("Arial", 20));
        setselector.getStyleClass().add("otherlabelcolors");

        TextField setsearcher = new TextField();
        setselection.getChildren().add(setsearcher);
        setsearcher.setTranslateY(-40);
        setsearcher.setEditable(true);
        setsearcher.setMaxWidth(180);
        setsearcher.setMaxHeight(15);

        Button searchfunction = new Button("Search for a Question Packet");
        setselection.getChildren().add(searchfunction);
        searchfunction.setTranslateY(-5);
        searchfunction.setFont(new Font("Arial", 12.5));
        searchfunction.getStyleClass().add("searchbutton");


        //Scenes used for Button Clicks and storing Buttons
        Scene scene = new Scene(main, 800, 400);
        Scene difficultyscene = new Scene(setDiffculty, 800, 400);
        Scene aboutsectionscene = new Scene(aboutSection, 800, 400);
        Scene playertype = new Scene(TypeofPlayer, 800, 400);
        Scene othermodemenu = new Scene(OtherModeSets, 800,400);
        Scene settingsarea = new Scene(MainSettings, 800, 400);
        Scene playernamescene = new Scene(playername, 800,400);
        Scene playernameconfirmationscene = new Scene(playernameconfirmation, 800,400);
        Scene setselectionscene = new Scene(setselection, 800, 400);

        //Button lambda Clickers for Button Events
        button.setOnAction(event -> primaryStage.setScene(playertype));
        playertype1.setOnAction(event -> primaryStage.setScene(difficultyscene));
        playertype2.setOnAction(event -> primaryStage.setScene(difficultyscene));
        playertype3.setOnAction(event -> primaryStage.setScene(difficultyscene));
        playertype4.setOnAction(event -> primaryStage.setScene(difficultyscene));
        playertype5.setOnAction(event -> primaryStage.setScene(difficultyscene));
        button3.setOnAction(event -> primaryStage.setScene(aboutsectionscene));
        backbutton.setOnAction(event -> primaryStage.setScene(scene));
        backbutton3.setOnAction(event -> primaryStage.setScene(scene));
        othermodes.setOnAction(event -> primaryStage.setScene(othermodemenu));
        backbutton4.setOnAction(event -> primaryStage.setScene(scene));
        backbutton5.setOnAction(event -> primaryStage.setScene(scene));
        button2.setOnAction(event -> Platform.exit());
        nonmainmenubackbutton.setOnAction(event -> primaryStage.setScene(playertype));
        settings.setOnAction(event -> primaryStage.setScene(settingsarea));
        backbutton6.setOnAction(event -> primaryStage.setScene(scene));
        backbutton7.setOnAction(event -> primaryStage.setScene(scene));
        playertype6.setOnAction(event -> primaryStage.setScene(difficultyscene));
        level1difficulty.setOnAction(event -> primaryStage.setScene(playernamescene));
        speedmode.setOnAction(event -> primaryStage.setScene(difficultyscene));
        computermode.setOnAction(event -> primaryStage.setScene(difficultyscene));
        randommode.setOnAction(event -> primaryStage.setScene(difficultyscene));
        Teams.setOnAction(event -> primaryStage.setScene(difficultyscene));
        playernameenter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(playernameconfirmationscene);
                confirmationofname.setText("Your name is: " + textField.getText());
            }
        });
        incorrectnameselection.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(playernamescene);
                playernameheader.setText("Please enter your username again:");
            }
        });
        yesselection.setOnAction(event -> primaryStage.setScene(setselectionscene));
        searchfunction.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SetSelector setSelector = new SetSelector();
                if(setsearcher.getText().contains("Chicago Open 2018")) {
                    setSelector.getChicagoOpen();
                    Label setlabel = new Label("This is the set you selected, " + chicagoopen);
                    setlabel.setTranslateY(30);
                    setlabel.setFont(new Font("Arial", 15));
                    setselection.getChildren().add(setlabel);
                    setlabel.getStyleClass().add("brightcolors");
                }
                if(setsearcher.getText().contains("NASAT 2018")) {
                    setSelector.getNASATTossups2018();
                }
                if(setsearcher.getText().contains("PACE NSC 2018")) {
                    setSelector.getPACENSC2018();
                }
                if(setsearcher.getText().contains("IMSAnity5 2018")) {
                    setSelector.getIMSAnity52018();
                }
                if(setsearcher.getText().contains("ACF Nationals 2018")) {
                    setSelector.getACFNationals2018();
                }
            }
        });

        scene.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        difficultyscene.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        aboutsectionscene.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        playertype.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        othermodemenu.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        settingsarea.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        settingsarea.getStylesheets().add(getClass().getResource("LabelStyleSheet.css").toExternalForm());
        playernamescene.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        playernameconfirmationscene.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        setselectionscene.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
=======
package MainSourceforJavabowl;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Main extends Application {
    public static ArrayList<String>tests = new ArrayList<>();
    private static final String chicagoopen = "Chicago Open 2018.";
    private static final String FACTS = "FACTS 2018.";
    private static final String NASAT2018Open = "NASAT 2018.";
    private static final String IMSAnity52018 = "IMSAnity 5 2018.";
    private static final String ACFNationals2018 = "ACF Nationals 2018.";

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
        StackPane OtherModeSets = new StackPane();
        StackPane MainSettings = new StackPane();
        StackPane playername = new StackPane();
        StackPane playernameconfirmation = new StackPane();
        StackPane setselection = new StackPane();
        StackPane setconfirm = new StackPane();
        StackPane questionset = new StackPane();
        StackPane bonueses = new StackPane();

        //Buttons for Main Menu returning, etc.
        primaryStage.setTitle("Javabowl");
        Button button = new Button("Play Now");
        button.setTranslateX(-60);
        button.setTranslateY(-60);
        button.setFont(new Font("Arial", 15));
        main.getChildren().add(button);

        Button settings = new Button("Settings");
        settings.setTranslateX(-60);
        settings.setTranslateY(-20);
        settings.setFont(new Font("Arial", 15));
        main.getChildren().add(settings);


        Button backbutton = new Button("Main Menu");
        setDiffculty.getChildren().add(backbutton);
        backbutton.setTranslateX(-335);
        backbutton.setTranslateY(170);
        backbutton.setFont(new Font("Arial", 12));

        Button backbutton3 = new Button("Main Menu");
        aboutSection.getChildren().add(backbutton3);
        backbutton3.setTranslateX(-335);
        backbutton3.setTranslateY(170);
        backbutton.setFont(new Font("Arial", 12));

        Button backbutton7 = new Button("Main Menu");
        TypeofPlayer.getChildren().add(backbutton7);
        backbutton7.setTranslateX(-335);
        backbutton7.setTranslateY(170);
        backbutton7.setFont(new Font("Arial", 12));

        Label label = new Label("Press any Button to Proceed.");
        main.getChildren().add(label);
        label.setTranslateY(-100);
        label.setTranslateX(-3);
        label.setFont(new Font("Arial", 20));


        Button button2 = new Button("Exit Here");
        main.getChildren().add(button2);
        button2.setTranslateX(40);
        button2.setTranslateY(-60);
        button2.setFont(new Font("Arial", 15));

        Button othermodes = new Button("Modes");
        main.getChildren().add(othermodes);
        othermodes.setTranslateX(40);
        othermodes.setTranslateY(-20);
        othermodes.setFont(new Font("Arial", 15));

        Button button3 = new Button("About Javabowl.");
        main.getChildren().add(button3);
        button3.setTranslateX(-10);
        button3.setTranslateY(20);
        button3.setFont(new Font("Arial", 9));

        //Header for Difficulty Menu Selection.
        Label HeaderSetSelection = new Label("Please Select a Set difficulty.");
        setDiffculty.getChildren().add(HeaderSetSelection);
        HeaderSetSelection.setTranslateY(-100);
        HeaderSetSelection.setTranslateX(-3);
        HeaderSetSelection.setFont(new Font("Arial", 20));

        //Header for the Other Mode Selection Menu.
        Label OtherModeLabel = new Label("Other Modes Available to Play");
        OtherModeSets.getChildren().add(OtherModeLabel);
        OtherModeLabel.setTranslateY(-80);
        OtherModeLabel.setTranslateX(5);
        OtherModeLabel.setFont(new Font("Arial", 20));

        //Label for the Settings.
        Label settingsheader = new Label("Settings");
        MainSettings.getChildren().add(settingsheader);
        settingsheader.setTranslateY(-150);
        settingsheader.setTranslateX(3);
        settingsheader.setFont(new Font("Arial", 20));

        Label amountofmaxquestions = new Label("Number of Tossups");
        MainSettings.getChildren().add(amountofmaxquestions);
        amountofmaxquestions.setTranslateY(-110);
        amountofmaxquestions.setFont(new Font("Arial", 13));

        Slider maxquestions = new Slider();
        maxquestions.setMin(0);
        maxquestions.setMax(22);
        maxquestions.setValue(0);
        maxquestions.setShowTickLabels(true);
        maxquestions.setShowTickMarks(true);
        maxquestions.setBlockIncrement(200);
        MainSettings.getChildren().add(maxquestions);
        maxquestions.getStyleClass().add("DialStyleSheet.css");
        maxquestions.setTranslateY(-80);
        maxquestions.setMaxWidth(220);

        Label amountofbonuses = new Label("Number of Bonuses");
        MainSettings.getChildren().add(amountofbonuses);
        amountofbonuses.setTranslateY(-60);
        amountofbonuses.setFont(new Font("Arial", 13));

        Slider numberofbonuses = new Slider();
        MainSettings.getChildren().add(numberofbonuses);
        numberofbonuses.setMin(0);
        numberofbonuses.setMax(10);
        numberofbonuses.setValue(0);
        numberofbonuses.setShowTickLabels(true);
        numberofbonuses.setShowTickMarks(true);
        numberofbonuses.setBlockIncrement(50);
        numberofbonuses.getStyleClass().add("DialStyleSheet.css");
        numberofbonuses.setTranslateY(-30);
        numberofbonuses.setMaxWidth(220);

        Label amountofquestiontime = new Label("Time For Each Question");
        MainSettings.getChildren().add(amountofquestiontime);
        amountofquestiontime.setTranslateY(-10);
        amountofquestiontime.setFont(new Font("Arial", 13));

        Slider timeforeachquestions = new Slider();
        MainSettings.getChildren().add(timeforeachquestions);
        timeforeachquestions.setMin(0);
        timeforeachquestions.setMax(10);
        timeforeachquestions.setValue(0);
        timeforeachquestions.setShowTickLabels(true);
        timeforeachquestions.setShowTickMarks(true);
        timeforeachquestions.setBlockIncrement(50);
        timeforeachquestions.getStyleClass().add("DialStyleSheet.css");
        timeforeachquestions.setTranslateY(20);
        timeforeachquestions.setMaxWidth(220);


        Button backbutton4 = new Button("Main Menu");
        OtherModeSets.getChildren().add(backbutton4);
        backbutton4.setTranslateX(-335);
        backbutton4.setTranslateY(170);
        backbutton4.setFont(new Font("Arial", 12));

        Button backbutton5 = new Button("Main Menu");
        MainSettings.getChildren().add(backbutton5);
        backbutton5.setTranslateX(-335);
        backbutton5.setTranslateY(170);
        backbutton5.setFont(new Font("Arial", 12));

        Button speedmode = new Button("Speed Mode");
        OtherModeSets.getChildren().add(speedmode);
        speedmode.setTranslateY(-50);
        speedmode.setTranslateX(-50);
        speedmode.setFont(new Font("Arial", 11));

        Button randommode = new Button("Random Mode");
        OtherModeSets.getChildren().add(randommode);
        randommode.setTranslateX(-50);
        randommode.setTranslateY(-20);
        randommode.setFont(new Font("Arial",10));

        Button computermode = new Button("Play an AI");
        OtherModeSets.getChildren().add(computermode);
        computermode.setTranslateY(-20);
        computermode.setTranslateX(50);
        computermode.setFont(new Font("Arial", 12));

        Button Teams = new Button("Teams");
        OtherModeSets.getChildren().add(Teams);
        Teams.setTranslateY(-50);
        Teams.setTranslateX(50);
        Teams.setFont(new Font("Arial", 12));

        //Buttons for difficulty of the set selection for the player.
        Button level1difficulty = new Button("Easy");
        setDiffculty.getChildren().add(level1difficulty);
        level1difficulty.setTranslateY(-60);
        level1difficulty.setTranslateX(-60);
        level1difficulty.setFont(new Font("Arial", 14));

        Button level2difficulty = new Button("Medium");
        setDiffculty.getChildren().add(level2difficulty);
        level2difficulty.setTranslateY(-60);
        level2difficulty.setTranslateX(40);
        level2difficulty.setFont(new Font("Arial", 14));

        Button level3difficulty = new Button("Hard");
        setDiffculty.getChildren().add(level3difficulty);
        level3difficulty.setTranslateY(-20);
        level3difficulty.setTranslateX(-60);
        level3difficulty.setFont(new Font("Arial", 14));

        Button level4difficulty = new Button("Ultra");
        setDiffculty.getChildren().add(level4difficulty);
        level4difficulty.setTranslateY(-20);
        level4difficulty.setTranslateX(40);
        level4difficulty.setFont(new Font("Arial", 14));

        //Header for the Player type section
        Label playertypeselection = new Label("What type of player are you?");
        TypeofPlayer.getChildren().add(playertypeselection);
        playertypeselection.setTranslateY(-100);
        playertypeselection.setTranslateX(-3);
        playertypeselection.setFont(new Font("Arial", 20));

        //Player Button Types
        Button playertype1 = new Button("Science");
        TypeofPlayer.getChildren().add(playertype1);
        playertype1.setTranslateY(-60);
        playertype1.setTranslateX(-60);
        playertype1.setFont(new Font("Arial", 15));

        Button playertype2 = new Button("History");
        TypeofPlayer.getChildren().add(playertype2);
        playertype2.setTranslateY(-60);
        playertype2.setTranslateX(40);
        playertype2.setFont(new Font("Arial", 15));

        Button playertype3 = new Button("Literature");
        TypeofPlayer.getChildren().add(playertype3);
        playertype3.setTranslateX(-60);
        playertype3.setTranslateY(-20);
        playertype3.setFont(new Font("Arial", 13));

        Button playertype4 = new Button("Arts");
        TypeofPlayer.getChildren().add(playertype4);
        playertype4.setTranslateX(40);
        playertype4.setTranslateY(-20);
        playertype4.setFont(new Font("Arial", 15));

        Button playertype5 = new Button("REM");
        TypeofPlayer.getChildren().add(playertype5);
        playertype5.setTranslateX(-60);
        playertype5.setTranslateY(20);
        playertype5.setFont(new Font("Arial", 15));

        Button playertype6 = new Button("Trash");
        TypeofPlayer.getChildren().add(playertype6);
        playertype6.setTranslateX(40);
        playertype6.setTranslateY(20);
        playertype6.setFont(new Font("Arial",15));

        Button backbutton6 = new Button("Main Menu");
        MainSettings.getChildren().add(backbutton6);
        backbutton6.setTranslateX(-335);
        backbutton6.setTranslateY(170);
        backbutton6.setFont(new Font("Arial", 12));

        Button nonmainmenubackbutton = new Button("Go Back");
        setDiffculty.getChildren().add(nonmainmenubackbutton);
        nonmainmenubackbutton.setTranslateX(-230);
        nonmainmenubackbutton.setTranslateY(170);
        nonmainmenubackbutton.setFont(new Font("Arial", 12));

        //Labels for the About Section
        Label aboutsectionheader = new Label("About Javabowl:");
        aboutSection.getChildren().add(aboutsectionheader);
        aboutsectionheader.setTranslateY(-90);
        aboutsectionheader.setTranslateX(10);
        aboutsectionheader.setFont(new Font("Arial", 20));

        TextField textField = new TextField();
        textField.setMaxWidth(180);
        textField.setFont(new Font("Arial", 13));
        textField.setMaxHeight(15);
        textField.setTranslateX(-5);
        textField.setTranslateY(-20);
        textField.setEditable(true);
        playername.getChildren().add(textField);

        Label playernameheader = new Label("Enter your Name");
        playername.getChildren().add(playernameheader);
        playernameheader.getStyleClass().add("test");
        playernameheader.setTranslateX(-5);
        playernameheader.setTranslateY(-50);
        playernameheader.setFont(new Font("Arial", 20));

        Button playernameenter = new Button("Press to Confirm your Player name");
        playername.getChildren().add(playernameenter);
        playernameenter.setTranslateY(20);
        playernameenter.setTranslateX(-5);
        playernameenter.setFont(new Font("Arial", 12));
        playernameenter.getStyleClass().add("userbuttonconfirmation");


        //About Section Details
        Label aboutsectiondetails = new Label(aboutwords);
        aboutSection.getChildren().add(aboutsectiondetails);
        aboutsectiondetails.setTranslateY(-30);
        aboutsectiondetails.setTranslateX(20);
        aboutsectiondetails.setFont(new Font("Arial", 15));

        Label confirmationofname = new Label(" Your Player Name is: ");
        playernameconfirmation.getChildren().add(confirmationofname);
        confirmationofname.setTranslateY(-90);
        confirmationofname.setFont(new Font("Arial", 20));
        confirmationofname.getStyleClass().add("textcolorsforuser");

        Label informationfouserconf = new Label ("Please Either click Yes or No to confirm your selected name:");
        playernameconfirmation.getChildren().add(informationfouserconf);
        informationfouserconf.setTranslateY(-60);
        informationfouserconf.setFont(new Font("Arial",15));
        informationfouserconf.getStyleClass().add("otherlabelcolors");

        Button yesselection = new Button("Yes");
        playernameconfirmation.getChildren().add(yesselection);
        yesselection.setTranslateY(-30);
        yesselection.setTranslateX(-40);
        yesselection.setFont(new Font("Arial", 15));
        yesselection.getStyleClass().add("yesbutton");

        Button incorrectnameselection = new Button("No");
        playernameconfirmation.getChildren().add(incorrectnameselection);
        incorrectnameselection.setTranslateY(-30);
        incorrectnameselection.setTranslateX(40);
        incorrectnameselection.setFont(new Font("Arial", 15));
        incorrectnameselection.getStyleClass().add("nobutton");

        Label setselector = new Label("Please type in a set to select below");
        setselection.getChildren().add(setselector);
        setselector.setTranslateY(-70);
        setselector.setFont(new Font("Arial", 20));
        setselector.getStyleClass().add("otherlabelcolors");

        TextField setsearcher = new TextField();
        setselection.getChildren().add(setsearcher);
        setsearcher.setTranslateY(-40);
        setsearcher.setEditable(true);
        setsearcher.setMaxWidth(180);
        setsearcher.setMaxHeight(15);

        Button searchfunction = new Button("Search for a Question Packet");
        setselection.getChildren().add(searchfunction);
        searchfunction.setTranslateY(-5);
        searchfunction.setFont(new Font("Arial", 12.5));
        searchfunction.getStyleClass().add("searchbutton");

        //Scenes used for Button Clicks and storing Buttons
        Scene scene = new Scene(main, 800, 400);
        Scene difficultyscene = new Scene(setDiffculty, 800, 400);
        Scene aboutsectionscene = new Scene(aboutSection, 800, 400);
        Scene playertype = new Scene(TypeofPlayer, 800, 400);
        Scene othermodemenu = new Scene(OtherModeSets, 800,400);
        Scene settingsarea = new Scene(MainSettings, 800, 400);
        Scene playernamescene = new Scene(playername, 800,400);
        Scene playernameconfirmationscene = new Scene(playernameconfirmation, 800,400);
        Scene setselectionscene = new Scene(setselection, 800, 400);
        Scene setselectionconf = new Scene(setconfirm, 800, 400);
        Scene questions = new Scene(questionset, 800, 400);


        //Button lambda Clickers for Button Events
        button.setOnAction(event -> primaryStage.setScene(playertype));
        playertype1.setOnAction(event -> primaryStage.setScene(difficultyscene));
        playertype2.setOnAction(event -> primaryStage.setScene(difficultyscene));
        playertype3.setOnAction(event -> primaryStage.setScene(difficultyscene));
        playertype4.setOnAction(event -> primaryStage.setScene(difficultyscene));
        playertype5.setOnAction(event -> primaryStage.setScene(difficultyscene));
        button3.setOnAction(event -> primaryStage.setScene(aboutsectionscene));
        backbutton.setOnAction(event -> primaryStage.setScene(scene));
        backbutton3.setOnAction(event -> primaryStage.setScene(scene));
        othermodes.setOnAction(event -> primaryStage.setScene(othermodemenu));
        backbutton4.setOnAction(event -> primaryStage.setScene(scene));
        searchfunction.setOnAction(event -> primaryStage.setScene(setselectionconf));
        backbutton5.setOnAction(event -> primaryStage.setScene(scene));
        button2.setOnAction(event -> Platform.exit());
        nonmainmenubackbutton.setOnAction(event -> primaryStage.setScene(playertype));
        settings.setOnAction(event -> primaryStage.setScene(settingsarea));
        backbutton6.setOnAction(event -> primaryStage.setScene(scene));
        backbutton7.setOnAction(event -> primaryStage.setScene(scene));
        playertype6.setOnAction(event -> primaryStage.setScene(difficultyscene));
        level1difficulty.setOnAction(event -> primaryStage.setScene(playernamescene));
        speedmode.setOnAction(event -> primaryStage.setScene(difficultyscene));
        computermode.setOnAction(event -> primaryStage.setScene(difficultyscene));
        randommode.setOnAction(event -> primaryStage.setScene(difficultyscene));
        Teams.setOnAction(event -> primaryStage.setScene(difficultyscene));
        playernameenter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(playernameconfirmationscene);
                confirmationofname.setText("Your name is: " + textField.getText());
            }
        });
        incorrectnameselection.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(playernamescene);
                playernameheader.setText("Please enter your username again:");
            }
        });
        yesselection.setOnAction(event -> primaryStage.setScene(setselectionscene));
        searchfunction.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SetSelector setSelector = new SetSelector();
                if (setsearcher.getText().contains("Chicago Open 2018")) {
                    setSelector.getChicagoOpen();
                    primaryStage.setScene(setselectionconf);
                    Label setconf2label = new Label("The Set you selected is: " + chicagoopen);
                    setconfirm.getChildren().add(setconf2label);
                    setconf2label.setTranslateY(-30);
                    setconf2label.setFont(new Font("Arial", 12.5));
                    setconf2label.getStyleClass().add("brightcolors");
                }
                if (setsearcher.getText().contains("NASAT 2018")) {
                    setSelector.getNASATTossups2018();
                }
                if (setsearcher.getText().contains("PACE NSC 2018")) {
                    setSelector.getPACENSC2018();
                }
                if (setsearcher.getText().contains("IMSAnity5 2018")) {
                    setSelector.getIMSAnity52018();
                }
                if (setsearcher.getText().contains("ACF Nationals 2018")) {
                    setSelector.getACFNationals2018();
                }
                else {
                    Label errorlabel = new Label("The set you have searched for is invalid, please try again.");
                    setselection.getChildren().add(errorlabel);
                    errorlabel.getStyleClass().add("brightcolors");
                    errorlabel.setTranslateY(23);
                    errorlabel.setFont(new Font("Arial", 15));
                }
            }
        });

        Button setconfyes = new Button("Yes it is");
        setconfirm.getChildren().add(setconfyes);
        setconfyes.setFont(new Font("Arial", 12.5));
        setconfyes.setTranslateY(2);
        setconfyes.setTranslateX(-60);
        setconfyes.getStyleClass().add("yesbutton");

        Button setconfno = new Button("No it is not");
        setconfirm.getChildren().add(setconfno);
        setconfno.setFont(new Font("Arial", 12.5));
        setconfno.setTranslateY(2);
        setconfno.setTranslateX(60);
        setconfno.getStyleClass().add("nobutton");

        setconfno.setOnAction(event -> primaryStage.setScene(scene));
        setconfyes.setOnAction(event -> primaryStage.setScene(questions));

        scene.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        difficultyscene.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        aboutsectionscene.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        playertype.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        othermodemenu.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        settingsarea.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        settingsarea.getStylesheets().add(getClass().getResource("LabelStyleSheet.css").toExternalForm());
        playernamescene.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        playernameconfirmationscene.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        setselectionscene.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        setselectionconf.getStylesheets().add(getClass().getResource("StyleSheet2.css").toExternalForm());
        questions.getStylesheets().add(getClass().getResource("QuestionStylesheet.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        int i = 0;
        launch(args);
    }
}
>>>>>>> 70cb24241009930ccf2c2ba2a675385cc56e39b0
