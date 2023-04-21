package BaiTap_6_4_Week2;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(){
        this.x=1;
        this.y=1;
        this.xSpeed=2;
        this.ySpeed=2;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super();
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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
        return  " Tọa độ x : "
                +getX()
                +" Tọa độ y : "
                +getY()
                +" Tọa độ xSpeed : "
                +getxSpeed()
                +" Tọa độ ySpeed : "
                +getySpeed()
                +super.toString();
    }

    @Override
    public void movaUp() {
        System.out.println( this.x -= this.xSpeed);
    }

    @Override
    public void movaDown() {
        System.out.println(this.x += this.xSpeed);
    }

    @Override
    public void movaLeft() {
        System.out.println(this.xSpeed -= this.x);
    }

    @Override
    public void moveReight() {
        System.out.println(this.ySpeed += this.y);
    }
}
class Test{
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(5,5,6,6);
        System.out.println(movablePoint);
        System.out.println(movablePoint.toString());
        movablePoint.movaUp();
        movablePoint.movaDown();
        movablePoint.movaLeft();
        movablePoint.moveReight();

    }

}

