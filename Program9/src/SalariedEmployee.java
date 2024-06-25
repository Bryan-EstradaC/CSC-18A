//            Programmer Name : Bryan Estrada
//           Assignment Start : 05/06/2024 3:00 pm
//      Assignment Completion : 05/10/2024 9:46 pm
// Total Hours for Assignment : 10 hours

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    //Constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
            }

    this.weeklySalary = weeklySalary;
    }

    //Set salary
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException(
                "Weekly salary must be >= 0.0");
        }

        this.weeklySalary = weeklySalary;
    }
    //Return salary
    public double getWeeklySalary() {return weeklySalary;}

    //Calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {return getWeeklySalary();}

    //Return String representation of SalariedEmployee object
    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }

}
