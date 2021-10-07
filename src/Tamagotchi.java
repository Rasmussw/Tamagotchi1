import java.util.Random;
import java.util.Scanner;

public class Tamagotchi {
    public String name;
    public int age;
    public int energy;
    public String mood;

    public Tamagotchi(String name, int age, int energy, String mood) {
        this.name = name;
        this.age = age;
        this.energy = energy;
        this.mood = mood;

    }

    //metode til at hvilken supclass vi skal hoppe ind i (hvilket dyr man vil have)
    public Tamagotchi getTamagotchiType(String input, String name, Tamagotchi tamagotchi){
        int ageOfTamagotchi = getAge();
        int energyOgTamagotchi = getEnergy();
        String moodOgTamagotchi = getMood();
        String tamagotchiType = "";


        if (input.equals("1")){
            tamagotchi = new Dog(name, ageOfTamagotchi, energyOgTamagotchi, moodOgTamagotchi);
            System.out.println(tamagotchi);
            tamagotchiType = " dog";
            System.out.println(name + " is " + ageOfTamagotchi + " years old and" + moodOgTamagotchi + tamagotchiType + " and the energy is " + energyOgTamagotchi);
            return tamagotchi;
        } else if (input.equals("2")){
            tamagotchi = new Cat(name, ageOfTamagotchi, energyOgTamagotchi, moodOgTamagotchi);
            tamagotchiType = " cat";
            System.out.println(name + " is " + ageOfTamagotchi + " years old and" + moodOgTamagotchi + tamagotchiType + " and the energy is " + energyOgTamagotchi);
            return tamagotchi;
        }
        return tamagotchi;
    }
    //metoden til at lege, sove eller spise med tamagotchien
    public void activity(Tamagotchi tamagotchi){
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        //et loop der kører indtil tamagotchien dør (energy<=-4), eller indtil man stopper spillet (q)
        do {

            System.out.println("press 1 for " + this.name + " to play, 2  for sleep, 3 for eat or q for quit");
            userInput = scanner.next();

            if (userInput.equals("1")) {
                tamagotchi.play();
                System.out.println("the energy is now " + (energy -= 3));
                die();
            } else if (userInput.equals("2")) {
                sleep();
                System.out.println("the energy is now " + (energy += 3));
                die();
            } else if (userInput.equals("3")) {
                tamagotchi.eat();
                System.out.println("the energy is now " + (energy += 2));
                die();
            } else if (userInput.equals("q")){

            }

        }while (energy > -4 && !userInput.equals("q"));

    }

    public void eat(){
    }

    public void sleep(){
        String sleepMessage = " is sleeping💤";
        System.out.println(this.name + sleepMessage);
    }

    public void die(){
        if(energy <= -4){
            System.out.println(this.name + " is dead🪦");
        } else if (energy < 0){
            System.out.println(this.name + " wants too eat");
        } else if (energy < 3){
            System.out.println(this.name + " wants too sleep");
        } else if (energy > 7){
            System.out.println(this.name + " wants too play");
        }
    }

    //metode til at få alderen
    public int getAge(){
        age = randomInt(1,20);
        return age;
    }


    // metode til at få navnet
    public String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want your pet to be named?");
        this.name = scanner.nextLine();

        return this.name;
    }

    // metode til at den skal lege
    public void play(){

    }

    //metode til at regulere energien
    public int getEnergy() {
        energy = randomInt(5,10);

        return energy;
    }

    //metod til at generere mood
    public String getMood(){
        String startMood = " ";
        mood = startMood;
        int generatedNumber = randomInt(1,3);

        if (generatedNumber == 1){
            startMood = " is a happy";
            return startMood;
        } else if (generatedNumber == 2){
            startMood = " is a playfull";
            return startMood;
        } else if (generatedNumber == 3){
            startMood = " is a confused";
            return startMood;
        }

        return startMood;
    }

    //random metode
    public int randomInt(int lowestRandom, int highestRandom){
        Random random = new Random();
        return random.nextInt(highestRandom - lowestRandom) + lowestRandom;

    }


}
