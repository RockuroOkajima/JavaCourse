import java.util.Scanner;

public class View {
    private final static Scanner scanner = new Scanner(System.in);

    public void printMenuData(){
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Добавить студента");
        System.out.println("2 - Найти студента");
        System.out.println("3 - Обновить параметры студента");
        System.out.println("4 - Добавить студенту предметов");
        System.out.println("5 - Изменить оценку по одному из предметов");
        System.out.println("6 - Удалить предмет");
        System.out.println("7 - Удалить студента");
        System.out.println("8 - Выйти");
    }

    public Integer readCommand() {
        return scanner.nextInt();
    }

    public void printIncomingString(String incomingString) {
        System.out.println(incomingString);
    }

    public String readStudentsName() {
        String incomingString = scanner.next();
        return incomingString;
    }

    public Integer readGroupsNumber() {
        Integer incomingNumber = scanner.nextInt();
        return incomingNumber;
    }

    public void printStudent(Student student) {
        System.out.println("Данные студента {Имя студента: "
                + student.getName()
                + "; Группа студента:  "
                + student.getGroup() + "}");
        System.out.println("Его предметы и оценки: ");
        student.getSubjects();
    }

}
