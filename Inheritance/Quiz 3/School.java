import java.util.*;
public class School
{
    private String name;
    private int gPA;
    private List<Student> students;
    public School(){
        students= new ArrayList<Student>();
    }
    public School(String name, int gPA){
        this.name=name;
        this.gPA=gPA;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public String getName(){
        return name;
    }
    public int getAvgGPA(){
        int avg=0;
        return gPA;
    }
    public String getStudents(){
        
    }
}
