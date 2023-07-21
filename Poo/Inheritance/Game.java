package Poo.Inheritance;

public class Game {
    public static void main(String[] args) {
        
        PlayerExercise player01 = new PlayerExercise();
        player01.x = 10;
        player01.y = 10;

        PlayerExercise player02 = new PlayerExercise();
        player02.x = 10;
        player02.y = 11;

       

        System.out.println(player01.life);
        System.out.println(player01.life);

        player01.toAttack(player02);
        player02.toAttack(player01);

        System.out.println(player01.life);
        System.out.println(player02.life);
    }
    
}
