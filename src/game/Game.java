package game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Character player;
    private Scanner scanner;

    public Game() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Enter your character's name:");
        String name = scanner.nextLine();
        player = new Character(name, 1, 100, 10, 5);

        introduction();
    }

    private void introduction() {
        System.out.println("Welcome to D day.");
        sleep(2000);
        System.out.println("This is an interactive experience, ");
        sleep(1000);
        System.out.println("except-");
        sleep(1000);
        System.out.println("it's not going to be a pleasant one.");
        sleep(2000);
        System.out.println("Try not to give up half-way... the world needs you-");
        sleep(2000);
        System.out.println("yes, YOU, to save it.");
        sleep(2000);
        System.out.println("You're about to wake up to an apocalypse.\nGood luck.\n");
        sleep(4000);
        System.out.println("Processing data");
        sleep(2000);
        System.out.println("Transferring files");
        sleep(2000);
        System.out.println("Initializing consciousness");
        sleep(2000);
        System.out.println("Initialization complete");
        sleep(2000);
        System.out.println("~eyes open~");
        sleep(2000);
        System.out.print(".");
        sleep(1000);
        System.out.print(".");
        sleep(1000);
        System.out.println(".");
        sleep(2000);

        System.out.println("Would you like to play?\n 1. Yes\n 2. No");
        int a = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (a == 1) {
            System.out.println("So, you think you can save the world, huh?");
            sleep(2000);
            System.out.println("Let's hope you're right.");
            sleep(2000);
            System.out.print(".");
            sleep(1000);
            System.out.print(".");
            sleep(1000);
            System.out.println(".");
            sleep(2000);

            instructions();
        } else if (a == 2) {
            System.out.println("Smart choice. \n ~eyes close~ ");
        } else {
            System.out.println("Enter a valid option.");
        }
    }

    private void instructions() {
        System.out.println("There are some things you should know before the game begins:");
        sleep(3000);
        System.out.println("1. There are 17 levels, each with one goal you must achieve in order to pass to the next level.");
        sleep(3000);
        System.out.println("2. The sequence of levels is completely random.");
        sleep(3000);
        System.out.println("3. There are no points, you either clear all the levels, or you die trying.");
        sleep(3000);
        System.out.println("4. While most levels are interactive, there will be certain buffer levels where your trivia is tested.");
        sleep(3000);
        System.out.println("5. Every decision you make from this moment forth, no matter how small or large, is going to alter the course of the game.");
        sleep(3000);
        System.out.println("Remember, YOU control the game.");
        sleep(2000);
        System.out.print(".");
        sleep(1000);
        System.out.print(".");
        sleep(1000);
        System.out.println(".");
        sleep(2000);

//        System.out.println("Enter your name:");
//        String name = scanner.nextLine();
        System.out.println("Welcome " + player.getName() + ", we're sorry for this.");
        sleep(2000);
        System.out.print(".");
        sleep(1000);
        System.out.print(".");
        sleep(1000);
        System.out.println(".");
        sleep(2000);

        weaponSelection();
    }

    private void weaponSelection() {
        String[] weapons = {"Sword", "Juice Box", "Mallet", "Reusable Straw", "Incredible Wit"};
        System.out.println("Choose your weapon.");
        sleep(1000);
        for (int i = 0; i < weapons.length; i++) {
            System.out.println("Option " + i + " = " + weapons[i]);
            sleep(1000);
        }
        int weapon = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("You have chosen * " + weapons[weapon] + " * \nTry not to regret it.");
        sleep(2000);
        System.out.print(".");
        sleep(1000);
        System.out.print(".");
        sleep(1000);
        System.out.println(".");
        sleep(2000);

        gameBegins();
    }

    private void gameBegins() {
        System.out.println("You blink,");
        sleep(2000);
        System.out.println("in an unfamiliar place- you're surrounded by doors.");
        sleep(2000);
        System.out.println("You count them, seventeen.");
        sleep(2000);
        System.out.println("Do you want to pick which door you open first? \n1. Yes \n2. No");
        int openDoor = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        int pickedDoor;
        if (openDoor == 1) {
            System.out.println("Pick a number from 1 to 17");
            pickedDoor = scanner.nextInt();
            scanner.nextLine(); // Consume newline
        } else {
            pickedDoor = new Random().nextInt(17) + 1;
            System.out.println("We'll pick a number for you. \nNumber " + pickedDoor + ".");
        }
        sleep(3000);
        System.out.println("\nYou walk slowly, unsteady feet and your eyes still adjusting to the dim lights.");
        sleep(3000);
        System.out.println("* " + pickedDoor + " * is the number that stares back at you as you reach for the door knob.\n");

        playLevel(pickedDoor);
    }

    private void playLevel(int levelNumber) {
        Level level = LevelFactory.getLevel(levelNumber);
        if (level != null) {
            level.play();
        } else {
            System.out.println("Invalid door number.");
        }
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.err.println("Sleep interrupted: " + e.getMessage());
        }
    }
}
