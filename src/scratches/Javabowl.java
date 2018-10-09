package scratches;

import java.util.Scanner;
import java.io.*;
import java.util.TimerTask;

public class Javabowl {
    public static int Correctanswer = 10;
    public static int WrongAnswer = 5;
    public static int totalscore;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello Quizbowl Player, Welcome to scratches.Javabowl.Javabowl.");
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
        if (x.equals("Yes")) {
            System.out.println("Alright then, Lets get started!");
            System.out.println("-------------------------------");
            firstquestion();
            answerquestion1();
        }
        if (x.equals("No")) {
            System.out.println("Ok, go then, and be a negger u dumb ass bitch.");
        }
        if (x.equals("yes")) {
            System.out.println("Alright then, Lets get started!");
            System.out.println("-------------------------------");
            firstquestion();
            answerquestion1();
        }
        if (x.equals("no")) {
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
        while (true) {
            System.out.println("                                  ");
            System.out.println("-----------------------------------------------");
            System.out.println("Now you have 10 seconds to answer the next Question.");
            Scanner scan = new Scanner(System.in);
            String Answer = scan.next();
            if (Answer.equals("reflection")) {
                System.out.println("-----------------------------------------------");
                System.out.println("That is correct, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("------------------------------------------------");
                correctanswerinput();
                secondquestion();
                answerquestion2();
                break;
            } else if (Answer.equals("Reflection")) {
                System.out.println("------------------------------------------------");
                System.out.println("That is correct, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("------------------------------------------------");
                correctanswerinput();
                secondquestion();
                answerquestion2();
                break;
            } else if (Answer.equals("")) {
                System.out.println("That is invalid input, neg 5.");
                wronganswerinput();
                secondquestion();
                answerquestion2();
            } else {
                System.out.println("-------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question.");
                System.out.println("------------------------------------------------");
                wronganswerinput();
                secondquestion();
                answerquestion2();
                break;
            }
        }
    }

    public static void secondquestion() {
        try {
            FileReader reader = new FileReader("ques2.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void answerquestion2() {
        while (true) {
            System.out.println("                                               ");
            System.out.println("-----------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String secondAnswer = scan.next();
            if (secondAnswer.equals("Napoleon")) {
                System.out.println("--------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question!");
                System.out.println("------------------------------------------------");
                correctanswerinput();
                thirdquestion();
                thirdquestionanswer();
                break;
            } else if (secondAnswer.equals("Bonaparte")) {
                System.out.println("--------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question!");
                System.out.println("------------------------------------------------");
                correctanswerinput();
                thirdquestion();
                thirdquestionanswer();
                break;
            } else if (secondAnswer.equals("Napoleon 1st.")) {
                System.out.println("--------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question!");
                System.out.println("------------------------------------------------");
                correctanswerinput();
                thirdquestion();
                thirdquestionanswer();
                break;
            } else if (secondAnswer.equals("Bunoaparte")) {
                System.out.println("-------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question!");
                System.out.println("------------------------------------------------");
                correctanswerinput();
                thirdquestion();
                thirdquestionanswer();
                break;
            } else if (secondAnswer.equals("Napoleonic Code")) {
                System.out.println("-------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question!");
                System.out.println("------------------------------------------------");
                correctanswerinput();
                thirdquestion();
                thirdquestionanswer();
                break;
            } else if (secondAnswer.equals("napoleon")) {
                System.out.println("-------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question!");
                System.out.println("------------------------------------------------");
                correctanswerinput();
                thirdquestion();
                thirdquestionanswer();
                break;
            } else {
                System.out.println("------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("------------------------------------------------");
                wronganswerinput();
                thirdquestion();
                thirdquestionanswer();
                break;
            }
        }
    }


    public static void thirdquestion() {
        try {
            FileReader reader = new FileReader("ques3.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void thirdquestionanswer() {
        while (true) {
            System.out.println("                                               ");
            System.out.println("-----------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Thirdpart = scan.nextLine();
            if (Thirdpart.equals("Farewell to Arms")) {
                System.out.println("---------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("---------------------------------------");
                correctanswerinput();
                fourthquestion();
                fourthquestionanswer();
                break;
            } else if (Thirdpart.equals("farewell to arms")) {
                System.out.println("----------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------");
                correctanswerinput();
                fourthquestion();
                fourthquestionanswer();
                break;
            } else {
                System.out.println("----------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------");
                wronganswerinput();
                fourthquestion();
                fourthquestionanswer();
                break;
            }
        }
    }

    public static void fourthquestion() {
        try {
            FileReader reader = new FileReader("ques4.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fourthquestionanswer() {
        while (true) {
            System.out.println("                                                 ");
            System.out.println("-------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Fourthpart = scan.nextLine();
            if (Fourthpart.equals("Pol Pot")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                correctanswerinput();
                fifthquestion();
                fifthquestionanswer();
                break;
            } else if (Fourthpart.equals("Pot")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                correctanswerinput();
                fifthquestion();
                fifthquestionanswer();
                break;
            } else if (Fourthpart.equals("Saloth Sar")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                correctanswerinput();
                fifthquestion();
                fifthquestionanswer();
                break;
            } else if (Fourthpart.equals("Saloth")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                correctanswerinput();
                fifthquestion();
                fifthquestionanswer();
                break;
            } else if (Fourthpart.equals("pot")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                correctanswerinput();
                fifthquestion();
                fifthquestionanswer();
                break;
            } else if (Fourthpart.equals("pol pot")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                correctanswerinput();
                fifthquestion();
                fifthquestionanswer();
                break;
            } else if (Fourthpart.equals("saloth sar")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                correctanswerinput();
                fifthquestion();
                fifthquestionanswer();
                break;
            } else if (Fourthpart.equals("saloth")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                correctanswerinput();
                fifthquestion();
                fifthquestionanswer();
                break;
            } else {
                System.out.println("----------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------");
                wronganswerinput();
                fifthquestion();
                fifthquestionanswer();
                break;
            }
        }
    }


    public static void fifthquestion() {
        try {
            FileReader reader = new FileReader("ques5.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void fifthquestionanswer() {
        while (true) {
            System.out.println("----------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Fifthpart = scan.next();
            if (Fifthpart.equals("Caravaggio")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                correctanswerinput();
                sixthquestion();
                sixthquestionanswer();
                break;
            } else if (Fifthpart.equals("Michelango")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                correctanswerinput();
                sixthquestion();
                sixthquestionanswer();
                break;
            } else if (Fifthpart.equals("Merisi")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                correctanswerinput();
                sixthquestion();
                sixthquestionanswer();
                break;
            } else if (Fifthpart.equals("Michelango Merisi")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                correctanswerinput();
                sixthquestion();
                sixthquestionanswer();
                break;
            } else if (Fifthpart.equals("caravaggio")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                correctanswerinput();
                sixthquestion();
                sixthquestionanswer();
                break;
            } else if (Fifthpart.equals("michelango")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                correctanswerinput();
                sixthquestion();
                sixthquestionanswer();
                break;
            } else if (Fifthpart.equals("michelango merisi")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                correctanswerinput();
                sixthquestion();
                sixthquestionanswer();
                break;
            } else {
                System.out.println("--------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                wronganswerinput();
                sixthquestion();
                sixthquestionanswer();
                break;
            }
        }
    }


    public static void sixthquestion() {
        try {
            FileReader reader = new FileReader("ques6.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void sixthquestionanswer() {
        while (true) {
            System.out.println("                                             ");
            System.out.println("---------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Sixthpart = scan.nextLine();
            if (Sixthpart.equals("United States")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                seventhquestion();
                seventhquestionanswer();
                break;
            } else if (Sixthpart.equals("United States of America")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                correctanswerinput();
                seventhquestion();
                seventhquestionanswer();
                break;
            } else if (Sixthpart.equals("U.S.")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                correctanswerinput();
                seventhquestion();
                seventhquestionanswer();
                break;
            } else if (Sixthpart.equals("U.S.A.")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                correctanswerinput();
                seventhquestion();
                seventhquestionanswer();
                break;
            } else if (Sixthpart.equals("America")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                correctanswerinput();
                seventhquestion();
                seventhquestionanswer();
                break;
            } else if (Sixthpart.equals("usa")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                correctanswerinput();
                seventhquestion();
                seventhquestionanswer();
                break;
            } else if (Sixthpart.equals("america")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                seventhquestion();
                seventhquestionanswer();
                break;
            } else if (Sixthpart.equals("united states")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                correctanswerinput();
                seventhquestion();
                seventhquestionanswer();
                break;
            } else if (Sixthpart.equals("united states of america")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                correctanswerinput();
                seventhquestion();
                seventhquestionanswer();
                break;
            } else {
                System.out.println("-------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------");
                wronganswerinput();
                seventhquestion();
                seventhquestionanswer();
                break;
            }
        }
    }


    public static void seventhquestion() {
        try {
            FileReader reader = new FileReader("ques7.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void seventhquestionanswer() {
        while (true) {
            System.out.println("                                                  ");
            System.out.println("--------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Seventhpart = scan.nextLine();
            if (Seventhpart.equals("Bread")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                correctanswerinput();
                eigthquestion();
                eigthquestionanswer();
                break;
            } else if (Seventhpart.equals("Loaves")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                correctanswerinput();
                eigthquestion();
                eigthquestionanswer();
                break;
            } else if (Seventhpart.equals("Matzah")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                correctanswerinput();
                eigthquestion();
                eigthquestionanswer();
                break;
            } else if (Seventhpart.equals("Challah")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                correctanswerinput();
                eigthquestion();
                eigthquestionanswer();
                break;
            } else if (Seventhpart.equals("bread")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                correctanswerinput();
                eigthquestion();
                eigthquestionanswer();
                break;
            } else if (Seventhpart.equals("loaves")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                correctanswerinput();
                eigthquestion();
                eigthquestionanswer();
                break;
            } else if (Seventhpart.equals("matzah")) {
                System.out.println("--------------------------------------------");
                System.out.println("That is the correct answer, 10 points");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                correctanswerinput();
                eigthquestion();
                eigthquestionanswer();
                break;
            } else {
                System.out.println("--------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------");
                wronganswerinput();
                eigthquestion();
                eigthquestionanswer();
                break;
            }
        }
    }

    public static void eigthquestion() {
        try {
            FileReader reader = new FileReader("ques8.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void eigthquestionanswer() {
        while (true) {
            System.out.println("                                                  ");
            System.out.println("--------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Eigthpart = scan.nextLine();
            if (Eigthpart.equals("French")) {
                System.out.println("-----------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-----------------------------------------");
                correctanswerinput();
                ninthquestion();
                ninthquestionanswer();
                break;
            } else if (Eigthpart.equals("Francais")) {
                System.out.println("-------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("---------------------------------------------");
                correctanswerinput();
                ninthquestion();
                ninthquestionanswer();
                break;
            } else if (Eigthpart.equals("language of france")) {
                System.out.println("----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-----------------------------------------------");
                correctanswerinput();
                ninthquestion();
                ninthquestionanswer();
                break;
            } else if (Eigthpart.equals("french")) {
                System.out.println("-----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-----------------------------------------------");
                correctanswerinput();
                ninthquestion();
                ninthquestionanswer();
                break;
            } else if (Eigthpart.equals("francais")) {
                System.out.println("------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("------------------------------------------------");
                correctanswerinput();
                ninthquestion();
                ninthquestionanswer();
                break;
            } else {
                System.out.println("------------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------------");
                wronganswerinput();
                ninthquestion();
                ninthquestionanswer();
                break;
            }
        }
    }

    public static void ninthquestion() {
        try {
            FileReader reader = new FileReader("ques9.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void ninthquestionanswer() {
        while (true) {
            System.out.println("                                                ");
            System.out.println("------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Ninthpart = scan.nextLine();
            if (Ninthpart.equals("Camillo Golgi")) {
                System.out.println("-----------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-----------------------------------------------");
                correctanswerinput();
                tenthquestion();
                tenthquestionanswer();
                break;
            } else if (Ninthpart.equals("Golgi stain")) {
                System.out.println("------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------------");
                correctanswerinput();
                tenthquestion();
                tenthquestionanswer();
                break;
            } else if (Ninthpart.equals("Golgi body")) {
                System.out.println("--------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------------");
                tenthquestion();
                tenthquestionanswer();
                break;
            } else if (Ninthpart.equals("Golgi apparatus")) {
                System.out.println("--------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("---------------------------------------------------");
                correctanswerinput();
                tenthquestion();
                tenthquestionanswer();
                break;
            } else if (Ninthpart.equals("Golgi")) {
                System.out.println("----------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("----------------------------------------------------");
                correctanswerinput();
                tenthquestion();
                tenthquestionanswer();
                break;
            } else if (Ninthpart.equals("camillo golgi")) {
                System.out.println("----------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-----------------------------------------------------");
                correctanswerinput();
                tenthquestion();
                tenthquestionanswer();
                break;
            } else if (Ninthpart.equals("golgi")) {
                System.out.println("------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("------------------------------------------------------");
                correctanswerinput();
                tenthquestion();
                tenthquestionanswer();
                break;
            } else if (Ninthpart.equals("golgi stain")) {
                System.out.println("------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-----------------------------------------------------");
                correctanswerinput();
                tenthquestion();
                tenthquestionanswer();
                break;
            } else if (Ninthpart.equals("golgi body")) {
                System.out.println("------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("------------------------------------------------------");
                correctanswerinput();
                tenthquestion();
                tenthquestionanswer();
                break;
            } else if (Ninthpart.equals("golgi apparatus")) {
                System.out.println("-------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------------------");
                correctanswerinput();
                tenthquestion();
                tenthquestionanswer();
                break;
            } else {
                System.out.println("------------------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("------------------------------------------------------");
                wronganswerinput();
                tenthquestion();
                tenthquestionanswer();
                break;
            }
        }
    }


    public static void tenthquestion() {
        try {
            FileReader reader = new FileReader("ques10.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void tenthquestionanswer() {
        while (true) {
            System.out.println("                                                              ");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Tenthpart = scan.nextLine();
            if (Tenthpart.equals("Thor's hammer")) {
                System.out.println("---------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("---------------------------------------------------------");
                correctanswerinput();
                eleventhquestion();
                eleventhquestionanswer();
                break;
            } else if (Tenthpart.equals("Mjolnier")) {
                System.out.println("---------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------------------");
                correctanswerinput();
                eleventhquestion();
                eleventhquestionanswer();
                break;
            } else if (Tenthpart.equals("hammer of thor")) {
                System.out.println("--------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------------------");
                correctanswerinput();
                eleventhquestion();
                eleventhquestionanswer();
                break;
            } else if (Tenthpart.equals("Hammer")) {
                System.out.println("---------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------------------");
                correctanswerinput();
                eleventhquestion();
                eleventhquestionanswer();
                break;
            } else if (Tenthpart.equals("Thors hammer")) {
                System.out.println("--------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------------------");
                correctanswerinput();
                eleventhquestion();
                eleventhquestionanswer();
                break;
            } else if (Tenthpart.equals("mjolnier")) {
                System.out.println("-------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("------------------------------------------------------");
                correctanswerinput();
                eleventhquestion();
                eleventhquestionanswer();
                break;
            } else if (Tenthpart.equals("Hammer of Thor")) {
                System.out.println("--------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question");
                System.out.println("-------------------------------------------------------");
                correctanswerinput();
                eleventhquestion();
                eleventhquestionanswer();
                break;
            } else {
                System.out.println("--------------------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question");
                System.out.println("--------------------------------------------------------");
                wronganswerinput();
                eleventhquestion();
                eleventhquestionanswer();
                break;
            }
        }
    }


    public static void eleventhquestion() {
        try {
            FileReader reader = new FileReader("ques11.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void eleventhquestionanswer() {
        while (true) {
            System.out.println("                                                       ");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String Eleventhpart = scan.nextLine();
            if (Eleventhpart.equals("Housing")) {
                System.out.println("-------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("-------------------------------------------------------");
                correctanswerinput();
                twelvethquestion();
                twelvethquestionanswer();
                break;
            } else if (Eleventhpart.equals("Urban housing")) {
                System.out.println("--------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("--------------------------------------------------------");
                correctanswerinput();
                twelvethquestion();
                twelvethquestionanswer();
                break;
            } else if (Eleventhpart.equals("House and Urban Development")) {
                System.out.println("--------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("--------------------------------------------------------");
                correctanswerinput();
                twelvethquestion();
                twelvethquestionanswer();
                break;
            } else if (Eleventhpart.equals("Public housing")) {
                System.out.println("--------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("--------------------------------------------------------");
                correctanswerinput();
                twelvethquestion();
                twelvethquestionanswer();
                break;
            } else if (Eleventhpart.equals("Real Estate")) {
                System.out.println("=--------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("---------------------------------------------------------");
                correctanswerinput();
                twelvethquestion();
                twelvethquestionanswer();
                break;
            } else if (Eleventhpart.equals("housing")) {
                System.out.println("---------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("---------------------------------------------------------");
                correctanswerinput();
                twelvethquestion();
                twelvethquestionanswer();
                break;
            } else {
                System.out.println("---------------------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question.");
                System.out.println("----------------------------------------------------------");
                wronganswerinput();
                twelvethquestion();
                twelvethquestionanswer();
                break;
            }
        }
    }


    public static void twelvethquestion() {
        try {
            FileReader reader = new FileReader("ques12.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void twelvethquestionanswer() {
        while (true) {
            System.out.println("                                            ");
            System.out.println("--------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            Scanner scan = new Scanner(System.in);
            String TwelvethPart = scan.nextLine();
            if (TwelvethPart.equals("Japan")) {
                System.out.println("--------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("--------------------------------------------------------");
                correctanswerinput();
                thirtenthquestion();
                thirtenthquestionanswer();
                break;
            } else if (TwelvethPart.equals("Nihon")) {
                System.out.println("---------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("---------------------------------------------------------");
                correctanswerinput();
                thirtenthquestion();
                thirtenthquestionanswer();
                break;
            } else if (TwelvethPart.equals("Nippon")) {
                System.out.println("----------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("-----------------------------------------------------------");
                correctanswerinput();
                thirtenthquestion();
                thirtenthquestionanswer();
                break;
            } else if (TwelvethPart.equals("japan")) {
                System.out.println("----------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("---------------------------------------------------------");
                correctanswerinput();
                thirtenthquestion();
                thirtenthquestionanswer();
                break;
            } else if (TwelvethPart.equals("nihon")) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("-----------------------------------------------------------");
                correctanswerinput();
                thirtenthquestion();
                thirtenthquestionanswer();
                break;
            } else if (TwelvethPart.equals("nippon")) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Be ready for the next Question.");
                System.out.println("------------------------------------------------------------");
                correctanswerinput();
                thirtenthquestion();
                thirtenthquestionanswer();
                break;
            } else if (TwelvethPart.equals(" ")) {
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("That is invalid input and also the wrong answer, so neg 5.");
                System.out.println("Be ready for the next Question and make sure you don't hit enter with nothing there");
                System.out.println("------------------------------------------------------------------------------------");
                wronganswerinput();
                thirtenthquestion();
                thirtenthquestionanswer();
                break;
            } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Be ready for the next Question.");
                System.out.println("-------------------------------------------------------------");
                wronganswerinput();
                thirtenthquestion();
                thirtenthquestionanswer();
                break;
            }
        }
    }


    public static void thirtenthquestion() {
        try {
            FileReader reader = new FileReader("ques13.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void thirtenthquestionanswer() {
        while (true) {
            System.out.println("                                                                           ");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question");
            System.out.println("---------------------------------------------------------------------");
            Scanner scan = new Scanner(System.in);
            String ThirtenthPart = scan.nextLine();
            if (ThirtenthPart.equals("My Fair Lady")) {
                System.out.println("-----------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("-----------------------------------------------------------------");
                correctanswerinput();
                fourtenthquestion();
                fourtenthquestionanswer();
                break;
            } else if (ThirtenthPart.equals("my fair lady")) {
                System.out.println("------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("------------------------------------------------------------------");
                correctanswerinput();
                fourtenthquestion();
                fourtenthquestionanswer();
                break;
            } else if (ThirtenthPart.equals("")) {
                System.out.println("------------------------------------------------------------------");
                System.out.println("That is invalid input, so neg 5.");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("------------------------------------------------------------------");
                wronganswerinput();
                fourtenthquestion();
                fourtenthquestionanswer();
                break;
            } else {
                System.out.println("------------------------------------------------------------------");
                System.out.println("That is incorrect, neg 5");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("------------------------------------------------------------------");
                wronganswerinput();
                fourtenthquestion();
                fourtenthquestionanswer();
                break;
            }
        }
    }


    public static void fourtenthquestion() {
        try {
            FileReader reader = new FileReader("ques14.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void fourtenthquestionanswer() {
        while (true) {
            System.out.println("                                                                      ");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            System.out.println("----------------------------------------------------------------------");
            Scanner scan = new Scanner(System.in);
            String FourtenthPart = scan.nextLine();
            if (FourtenthPart.equals("Maugham")) {
                System.out.println("------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("------------------------------------------------------------------");
                correctanswerinput();
                fifthtenthquestion();
                fifthtenthquestionanswer();
                break;
            } else if (FourtenthPart.equals("Somerset Maugham")) {
                System.out.println("------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("------------------------------------------------------------------");
                fifthtenthquestion();
                fifthtenthquestionanswer();
                break;
            } else if (FourtenthPart.equals("W. Somerset Maugham")) {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("--------------------------------------------------------------------");
                correctanswerinput();
                fifthtenthquestion();
                fifthtenthquestionanswer();
                break;
            } else if (FourtenthPart.equals("maugham")) {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("--------------------------------------------------------------------");
                fifthtenthquestion();
                fifthtenthquestionanswer();
                break;
            } else if (FourtenthPart.equals("somerset maugham")) {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("--------------------------------------------------------------------");
                correctanswerinput();
                fifthtenthquestion();
                fifthtenthquestionanswer();
                break;
            } else if (FourtenthPart.equals("w. somerset maugham")) {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("--------------------------------------------------------------------");
                correctanswerinput();
                fifthtenthquestion();
                fifthtenthquestionanswer();
                break;
            } else if (FourtenthPart.equals("")) {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("That is invalid input, so neg 5.");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("--------------------------------------------------------------------");
                wronganswerinput();
                fifthtenthquestion();
                fifthtenthquestionanswer();
                break;
            } else {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("---------------------------------------------------------------------");
                wronganswerinput();
                fifthtenthquestion();
                fifthtenthquestionanswer();
                break;
            }
        }
    }


    public static void fifthtenthquestion() {
        try {
            FileReader reader = new FileReader("ques15.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void fifthtenthquestionanswer() {
        while (true) {
            System.out.println("                                                                         ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            System.out.println("-------------------------------------------------------------------------");
            Scanner scan = new Scanner(System.in);
            String FifthtenthPart = scan.nextLine();
            if (FifthtenthPart.equals("Pampas")) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("---------------------------------------------------------------------");
                correctanswerinput();
                sixthtenthquestion();
                sixthtenthquestionanswer();
                break;
            } else if (FifthtenthPart.equals("The Pampas")) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("----------------------------------------------------------------------");
                correctanswerinput();
                sixthtenthquestion();
                sixthtenthquestionanswer();
                break;
            } else if (FifthtenthPart.equals("Pampa")) {
                System.out.println("----------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("----------------------------------------------------------------------");
                correctanswerinput();
                sixthtenthquestion();
                sixthtenthquestionanswer();
            } else if (FifthtenthPart.equals("pampas")) {
                System.out.println("----------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("----------------------------------------------------------------------");
                correctanswerinput();
                sixthtenthquestion();
                sixthtenthquestionanswer();
                break;
            } else if (FifthtenthPart.equals("the pampas")) {
                System.out.println("----------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("----------------------------------------------------------------------");
                correctanswerinput();
                sixthtenthquestion();
                sixthtenthquestionanswer();
                break;
            } else if (FifthtenthPart.equals("pampa")) {
                System.out.println("----------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("----------------------------------------------------------------------");
                correctanswerinput();
                sixthtenthquestion();
                sixthtenthquestionanswer();
                break;
            } else if (FifthtenthPart.equals("")) {
                System.out.println("----------------------------------------------------------------------");
                System.out.println("That is invalid input, neg 5.");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("----------------------------------------------------------------------");
                wronganswerinput();
                sixthtenthquestion();
                sixthtenthquestionanswer();
                break;
            } else {
                System.out.println("----------------------------------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("----------------------------------------------------------------------");
                wronganswerinput();
                sixthtenthquestion();
                sixthtenthquestionanswer();
                break;
            }
        }
    }


    public static void sixthtenthquestion() {
        try {
            FileReader reader = new FileReader("ques16.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void sixthtenthquestionanswer() {
        while (true) {
            System.out.println("                                                                                ");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            System.out.println("---------------------------------------------------------------------------");
            Scanner scan = new Scanner(System.in);
            String SixthtenthPart = scan.nextLine();
            if (SixthtenthPart.equals("Blue")) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("-----------------------------------------------------------------------");
                correctanswerinput();
                questionseventeen();
                questionseventeenanswer();
                break;
            } else if (SixthtenthPart.equals("Cobalt Blue")) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("-----------------------------------------------------------------------");
                questionseventeen();
                questionseventeenanswer();
                break;
            } else if (SixthtenthPart.equals("Prussian Blue")) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("-----------------------------------------------------------------------");
                correctanswerinput();
                questionseventeen();
                questionseventeenanswer();
                break;
            } else if (SixthtenthPart.equals("Bromthyol Blue")) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("-----------------------------------------------------------------------");
                correctanswerinput();
                questionseventeen();
                questionseventeenanswer();
                break;
            } else if (SixthtenthPart.equals("blue")) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("-----------------------------------------------------------------------");
                correctanswerinput();
                questionseventeen();
                questionseventeenanswer();
                break;
            } else if (SixthtenthPart.equals("cobalt blue")) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("-----------------------------------------------------------------------");
                correctanswerinput();
                questionseventeen();
                questionseventeenanswer();
                break;
            } else if (SixthtenthPart.equals("prussian blue")) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("-----------------------------------------------------------------------");
                correctanswerinput();
                questionseventeen();
                questionseventeenanswer();
                break;
            } else if (SixthtenthPart.equals("bromthyol blue")) {
                System.out.println("------------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("-------------------------------------------------------------------------");
                correctanswerinput();
                questionseventeen();
                questionseventeenanswer();
                break;
            } else if (SixthtenthPart.equals("")) {
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("That is invalid input, neg 5.");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("-------------------------------------------------------------------------");
                wronganswerinput();
                questionseventeen();
                questionseventeenanswer();
                break;
            } else {
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("-------------------------------------------------------------------------");
                wronganswerinput();
                questionseventeen();
                questionseventeenanswer();
                break;
            }
        }
    }


    public static void questionseventeen() {
        try {
            FileReader reader = new FileReader("ques17.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void questionseventeenanswer() {
        while (true) {
            System.out.println("                                                                              ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("On this Question, a description is acceptable.");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            System.out.println("-----------------------------------------------------------------------");
            Scanner scan = new Scanner(System.in);
            String PartSeventeen = scan.nextLine();
            if (PartSeventeen.equals("Being Headless")) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("--------------------------------------------------------------------");
                correctanswerinput();
                questioneighteen();
                questioneighteenanswer();
                break;
            } else if (PartSeventeen.equals("Having No Head")) {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("-------------------------------------------------------------------");
                correctanswerinput();
                questioneighteen();
                questioneighteenanswer();
                break;
            } else if (PartSeventeen.equals("Beheaded")) {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("-------------------------------------------------------------------");
                correctanswerinput();
                questioneighteen();
                questioneighteenanswer();
                break;
            } else if (PartSeventeen.equals("beheaded")) {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("--------------------------------------------------------------------");
                correctanswerinput();
                questioneighteen();
                questioneighteenanswer();
                break;
            } else if (PartSeventeen.equals("being headless")) {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("--------------------------------------------------------------------");
                correctanswerinput();
                questioneighteen();
                questioneighteenanswer();
                break;
            } else if (PartSeventeen.equals("dead")) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Due to the type of answer you gave, I shall prompt you.");
                System.out.println("You will have 5 seconds to answer the prompt.");
                System.out.println("---------------------------------------------------------------------");
            } else if (PartSeventeen.equals("having no head")) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("---------------------------------------------------------------------");
                wronganswerinput();
                questioneighteen();
                questioneighteenanswer();
                break;
            } else if (PartSeventeen.equals("")) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("That is invalid input, neg 5.");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("---------------------------------------------------------------------");
                wronganswerinput();
                questioneighteen();
                questioneighteenanswer();
                break;
            } else {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("---------------------------------------------------------------------");
                wronganswerinput();
                questioneighteen();
                questioneighteenanswer();
                break;
            }
        }
    }


    public static void questioneighteen() {
        try {
            FileReader reader = new FileReader("ques18.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void questioneighteenanswer() {
        while (true) {
            System.out.println("                                                                           ");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            System.out.println("---------------------------------------------------------------------------");
            Scanner scan = new Scanner(System.in);
            String PartEighteen = scan.nextLine();
            if (PartEighteen.equals("Scotland")) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("---------------------------------------------------------------------");
                correctanswerinput();
                questionnineteen();
                questionnineteenanswer();
                break;
            } else if (PartEighteen.equals("Alba")) {
                System.out.println("----------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("----------------------------------------------------------------------");
                correctanswerinput();
                questionnineteen();
                questionnineteenanswer();
                break;
            } else if (PartEighteen.equals("scotland")) {
                System.out.println("----------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("----------------------------------------------------------------------");
                correctanswerinput();
                questionnineteen();
                questionnineteenanswer();
                break;
            } else if (PartEighteen.equals("alba")) {
                System.out.println("----------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("----------------------------------------------------------------------");
                correctanswerinput();
                questionnineteen();
                questionnineteenanswer();
                break;
            } else if (PartEighteen.equals("")) {
                System.out.println("----------------------------------------------------------------------");
                System.out.println("That is invalid input, neg 5.");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("----------------------------------------------------------------------");
                wronganswerinput();
                questionnineteen();
                questionnineteenanswer();
                break;
            } else {
                System.out.println("----------------------------------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("----------------------------------------------------------------------");
                wronganswerinput();
                questionnineteen();
                questionnineteenanswer();
                break;
            }
        }
    }


    public static void questionnineteen() {
        try {
            FileReader reader = new FileReader("ques19.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void questionnineteenanswer() {
        while (true) {
            System.out.println("                                                                                ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            System.out.println("-------------------------------------------------------------------------");
            Scanner scan = new Scanner(System.in);
            String PartNineteen = scan.nextLine();
            if (PartNineteen.equals("Aquifier")) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("---------------------------------------------------------------------");
                correctanswerinput();
                questiontwenty();
                questiontwentyanswer();

                break;
            } else if (PartNineteen.equals("Aquifiers")) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("---------------------------------------------------------------------");
                correctanswerinput();
                questiontwenty();
                questiontwentyanswer();
                break;
            } else if (PartNineteen.equals("aquifier")) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("---------------------------------------------------------------------");
                correctanswerinput();
                questiontwenty();
                questiontwentyanswer();
                break;
            } else if (PartNineteen.equals("aquifiers")) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("---------------------------------------------------------------------");
                correctanswerinput();
                questiontwenty();
                questiontwentyanswer();
                break;
            } else if (PartNineteen.equals("")) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("That is invalid input, neg 5.");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("---------------------------------------------------------------------");
                wronganswerinput();
                questiontwenty();
                questiontwentyanswer();
                break;
            } else {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("---------------------------------------------------------------------");
                wronganswerinput();
                questiontwenty();
                questiontwentyanswer();
                break;
            }

        }
    }


    public static void questiontwenty() {
        try {
            FileReader reader = new FileReader("ques20.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void questiontwentyanswer() {
        while (true) {
            System.out.println("                                                                      ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Now, you have 10 seconds to answer the Question.");
            System.out.println("-------------------------------------------------------------------------");
            Scanner scan = new Scanner(System.in);
            String PartTwenty = scan.nextLine();
            if (PartTwenty.equals("Stravinsky")) {
                System.out.println("------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("------------------------------------------------------------------");
                correctanswerinput();
                FinalScoreOutput();
                break;
            } else if (PartTwenty.equals("stravinsky")) {
                System.out.println("------------------------------------------------------------------");
                System.out.println("That is the correct answer, 10 points!");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("------------------------------------------------------------------");
                correctanswerinput();
                FinalScoreOutput();
                break;
            } else if (PartTwenty.equals("")) {
                System.out.println("------------------------------------------------------------------");
                System.out.println("That is invalid input, neg 5.");
                System.out.println("Now, be ready for the next Question.");
                System.out.println("------------------------------------------------------------------");
                wronganswerinput();
                FinalScoreOutput();
                break;
            } else {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("That is incorrect, neg 5.");
                System.out.println("This is also the end of the Set, so good bye.");
                System.out.println("-------------------------------------------------------------------");
                wronganswerinput();
                FinalScoreOutput();
                break;
            }
        }
    }

    private static void wronganswerinput() {
        totalscore = totalscore - WrongAnswer;
    }

    private static void correctanswerinput() {
        totalscore = totalscore + Correctanswer;
    }

    private static void FinalScoreOutput() {
        System.out.println("Your total score is:" + " " + totalscore);
    }

    abstract class QuestionTimer extends TimerTask {

        public void timerparameters() {

        }

        public void PromptTimer() {

        }
    }
}

