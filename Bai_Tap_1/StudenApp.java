package Bai_Tap_1;

public class StudenApp {
    public static void main(String[] args) throws Exception {
        Student[] lisStudent = new Student[5];
        lisStudent[0] = new Student(1, "Nguyễn Hữu Giang 1 ", 18, "D101_C2k14");
        lisStudent[1] = new Student(2, "Nguyễn Hữu Giang 2 ", 19, "D101_C2k14");
        lisStudent[2] = new Student(3, "Nguyễn Hữu Giang 3 ", 20, "D101_C2k14");
        lisStudent[3] = new Student(4, "Nguyễn Hữu Giang 4 ", 21, "D101_C2k14");
        lisStudent[4] = new Student(5, "Nguyễn Hữu Giang 5 ", 22, "D101_C2k14");
        StudentProcess studentProcess = new StudentProcess();
        StudentProcess.writeStudent(lisStudent[0], "C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Bai_Tap_1\\text.dat");
        StudentProcess.writeStudent(lisStudent[1], "C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Bai_Tap_1\\text.dat");
        StudentProcess.writeStudent(lisStudent[2], "C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Bai_Tap_1\\text.dat");
        StudentProcess.writeStudent(lisStudent[3], "C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Bai_Tap_1\\text.dat");
        StudentProcess.writeStudent(lisStudent[4], "C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Bai_Tap_1\\text.dat");
//        studentProcess.readStuden("C:\\Users\\Admin\\IdeaProjects\\oop2\\Vao_ra_du_lieu_2\\src\\Bai_Tap_1\\text.dat");
        for (Student list : lisStudent
        ) {
            System.out.println(list.toString());
        }
    }
}
