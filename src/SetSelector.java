package MainSourceforJavabowl;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class SetSelector {
    int QuestioNumber;
    String Questions;
    String Bonuses;
    int BonusesAmount;
    ArrayList<String>QuestionsOrder;
    ArrayList<String>BonusesOrder;

    public void SetSelector(int QuestioNumber, String Questions, String Bonuses, int BonusesAmount) {
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
            scan = new Scanner(new BufferedReader(new FileReader("ChicagoOpen2018Tossups.json")));
            Questions = scan.nextLine();
            Bonuses = scan.nextLine();
            while(scan.hasNextLine()) {
                QuestionsOrder.add(Questions);
                BonusesOrder.add(Bonuses);
            }
            Collections.sort(QuestionsOrder);
            Collections.sort(BonusesOrder);
            System.out.println(BonusesOrder);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
