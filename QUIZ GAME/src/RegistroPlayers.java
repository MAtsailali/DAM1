import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroPlayers {
//el registro no chuta
    public static void registroPlayers(String player, String categoria , String score, String numPreguntas, String countfails) {
        int correctAnsw =  (Integer.parseInt(numPreguntas) - Integer.parseInt(countfails));
        String time = timeStamp();
        String registro = player + ";" + categoria + ";" + score + ";" + correctAnsw + ";" + countfails + ";" + time;

        Path path = Paths.get("src/log/RegistroPlayers.txt");
        try {
            Files.writeString(path, registro,StandardOpenOption.APPEND);
            Files.writeString(path, System.lineSeparator(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error al escribir el registro");
        }

    }


    public static String timeStamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return now.format(formatter);
    }


}
