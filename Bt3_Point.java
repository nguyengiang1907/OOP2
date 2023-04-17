package week_1;

public class Bt3_Point {
    private float x;
    private float y;
    public Bt3_Point(){
        super();
        this.x=0.0f;
        this.y=0.0f;
    }
    public Bt3_Point(float x, float y){
        super();
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float [] getXY(){
        float[] array = {this.x,this.y};
        return  array;
    }
    public String toString(){
        return "Tọa độ x : "
                +this.getX()
                +" và tọa độ y : "
                +this.getY();
    }
}
class PointTest{
    public static void main(String[] args) {
        Bt3_Point bt3Point = new Bt3_Point();
        System.out.println(bt3Point);

        bt3Point = new Bt3_Point(2.0f, 3.0f);
        System.out.println(bt3Point);
    }
}
class MovablePoint extends Bt3_Point{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(){
        this.xSpeed=0.0f;
        this.ySpeed=0.0f;
    }
    public MovablePoint(float x, float y , float xSpeed , float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] array={xSpeed,ySpeed};
        return array;
    }

    @Override
    public String toString() {
        return  "Tọa độ speed là : "
                +this.xSpeed
                + "  "
                +this.ySpeed
                + " ,là con của lớp : "
                + super.toString();
    }
//    public MovablePoint move(){
//
//        return
//    }
}
class MovablePointTest{
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(9.0f,9.0f);
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(1.0f,2.0f,3.0f,4.0f);
        System.out.println(movablePoint);
    }
}
