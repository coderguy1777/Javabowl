package MainSourceforJavabowl;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

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
        JSONParser parser11 = new JSONParser();
        try {
            JSONArray j = (JSONArray) parser11.parse(new FileReader("C:\\Users\\lolzk\\IdeaProjects\\JavabowlGUI\\src\\JSONData\\2018FACTS"));
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}