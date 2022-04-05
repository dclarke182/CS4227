package Interceptor;

//import java.util.ArrayList;
//import java.util.List;

// Manages the filters and chain

public class Dispatcher{
    Chain filterChain;
    //private List<RequestFilter> filters = new ArrayList<RequestFilter>();
      //private Target target;
 
    public Dispatcher(Target target){
      filterChain = new Chain();
      filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
       filterChain.addFilter(filter);
    }
 
    public void filterRequest(String request){
       filterChain.execute(request);
    
    }
}