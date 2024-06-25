//            Programmer Name : Bryan Estrada
//           Assignment Start : 05/06/2024 3:00 pm
//      Assignment Completion : 05/10/2024 9:46 pm
// Total Hours for Assignment : 10 hours

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary; //Base salary per week

    //Constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0.0) { //Validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    //Set base salary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) { //Validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    //Return Base Salary
    public double getBaseSalary() {return baseSalary;}

    //Calculate earnings; override method earnings in CommissionEmployee
    @Override
    public double earnings() {return getBaseSalary() + super.earnings();}

    //Return String representation of BasePlusCommissionEmployee object
    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    }
}
