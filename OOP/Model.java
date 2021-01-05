import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<Student> students = new ArrayList<>();

    public void createNewStudent(String name, Integer group){
        Student student = new Student();
        student.setName(name);
        student.setGroup(group);
        students.add(student);
    }

    public Student findAnyStudent(String name) {
        for(Student student : students) {
            if(student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public Student updateAnyStudent(String currentName, String newName, Integer newGroup) {
        Student student = findAnyStudent(currentName);
        if(student != null) {
            student.setName(newName);
            student.setGroup(newGroup);
            return student;
        }
        return null;
    }
