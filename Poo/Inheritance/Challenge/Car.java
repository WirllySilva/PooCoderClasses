package Poo.Inheritance.Challenge;

public class Car {

    int currentSpeed = 0;
    boolean working = false;

    void startEngine() {
        if(working == false) {
            working = true;
            System.out.println("The car is on");
        } else {
            System.out.println("The car is already on");
        }
    }
    
    void speedUp() {
        if(working) {
            currentSpeed = currentSpeed + 5;
            System.out.println(currentSpeed);
        } else {
            System.out.println("It can't speed up, the car is off");
        }
    }

    void brake() {
        if(currentSpeed > 0) {
            currentSpeed = currentSpeed - 5;
            System.out.println(currentSpeed);
        } else {
            System.out.println("The car is stopped");
        }

    }
    
}
