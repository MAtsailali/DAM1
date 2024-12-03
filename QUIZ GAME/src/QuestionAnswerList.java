import java.util.*;

public class QuestionAnswerList {

//Base con todas la preguntas y respuestas del quiz
    public static String[][] arrayQuestionsDog(){
        String[][] arrayQuestionsD = {
                {
                        "Perro",                                          //Category
                },
                {
                        "¿Qué alimento es tóxico para los perros?",    //Pregunta
                        "a) Chocolate",                                //Opcion1
                        "b) Arroz",                                    //Opcion2
                        "c) Zanahoria",                                //Opcion3
                        "Chocolate",                                   //Respuesta Correcta Palabra
                        "a"                                            //Respuesta Correcta Letra
                },
                {
                        "¿Cuál es la temperatura corporal promedio de un perro?",
                        "a) 37°C",
                        "b) 39°C",
                        "c) 41°C",
                        "39°C",
                        "b"
                },
                {
                        "¿Qué raza es conocida por su gran sentido del olfato?",
                        "a) Labrador Retriever",
                        "b) Beagle",
                        "c) Chihuahua",
                        "Beagle",
                        "b"
                },
                {
                        "¿Qué actividad física es fundamental para la salud de los perros?",
                        "a) Dormir",
                        "b) Nadar",
                        "c) Caminar",
                        "Caminar",
                        "c"
                },
                {
                        "¿Cuál es el promedio de vida de un perro doméstico?",
                        "a) 5-8 años",
                        "b) 10-13 años",
                        "c) 15-18 años",
                        "10-13 años",
                        "b"
                },
                {
                        "¿Cuál de estos alimentos es seguro para los perros?",
                        "a) Uvas",
                        "b) Manzanas",
                        "c) Cebolla",
                        "Manzanas",
                        "b"
                },
                {
                        "¿Cuántas veces al día debe comer un cachorro?",
                        "a) Una vez",
                        "b) Dos veces",
                        "c) Tres veces",
                        "Tres veces",
                        "c"
                },
                {
                        "¿Qué sentido es el más desarrollado en los perros?",
                        "a) Vista",
                        "b) Oído",
                        "c) Olfato",
                        "Olfato",
                        "c"
                },
                {
                        "¿Cuál es el propósito de vacunar a un perro?",
                        "a) Mejorar su apetito",
                        "b) Proteger contra enfermedades",
                        "c) Aumentar su energía",
                        "Proteger contra enfermedades",
                        "b"
                },
                {
                        "¿Qué raza es conocida por ser excelente perro guardián?",
                        "a) Pug",
                        "b) Pastor Alemán",
                        "c) Bichón Frisé",
                        "Pastor Alemán",
                        "b"
                },
                {
                        "¿Cómo demuestran los perros afecto a sus dueños?",
                        "a) Gruñendo",
                        "b) Moviendo la cola",
                        "c) Ladrando sin parar",
                        "Moviendo la cola",
                        "b"
                },
                {
                        "¿Qué necesitan los perros para mantener sus dientes saludables?",
                        "a) Comida húmeda",
                        "b) Juguetes para morder",
                        "c) Dormir mucho",
                        "Juguetes para morder",
                        "b"
                },
                {
                        "¿Qué raza es famosa por ser usada en rescates de montaña?",
                        "a) San Bernardo",
                        "b) Golden Retriever",
                        "c) Boxer",
                        "San Bernardo",
                        "a"
                },
                {
                        "¿Por qué los perros jadean?",
                        "a) Para comunicarse",
                        "b) Para enfriarse",
                        "c) Para mostrar hambre",
                        "Para enfriarse",
                        "b"
                },
                {
                        "¿Qué significa cuando un perro se rasca las orejas constantemente?",
                        "a) Está feliz",
                        "b) Tiene una infección",
                        "c) Quiere jugar",
                        "Tiene una infección",
                        "b"
                },
                {
                        "¿Qué raza es conocida por ser extremadamente leal?",
                        "a) Akita",
                        "b) Bulldog",
                        "c) Poodle",
                        "Akita",
                        "a"
                },
                {
                        "¿Qué sucede si un perro ingiere huesos cocidos?",
                        "a) Mejora su digestión",
                        "b) Puede sufrir obstrucciones",
                        "c) No pasa nada",
                        "Puede sufrir obstrucciones",
                        "b"
                },
                {
                        "¿Cuál es el mejor momento para entrenar a un perro?",
                        "a) Durante su etapa de cachorro",
                        "b) Cuando sea adulto",
                        "c) A cualquier edad",
                        "Durante su etapa de cachorro",
                        "a"
                },
                {
                        "¿Qué raza es conocida por ser pequeña y enérgica?",
                        "a) Chihuahua",
                        "b) Gran Danés",
                        "c) Husky",
                        "Chihuahua",
                        "a"
                },
                {
                        "¿Por qué es importante desparasitar a los perros?",
                        "a) Para evitar enfermedades parasitarias",
                        "b) Para que sean más fuertes",
                        "c) Para que sean más amigables",
                        "Para evitar enfermedades parasitarias",
                        "a"
                }

        };
        return arrayQuestionsD;
    }

    public static String[][] arrayQuestionsCat(){
        String[][] arrayQuestionsC = {
                {
                        "Gato"                                                    //Category
                },
                {
                        "¿Qué alimento es tóxico para los gatos?",           //Pregunta
                        "a) Cebolla",                                        //Opcion1
                        "b) Zanahoria",                                      //Opcion2
                        "c) Manzana",                                        //Opcion3
                        "Cebolla",                                           //Respuesta Correcta Palabra
                        "a"                                                  //Respuesta Correcta Letra
                },
                {
                        "¿Cuál es la esperanza de vida promedio de un gato doméstico?",
                        "a) 5-8 años",
                        "b) 10-15 años",
                        "c) 18-22 años",
                        "10-15 años",
                        "b"
                },
                {
                        "¿Qué indica cuando un gato ronronea?",
                        "a) Está molesto",
                        "b) Está relajado o feliz",
                        "c) Tiene hambre",
                        "Está relajado o feliz",
                        "b"
                },
                {
                        "¿Qué parte del cuerpo de un gato le ayuda a mantener el equilibrio?",
                        "a) Cola",
                        "b) Orejas",
                        "c) Patas",
                        "Cola",
                        "a"
                },
                {
                        "¿Cuántas horas duermen los gatos en promedio al día?",
                        "a) 8 horas",
                        "b) 12 horas",
                        "c) 16 horas",
                        "16 horas",
                        "c"
                },
                {
                        "¿Qué raza de gato es conocida por no tener pelaje?",
                        "a) Maine Coon",
                        "b) Sphynx",
                        "c) Siamés",
                        "Sphynx",
                        "b"
                },
                {
                        "¿Por qué es importante esterilizar a los gatos?",
                        "a) Para mejorar su pelaje",
                        "b) Para prevenir sobrepoblación y enfermedades",
                        "c) Para hacerlos más juguetones",
                        "Para prevenir sobrepoblación y enfermedades",
                        "b"
                },
                {
                        "¿Qué sentido está más desarrollado en los gatos?",
                        "a) Vista",
                        "b) Oído",
                        "c) Olfato",
                        "Oído",
                        "b"
                },
                {
                        "¿Qué significa cuando un gato arquea su espalda y eriza el pelo?",
                        "a) Está asustado o defendiendo",
                        "b) Quiere jugar",
                        "c) Tiene frío",
                        "Está asustado o defendiendo",
                        "a"
                },
                {
                        "¿Qué tipo de leche es segura para los gatos?",
                        "a) Leche de vaca",
                        "b) Leche sin lactosa",
                        "c) Leche condensada",
                        "Leche sin lactosa",
                        "b"
                },
                {
                        "¿Cómo marcan su territorio los gatos?",
                        "a) Rascando superficies",
                        "b) Moviendo la cola",
                        "c) Ronroneando",
                        "Rascando superficies",
                        "a"
                },
                {
                        "¿Qué tipo de arena prefieren la mayoría de los gatos para su caja?",
                        "a) Arena perfumada",
                        "b) Arena sin perfume",
                        "c) Arena de grano grueso",
                        "Arena sin perfume",
                        "b"
                },
                {
                        "¿Por qué los gatos amasan con sus patas?",
                        "a) Para estirar sus músculos",
                        "b) Por instinto de relajación",
                        "c) Para afilar sus uñas",
                        "Por instinto de relajación",
                        "b"
                },
                {
                        "¿Cuál es una señal común de que un gato está enfermo?",
                        "a) Come más de lo habitual",
                        "b) Deja de acicalarse",
                        "c) Juega más tiempo",
                        "Deja de acicalarse",
                        "b"
                },
                {
                        "¿Qué raza de gato es famosa por sus ojos azules y su pelaje claro con puntas más oscuras?",
                        "a) Siamés",
                        "b) Persa",
                        "c) Bengalí",
                        "Siamés",
                        "a"
                },
                {
                        "¿Qué es importante para la dieta de un gato?",
                        "a) Altos niveles de proteínas",
                        "b) Alto contenido de azúcar",
                        "c) Bajo nivel de grasas",
                        "Altos niveles de proteínas",
                        "a"
                },
                {
                        "¿Qué hacer si un gato ingiere una planta venenosa?",
                        "a) Ofrecerle agua",
                        "b) Llevarlo al veterinario inmediatamente",
                        "c) Dejarlo descansar",
                        "Llevarlo al veterinario inmediatamente",
                        "b"
                },
                {
                        "¿Cómo muestra afecto un gato hacia su dueño?",
                        "a) Moviendo la cola",
                        "b) Frotándose contra él",
                        "c) Ladrando",
                        "Frotándose contra él",
                        "b"
                },
                {
                        "¿Qué hacer para evitar que un gato se aburra en casa?",
                        "a) Dejarlo dormir todo el día",
                        "b) Proporcionarle juguetes interactivos",
                        "c) Alimentarlo más",
                        "Proporcionarle juguetes interactivos",
                        "b"
                },
                {
                        "¿Por qué los gatos trepan a lugares altos?",
                        "a) Para estar seguros y vigilar",
                        "b) Porque no les gusta el suelo",
                        "c) Para demostrar su fuerza",
                        "Para estar seguros y vigilar",
                        "a"
                }

                };
        return arrayQuestionsC;
    }
}
