import java.util.*;
import java.io.*;
import java.util.Scanner;
public class Javabowl {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello Quizbowl Player, Welcome to Javabowl.");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("This is meant to test your Quizbowl Skills and be more accurate than protobowl");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("With this program, one can play with many packets, but simply has to revise the packet question in the .txt files.");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Rules of Quizbowl are the same, just no powers are in here, also the questions aren't put up word by word, instead you have 10 seconds to answer each one.");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Well, I think thats enough from me, type in yes or no to start.");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Now, type your choice!");
        scan = new Scanner(System.in);
        String x = scan.next();
        if(x.equals("Yes")) {
            System.out.println("Alright then, Lets get started!");
            System.out.println("-------------------------------");
            firstquestion();
            answerquestion1();
        }
        if(x.equals("No")) { 
            System.out.println("Ok, go then, and be a negger u dumb ass bitch.");
        }
        if(x.equals("yes")) {
            System.out.println("Alright then, Lets get started!");
            System.out.println("-------------------------------");
            firstquestion();
            answerquestion1();
        }
        if(x.equals("no")) {
            System.out.println("Ok, go then, and be a negger u dumb ass bitch.");
        }
    }

    public static void firstquestion() {
        try {
            FileReader reader = new FileReader("ques1.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void answerquestion1() {
        while(true) {
            System.out.println("                                  ");
            System.out.println("-----------------------------------------------");
            System.out.println("Now you have 10 seconds to answer the next Question.");
            Scanner scan = new Scanner(System.in);
            String Answer = scan.next();
            if(Answer.equals("reflection")) {
                System.out.println("-----------------------------------------------");
                System.out.println("That is correct, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("------------------------------------------------");
                secondquestion();
                answerquestion2();
                break;
            }
            else if(Answer.equals("Reflection")) {
                System.out.println("------------------------------------------------");
                System.out.println("That is correct, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("------------------------------------------------");
                secondquestion();
                answerquestion2();
                break;
            }
            else{
                System.out.println("-------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question.");
                System.out.println("------------------------------------------------");
                secondquestion();
                answerquestion2();
                break;
            }
        }
    }

    public static void secondquestion () {
        try{
            FileReader reader = new FileReader("ques2.txt");
            int character;
            while((character = reader.read()) != -1 ) {
                System.out.print((char)character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void answerquestion2() {
        while(true) {
            System.out.println("-----------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String secondAnswer = scan.next();
            if(secondAnswer.equals("Napoleon")) {
                System.out.println("--------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question!");
                System.out.println("------------------------------------------------");
                thirdquestion();
                thirdquestionanswer();
                break;
            }
            else if(secondAnswer.equals("Bonaparte")) {
                System.out.println("--------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question!");
                System.out.println("------------------------------------------------");
                thirdquestion();
                thirdquestionanswer();
                break;
            }
            else if(secondAnswer.equals("Napoleon 1st.")) {
                System.out.println("--------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question!");
                System.out.println("------------------------------------------------");
                thirdquestion();
                thirdquestionanswer();
                break;
            }
            else if(secondAnswer.equals("Bunoaparte")) {
                System.out.println("-------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question!");
                System.out.println("------------------------------------------------");
                thirdquestion();
                thirdquestionanswer();
                break;
            }
            else if(secondAnswer.equals("Napoleonic Code")) {
                System.out.println("-------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question!");
                System.out.println("------------------------------------------------");
                thirdquestion();
                thirdquestionanswer();
                break;
            }
            else if(secondAnswer.equals("napoleon")) {
                System.out.println("-------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question!");
                System.out.println("------------------------------------------------");
                thirdquestion();
                thirdquestionanswer();
                break;
            }
            else {
                System.out.println("------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("------------------------------------------------");
                thirdquestion();
                thirdquestionanswer();
                break;
            }
        }
    }

    public static void thirdquestion() {
        try{
            FileReader reader = new FileReader("ques3.txt");
            int character;
            while((character = reader.read()) != -1 ) {
                System.out.print((char)character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void thirdquestionanswer() {
        while(true){
            System.out.println("                                               ");
            System.out.println("-----------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Thirdpart = scan.nextLine();
            if(Thirdpart.equals("Farewell to Arms")) {
                System.out.println("---------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("---------------------------------------");
                fourthquestion();
                fourthquestionanswer();
                break;
            }
            else if(Thirdpart.equals("farewell to arms")) {
                System.out.println("----------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------");
                fourthquestion();
                fourthquestionanswer();
                break;
            }
            else {
                System.out.println("----------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------");
                fourthquestion();
                fourthquestionanswer();
                break;
            }
        }
    }

    public static void fourthquestion() {
        try{
            FileReader reader = new FileReader("ques4.txt");
            int character;
            while((character = reader.read()) != -1) {
                System.out.print((char)character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fourthquestionanswer() {
        while(true) {
            System.out.println("                                                 ");
            System.out.println("-------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Fourthpart = scan.nextLine();
            if(Fourthpart.equals("Pol Pot")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                fifthquestion();
                fifthquestionanswer();
                break;
            }
            else if(Fourthpart.equals("Pot")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                fifthquestion();
                fifthquestionanswer();
                break;
            }
            else if(Fourthpart.equals("Saloth Sar")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                fifthquestion();
                fifthquestionanswer();
                break;
            }
            else if(Fourthpart.equals("Saloth")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                fifthquestion();
                fifthquestionanswer();
                break;
            }
            else if(Fourthpart.equals("pot")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                fifthquestion();
                fifthquestionanswer();
                break;
            }
            else if(Fourthpart.equals("pol pot")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                fifthquestion();
                fifthquestionanswer();
                break;
            }
            else if(Fourthpart.equals("saloth sar")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                fifthquestion();
                fifthquestionanswer();
                break;
            }
            else if(Fourthpart.equals("saloth")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                fifthquestion();
                fifthquestionanswer();
                break;
            }
            else {
                System.out.println("----------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                fifthquestion();
                fifthquestionanswer();
                break;
            }
        }
    }

    public static void fifthquestion() {
        try{
            FileReader reader = new FileReader("ques5.txt");
            int character;
            while((character = reader.read()) != -1) {
                System.out.print((char)character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fifthquestionanswer() {
        while(true) {
            System.out.println("----------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Fifthpart = scan.next();
            if(Fifthpart.equals("Caravaggio")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                sixthquestion();
                sixthquestionanswer();
                break;
            }
            else if(Fifthpart.equals("Michelango")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                sixthquestion();
                sixthquestionanswer();
                break;
            }
            else if(Fifthpart.equals("Merisi")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                sixthquestion();
                sixthquestionanswer();
                break;
            }
            else if(Fifthpart.equals("Michelango Merisi")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                sixthquestion();
                sixthquestionanswer();
                break;
            }
            else if(Fifthpart.equals("caravaggio")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                sixthquestion();
                sixthquestionanswer();
                break;
            }
            else if(Fifthpart.equals("michelango")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                sixthquestion();
                sixthquestionanswer();
                break;
            }
            else if(Fifthpart.equals("michelango merisi")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                sixthquestion();
                sixthquestionanswer();
                break;
            }
            else {
                System.out.println("--------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                sixthquestion();
                sixthquestionanswer();
                break;
            }
        }
    }

    public static void sixthquestion() {
        try{
            FileReader reader = new FileReader("ques6.txt");
            int character;
            while((character = reader.read()) != -1) {
                System.out.print((char)character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sixthquestionanswer() {
        while(true) {
            System.out.println("                                             ");
            System.out.println("---------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Sixthpart = scan.nextLine();
            if(Sixthpart.equals("United States")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                seventhquestion();
                seventhquestionanswer();
                break;
            }
            else if(Sixthpart.equals("United States of America")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                seventhquestion();
                seventhquestionanswer();
                break;
            }
            else if(Sixthpart.equals("U.S.")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                seventhquestion();
                seventhquestionanswer();
                break;
            }
            else if(Sixthpart.equals("U.S.A.")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------"); 
                seventhquestion();
                seventhquestionanswer();
                break;
            }
            else if(Sixthpart.equals("America")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                seventhquestion();
                seventhquestionanswer();
                break;
            }
            else if(Sixthpart.equals("usa")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                seventhquestion();
                seventhquestionanswer();
                break;
            }
            else if(Sixthpart.equals("america")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                seventhquestion();
                seventhquestionanswer();
                break;
            }
            else if(Sixthpart.equals("united states")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                seventhquestion();
                seventhquestionanswer();
                break;
            }
            else if(Sixthpart.equals("united states of america")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                seventhquestion();
                seventhquestionanswer();
                break;
            }
            else {
                System.out.println("-------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                seventhquestion();
                seventhquestionanswer();
                break;
            }
        }
    }

    public static void seventhquestion() {
        try{
            FileReader reader = new FileReader("ques7.txt");
            int character; 
            while((character = reader.read()) != -1) {
                System.out.print((char)character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void seventhquestionanswer() {
        while(true){
            System.out.println("                                                  ");
            System.out.println("--------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Seventhpart = scan.nextLine();
            if(Seventhpart.equals("Bread")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                eigthquestion();
                eigthquestionanswer();
                break;
            }
            else if(Seventhpart.equals("Loaves")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                eigthquestion();
                eigthquestionanswer();
                break;
            }
            else if(Seventhpart.equals("Matzah")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                eigthquestion();
                eigthquestionanswer();
                break;
            }
            else if(Seventhpart.equals("Challah")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                eigthquestion();
                eigthquestionanswer();
                break;
            }
            else if(Seventhpart.equals("bread")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                eigthquestion();
                eigthquestionanswer();
                break;
            }
            else if(Seventhpart.equals("loaves")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                eigthquestion();
                eigthquestionanswer();
                break;
            }
            else if(Seventhpart.equals("matzah")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                eigthquestion();
                eigthquestionanswer();
                break;
            }
            else{
                System.out.println("--------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                eigthquestion();
                eigthquestionanswer();
                break;
            }
        }
    }

    public static void eigthquestion() {
        try{
            FileReader reader = new FileReader("ques8.txt");
            int character;
            while((character = reader.read ()) != -1) {
                System.out.print((char)character);
            }
            reader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void eigthquestionanswer() {
        while(true) {
            System.out.println("                                                  ");
            System.out.println("--------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Eigthpart = scan.nextLine();
            if(Eigthpart.equals("French")) {
                System.out.println("-----------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-----------------------------------------");
                ninthquestion();
                ninthquestionanswer();
                break;
            }
            else if(Eigthpart.equals("Francais")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("---------------------------------------------");
                ninthquestion();
                ninthquestionanswer();
                break;
            }
            else if(Eigthpart.equals("language of france")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-----------------------------------------------");
                ninthquestion();
                ninthquestionanswer();
                break;
            }
            else if(Eigthpart.equals("french")) {
                System.out.println("-----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-----------------------------------------------");
                ninthquestion();
                ninthquestionanswer();
                break;
            }
            else if(Eigthpart.equals("francais")) {
                System.out.println("------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("------------------------------------------------");
                ninthquestion();
                ninthquestionanswer();
                break;
            }
            else {
                System.out.println("------------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------------");
                ninthquestion();
                ninthquestionanswer();
                break;
            }
        }
    }

    public static void ninthquestion() {
        try{
            FileReader reader = new FileReader("ques9.txt");
            int character;
            while((character = reader.read ()) != -1) {
                System.out.print((char)character);
            }
            reader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ninthquestionanswer() {
        while(true){
            System.out.println("                                                ");
            System.out.println("------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Ninthpart = scan.nextLine();
            if(Ninthpart.equals("Camillo Golgi")) {
                System.out.println("-----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-----------------------------------------------");
                tenthquestion(); 
                tenthquestionanswer();
                break;
            }
            else if(Ninthpart.equals("Golgi stain")) {
                System.out.println("------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------------");
                tenthquestion();
                tenthquestionanswer();
                break;
            }
            else if(Ninthpart.equals("Golgi body")) {
                System.out.println("--------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------------");
                tenthquestion();
                tenthquestionanswer();
                break;
            }
            else if(Ninthpart.equals("Golgi apparatus")) {
                System.out.println("--------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("---------------------------------------------------");
                tenthquestion();
                tenthquestionanswer();
                break;
            }
            else if(Ninthpart.equals("Golgi")) {
                System.out.println("----------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------------");
                tenthquestion();
                tenthquestionanswer();
                break;
            }
            else if(Ninthpart.equals("camillo golgi")) {
                System.out.println("----------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-----------------------------------------------------");
                tenthquestion();
                tenthquestionanswer();
                break;
            }
            else if(Ninthpart.equals("golgi")) {
                System.out.println("------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("------------------------------------------------------");
                tenthquestion();
                tenthquestionanswer();
                break;
            }
            else if(Ninthpart.equals("golgi stain")) {
                System.out.println("------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-----------------------------------------------------");
                tenthquestion();
                tenthquestionanswer();
                break;
            }
            else if(Ninthpart.equals("golgi body")) {
                System.out.println("------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("------------------------------------------------------");
                tenthquestion();
                tenthquestionanswer();
                break;
            }
            else if(Ninthpart.equals("golgi apparatus")) {
                System.out.println("-------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------------------");
                tenthquestion();
                tenthquestionanswer();
                break;
            }
            else {
                System.out.println("------------------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("------------------------------------------------------");
                tenthquestion();
                tenthquestionanswer();
                break;
            }
        }
    }

    public static void tenthquestion() {
        try{
            FileReader reader = new FileReader("ques10.txt");
            int character;
            while((character = reader.read ()) != -1)  {
                System.out.print((char)character);
            }
            reader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void tenthquestionanswer(){
        while(true) {
            System.out.println("                                                              ");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Tenthpart = scan.nextLine();
            if(Tenthpart.equals("Thor's hammer")) {
                System.out.println("---------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("---------------------------------------------------------");
                eleventhquestion();
                break;
            }
            else if(Tenthpart.equals("Mjolnier")) {
                System.out.println("---------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------------------");
                eleventhquestion();
                break;
            }
            else if(Tenthpart.equals("hammer of thor")) {
                System.out.println("--------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------------------");
                eleventhquestion();
                break;
            }
            else if(Tenthpart.equals("Hammer")) {
                System.out.println("---------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------------------");
                eleventhquestion();
                break;
            }
            else if(Tenthpart.equals("Thors hammer")) {
                System.out.println("--------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------------------");
                eleventhquestion();
                break;
            }
            else if(Tenthpart.equals("mjolnier")) {
                System.out.println("-------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("------------------------------------------------------");
                eleventhquestion();
                break;
            }
            else if(Tenthpart.equals("Hammer of Thor")) {
                System.out.println("--------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------------------");
                eleventhquestion();
                break;
            }
            else{
                System.out.println("--------------------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------------------");
                eleventhquestion();
                break;
            }
        }
    }

    public static void eleventhquestion() {
        try{
            FileReader reader = new FileReader("ques11.txt");
            int character;
            while((character = reader.read ()) != -1) {
                System.out.print((char)character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}