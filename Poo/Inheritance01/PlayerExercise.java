package Poo.Inheritance01;

public class PlayerExercise {

    int life = 100;
    int x;
    int y;

    boolean toAttack(PlayerExercise challenger){
        int positionX = Math.abs(x - challenger.x);
        int positionY = Math.abs(y - challenger.y);

        if(positionX == 0 && positionY == 1) {
            challenger.life -= 10;
            return true;
        } else if(positionX == 1 && positionY == 0) {
            challenger.life -= 10;
            return true;
        } else {
            return false;
        }
    }

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