package task2.domain;

public class Tester {

    public String name;
    public String surname;
    public int expirienceInYears;
    public String englishLevel;
    public double salary;

    public Tester(int expLvl) {
        expirienceInYears = expLvl;
    }
    public Tester(String name, String surname, int expLvl) {
        this(expLvl);
        this.name = name;
        this.surname = surname;
    }
    public Tester(String name, String surname, int expLvl, String engLvl, double salary) {
        this(name, surname, expLvl);
        englishLevel = engLvl;
        this.salary = salary;
    }

    public void ChangeData(String name) {
        this.name = name;
    }
    public void ChangeData(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void ChangeData(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public static void PrintMessage(String message) {
        System.out.println(message);
    }
}
