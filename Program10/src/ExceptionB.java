//            Programmer Name : Bryan Estrada
//           Assignment Start : 05/18/2024 04:10 pm
//      Assignment Completion : 05/10/2024 11:11 pm
// Total Hours for Assignment : 7 hours

public class ExceptionB extends ExceptionA{
    public ExceptionB(){
        super("ExceptionB");
    }

    public ExceptionB(String str){
        super(str);
    }

    public ExceptionB(String str, Throwable throwable){
        super(str, throwable);
    }

    public ExceptionB(Throwable throwable){
        super(throwable);
    }
}
