package RemoteProxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// RealSubject
public class RealRemoteService extends UnicastRemoteObject implements RemoteService {
    protected RealRemoteService() throws RemoteException {
        super();
    }

    @Override
    public String fetchData(String param) throws RemoteException {
        // Simulate fetching data from a remote server
        return "Data from server for " + param;
    }
}
