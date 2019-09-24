import java.util.Date;

public class faculty extends Person {
   String designation;
   float salary;
   String specialization;


    public faculty(int id, String firstName, String lastName, Date birthDate, String gender, String designation, float salary, String specialization) {
        super(id, firstName, lastName, birthDate, gender);
        this.designation = designation;
        this.salary = salary;
        this.specialization = specialization;
    }
}
