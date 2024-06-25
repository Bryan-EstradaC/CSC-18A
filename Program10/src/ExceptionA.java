//            Programmer Name : Bryan Estrada
//           Assignment Start : 05/18/2024 04:10 pm
//      Assignment Completion : 05/10/2024 11:11 pm
// Total Hours for Assignment : 7 hours

public class ExceptionA extends Exception {
    public ExceptionA(){
        super("ExceptionA");
    }

    public ExceptionA(String str){
        super(str);
    }

    public ExceptionA(String str, Throwable throwable){
        super(str, throwable);
    }

    public ExceptionA(Throwable throwable){
        super(throwable);
    }

}
