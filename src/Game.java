import java.util.Scanner;
public class Game {

    public static String chooseTamagotchi(){
        Scanner scanner = new Scanner(System.in);

        String chooseTamagotchiMessage = "Hello, would you like to create a dog or a cat? " +
                "Press 1 for dog or 2 for cat";
        System.out.println(chooseTamagotchiMessage);
        String chooseTamagotchi = scanner.next();

        String choosenTamagothciMessage = "you have chosen ";

        if (chooseTamagotchi.equals("1")) {
            chooseTamagotchi = "dog🐶";
            System.out.println(choosenTamagothciMessage + chooseTamagotchi);
            return "1";
        } else if (chooseTamagotchi.equals("2")) {
            chooseTamagotchi = "cat🐈";
            System.out.println(choosenTamagothciMessage + chooseTamagotchi);
            return "2";
        }
        return " ";
    }

    public static void main(String[] args) {

        Tamagotchi tamagotchi = new Tamagotchi(null, 0, 0, null);

        tamagotchi = tamagotchi.getTamagotchiType(chooseTamagotchi(), tamagotchi.getName(), tamagotchi);

        tamagotchi.activity(tamagotchi);

    }

}
