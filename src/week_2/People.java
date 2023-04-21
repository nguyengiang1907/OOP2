package week_2;

public abstract class People {
    protected String name;
    protected int age;
    protected boolean gender;

    public People(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    abstract void eat();
    abstract void sleep();
    abstract void study();
}
interface Student{
    void registerCourse(String course);
    void attendClass();
}
interface Employee{
    void work();
    void takeABreack();
}
class StutentImpl extends People implements Student{
    public StutentImpl(String name , int age , boolean gender){
        super(name,age,gender);
    }

    @Override
    void eat() {
        System.out.println(" Đang ăn trưa ");
    }

    @Override
    void sleep() {
        System.out.println(" Ngủ 24/7  ");
    }

    @Override
    void study() {
        System.out.println(" Học 8 tiếng 1 ngày ");
    }

    @Override
    public void registerCourse(String course) {
        System.out.println(" Code Gym ");
    }

    @Override
    public void attendClass() {
        System.out.println(" IBSK1D2 ");
    }
}
class Test2{
    public static void main(String[] args) {
        StutentImpl stutent = new StutentImpl("Nguyễn Giang", 18,true);
        System.out.println(stutent);

        stutent.eat();
        stutent.sleep();
        stutent.registerCourse(" Lập trình java ");
        stutent.attendClass();
        stutent.study();
    }
}

