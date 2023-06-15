package Bai1;

public class People {
    private String name;
    private int age;
    private boolean sex;
    private double height;
    private double weight;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {return sex;}

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public People(){
        this.name="Tên mặc định";
        this.age=0;
        this.sex=false;
        this.height=0.0;
        this.weight=0.0;
    }

    public People(String name, int age, boolean sex, double height, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }
    public static String sexString(boolean sex){
        if (sex){
            return "Nam";
        }else {
            return "Nữ";
        }
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" +sexString(sex) +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
class PeopleTest{

    public static void main(String[] args) {
        People people = new People();
        System.out.println(people);
        people = new People("Nguyễn Hữu Giang",18,true,45.6,1.80);
        System.out.println(people);
    }
}
