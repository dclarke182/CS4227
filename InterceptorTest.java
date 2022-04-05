import Interceptor.*;

public class InterceptorTest {
   public static void main(String[] args) {
      Dispatcher filterController = new Dispatcher(new Target());
      filterController.setFilter(new Authentication());
      filterController.setFilter(new RequestLogger());
      // filterController.setFilter(new RequestCounter());

      Request request = new Request();
      request.setFilterManager(filterController);
      request.sendRequest("Login");
   }

}