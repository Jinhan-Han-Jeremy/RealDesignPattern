import RemoteProxy.RemoteService;
import RemoteProxy.RemoteServiceProxy;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MainByRemoteProxy {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            RemoteService realService = (RemoteService) registry.lookup("RemoteService");
            RemoteServiceProxy proxy = new RemoteServiceProxy(realService);

            // Fetch data through the proxy
            System.out.println(proxy.fetchData("test1"));
            System.out.println(proxy.fetchData("test2"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
