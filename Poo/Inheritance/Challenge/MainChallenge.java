package Poo.Inheritance.Challenge;

public class MainChallenge {

    public static void main(String[] args) {
        
        Ferrari f11 = new Ferrari();

        f11.startEngine();
        f11.speedUp();
        f11.speedUp();
        f11.brake();
        f11.brake();
        f11.brake();

        Civic civ02 = new Civic();

        civ02.speedUp();
        civ02.startEngine();
        civ02.speedUp();
        civ02.speedUp();
        civ02.speedUp();
        civ02.brake();
    }
    
}
