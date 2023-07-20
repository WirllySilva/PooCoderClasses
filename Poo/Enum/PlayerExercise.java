package Poo.Enum;

public class PlayerExercise {

    int x;
    int y;

    boolean walk(Direction direction) {
        switch(direction) {
        case LEFT:
            x--;
            break;
        case RIGHT:
            x++;
            break;
        case UP:
            y++;
            break;
        case DOWN:
            y--;
            break;
        }
        return true;
    }

}