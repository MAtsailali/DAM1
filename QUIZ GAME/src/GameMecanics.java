import java.util.*;

public class GameMecanics {





//CREACION USUARIO
    public static String nameUser(){
        try {
            System.out.println(Menus.mensajeUserNames()[0]);
            System.out.println(Menus.mensajeUserNames()[1]);
            System.out.print(Menus.mensajeUserNames()[3]);
            String nameUser = new Scanner(System.in).nextLine();
            System.out.println(Menus.mensajeUserNames()[2] + nameUser);
            return nameUser;

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }



//PREPARACION JUEGO
//Seleccion de la categoria y assignacion de las arrays en base la categoria
    public static String[][] categoryChose() {
        String[][] questionList = new String[0][0];
        String[] correctInputs = Menus.combinedInputs();
        String select;

            System.out.println(Menus.mensajeCategoryas()[0]);
            System.out.println(Menus.mensajeCategoryas()[1]);
            System.out.println(Menus.mensajeCategoryas()[3]);
            System.out.println(Menus.mensajeCategoryas()[4]);

        do {
            System.out.println();
            System.out.print(Menus.mensajeCategoryas()[5]);
            select = new Scanner(System.in).nextLine().toLowerCase(Locale.ROOT);
        } while (!isValidInput(select, correctInputs));

        if (select.equals("1") || select.equals("dog") || select.equals("perro") || select.equals("perros")) {
            questionList = QuestionAnswerList.arrayQuestionsDog();

        } else
            if (select.equals("2") || select.equals("cat") || select.equals("gato") || select.equals("gatos")) {
            questionList = QuestionAnswerList.arrayQuestionsCat();
        }

        return questionList;
    }



//vaida que la opcion introducida sea una del listado de correctInputs
    private static boolean isValidInput(String input, String[] validInputs) {
        for (String validInput : validInputs) {
            if (input.equals(validInput)) {
                return true;
            }
        }
        System.out.println(Menus.mensajeCategoryas()[2]);
        return false;
    }


    //JUEGO
    public static String[] game(String[][] inGameQuestions){
        int score = 0 , multiplier = 0, countFails=0, numQuestionsResponded = 0;
        boolean fails = true;


            for (int i = 1; i < inGameQuestions.length && countFails < 3; i++) {

                System.out.println();
                System.out.println(Menus.mensajeGame()[2] + score + " |  " + Menus.mensajeGame()[3] + countFails + "/3 |");
                System.out.println();
                System.out.println(Menus.mensajeGame()[4]);
                System.out.println(inGameQuestions[i][0]);
                System.out.println(inGameQuestions[i][1]);
                System.out.println(inGameQuestions[i][2]);
                System.out.println(inGameQuestions[i][3]);
                System.out.print(Menus.mensajeGame()[5]);
                String answer = inputAnswer();

                if (answer.equals((inGameQuestions[i][4]).toLowerCase())) {
                    System.out.println(Menus.mensajeGame()[0]);
                    multiplier = multiplier + 1;
                    numQuestionsResponded++;
                    score = scoreCount(score, multiplier,i);
                } else if (answer.equals((inGameQuestions[i][5]).toLowerCase())) {
                    System.out.println(Menus.mensajeGame()[0]);
                    multiplier = multiplier + 1;
                    numQuestionsResponded++;
                    score = scoreCount(score, multiplier, i);
                } else {
                    System.out.println(Menus.mensajeGame()[1]);
                    multiplier = 1;
                    countFails = failCount(countFails, fails);
                    numQuestionsResponded++;
                }
            }

        String[] resultGame = {String.valueOf(score), String.valueOf(numQuestionsResponded), String.valueOf(countFails)};
        return resultGame;
    }


    public static String inputAnswer(){

            String select = new Scanner(System.in).nextLine().toLowerCase(Locale.ROOT);



        return select;
    }

    public static int scoreCount(int score, int multiplier, int i){

        if (multiplier == 1){
            score = score + 2;
        } else if (score == 0) {
            score = 2;
        } else {
            score = (int) ((score * 1.5)  + (i * multiplier));
        }
        //max score 84107
        return score;
    }

    public static int failCount(int fails, boolean fail){
        if (fail){
            fails++;
        }
        return fails;
    }

    public static void mensajeScores(int score){
        float percent;
        int maxScore = 84107;
        percent = (float) (score * 100) / maxScore;
        if (percent <= 33 ){
            System.out.println(Menus.mensajeScore()[0]);
        } else if (percent > 34 && percent <= 66) {
            System.out.println(Menus.mensajeScore()[1]);
        } else if (percent > 65 && percent <= 99) {
            System.out.println(Menus.mensajeScore()[2]);
        } else if (percent == 100) {
            System.out.println(Menus.mensajeScore()[3]);
        }
    }

}






