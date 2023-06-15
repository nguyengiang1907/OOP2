package Cau1;

import java.io.*;

public class CRUDRollRoyce implements Serializable {
    RollRoyce[] rollRoyces;
    private static int numberOfRollRoyce;


    public CRUDRollRoyce() {
        this.rollRoyces = new RollRoyce[100];
        numberOfRollRoyce = 0;
    }

    public RollRoyce addRollRoyceToArray(RollRoyce objRollRoyce) {
            this.rollRoyces[numberOfRollRoyce++] = objRollRoyce;
            return objRollRoyce;
    }

    public boolean addRollRoyceToFile(RollRoyce objRollRoyce, String filename) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
            objectOutputStream.writeObject(objRollRoyce);
            System.out.println(" Ghi thành công !");
            objectOutputStream.flush();
            return true;
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }

    public RollRoyce getRollRoyceFromFile(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename));
        RollRoyce rollRoyce = (RollRoyce) objectInputStream.readObject();
        return rollRoyce;
    }

    public boolean addRollRoyceListToFile(RollRoyce[] listRollRoyce, String filename) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
            objectOutputStream.writeObject(listRollRoyce);
            System.out.println("Ghi danh sách thành công ! ");
            objectOutputStream.flush();
            return true;
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }

    public RollRoyce[] getAllRollRoyceFromFile(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename));
        RollRoyce[] royces = (RollRoyce[]) objectInputStream.readObject();
        return royces;
    }
}

class AppRollRoyce {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "C:\\Users\\Admin\\IdeaProjects\\OnTap\\src\\Cau1\\Text.txt";
        RollRoyce rollRoyce1 = new RollRoyce("Máy cày 1", "Đen thui", 1000, 2.5, 100, 200, "Vô giá");
        RollRoyce rollRoyce2 = new RollRoyce("Máy cày 2", "Đen thui", 1000, 2.5, 100, 200, "Vô giá");
        RollRoyce rollRoyce3 = new RollRoyce("Máy cày 3", "Đen thui", 1000, 2.5, 100, 200, "Vô giá");
        RollRoyce rollRoyce4 = new RollRoyce("Máy cày 4", "Đen thui", 1000, 2.5, 100, 200, "Vô giá");
        System.out.println("________add__________");
        CRUDRollRoyce crudRollRoyce = new CRUDRollRoyce();
        RollRoyce[] rollRoyces = new RollRoyce[crudRollRoyce.rollRoyces.length];
        rollRoyces[0] = crudRollRoyce.addRollRoyceToArray(rollRoyce1);
        rollRoyces[1] = crudRollRoyce.addRollRoyceToArray(rollRoyce2);
        rollRoyces[2] = crudRollRoyce.addRollRoyceToArray(rollRoyce3);
        rollRoyces[3] = crudRollRoyce.addRollRoyceToArray(rollRoyce4);
        crudRollRoyce.addRollRoyceToArray(rollRoyce2);
        crudRollRoyce.addRollRoyceToArray(rollRoyce3);
        System.out.println("_______________________");
        crudRollRoyce.addRollRoyceToFile(rollRoyce1, fileName);
        crudRollRoyce.addRollRoyceToFile(rollRoyce2, fileName);
        crudRollRoyce.addRollRoyceToFile(rollRoyce3, fileName);
        crudRollRoyce.addRollRoyceToFile(rollRoyce4, fileName);
        show(rollRoyce1);
        show(rollRoyce2);
        show(rollRoyce3);
        System.out.println("______________________");
        crudRollRoyce.getRollRoyceFromFile(fileName);
        crudRollRoyce.addRollRoyceListToFile(crudRollRoyce.rollRoyces, fileName);
        System.out.println("____________________");
        crudRollRoyce.getAllRollRoyceFromFile(fileName);
        showAll(rollRoyces);

    }

    public static void show(RollRoyce rollRoyce) {
        System.out.println(rollRoyce);
    }

    public static void showAll(RollRoyce[] rollRoyces) {
        for (RollRoyce song: rollRoyces
        ) {
            System.out.println(song);
        }
    }
}

