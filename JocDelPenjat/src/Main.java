import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //set up game
        String[] arrayWords = wordsArrayList();
        String randomWord = arrayWords[selectionRandomWord()].toUpperCase();
        int fails = 0;
        int maxFails = 6;
        String[] arrayMensajesJuego = mensajesJuego();


        //inicio game
        String wordCensured = randomWord.replaceAll("[a-zA-Z]","_");

        mensajeInicioJuego(arrayMensajesJuego);

        //game on
        do {
            printAhorcado(fails, wordCensured);
          char inputLetter = inputLetterValidation(arrayMensajesJuego);
            wordCensured = letterIsInWordPosition(randomWord, inputLetter, wordCensured, arrayMensajesJuego);
            fails = numfails(failCheck(randomWord, inputLetter,arrayMensajesJuego), fails);


        } while (fails < maxFails && wordCensured.contains("_"));
        //End
            if (!wordCensured.contains("_")){
            mensajeWin(arrayMensajesJuego, wordCensured);
        } else {
            printAhorcado(fails, wordCensured);
            mensajeLose(arrayMensajesJuego, randomWord);
        }

    }




    //Lista de palabras
    public static String[] wordsArrayList(){
        String[] arrayWords = new String[]{
                "sapientia",        // Sabiduría
                "virtus",           // Virtud
                "libertas",         // Libertad
                "fortuna",          // Suerte o destino
                "natura",           // Naturaleza
                "amicitia",         // Amistad
                "gloria",           // Gloria, fama
                "honor",            // Honor
                "civitas",          // Ciudad, ciudadanía
                "rex",              // Rey
                "vita",             // Vida
                "aqua",             // Agua
                "terra",            // Tierra
                "mors",             // Muerte
                "luna",             // Luna
                "sol",              // Sol
                "mare",             // Mar
                "aurora",           // Amanecer
                "caelum",           // Cielo
                "ignis",            // Fuego
                "corpus",           // Cuerpo
                "anima",            // Alma
                "fides",            // Fe, confianza
                "familia",          // Familia
                "tempus",           // Tiempo
                "amicus",           // Amigo
                "scientia",         // Conocimiento, ciencia
                "pax",              // Paz
                "veritas",          // Verdad
                "amor"              // Amor
        };

        return arrayWords;
    }

    //eleccion del la palabra del listado
    public static int selectionRandomWord() {
        int high = 30;
        int low = 0;
        int randomWordNumber = new Random().nextInt(high - low) + low;
        return randomWordNumber;
    }




    //parte inicial del juego en el que se muestran los espacios = de letras de la palabra
    public static void palabraConEspacios(String word) {
        int wordLength = word.length();
        for (int i = 0; i < wordLength; i++) {
            System.out.print(" "+word.charAt(i));
        }
        System.out.println();
    }

//scanner i validacion de la letra
  public static char inputLetterValidation(String[] arrayMensajesJuego) {
        boolean valid = false;
        String letter;
        do {
            System.out.println();
            System.out.println(arrayMensajesJuego[2]);
            letter = new Scanner(System.in).next().toUpperCase().trim();
            if (letter.matches("[a-zA-Z]")){
                valid = true;
            } else {
                System.out.println(arrayMensajesJuego[3]);
            }
        } while (!valid);
      return letter.charAt(0);
  }

  //recuento fallos
    public static int numfails(boolean failLetter, int fails) {
        if (failLetter){
            fails = fails +1;
        }
        return fails;
    }

public static boolean failCheck(String wordCensured, char inputLetter, String[] arrayMensajesJuego) {
        boolean failLetter = false;
        if (wordCensured.indexOf(inputLetter) !=-1) {
        } else {
            failLetter = true;
            mensajeFailLetra(arrayMensajesJuego);
        } return failLetter;
}
            // mecanismo del juego

    public static String letterIsInWordPosition (String chosenWord,char inputLetter ,String gamingWord, String[] arrayMensajesJuego) {
        char[] gamingWordArray = gamingWord.toCharArray();

        if (!failCheck(chosenWord, inputLetter, arrayMensajesJuego)) {
            for (int i = 0; i < chosenWord.length(); i++) {
                if (chosenWord.charAt(i) == inputLetter) {
                    gamingWordArray[i] = inputLetter;
                }
            }
        }

        gamingWord = new String(gamingWordArray);
        return gamingWord;
    }
    public static void printAhorcado(int fails, String wordCensured) {
        String[] partesAhorcado = {
                "      ",
                " +---+",
                " |   |",
                " O   |",
                "/|\\  |",
                " |   |",
                "/ \\  |",
                "     ==="
        };
        System.out.println("                    "+"fallos: " + fails);
        for (int i = 0; i <= fails && i < partesAhorcado.length; i++) {
            System.out.println("           " + partesAhorcado[i]);
        }
        palabraConEspacios(wordCensured);
    }



    public static String[] mensajesJuego() {
        String[] arrayMensajesJuego = new String[]{
                //mensaje inicio
                "Bienvenido al juego del Ahorcado",                                             //0
                "Instruciones: Introduce una letra hasta completar la palabra",                 //1
                //menssajes validacion
                "Introduzca 1 letra ",                                                          //2
                "Porfavor introduzca 1 letra",                                                  //3
                //mensajes de fallo letra
                "Tu letra no esta en la palabra",                                               //4
                "Prueba con otra letra",                                                        //5
                //mensajes ganar juego
                "Correcto has acertado!!",                                                      //6
                "Conocias esa palabra del latin o acertaste por casualidad?",                   //7
                "Da igual una victoria es una victoria!! ",                                     //8
                //mensajes perder juego
                "Oooh has perdido... la palabra completa era: ",                                //9
                "Las ultimas palabras del colgado han sido: \"Son matematicas...y no brujeria...\"", //10
                "Espero que con la siguiente victima tenga mas suerte"                          //11


        };

        return arrayMensajesJuego;
    }

    //print mensaje inicio juego
    public static void mensajeInicioJuego(String [] arrayMensajesJuego) {
        System.out.println(arrayMensajesJuego[0]);
        System.out.println(arrayMensajesJuego[1]);
    }
    //print mensaje validacio letra
    public static void mensajeValidacionLetra(String [] arrayMensajesJuego) {
        System.out.println(arrayMensajesJuego[2]);
        System.out.println(arrayMensajesJuego[3]);
    }
    //print mensaje si la letra no esta en la palabra
    public static void mensajeFailLetra(String [] arrayMensajesJuego) {
        System.out.println(arrayMensajesJuego[4]);
        System.out.println(arrayMensajesJuego[5]);
    }

    public static void mensajeWin(String [] arrayMensajesJuego, String randomWord) {
        System.out.println(arrayMensajesJuego[6] + " " + randomWord);
        System.out.println(arrayMensajesJuego[7]);
        System.out.println(arrayMensajesJuego[8]);
    }
    public static void mensajeLose(String [] arrayMensajesJuego, String randomWord) {
        System.out.println(arrayMensajesJuego[9] + " " + randomWord);
        System.out.println(arrayMensajesJuego[10]);
        System.out.println(arrayMensajesJuego[11]);
    }







}



