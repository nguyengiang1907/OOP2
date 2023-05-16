package Bai_Tap_1;

public class StudenApp {
    public static void main(String[] args)throws Exception {
        Student student1 = new Student(1,"Nguyễn Hữu Giang 1",18,"D101_C2k14");
        Student student2 = new Student(2,"Nguyễn Hữu Giang 2",19,"D101_C2k14");
        Student student3 = new Student(3,"Nguyễn Hữu Giang 3",20,"D101_C2k14");
        Student student4 = new Student(4,"Nguyễn Hữu Giang 4",21,"D101_C2k14");
        Student student5 = new Student(5,"Nguyễn Hữu Giang 5",22,"D101_C2k14");
        StudentProcess studentProcess = new StudentProcess();
        studentProcess.writeStudent(student1,"C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Bai_Tap_1\\text.dat");
        studentProcess.writeStudent(student2,"C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Bai_Tap_1\\text.dat");
        studentProcess.writeStudent(student3,"C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Bai_Tap_1\\text.dat");
        studentProcess.writeStudent(student4,"C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Bai_Tap_1\\text.dat");
        studentProcess.writeStudent(student5,"C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Bai_Tap_1\\text.dat");
    }

}
