package RemoteProxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Remote Interface
public interface RemoteService extends Remote {
    String fetchData(String param) throws RemoteException;
}