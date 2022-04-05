package Interceptor;

public class RequestLogger implements Filter {
    public void execute(String request){
        System.out.println("Request log: " + request); 
    }
}