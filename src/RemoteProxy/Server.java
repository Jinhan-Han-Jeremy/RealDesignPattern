package RemoteProxy;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

// Server
public class Server {
    public static void main(String[] args) {
        try {
            RealRemoteService realService = new RealRemoteService();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("RemoteService", realService);
            System.out.println("Server started");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
