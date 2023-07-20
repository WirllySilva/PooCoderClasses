package Poo.Enum;

public class Game {
    public static void main(String[] args) {
        
        PlayerExercise player01 = new PlayerExercise();

        player01.walk(Direction.LEFT);
        player01.walk(Direction.DOWN);
        player01.walk(Direction.RIGHT);
        player01.walk(Direction.UP);

        System.out.println(player01.y);
        System.out.println(player01.x);
    }
    
}
