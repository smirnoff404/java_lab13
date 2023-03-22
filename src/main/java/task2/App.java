package task2;

import task2.domain.Tester;

public class App {
    public static void main(String[] args) {
        Tester t1 = new Tester("Николай", "Коряков", 1, "A2", 1000);
        t1.ChangeData("Новое_имя", "Новая_фамилия");
        System.out.println(t1.name + " " + t1.surname);

        Tester.PrintMessage("Какое-то сообщение");
    }
}
