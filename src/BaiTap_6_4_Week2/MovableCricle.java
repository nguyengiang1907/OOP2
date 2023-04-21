package BaiTap_6_4_Week2;

public class MovableCricle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCricle(){
        this.radius=2;
    }
    public MovableCricle(int radius){
        this.radius=radius;
    }
    public MovableCricle(int x, int y , int xSpeed, int ySpeed , int radius){
        super(x, y, xSpeed, ySpeed);
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return  "Radius : "
                +getRadius()
                +", và là lớp con của"
                +super.toString();
    }
}
class TestMovableCricle{
    public static void main(String[] args) {
        MovableCricle movableCricle = new MovableCricle();
        System.out.println(movableCricle);
        movableCricle = new MovableCricle(10);
        System.out.println(movableCricle);
        movableCricle = new MovableCricle(1,1,1,1,1);
        System.out.println(movableCricle);
        System.out.println(movableCricle.toString());
        movableCricle.movaUp();
        movableCricle.movaDown();
        movableCricle.moveReight();
        movableCricle.movaLeft();
    }

}
