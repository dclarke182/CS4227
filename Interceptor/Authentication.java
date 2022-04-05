package Interceptor;

public class Authentication implements Filter {
    public void execute(String request){
       System.out.println("Authenticating: " + request);
    }
 }