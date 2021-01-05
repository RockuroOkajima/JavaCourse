public class Controller
{
    public void initController(){

        View view = new View();
        Model model = new Model();

        while(true) {
            view.printMenuData();
            Integer command = view.readCommand();
            if(command.equals(8))
            {
                break;
            }else if(command.equals(1)){
                System.out.println("Введите имя студента: ");
                String name = view.readStudentsName();
                System.out.println("Введите желаемую группу: ");
                int group = view.readGroupsNumber();
                model.createNewStudent(name, group);
                view.printIncomingString("Студент был добавлен!");
            }else if(command.equals(2)){
                System.out.println("Введите имя студента: ");
                String name = view.readStudentsName();
                Student student = model.findAnyStudent(name);
                if(student != null){
                    view.printStudent(student);
                }else{
                    view.printIncomingString("Студент не был найден!");
                }
            }else if(command.equals(3)){
                view.printIncomingString("Введите текущее имя студента: ");
                String currentName = view.readStudentsName();
                view.printIncomingString("Введите новое имя студента: ");
                String newName = view.readStudentsName();
                view.printIncomingString("Введите новую группу студента: ");
                int newGroup = view.readGroupsNumber();
                Student newStudent = model.updateAnyStudent(currentName, newName, newGroup);
                view.printIncomingString("Новые параметры студента: ");
                if(newStudent != null)
                    view.printStudent(newStudent);
                else{
                    view.printIncomingString("Такой студент не найден");
                }
            }
            else if(command.equals(4)) {
                System.out.println("Введите имя студента: ");
                String nameOfStudent = view.readStudentsName();
                Student student = model.findAnyStudent(nameOfStudent);
                if (student != null) {
                    System.out.println("Введите название предмета: ");
                    String nameOfSubject = view.readStudentsName();
                    System.out.println("Введите оценочку: ");
                    int mark = view.readGroupsNumber();
                    model.setSubjectToStudent(nameOfStudent, nameOfSubject, mark);
                    System.out.println("Предмет добавлен!");
                } else {
                    view.printIncomingString("Студент не был найден!");
                }
            }
            else if(command.equals(5)) {
                System.out.println("Введите имя студента: ");
                String nameOfStudent = view.readStudentsName();
                Student student = model.findAnyStudent(nameOfStudent);
                if (student != null) {
                    System.out.println("Введите название предмета: ");
                    String nameOfSubject = view.readStudentsName();
                    Subject subject = student.findAnySubject(nameOfSubject);
                    if (subject != null) {
                        System.out.println("Введите оценочку, господин!");
                        int mark = view.readGroupsNumber();
                        subject.setMark(mark);
                        System.out.println("Мы изменили оценочку!");
                    }
                } else {
                    view.printIncomingString("Студент или предмет не был найден!");
                }
            }
            else if(command.equals(6)) {
                System.out.println("Введите имя студента: ");
                String nameOfStudent = view.readStudentsName();
                Student student = model.findAnyStudent(nameOfStudent);
                if (student != null) {
                    System.out.println("Введите название предмета: ");
                    String nameOfSubject = view.readStudentsName();
                    Subject subject = student.findAnySubject(nameOfSubject);
                    if (subject != null) {
                        student.removeSubject(subject);
                        System.out.println("Предметик удален!");
                    }
                } else {
                    view.printIncomingString("Студент или предмет не был найден!");
                }
            }

            else if (command.equals(7)){
                view.printIncomingString("Введите студента к отчислению: ");
                int index = model.deleteAnyStudent(view.readStudentsName());
                if(index != -1)
                    view.printIncomingString("Студент по индексу " + index + " был отчислен");
                else
                    view.printIncomingString("Такой студент не найден");
            }
        }
    }
}
