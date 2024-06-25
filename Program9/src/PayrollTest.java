//            Programmer Name : Bryan Estrada
//           Assignment Start : 05/06/2024 3:00 pm
//      Assignment Completion : 05/10/2024 9:46 pm
// Total Hours for Assignment : 10 hours
//                   Comments : I created a new class which is a subclass of employees. This class is a type of employee
//                              that earned by the amount of pieces they created or produced, for every piece there is
//                              a fixed wage. The employee's final salary is calculated by multiplying the total amount
//                              of pieces times the wage.

import java.time.LocalDateTime;            //LocalDateTime class importation
import java.time.format.DateTimeFormatter; //Importation for class to format the date and time

public class PayrollTest {
    public static void main(String[] args) {
        // create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, 0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis",
                                                                                               "444-44-4444", 5000,
                                                                                               0.04, 300);
        PieceWorker pieceWorker = new PieceWorker("Bryan", "Estrada", "555-55-5555", 1450, 0.9);

        // create four-element Employee array
        Employee[] employees = new Employee[5];

        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;

        System.out.printf("Employees processed polymorphically:%n%n");

        // generically process each element in array employees
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // invokes toString
            // determine whether element is a BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                // downcast Employee reference to
                // BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
            }
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }

        // get type name of each object in employees array
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
        }

        //Goodbye message
        System.out.println("\nThank you for using the Payroll application.");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm::ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.print("Time of calculation is ");
        System.out.println(dtf.format(now));

        System.exit(0);
    }
}
