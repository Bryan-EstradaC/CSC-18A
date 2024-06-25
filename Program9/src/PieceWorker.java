//            Programmer Name : Bryan Estrada
//           Assignment Start : 05/06/2024 3:00 pm
//      Assignment Completion : 05/10/2024 9:46 pm
// Total Hours for Assignment : 10 hours

public class PieceWorker extends Employee{
    private int pieces;     //Number of pieces produced by the employee
    private double wage;    //Wage per pieces

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, int pieces, double wage){
        super(firstName, lastName, socialSecurityNumber);   //Call the superclass constructor

        this.pieces = pieces;   //Initialize pieces in the constructor
        this.wage = wage;       //Initialize wage in the constructor
    }

    //Setters
    public void setPieces(int pieces){
        if (pieces < 0) { //Validate
            throw new IllegalArgumentException("Pieces must be >= 0");
        }
        this.pieces = pieces;
    }
    public void setWage(double wage){
        if (wage < 0.0) { //Validate
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        this.wage = wage;
    }

    //Getters
    public int getPieces(){
        return this.pieces;
    }
    public double getWage(){
        return this.wage;
    }

    //Concrete implementation of earnings method
    @Override
    public double earnings() {
        return getPieces() * getWage();
    }

    //Overriding toString method
    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %,d; %s: $%.2f", "piece worker employee", super.toString(),
                             "pieces", getPieces(), "wage", getWage());
    }
}
