/*Student requirements:

- private String name
- private String studentId
- private int mark
- a constructor receiving all three values
- name and studentId must be non-null and non-blank
- mark must remain between 0 and 100
- getters for all fields
- boolean setMark(int newMark), preserving the old mark when invalid
- boolean hasPassed()
- String getClassification()
- a useful toString()
*/

public class Student
{
    private String name,studentId;
    private int mark;
    Student(String name,String studentId,int mark)
    {
       if (name == null || studentId == null ) 
        {
            System.out.println("Error!");
        }
        this.name = name;
        this.studentId = studentId;
        if (mark >= 0 && mark <= 100) 
        {
            this.mark = mark;
        } 
        else 
        {
            this.mark = 0; 
        }
    }
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getMark() {
        return mark;
    }
    public boolean setMark(int newMark){
        if (newMark >= 0 && newMark <= 100) 
        {
            this.mark = newMark;
            return true;
        }
        return false;
    }
    public boolean hasPassed(){
        return mark>=50;
    }
    public String getClassification(){
        if (mark >= 80) {
            return "Great";
        } 
        else if (mark >= 70) {
            return "Good";
        }
        else if (mark >= 50) {
            return "Pass";
        } 
        else {
            return "Fail";
        }
    }
    @Override
    public String toString(){
        return "Student{name='" + name + "', studentId='" + studentId
                + "', mark=" + mark + ", classification='" + getClassification() + "'}";
    }

}