import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menus {
//TEXTOS JUEGO



    //texto relacionados con el nombre del usuario
    public static String[] mensajeUserNames(){
        String[] mensajeName = {
                "BIENVENIDO A NUESTRO QUIZ!",
                "Elija un nombre o pseudonimo",
                "Su usuario es: ",
                "Escriba aqui su usuario: ",
        };
        return mensajeName;
    }

    //textos relacionados con las categorias del juego
    public static String[] mensajeCategoryas(){
        String[] mensajeCategory = {
                "Ahora elija una categoria para el Quiz",                    //0
                "Las categorias disponibles son: ",                          //1
                "Introduca una opcion de categoria disponible",              //2
                "1 - " + categoria1(),                                       //3
                "2 - " + categoria2(),                                       //4
                "Introduca una opcion: ",                                    //5
                "Se ha selecionado la categoria ",                           //6
                " para el Quiz",                                             //7
        };
        return mensajeCategory;
    }


    //Creacion de las categorias
    public static String categoria1(){
        return "Perro";
    }
    //inputs para la eleccion de la categoria
    public static String[] validInputsCategory1(){
        return new String[]{"1", "dog", "perro", "perros"};
    }
    public static String categoria2(){
        return  "Gato";
    }
    public static String[] validInputsCategory2(){
        return new String[]{"2", "cat", "gato", "gatos"};
    }

    public static String[] combinedInputs(){
        String[] inputCategory1 = validInputsCategory1();
        String[] inputCategory2 = validInputsCategory2();

        List<String> combinedInputs = new ArrayList<>();
        combinedInputs.addAll(Arrays.asList(inputCategory1));
        combinedInputs.addAll(Arrays.asList(inputCategory2));

        return combinedInputs.toArray(new String[combinedInputs.size()]);
    }

    //texto relacionados con la parte interactiva del juego
    public static String[] mensajeGame(){
        String[] mensajeGame = {
                "Respuesta Correcta!",                             //0
                "Respuesta Incorrecta!",                           //1
                "Tu total de puntos es: ",                         //2
                "Tu total de fallos es: ",                         //3
                "La siguiente pregunta es: ",                      //4
                "Su respuesta: ",                                  //5

        };
        return mensajeGame;
    }

    //texto relacionado con Scores
    public static String[] mensajeScore(){
        String[] mensajeScore = {
        "¡Ánimo! Parece que necesitas conocer más sobre el mundo de las mascotas." +
                " Sigue explorando y pronto serás un experto en animales.",
        "¡Vas por buen camino! Sabes bastante sobre mascotas, pero aún hay cosas por descubrir." +
                " ¡Sigue aprendiendo y mejorando tus conocimientos!",
        "¡Gran trabajo! Eres casi un experto en mascotas." +
                " Solo un poco más de práctica y dominarás todo sobre el reino animal.",
        "¡Increíble! Has demostrado ser un verdadero amante y conocedor de las mascotas. " +
                "¡Tus conocimientos son impecables, felicidades!"
        };
        return mensajeScore;
    }


}

