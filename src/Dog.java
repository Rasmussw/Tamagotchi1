import java.util.Scanner;

public class Dog extends Tamagotchi{


    public Dog(String name, int age, int energy, String mood) {
        super(name, age, energy, mood);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", energy=" + energy +
                ", mood='" + mood + '\'' +
                '}';
    }

    @Override
    public void eat(){
        String eatMessage = " is eating meat🥩";
        System.out.println(this.name + eatMessage);
    }

    @Override
    public void play(){
        Scanner scanner = new Scanner((System.in));

        System.out.println("press 1 to play with a ball, 2 to play with a rope or 3 to play in the water");

        String typeOfPlay = scanner.nextLine();

        if (typeOfPlay.equals("1")){
            typeOfPlay = " with the ball⚽️";
        } else if (typeOfPlay.equals("2")){
            typeOfPlay = " with the rope🪢";
        } else if (typeOfPlay.equals("3")){
            typeOfPlay = " in the water💦";
        }

        System.out.println(name + " is playing" + typeOfPlay);
    }

}

