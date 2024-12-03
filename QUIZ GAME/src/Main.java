import java.util.Arrays;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = GameMecanics.nameUser();
        System.out.println();
        String[][] inGameQuestions = GameMecanics.categoryChose();
        String category = Arrays.toString(inGameQuestions[0]);
        System.out.print(Menus.mensajeCategoryas()[6]+category+Menus.mensajeCategoryas()[7]);
        System.out.println();
        String[] resultGame = GameMecanics.game(inGameQuestions);
        RegistroPlayers.registroPlayers(name,category,resultGame[0],resultGame[1],resultGame[2]);
        System.out.println("Fin del Quiz!" + "                       Tu puntuación es: " + resultGame[0]);
        System.out.println();
        GameMecanics.mensajeScores(Integer.parseInt(resultGame[0]));

    }

}
