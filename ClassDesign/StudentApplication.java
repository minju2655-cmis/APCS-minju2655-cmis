public class StudentApplication
{
  public static void main(String args[]){
      Student senior001 = new Student();
      System.out.println(senior001);
      Student junior001 = new Student("MinJu", "Lee", 17, false);
      System.out.println(junior001);
      //JOptionPane.showMessageDialog(null, junior001);
  }
}