package BaiTap6_3_Week2;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint() {
        this.x = 1;
        this.y = 1;
        this.xSpeed = 2;
        this.ySpeed = 2;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return " tọa độ x : "
                + getX()
                + " tọa độ y : "
                + getY()
                + " tọa độ xSpeed : "
                + getxSpeed()
                + " Tọa độ ySpeed : "
                + getySpeed()
                + super.toString();
    }

    @Override
    public void moveUp() {
       System.out.println(this.y -= this.ySpeed);
    }

    @Override
    public void moveDown() {
       System.out.println(this.y += this.ySpeed);
    }

    @Override
    public void moveLeft() {
       System.out.println( this.x -= this.xSpeed);
    }

    @Override
    public void moveRight() {
       System.out.println( this.x += this.xSpeed);
    }
}

class Test {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(7, 7, 7, 7);
        System.out.println(movablePoint);
        System.out.println("Phương thức toString"+movablePoint.toString());
        movablePoint.moveUp();
        movablePoint.moveDown();
        movablePoint.moveRight();
        movablePoint.moveLeft();
    }
}
