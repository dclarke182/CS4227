package Interceptor;

// object who sends request to target

public class Request {
   Dispatcher filterController;
     
   public void setFilterManager(Dispatcher filterController){
      this.filterController = filterController;
   }
     
    public void sendRequest(String request){
      filterController.filterRequest(request);
   }
} 
