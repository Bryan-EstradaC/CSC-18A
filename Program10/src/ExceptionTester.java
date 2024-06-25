//            Programmer Name : Bryan Estrada
//           Assignment Start : 05/18/2024 04:10 pm
//      Assignment Completion : 05/10/2024 11:11 pm
// Total Hours for Assignment : 7 hours
//                   Comments : In my program, I printed a message with the Exception type thrown when the exception is
//                              caught. Also, I dynamically specified in which method the Exception is thrown. I started
//                              hardcoding the Method name, but I did my research to learn how I could print the
//                              Method's name. For the ExceptionA and ExceptionB, I created four constructors as the
//                              textbook stated in Chapter 11 section 11.9.

import java.time.LocalDateTime;            //LocalDateTime class importation
import java.time.format.DateTimeFormatter; //Importation for class to format the date and time
import java.io.IOException;                //Import IOException

public class ExceptionTester {
    public static void main(String[] args) {
        //Try statement for ExceptionA
        try {
            throwExceptionA();
        }
        catch (Exception exception) {
            //Print exception message with details
            System.err.printf("Exception: %s:%s%n", exception, exception.getStackTrace()[0].getLineNumber());
        }

        //Try statement for ExceptionB
        try {
            throwExceptionB();
        }
        catch (Exception exception) {
            //Print exception message with details
            System.err.printf("Exception: %s:%s%n", exception, exception.getStackTrace()[0].getLineNumber());
        }

        //Try statement for NullPointerException
        try {
            throwNullPointerException();
        }
        catch (Exception exception) {
            //Print exception message with details
            System.err.printf("Exception: %s:%s%n", exception, exception.getStackTrace()[0].getLineNumber());
        }

        //Try statement for IOException
        try {
            throwIOException();
        }
        catch (Exception exception) {
            //Print exception message with details
            System.err.printf("Exception: %s:%s%n", exception, exception.getStackTrace()[0].getLineNumber());
        }

        //Goodbye message
        System.out.println("\nThank you for using the Exception application.");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm::ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.print("Time of calculation is ");
        System.out.println(dtf.format(now));

        System.exit(0);
    }

    //Method that throws ExceptionA
    public static void throwExceptionA() throws ExceptionA {
        String methodName = new Throwable().getStackTrace()[0].getMethodName();
        throw new ExceptionA("Exception thrown in " + methodName + "()");
    }

    //Method that throws ExceptionB
    public static void throwExceptionB() throws ExceptionB {
        String methodName = new Throwable().getStackTrace()[0].getMethodName();
        throw new ExceptionB("Exception thrown in " + methodName + "()");
    }

    //Method that throws NullPointerException
    public static void throwNullPointerException() throws NullPointerException {
        String methodName = new Throwable().getStackTrace()[0].getMethodName();
        throw new NullPointerException("Exception thrown in " + methodName + "()");
    }

    //Method that throws IOException
    public static void throwIOException() throws IOException {
        String methodName = new Throwable().getStackTrace()[0].getMethodName();
        throw new IOException("Exception thrown in " + methodName + "()");
    }
}