package MainSourceforJavabowl;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


class SetSelector {
    int QuestioNumber;
    String Questions;
    String Bonuses;
    int BonusesAmount;
    ArrayList<ArrayList<String>>QuestionsStorage;

    public SetSelector(int QuestioNumber, String Questions, String Bonuses, int BonusesAmount) {
        this.QuestioNumber = QuestioNumber;
        this.Questions = Questions;
        this.Bonuses = Bonuses;
        this.BonusesAmount = BonusesAmount;
    }

    public int getQuestioNumber(int QuestioNumber) {
        return QuestioNumber;
    }

    public String getQuestions(String Questions) {
        return Questions;
    }

    public String getBonuses(String Bonuses) {
        return Bonuses;
    }

    public int getBonusesAmount(int BonusesAmount) {
        return BonusesAmount;
    }

    public void FileScan(String Questions, String Bonuses) {
        Scanner scan;
        try {
            scan = new Scanner(new BufferedReader(new FileReader("sets.txt")));
            Questions = scan.nextLine();
            Bonuses = scan.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
