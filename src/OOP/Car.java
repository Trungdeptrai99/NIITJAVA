package OOP;

import java.util.*;
public class Car implements Runnable {

    private String name;

    public static int DISTANCE = 100;

    public Car(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        int runDistance = 0;

        long startTime = System.currentTimeMillis();

        while (runDistance < OrganizationBoard.DISTANCE) {
            try {

                int speed = (new Random()).nextInt(10);

                runDistance += speed;

                String log = "|";
                int percentTravel = (runDistance * 100) / OrganizationBoard.DISTANCE;
                for (int i = 0; i < OrganizationBoard.DISTANCE; i += OrganizationBoard.STEP) {
                    if (percentTravel >= i + OrganizationBoard.STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + OrganizationBoard.STEP) {
                        log += "Xe "+this.name;
                    } else {
                        log += "-";
                    }
                }
                log += "/";
                System.out.println("Xe" + this.name + ": " + log + " " + Math.min(OrganizationBoard.DISTANCE, runDistance) + "KM "+
                        "hoàn thành "+percentTravel+" %");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Xe" + this.name + " hỏng...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Xe" + this.name + " hoàn thành sau " + (endTime - startTime) / 1000 + "s");
    }
}