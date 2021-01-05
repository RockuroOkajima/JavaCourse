import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private Integer group;
    private List<Subject> subjects = new ArrayList<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getGroup() {
        return group;
    }
    public void setGroup(Integer group) {
        this.group = group;
    }

    public void addSubject(String name, int mark) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setMark(mark);
        subjects.add(subject);
    }

    public void getSubjects() {
        for(int i = 0; i < subjects.size(); i++)
            System.out.println("Предмет и оценка: " + subjects.get(i).getName() + " " + subjects.get(i).getMark() );
    }

    public void removeSubject(Subject subject) {
            subjects.remove(subject);
    }

    public Subject findAnySubject(String name) {
        for(Subject subject : subjects) {
            if(subject.getName().equals(name)) {
                return subject;
            }
        }
        return null;
    }

}
