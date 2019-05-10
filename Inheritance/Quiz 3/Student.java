import java.util.*;
public class Student
{   
    private String name;
    private int gradeLevel;
    private List<Course> courses;
    
    public Student(){
        courses= new ArrayList<Course>();
    }
    public Student(String name, int gradeLevel){
        this.name=name;
        this.gradeLevel=gradeLevel;
    }
    public void addCourse(Course course){
        courses.add(course);
    }
}
