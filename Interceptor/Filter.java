package Interceptor;

// Performs task prior or after excecution of request handler

public interface Filter {
    public void execute(String request);
}
