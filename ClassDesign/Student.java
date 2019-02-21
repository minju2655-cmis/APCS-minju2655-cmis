public class Student{
    private String firstname;
    private String lastname;
    private int age;
    private boolean male;
    public Student(){
        this.firstname = "Mike";
        this.lastname = "Lee";
        this.age = 20;
        this.male = true;
    }

    public Student(String firstname, String lastname, int age, boolean male){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.male = male;
    }
    
    public String toString(){
        return "Firstname: " + firstname + "\nLast Name: " + lastname + "\nAge: " + age + "\nMale: " + male + "\n";
    }
}