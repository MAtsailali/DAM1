import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int energy = generateStat();
        int sleep = generateStat();
        int fatigue = generateStat();
        int weight = generateStat();
        int hygiene = generateStat();
        int[] statAr = {sleep, fatigue, energy, weight, hygiene};
        boolean isAlive = true;

        initialMenu();
        String petType= petType(); //tipus mascota
        String petTypE = emojipetType(petType); //assignacio del emoji
        String nombreMascota = creationMenu(petType); //Nom mascota

        int option;
        do {
            menuYstats(petType, nombreMascota, sleep, energy, weight, hygiene, fatigue);
            option = selectOption();
            sleep = sleepStat(option, sleep, petType);
            fatigue = fatigueStat(option, fatigue);
            energy = energyStat(option, energy);
            weight = weightStat(option, weight);
            hygiene = hygieneStat(option, hygiene);
            statAr = new int[]{sleep, fatigue, energy, weight, hygiene};
            isAlive = statCap(statAr);

        } while ((option != 0) && (isAlive));
        {
            if (option == 0) {
                messageExit(petType, nombreMascota);
            } else {
                messageDead(petTypE, nombreMascota);
            }
        }

    }

    private static void initialMenu(){
        System.out.println("Booting virtual pet...");
        System.out.println("Loading...");
        System.out.println("You have 2 typs of pet unloked");
        System.out.println("Dog     (❍ᴥ❍ʋ)");
        System.out.println("Cat    =^._.^= ∫");
    }
    private static String petType() {
        System.out.println("Chose your type of pet");
        String petType = "";
        do {
            petType = new Scanner(System.in).nextLine();
            switch (petType) {
                case "Dog", "dog", "DOG":
                    petType = "dog";
                    break;

                case "Cat", "cat", "CAT":
                    petType = "cat";
                    break;
                default:
                    petType = "";
                    System.out.println("Invalid pet type");
                    System.out.println("Please choose between Dog or Cat");
                    break;
            }
        } while (petType.equals(""));
        return petType;
    }
    private static String creationMenu(String petType) {
        System.out.println("Pet created!");
        System.out.println("Chose a name for your " + petType);
        System.out.println("Name:");
        String nombreMascota = new Scanner(System.in).nextLine();
        return nombreMascota;
    }
    private static void menuYstats(String petType,String nombreMascota, int sleep, int energy, int weight, int hygiene, int fatigue) {
        if (petType.equals("dog")) {
            System.out.println("                 (❍ᴥ❍ʋ) " + nombreMascota);}
        if (petType.equals("cat")) {
            System.out.println("                 =^._.^= ∫ " + nombreMascota);}
        System.out.println("1.- Sleep                   " + "Sleep   Stat: " + sleep);
        System.out.println("2.- Play                    " + "Energy  Stat: " + energy);
        System.out.println("3.- Eat                     " + "Weight  Stat: " + weight);
        if (petType.equals("dog")) {
            System.out.println("4.- Shower                  " + "Hygiene Stat: " + hygiene);}
        if (petType.equals("cat")) {
            System.out.println("4.- Self-cleaning           " + "Hygiene Stat: " + hygiene);}
        System.out.println("0.- Exit virtual pet        " + "Fatigue Stat: " + fatigue);
        System.out.println("Select an option: ");
    }
    private static int selectOption() {
        int option = new Scanner(System.in).nextInt();
        return option;
    }
    private static String emojipetType(String petType) {
            String petTypeE = "";
            if (petType.equals("dog")) {
                petTypeE = "          (❍ᴥ❍ʋ)";
            }
            if (petType.equals("cat")) {
                petTypeE = "         =^._.^= ∫";
            }
            return petTypeE;
    }
    private static int generateStat() {
        Random statRandom;
        int low = 40;
        int high = 60;
        statRandom = new Random();
        int stat = statRandom.nextInt(high - low) + low;

        return stat;
    }
    private static boolean statCap(int[] statAr) {
        boolean isAlive = true;
        for (int stats : statAr) {
            if (stats < 0 || stats > 100) {
                isAlive = false;
            }
        }
        return isAlive;
    }
    private static int sleepStat (int option, int sleep, String petType) {
        switch (option) {
            case 1:
                if (petType.equals("dog")) {
                    sleep = sleep - 25;
                }
                if (petType.equals("cat")) {
                    sleep = sleep - 20;
                } break;
            case 2:
                if (petType.equals("dog")) {
                    sleep = sleep + 25;
                }
                if (petType.equals("cat")) {
                    sleep = sleep + 20;
                } break;
            case 3:
                if (petType.equals("dog")) {
                    sleep = sleep + 15;
                }
                if (petType.equals("cat")) {
                    sleep = sleep + 10;
                } break;
        }
        return sleep;
    }
    private static int fatigueStat (int option, int fatigue) {
        switch (option) {
            case 1:
                fatigue = fatigue - 15;
                break;
            case 2:
                fatigue = fatigue + 15;
                break;
        }
        return fatigue;
    }
    private static int energyStat (int option, int energy) {
        switch (option) {
            case 1:
                energy = energy + 15;
                break;
            case 2:
                energy = energy - 15;
                break;
            case 3:
                energy = energy + 10;
                break;
        }
        return energy;
    }
    private static int weightStat (int option, int weight) {
        switch (option) {
            case 3:
                weight = weight + 10;
                break;
        }
        return weight;
    }
    private static int hygieneStat (int option, int hygiene) {
        switch (option) {
            case 4:
                hygiene = hygiene + 20;
                break;
        }
        return hygiene;
    }
    private static void messageExit(String petType, String nombreMascota) {
        System.out.println("Deleting your " + petType + " " + nombreMascota);
        System.out.println("Thanks for playing");
    }
    private static void messageDead(String petTypE, String nombreMascota) {
        System.out.println("GAME OVER");
        System.out.println(nombreMascota + " is dead  " + petTypE);
    }
}
