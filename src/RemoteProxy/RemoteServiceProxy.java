package RemoteProxy;

import java.rmi.RemoteException;

// Proxy
public class RemoteServiceProxy implements RemoteService {
    private final RemoteService realService;

    public RemoteServiceProxy(RemoteService realService) {
        this.realService = realService;
    }

    @Override
    public String fetchData(String param) throws RemoteException {
        System.out.println("Proxy: Fetching data for " + param);
        return realService.fetchData(param);
    }
}
