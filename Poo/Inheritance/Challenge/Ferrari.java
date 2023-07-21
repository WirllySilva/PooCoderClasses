package Poo.Inheritance.Challenge;

public class Ferrari extends Car {

    @Override
    void brake() {
       if(currentSpeed > 0) {
        currentSpeed = currentSpeed - 20;
        System.out.println(currentSpeed);
       } else {
        System.out.println("The car is parked");
       }
    }

    @Override
    void speedUp() {
        if(working) {
            currentSpeed = currentSpeed + 20;
            System.out.println(currentSpeed);
        } else {
            System.out.println("The car is not on");
        }
      
    }

    
}
