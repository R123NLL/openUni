package mmn11.tester;

import mmn11.entities.Train;

import java.util.Scanner;


public class TrainTester {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** Train distance calculator *****\n");

        System.out.println("Enter the speed of train 1: ");
        Train train1 = new Train();
        train1.setName("train 1");
        train1.setSpeed(scanner.nextInt());
        System.out.println("Enter the time it took train 1 to arrive: ");
        train1.setArrivalTime(scanner.nextInt());

        System.out.println("Enter the speed of train 2: ");
        Train train2 = new Train();
        train2.setName("train 2");
        train2.setSpeed(scanner.nextInt());
        System.out.println("Enter the time it took train 2 to arrive: ");
        train2.setArrivalTime(scanner.nextInt());

        System.out.println("The distance between the trains is " + distanceBetween2Trains(train1,train2));
    }

    private static int distance(int speed, int time) {
        return (speed * time)/60;
    }

    private static int distanceBetween2Trains(Train train1, Train train2) {
        int train1Distance = distance(train1.getSpeed(), train1.getArrivalTime());
        int train2Distance = distance(train2.getSpeed(), train2.getArrivalTime());
        return Math.abs(train1Distance - train2Distance);
    }
}
