package Bai1;

public class Teacher extends People{
    private String level;
    private int experience;
    private String subject;

    public String getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public String getSubject() {
        return subject;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public Teacher(){
        super();
        this.level=" Mặc định";
        this.experience=0;
        this.subject="Môn mặc định";
    }
    public Teacher(String name , int age , boolean sex , double height , double weight , String level , int experience , String subject){
        super(name,age,sex,height,weight);
        this.level=level;
        this.experience=experience;
        this.subject=subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "level='" + level + '\'' +
                ", experience=" + experience +
                ", subject='" + subject + '\'' +
                '}'+ super.toString()
                ;
    }
}
class TeacherTest{
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println(teacher);
        teacher = new Teacher("Cấn Tuấn Anh " , 27,true,1.80,50,"Thạc sĩ",3,"Hướng đối tươợng");
        System.out.println(teacher);
    }
}
