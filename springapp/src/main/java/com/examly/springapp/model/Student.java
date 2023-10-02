
public class Student{
    int stdid;
    String firstName,lastName;
    void setStudentId(int stdid){
        this.stdid=stdid;
    }
    void setFirstName(String firstName){
        this.firstName=firstName;
    }
    void setLastName(String lastName){
        this.lastName=lastName;
    }
    int getStudentId(){
        return stdid;
    }
    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
}