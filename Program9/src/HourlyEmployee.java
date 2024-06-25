//            Programmer Name : Bryan Estrada
//           Assignment Start : 05/06/2024 3:00 pm
//      Assignment Completion : 05/10/2024 9:46 pm
// Total Hours for Assignment : 10 hours

public class HourlyEmployee extends Employee{
    private double wage; //Wage per hour
    private double hours; //Hours worked for week

    //Constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        if (wage < 0.0) { //Validate wage
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        if ((hours < 0.0) || (hours > 168.0)) { //Validate hours
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }
        this.wage = wage;
        this.hours = hours;
    }

    //Set wage
    public void setWage(double wage) {
        if (wage < 0.0) { //Validate wage
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }

        this.wage = wage;
    }

    //Return wage
    public double getWage() {return wage;}

    //Set hours worked
    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0)) { //Validate hours
            throw new IllegalArgumentException(
                    "Hours worked must be >= 0.0 and <= 168.0");
        }

        this.hours = hours;
    }

    //Return hours worked
    public double getHours() {return hours;}

    //Calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        if (getHours() <= 40) { //No overtime
            return getWage() * getHours();
        }
        else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }

    //Return String representation of HourlyEmployee object
    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage", getWage(),
                             "hours worked", getHours());
    }
}
