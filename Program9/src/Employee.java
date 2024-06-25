//            Programmer Name : Bryan Estrada
//           Assignment Start : 05/06/2024 3:00 pm
//      Assignment Completion : 05/10/2024 9:46 pm
// Total Hours for Assignment : 10 hours

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    //Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //Return first name
    public String getFirstName() {return firstName;}

    //Return last name
    public String getLastName() {return lastName;}

    //Return social security number
    public String getSocialSecurityNumber() {return socialSecurityNumber;}

    //Return String representation of Employee object
    @Override
    public String toString() {
    return String.format("%s %s%nsocial security number: %s",getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    //Abstract method must be overridden by concrete subclasses
    public abstract double earnings(); //No implementation here
}

