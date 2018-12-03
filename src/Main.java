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
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.IOException;

public class Main extends Application {

    public static ArrayList<String>tests = new ArrayList<>();
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
        StackPane setconfirm = new StackPane();

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
                else if(setsearcher.getText().contains("Chicago 2018")) {
                    setSelector.getChicagoOpen();
                    Label setlabel = new Label("This is the set you selected, " + chicagoopen);
                    setlabel.setTranslateY(30);
                    setlabel.setFont(new Font("Arial", 15));
                    setselection.getChildren().add(setlabel);
                    setlabel.getStyleClass().add("brightcolors");
                    String scans = "";
                    try {
                        Scanner scan = new Scanner(new BufferedReader(new FileReader("C:\\Users\\lolzk\\IdeaProjects\\JavabowlGUI\\src\\MainSourceforJavabowl\\Test.txt")));
                        while(scan.hasNextLine()) {
                            scans = scan.nextLine();
                            tests.add(scans);
                        }
                    } catch(IOException e) {
                        System.out.println(e);
                    }
                    setlabel.setText(scans);


                }
            }
        });

        Label setconf = new Label("Is" + setsearcher.getText() + "As the main set you selected to use, confirm by clicking either y or n to continue");
        setconfirm.getChildren().add(setconf);
        setconf.setTranslateX(-3);
        setconf.setTranslateY(-100);
        setconf.setFont(new Font("Arial", 20));
        setconf.getStyleClass().add("setconf");


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
        int i = 0;
        launch(args);
    }
}
class SetSelector {
    private int QuestioNumber;
    public String Questions;
    public String Bonuses;
    private int BonusesAmount;

    public void SetSelector(int QuestioNumber, String Questions, String Bonuses, int BonusesAmount) {
        this.QuestioNumber = QuestioNumber;
        this.Questions = Questions;
        this.Bonuses = Bonuses;
        this.BonusesAmount = BonusesAmount;
    }

    public int getQuestionNumber(int QuestioNumber) {
        int i = 0;
        return QuestioNumber;
    }

    void getChicagoOpen() {
        int i = 0;
        ChicagoOpenTossups2018();
    }

    void getACFNationals2018() {
        int i = 0;
        ACFNAtionalsTossups();
    }

    void getPACENSC2018() {
        int i = 0;
        PACE2018Tossups();
    }

    void getIMSAnity52018() {
        int i = 0;
        IMS2018Anity5Tossups();
    }

    void getNASATTossups2018() {
        int i = 0;
        NASATTossups2018();
    }

    public String getQuestions(String Questions) {
        int i = 0;
        return Questions;
    }

    public String getBonuses(String Bonuses) {
        int i = 0;
        return Bonuses;
    }

    public int getBonusesAmount(int BonusesAmount) {
        int i = 0;
        return BonusesAmount;
    }

    public void ChicagoOpenTossups2018() {
        JSONParser parser = new JSONParser();
        try {
            JSONArray a = (JSONArray) parser.parse(new FileReader("C:\\Users\\lolzk\\IdeaProjects\\JavabowlGUI\\src\\JSONData\\Tossups\\ChicagoOpen2018Tossups.json"));
            for (Object o : a) {
                JSONObject answers = (JSONObject) o;
                long id = (long) answers.get("id");
                String text = (String) answers.get("text");
                String answer = (String) answers.get("answer");
                long number = (long) answers.get("number");
                long tournamentid = (long) answers.get("tournament_id");
                long categoryid = (long) answers.get("category_id");
                String round = (String) answers.get("round");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public void PACE2018Tossups() {
        JSONParser parser2 = new JSONParser();
        try {
            JSONArray b = (JSONArray) parser2.parse(new FileReader("C:\\Users\\lolzk\\IdeaProjects\\JavabowlGUI\\src\\JSONData\\Tossups\\2018PACENSCTossups.json"));
            for (Object set1 : b) {
                JSONObject settossups = (JSONObject) set1;
                long id = (long) settossups.get("id");
                String text = (String) settossups.get("text");
                String answer = (String) settossups.get("answer");
                long number = (long) settossups.get("number");
                long tournamentid = (long) settossups.get("tournament_id");
                long categoryid = (long) settossups.get("category_id");
                String round = (String) settossups.get("round");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void IMS2018Anity5Tossups() {
        JSONParser parser3 = new JSONParser();
        try {
            JSONArray c = (JSONArray) parser3.parse(new FileReader("C:\\Users\\\\lolzk\\IdeaProjects\\JavabowlGUI\\src\\JSONData\\Tossups\\2018IMSAnity5Tossups.json"));
            for (Object set2 : c) {
                JSONObject settossups2 = (JSONObject) set2;
                long id = (long) settossups2.get("id");
                String text = (String) settossups2.get("text");
                String answer = (String) settossups2.get("answer");
                long number = (long) settossups2.get("number");
                long tournamentid = (long) settossups2.get("tournament_id");
                long categoryid = (long) settossups2.get("category_id");
                String round = (String) settossups2.get("round");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void ACFNAtionalsTossups() {
        JSONParser parser4 = new JSONParser();
        try {
            JSONArray d = (JSONArray) parser4.parse(new FileReader("C:\\Users\\lolzk\\IdeaProjects\\JavabowlGUI\\src\\JSONData\\Tossups\\2018ACFNationalsTossups.json"));
            for (Object set3 : d) {
                JSONObject settossups3 = (JSONObject) set3;
                long id = (long) settossups3.get("id");
                String text = (String) settossups3.get("text");
                String answer = (String) settossups3.get("answer");
                long number = (long) settossups3.get("number");
                long tournamentid = (long) settossups3.get("tournament_id");
                long categoryid = (long) settossups3.get("category_id");
                String round = (String) settossups3.get("round");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void ACFNationalBonuses() {
        JSONParser parser5 = new JSONParser();
        try {
            JSONArray e = (JSONArray) parser5.parse(new FileReader("C:\\Users\\lolzk\\IdeaProjects\\JavabowlGUI\\src\\JSONData\\Bonuses\\2018ACFNationalsBonuses.json"));
            for (Object bonusset1 : e) {
                JSONObject bonuses1 = (JSONObject) bonusset1;
                long id = (long) bonuses1.get("id");
                long number = (long) bonuses1.get("number");
                String round = (String) bonuses1.get("round");
                long categoryid = (long) bonuses1.get("category_id");
                long subcategoryid = (long) bonuses1.get("subcategory_id");
                long tournamentid = (long) bonuses1.get("tournament_id");
                String leadin = (String) bonuses1.get("leadin");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void ChicagoOpen2018Bonuses() {
        JSONParser parser6 = new JSONParser();
        try {
            JSONArray f = (JSONArray) parser6.parse(new FileReader("C:\\Users\\lolzk\\IdeaProjects\\JavabowlGUI\\src\\JSONData\\Bonuses\\ChicagoOpen2018Bonuses.json"));
            for (Object bonuseset2 : f) {
                JSONObject bonuses2 = (JSONObject) bonuseset2;
                long id = (long) bonuses2.get("id");
                long number = (long) bonuses2.get("number");
                String round = (String) bonuses2.get("round");
                long categoryid = (long) bonuses2.get("category_id");
                long subcategoryid = (long) bonuses2.get("subcategory_id");
                long tournamentid = (long) bonuses2.get("tournament_id");
                String leadin = (String) bonuses2.get("leadin");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void PACE2018NSCBonuses() {
        JSONParser parser7 = new JSONParser();
        try {
            JSONArray g = (JSONArray) parser7.parse(new FileReader("C:\\Users\\lolzk\\IdeaProjects\\JavabowlGUI\\src\\JSONData\\Bonuses\\2018PACENSCBonuses.json"));
            for (Object bonuseset3 : g) {
                JSONObject bonuses3 = (JSONObject) bonuseset3;
                long id = (long) bonuses3.get("id");
                long number = (long) bonuses3.get("number");
                String round = (String) bonuses3.get("round");
                long categoryid = (long) bonuses3.get("category_id");
                long subcategoryid = (long) bonuses3.get("subcategory_id");
                long tournamentid = (long) bonuses3.get("tournament_id");
                String leadin = (String) bonuses3.get("leadin");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    public void NASATTossups2018() {
        JSONParser parser7 = new JSONParser();
        try {
            JSONArray g = (JSONArray) parser7.parse(new FileReader("C:\\Users\\lolzk\\IdeaProjects\\JavabowlGUI\\src\\JSONData\\Tossups\\NASAT2018Tossups.json"));
            for (Object tossups4 : g) {
                JSONObject tossupset4 = (JSONObject) tossups4;
                long id = (long) tossupset4.get("id");
                String text = (String) tossupset4.get("text");
                String answer = (String) tossupset4.get("answer");
                long number = (long) tossupset4.get("number");
                long tournamentid = (long) tossupset4.get("tournament_id");
                long categoryid = (long) tossupset4.get("category_id");
                long round = (long) tossupset4.get("round");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    public void IMSAnity5Bonuses2018() {
        JSONParser parser8 = new JSONParser();
        try {
            JSONArray h = (JSONArray) parser8.parse(new FileReader("C:\\Users\\lolzk\\IdeaProjects\\JavabowlGUI\\src\\JSONData\\Bonuses\\2018IMSAnity5Bonuses.json"));
            for (Object bonuseset4 : h) {
                JSONObject bonuses4 = (JSONObject) bonuseset4;
                long id = (long) bonuses4.get("id");
                long number = (long) bonuses4.get("number");
                String round = (String) bonuses4.get("round");
                long categoryid = (long) bonuses4.get("category_id");
                long subcategoryid = (long) bonuses4.get("subcategory_id");
                long tournamentid = (long) bonuses4.get("tournament_id");
                String leadin = (String) bonuses4.get("leadin");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void FACTSTossups2018() {
        JSONParser parser10 = new JSONParser();
        try {
            JSONArray i = (JSONArray) parser10.parse(new FileReader("C:\\Users\\lolzk\\IdeaProjects\\JavabowlGUI\\src\\JSONData\\2018FACTSTossup.json"));
            for (Object tossupset5 : i) {
                JSONObject tossups5 = (JSONObject) tossupset5;
                long id = (long) tossups5.get("id");
                String text = (String) tossups5.get("text");
                String answer = (String) tossups5.get("answer");
                long number = (long) tossups5.get("number");
                long tournamentid = (long) tossups5.get("tournament_id");
                long categoryid = (long) tossups5.get("category_id");
                long round = (long) tossups5.get("round");

            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void NASATBonuses2018() {
        int i = 0;
        int k = 0;
    }
}